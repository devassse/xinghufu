<template>
    <q-drawer
        v-model="leftDrawerOpen"
        show-if-above
        :width="250"
        :breakpoint="545"
      >
        <q-scroll-area style="height: calc(100% - 185px); margin-top: 185px; border-right: 1px solid #ddd">
          <q-list padding>

            <q-item to="/" exact clickable v-ripple>
              <q-item-section avatar>
                <q-icon name="dashboard" />
              </q-item-section>

              <q-item-section>
                Dashboard
              </q-item-section>
            </q-item>

            <q-item to="/news" clickable v-ripple>
              <q-item-section avatar>
                <q-icon name="notes" />
              </q-item-section>

              <q-item-section>
                Notícias
              </q-item-section>
            </q-item>

            <q-item to="/matchs" clickable v-ripple>
              <q-item-section avatar>
                <q-icon name="event" />
              </q-item-section>

              <q-item-section>
                Calendário de Jogos
              </q-item-section>
            </q-item>

            <q-item to="/highlights" clickable v-ripple>
              <q-item-section avatar>
                <q-icon name="grade" />
              </q-item-section>

              <q-item-section>
                Melhores Momentos
              </q-item-section>
            </q-item>

          </q-list>
        </q-scroll-area>

        <q-img class="absolute-top" :src="profilebgc" style="height: 174px">
          <div class="absolute-bottom bg-transparent">
            <q-avatar size="56px" class="q-mb-sm">
              <img :src="profilepic" alt="">
            </q-avatar>
            <div class="text-weight-bold">João Devson Mucavel</div>
            <div>@devasse</div>
          </div>
        </q-img>
      </q-drawer>
</template>

<script>
import profilepicsrc from '../assets/imgs/profile-02.png'
import profilebgcsrc from '../assets/imgs/thunder-bg.jpg'

export default {
  name: 'Navigation',
  components: {
  },
  data () {
    return {
      leftDrawerOpen: false,
      profilepic: profilepicsrc,
      profilebgc: profilebgcsrc
    }
  },
  computed: {
  }
}
</script>
