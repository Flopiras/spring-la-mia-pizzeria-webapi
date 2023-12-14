<script setup>
import { defineProps, ref } from 'vue';

import PizzaForm from './PizzaForm.vue'

// props
const props = defineProps({
    pizza: {
        type: Object,
        required: true
    }
});

//datas
const pizzaUpdate = ref(false);
const myPizza = ref(props.pizza);

//functions
const updated = (newPizza) => {

    pizzaUpdate.value = false;

    myPizza.value = newPizza;
}
</script>

<template>
    <div v-if="!pizzaUpdate">
        <h1 class="text-center my-4">
            {{ pizza.name }}
        </h1>

        <div class="d-flex justify-content-center align-items-start">

            <!-- image -->
            <img :src="pizza.urlImage" :alt="pizza.name" class="img-fluid">

            <!-- description -->
            <div class="ms-4">
                <h4 class="my-0">Descrizione:</h4>
                <p>{{ pizza.description }}</p>

                <h5 class="m-0">Prezzo:</h5>
                <p>€ {{ pizza.price }}</p>
            </div>
        </div>

        <!-- buttons -->
        <div class="my-4 d-flex justify-content-around">
            <!-- edit -->
            <button @click="pizzaUpdate = true" class="btn btn-warning">Modifica</button>

            <!-- back -->
            <button @click="$emit('closeShow', myPizza != pizza)" class="btn btn-secondary">Torna alle pizze</button>
        </div>
    </div>

    <!-- form -->
    <PizzaForm v-else @back="pizzaUpdate = false" @saved="updated" :oldPizza="pizza" />
</template>

<style scoped>
img {
    max-width: 500px;
}
</style>