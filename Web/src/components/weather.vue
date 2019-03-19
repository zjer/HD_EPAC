<template>
  <div>
    <van-dialog
      v-model="showDialog"
      show-cancel-button
      :lazy-render="false"
      :before-close="beforeClose">
    </van-dialog>
    <van-popup
      v-model="showPop"
      position="bottom">
      <van-picker
        show-toolbar
        :columns="columns"
        @confirm="showPop = false"
        @cancel="showPop = false"/>
    </van-popup>
  </div>
</template>

<script>
  import { getLocal } from "../config/mUtils";

  export default {
    name: 'weather',
    data () {
      return {
        showDialog: false,
        showPop: false,
        columns: ['杭州', '宁波', '温州', '嘉兴', '湖州']
      }
    },
    created() {
      if (!getLocal('locationCity')) {
        this.selectCityConfirm();
      }
    },
    methods: {
      selectCityConfirm() {
        this.$dialog.confirm({
          title: '选择城市',
          message: ''
        });
      },
      beforeClose(action, done) {
        if (action === 'confirm') {
          this.showPop = true;
          done();
        } else {
          done();
        }
      }
    }
  }
</script>

<style scoped>

</style>
