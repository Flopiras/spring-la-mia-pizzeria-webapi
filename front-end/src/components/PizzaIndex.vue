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
    <h2 class="my-4 text-center">Le nostre pizze</h2>

    <!-- pizzas list -->
    <div class="d-flex justify-content-center">

        <div class="list-group">
            <span v-for="pizza in pizzas" :key="pizza.id" class="list-group-item list-group-item-action">
                {{ pizza.name }}
                <!-- button for show -->
                <button class="btn btn btn-outline-primary btn-sm ms-4" @click="$emit('showPizza', pizza.id)">
                    <i class="fa-solid fa-eye"></i> Vedi dettagli pizza
                </button>
            </span>
        </div>
    </div>
</template>

<style scoped></style>