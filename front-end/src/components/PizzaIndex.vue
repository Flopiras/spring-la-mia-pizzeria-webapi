<script setup>
import { defineProps } from 'vue';

// props
const props = defineProps({
    pizzas: {
        type: Array,
        required: true
    }
});
</script>

<template>
    <h1 class="my-4 text-center">Le nostre pizze</h1>
    <ul>
        <li v-for="pizza in pizzas" :key="pizza.id"> {{ pizza.name }}</li>
    </ul>
</template>

<style scoped>
li {
    list-style-type: none;
}
</style>