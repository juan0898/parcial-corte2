<template>
    <ion-item>
      <ion-label>Fecha y Hora</ion-label>
      <ion-datetime
        presentation="date-time"
        v-model="selectedDateTime"
        @ionChange="$emit('update:datetime', selectedDateTime)">
      </ion-datetime>
    </ion-item>
  </template>
  
  <script setup>
  import { ref, watch } from 'vue';
  const selectedDateTime = ref('');
  </script>
  