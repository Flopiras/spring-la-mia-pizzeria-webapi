<script setup>
import { defineProps, ref } from 'vue';
import axios from 'axios';

//props
const props = defineProps({
    oldPizza: {
        type: Object,
        required: false,
        default: null
    }
});

//emits
const emits = defineEmits(["back", "saved"]);

//datas
const newPizza = ref({
    name: null,
    price: null,
    description: null,
    photo: null
});
if (props.oldPizza != null) {

    newPizza.value = {
        name: props.oldPizza.name,
        price: props.oldPizza.price,
        description: props.oldPizza.description,
        photo: props.oldPizza.photo
    };
}

//functions
const save = async () => {

    if (props.oldPizza == null) {

        const data = await axios.post("http://localhost:8080/api/pizzas",
            newPizza.value);

        console.log("data", data);

        emits("saved");

        return;
    }

    const data = await axios.put(`http://localhost:8080/api/pizzas/${props.oldPizza.id}`,
        newPizza.value);

    console.log("data", data);

    emits("saved", newPizza.value);
}
</script>

<template>
    <!-- back button -->
    <button class="btn btn-secondary my-4" @click="$emit('back')">
        Indietro
    </button>

    <h1 class="my-4 text-center">Form delle pizze</h1>

    <form @submit.prevent="save">

        <!--name-->
        <div class="mb-3">
            <label for="name" class="form-label">Nome pizza</label>
            <input v-model="newPizza.name" type="text" class="form-control" id="name" name="name">
        </div>

        <!-- price -->
        <div class="mb-3">
            <label for="price" class="form-label me-2">Prezzo</label>
            <input v-model="newPizza.price" type="number" name="price" id="price" min="0">
        </div>

        <!--description-->
        <div class="mb-3">
            <label for="description" class="form-label">Descrizione</label>
            <textarea v-model="newPizza.description" class="form-control" id="description" name="description"
                rows="4"></textarea>
        </div>

        <!--URL immagine-->
        <div class="mb-3">
            <label for="urlImage" class="form-label">Copia qui l'URL dell'immagine</label>
            <input v-model="newPizza.urlImage" type="text" class="form-control" id="urlImage" name="urlImage">
        </div>

        <!-- button -->
        <div class="d-flex justify-content-center mt-4">
            <button class="btn btn-success">Salva</button>
        </div>
    </form>
</template>