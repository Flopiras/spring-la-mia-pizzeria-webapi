<script setup>

import axios from 'axios';
import { onMounted, ref } from 'vue';

import PizzaIndex from './components/PizzaIndex.vue';

// datas
const pizzas = ref(null);

// functions
const getPizzas = async () => {

  const data = await axios.get("http://localhost:8080/api/pizzas");

  pizzas.value = data.data;
}

//mounted
onMounted(getPizzas);
</script>

<template>
  <div class="container">

    <!-- index -->
    <pizzaIndex :pizzas="pizzas" />

  </div>
</template>

<style scoped></style>
