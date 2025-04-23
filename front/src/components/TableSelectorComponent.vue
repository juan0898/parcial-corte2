<template>
    <ion-item>
      <ion-label>Mesa</ion-label>
      <ion-select v-model="selectedTable" placeholder="Selecciona una mesa" @ionChange="$emit('update:table', selectedTable)">
        <ion-select-option v-for="table in tables" :key="table.id" :value="table.id">
          Mesa {{ table.id }} - {{ table.description }}
        </ion-select-option>
      </ion-select>
    </ion-item>
  </template>
  
  <script setup>
  import { ref } from 'vue';
  const props = defineProps({
    tables: Array
  });
  const selectedTable = ref(null);
  </script>
  