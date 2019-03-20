<template>
  <div>
    <head-top :topTitle="headerTitle" :showArrow="showArrow"></head-top>
    <foot-nav :currentIndex="active"></foot-nav>
    <guide v-show="showGuide"></guide>
  </div>
</template>

<script>
  import { getLocal } from "../config/mUtils";
  import HeadTop from '../components/headTop';
  import FootNav from '../components/footNav';
  import Guide from "./guide";

  export default {
    name: 'home',
    components: {Guide, FootNav, HeadTop},
    data () {
      return {
        headerTitle: 'home',
        active: 0,
        showArrow: false,
        showGuide: false
      }
    },
    created() {
      if (!getLocal('guide')) {
        this.showGuide = true;
      }
    }
  }
</script>

<style scoped>

</style>
