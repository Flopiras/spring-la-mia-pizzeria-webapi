<script setup>
import { defineProps } from 'vue';

//emits
const emits = defineEmits(["showPizza"]);

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
            <!-- button for show -->
            <button class="btn btn btn-outline-primary btn-sm" @click="$emit('showPizza', pizza.id)">
                <i class="fa-solid fa-eye"></i> Vedi dettagli pizza
            </button>
        </li>
    </ul>
</template>

<style scoped></style>