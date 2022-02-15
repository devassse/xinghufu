
const routes = [
  {
    path: '/',
    component: () => import('layouts/MainLayout.vue'),
    children: [
      { path: '/', component: () => import('pages/News.vue') },
      { path: '/matchs', component: () => import('pages/Matchscalendar.vue') },
      { path: '/highlights', component: () => import('pages/Highlights.vue') },
      { path: '/todo', component: () => import('pages/ToDo.vue') }
    ]
  },

  // Always leave this as last one,
  // but you can also remove it
  {
    path: '*',
    component: () => import('pages/Error404.vue')
  }
]

export default routes
