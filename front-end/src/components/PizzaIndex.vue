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

    <!-- pizzas list -->
    <ul class="list-group">
        <li v-for="pizza in pizzas" :key="pizza.id" class="list-group-item list-group-item-action">
            {{ pizza.name }}
        </li>
    </ul>
</template>

<style scoped></style>