<template>
  <div class="mask">
    <div class="guide">
      <van-steps :active="step">
        <van-step>选择城市</van-step>
        <van-step>选择模块</van-step>
        <van-step>选择城市</van-step>
        <van-step>选择模块</van-step>
      </van-steps>
      <van-button type="primary" size="small" :disabled="isDisabled " @click="nextStep">下一步</van-button>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'guide',
    data () {
      return {
        step: 0,
        isDisabled: false
      }
    },
    methods: {
      nextStep() {
        this.step = ++this.step % 4;
        this.isDisabled = true;
      }
    }
  }
</script>

<style scoped>

</style>
