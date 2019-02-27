import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/views/home'
import Lists from '@/views/lists'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    }, {
      path: '/lists',
      name: 'lists',
      component: Lists
    }
  ]
})
