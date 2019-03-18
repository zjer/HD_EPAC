<template>
  <div id="login">
    <form>
      <label>用户名</label>
      <input type="text" v-model="loginData.username" name="username">
      <label>密码</label>
      <input type="password" v-model="loginData.password" name="password">
      <input type="button" value="登陆" @click="dologin">
    </form>
  </div>
</template>

<script>
import { login } from '@/api/api.js'
export default {
  name: 'login',
  data () {
    return {
      loginData: {
        username: '',
        password: ''
      }
    }
  },
  methods: {
    async login () {
      let result = await login({
        username: this.loginData.username,
        password: this.loginData.password
      })
      if (result.code === 0) {}
    },
    dologin () {
      this.login()
    }
  }
}
</script>

<style scoped>

</style>
