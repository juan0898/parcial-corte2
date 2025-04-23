<template>
  <ion-page>
    <ion-header>
      <ion-toolbar>
        <ion-title>Gestión de Reservas</ion-title>
      </ion-toolbar>
    </ion-header>

    <ion-content>
      <DateTimeComponent v-model:date="reservation.date" v-model:time="reservation.time" />
      <CustomerFormComponent v-model:name="reservation.name" v-model:contact="reservation.contact" />
      <TableSelectorComponent :tables="availableTables" @update:table="reservation.tableId = $event" />

      <ion-button expand="block" @click="submitReservation">Reservar</ion-button>
    </ion-content>
  </ion-page>
</template>

<script setup>
import { ref } from 'vue';
import DateTimeComponent from '@/components/DateTimeComponent.vue';
import CustomerFormComponent from '@/components/CustomerFormComponent.vue';
import TableSelectorComponent from '@/components/TableSelectorComponent.vue';

const reservation = ref({
  date: '',
  time: '',
  name: '',
  contact: '',
  tableId: null
});

const availableTables = ref([
  { id: 1, description: 'Cerca de la ventana' },
  { id: 2, description: 'Patio interno' },
  { id: 3, description: 'Zona VIP' }
]);

function submitReservation() {
  console.log('Reserva:', reservation.value);
  alert('Reserva creada exitosamente');
}
</script>

