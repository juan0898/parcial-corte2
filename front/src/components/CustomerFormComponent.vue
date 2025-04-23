<template>
    <ion-list>
      <ion-item>
        <ion-label position="stacked">Nombre</ion-label>
        <ion-input v-model="name" required></ion-input>
      </ion-item>
      <ion-item>
        <ion-label position="stacked">Contacto</ion-label>
        <ion-input v-model="contact" type="tel" required></ion-input>
      </ion-item>
    </ion-list>
  </template>
  
  <script setup>
  import { ref, watchEffect } from 'vue';
  
  // Definir las variables reactivas
  const name = ref('');
  const contact = ref('');
  
  // Definir los eventos que se van a emitir
  const emit = defineEmits(['update:customer']);
  
  // Emitir los datos cuando cambian
  watchEffect(() => {
    emit('update:customer', { name: name.value, contact: contact.value });
  });
  </script>
  
  