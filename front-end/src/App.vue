<script setup>

import axios from 'axios';
import { onMounted, ref } from 'vue';

import PizzaIndex from './components/PizzaIndex.vue';
import PizzaShow from './components/PizzaShow.vue';
import PizzaForm from './components/PizzaForm.vue';


// datas
const pizzas = ref(null);
const selectedPizza = ref(null);
const creatingPizza = ref(false);

// functions
const getPizzas = async () => {

  const data = await axios.get("http://localhost:8080/api/pizzas");

  pizzas.value = data.data;
};

const showPizza = (id) => {
  pizzas.value.forEach((pizza) => {

    if (pizza.id == id) {

      selectedPizza.value = pizza;
    }

  });
  console.log('pizza cliccata');
};

const closeShow = (update) => {
  selectedPizza.value = null;
  if (update) getPizzas();
};

const createdPizza = () => {

  creatingPizza.value = false;

  getPizzas();
};

const deletePizza = () => {
  selectedPizza.value = null;
  updatePizzas();
};

//mounted
onMounted(getPizzas);
</script>

<template>
  <div class="container">

    <!-- create button -->
    <div v-if="!creatingPizza && selectedPizza == null" @click="creatingPizza = true"
      class="d-flex justify-content-center my-4">
      <button class="btn btn-success">
        Aggiungi pizza
      </button>
    </div>

    <!-- create form -->
    <pizzaForm v-if="creatingPizza" @back="creatingPizza = false" @saved="createdPizza" />

    <div v-else>

      <!-- index -->
      <pizzaIndex v-if="!selectedPizza" :pizzas="pizzas" @show-pizza="showPizza" />

      <!-- show -->
      <pizzaShow v-else :pizza="selectedPizza" @close-show="closeShow" @delete-pizza="deletePizza" />
    </div>

  </div>
</template>

<style scoped></style>
