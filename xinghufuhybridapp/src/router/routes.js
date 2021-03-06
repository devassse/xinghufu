
const routes = [
  {
    path: '/',
    component: () => import('layouts/MainLayout.vue'),
    children: [
      { path: '/', component: () => import('pages/Dashboard.vue') },
      { path: '/news', component: () => import('pages/News.vue') },
      { path: '/matchs', component: () => import('pages/Matchscalendar.vue') },
      { path: '/highlights', component: () => import('pages/Highlights.vue') }
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
