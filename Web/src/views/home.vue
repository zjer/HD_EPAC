<template>
  <div>
    <head-top :topTitle="headerTitle" :showArrow="showArrow"></head-top>
    <weather></weather>
    <foot-nav :currentIndex="active"></foot-nav>
  </div>
</template>

<script>
  import HeadTop from '../components/headTop'
  import FootNav from '../components/footNav'
  import Weather from "../components/weather";

  export default {
    name: 'home',
    components: {Weather, FootNav, HeadTop},
    data () {
      return {
        headerTitle: 'home',
        active: 0,
        showArrow: false
      }
    }
  }
</script>

<style scoped>

</style>
