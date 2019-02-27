<template>
  <div id="app">
    <van-nav-bar title="标题" left-arrow></van-nav-bar>
    <router-view/>
    <van-tabbar v-model="active">
      <van-tabbar-item icon="home-o" to="./">首页</van-tabbar-item>
      <van-tabbar-item icon="search" to="lists">列表</van-tabbar-item>
      <van-tabbar-item icon="friends-o" to="charts">图标</van-tabbar-item>
      <van-tabbar-item icon="setting-o" to="settings">设置</van-tabbar-item>
    </van-tabbar>
  </div>
</template>

<script>
export default {
  name: 'App',
  data () {
    return {
      active: 0
    }
  }
}
</script>

<style>

</style>
