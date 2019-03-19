<template>
  <van-tabbar v-model="active" :currentIndex="currentIndex">
    <van-tabbar-item icon="wap-home" to="/">首页</van-tabbar-item>
    <van-tabbar-item icon="apps-o" to="lists">列表</van-tabbar-item>
    <van-tabbar-item icon="bar-chart-o" to="charts">图表</van-tabbar-item>
    <van-tabbar-item icon="setting-o" to="settings">设置</van-tabbar-item>
  </van-tabbar>
</template>

<script>
export default {
  name: 'footNav',
  props: ['currentIndex'],
  data () {
    return {
      active: this.currentIndex
    }
  }
}
</script>

<style scoped>

</style>
