<script setup>

import axios from 'axios';
import { onMounted, ref } from 'vue';

import PizzaIndex from './components/pizzaindex.vue';
import PizzaShow from './components/PizzaShow.vue';


// datas
const pizzas = ref(null);
const selectedPizza = ref(null);

// functions
const getPizzas = async () => {

  const data = await axios.get("http://localhost:8080/api/pizzas");

  pizzas.value = data.data;
}

const showPizza = (id) => {
  pizzas.value.forEach((pizza) => {

    if (pizza.id == id) {

      selectedPizza.value = pizza;
    }

  });
  console.log('pizza cliccata');
}

//mounted
onMounted(getPizzas);
</script>

<template>
  <div class="container">

    <!-- index -->
    <pizzaIndex v-if="!selectedPizza" :pizzas="pizzas" @show-pizza="showPizza" />

    <!-- show -->
    <pizzaShow v-if="selectedPizza" :pizza="selectedPizza" />

  </div>
</template>

<style scoped></style>
