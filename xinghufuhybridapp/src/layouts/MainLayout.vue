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
        <div class="text-h3">Xinghufu</div>
        <div class="text-subtitle1">{{dateOfToday}}</div>
      </div>
      <q-img
        :src="profilebgc"
        class="header-image absolute-top">
      </q-img>
    </q-header>

    <q-drawer
        v-model="leftDrawerOpen"
        show-if-above
        :width="250"
        :breakpoint="545"
      >
        <q-scroll-area style="height: calc(100% - 192px); margin-top: 192px; border-right: 1px solid #ddd">
          <q-list padding>
            <q-item to="/" exact clickable v-ripple>
              <q-item-section avatar>
                <q-icon name="inbox" />
              </q-item-section>

              <q-item-section>
                Notícias
              </q-item-section>
            </q-item>

            <q-item to="/matchs" clickable v-ripple>
              <q-item-section avatar>
                <q-icon name="star" />
              </q-item-section>

              <q-item-section>
                Calendário de Jogos
              </q-item-section>
            </q-item>

            <q-item to="/highlights" clickable v-ripple>
              <q-item-section avatar>
                <q-icon name="star" />
              </q-item-section>

              <q-item-section>
                Melhores Momentos
              </q-item-section>
            </q-item>
          </q-list>
        </q-scroll-area>

        <q-img class="absolute-top" :src="profilebgc" style="height: 192px">
          <div class="absolute-bottom bg-transparent">
            <q-avatar size="56px" class="q-mb-sm">
              <img :src="profilepic" alt="">
            </q-avatar>
            <div class="text-weight-bold">João Devson Mucavel</div>
            <div>@devasse</div>
          </div>
        </q-img>
      </q-drawer>

    <q-page-container>
      <keep-alive>
        <router-view />
      </keep-alive>
    </q-page-container>
  </q-layout>
</template>

<script>
import profilepicsrc from '../assets/imgs/profile-02.png'
import profilebgcsrc from '../assets/imgs/thunder-bg.jpg'
import { date } from 'quasar'
export default {
  name: 'MainLayout',
  components: {},
  data () {
    return {
      leftDrawerOpen: false,
      profilepic: profilepicsrc,
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
