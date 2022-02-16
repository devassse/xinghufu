<template>
  <q-layout view="lHh Lpr lFf">
    <q-header elevated>
      <q-toolbar>
        <q-btn
          flat
          dense
          round
          icon="menu"
          aria-label="Menu"
          @click="leftDrawerOpen = !leftDrawerOpen"
        />
      </q-toolbar>
      <div class="q-px-lg q-pt-xl q-mb-md">
        <div class="text-h5">Xinghufu - Portal do Atleta</div>
        <div class="text-subtitle1">{{dateOfToday}}</div>
      </div>
      <q-img
        :src="profilebgc"
        class="header-image absolute-top">
      </q-img>
    </q-header>

    <Navigation/>

    <q-page-container>
      <keep-alive>
        <router-view />
      </keep-alive>
    </q-page-container>
  </q-layout>
</template>

<script>
import profilebgcsrc from '../assets/imgs/thunder-bg.jpg'
import Navigation from '../layouts/Navigation.vue'
import { date } from 'quasar'
export default {
  name: 'MainLayout',
  components: {
    Navigation
  },
  data () {
    return {
      profilebgc: profilebgcsrc
    }
  },
  computed: {
    dateOfToday () {
      const timeStamp = Date.now()
      return date.formatDate(timeStamp, 'dddd, D MMMM YYYY')
    }
  },
  created () {
  }
}
</script>

<style lang="scss">
  .header-image{
    height: 100%;
    z-index: -1;
    opacity: 0.2;
    filter: grayscale(100%);
  }
</style>
