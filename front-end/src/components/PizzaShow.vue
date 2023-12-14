<script setup>
import { defineProps } from 'vue';

// props
const props = defineProps({
    pizza: {
        type: Object,
        required: true
    }
});
</script>

<template>
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
</template>

<style scoped>
img {
    max-width: 500px;
}
</style>