<template>
  <q-page class="q-pa-lg bg-grey-3 column">
    <h5 class="q-mt-none flexed">
      Dashboard
      <q-btn
        @click="prompt = true"
        size="10px"
        round
        color="teal"
        icon="add"/>
      </h5>

      <div class="q-mt-none">
        <q-item
          tag="label"
          class="bg { 'done': note.done }"
          v-for="note in dashboards" :key="note.id" v-ripple @click="confirmed">
        <q-item-section side top>
          <q-checkbox v-model="note.done" />
        </q-item-section>

        <q-item-section>
          <q-item-label> {{ note.title }} </q-item-label>
          <q-item-label caption>
            {{ note.description }}
          </q-item-label>
        </q-item-section>
      </q-item>
      </div>

      <!-- Add Configs Modal -->
      <q-dialog v-model="prompt" persistent>
      <q-card style="min-width: 350px">
        <q-card-section>
          <div class="text-h6">New Dashboard</div>
        </q-card-section>

        <q-card-section class="q-pt-none">
          <q-input v-model="title" autofocus label="Title" dense />
          <q-input v-model="description" label="Description" dense type="textarea" />
        </q-card-section>

        <q-card-actions align="right" class="text-primary">
          <q-btn flat label="Cancel" v-close-popup />
          <q-btn flat label="Add +" v-close-popup @click="newDashboard" />
        </q-card-actions>
      </q-card>
    </q-dialog>
      <!--/ Add Configs Modal -->
  </q-page>
</template>

<script>
export default {
  name: 'Dashboard',
  data () {
    return {
      newItem: '',
      title: '',
      description: '',
      prompt: false,
      dashboards: [
        { id: 1, title: 'Notications about news', description: 'Notifications were added to Configurations', done: false },
        { id: 2, title: 'New Maches Registered', description: 'Derb within clubs are waiting to be aproved', done: false },
        { id: 3, title: 'Last weeked higlihgts', description: 'Best moments from last week matchs', done: false },
        { id: 4, title: 'Nation Champions League', description: 'Lets begin the votation from the next winner and champion', done: false }
      ]
    }
  },

  methods: {
    confirmed () {
      console.log('Checked')
    },
    newDashboard () {
      this.dashboards.push({
        title: this.title,
        description: this.description,
        done: false
      })
      this.title = ''
      this.description = ''
    }

  }
}
</script>

<style lang="scss">
    .bg{
      border-bottom:1px solid #ccc
    }
    .done {
        .q-item__label{
            text-decoration: line-through;
            color: #bbb;
        }
    }
    .flexed {
      display:flex;
      justify-content:space-between
    }
</style>
