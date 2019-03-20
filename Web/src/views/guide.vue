<template>
  <div class="mask" v-show="step !== 3">
    <div class="guide">
      <van-steps :active="step" active-color="#38f">
        <van-step>{{ $t('choseLang') }}</van-step>
        <van-step>{{ $t('getCity') }}</van-step>
        <van-step>{{ $t('addModules') }}</van-step>
      </van-steps>
      <van-panel class="newPanel">
        <div v-if="step === 0">
          <van-radio-group v-model="langRadio">
            <van-cell-group>
              <van-cell :title="$t('chinese')" clickable @click="langRadio = 'zh_CN'">
                <van-radio name="zh_CN" />
              </van-cell>
              <van-cell :title="$t('english')" clickable @click="langRadio = 'en_US'">
                <van-radio name="en_US" />
              </van-cell>
            </van-cell-group>
          </van-radio-group>
        </div>
        <div v-else-if="step === 1">
          <van-radio-group v-model="cityRadio">
            <van-cell-group>
              <van-cell :title="$t('wuXi')" clickable @click="cityRadio = 'wx'">
                <van-radio name="wx" />
              </van-cell>
              <van-cell :title="$t('changZhou')" clickable @click="cityRadio = 'cz'">
                <van-radio name="cz" />
              </van-cell>
              <van-cell :title="$t('nanTong')" clickable @click="cityRadio = 'nt'">
                <van-radio name="nt" />
              </van-cell>
            </van-cell-group>
          </van-radio-group>
        </div>
        <div v-else>
          <van-checkbox-group v-model="moduleResult">
            <van-cell-group>
              <van-cell
                v-for="(item, index) in lists"
                clickable
                :key="item.code"
                :title="`${item.text}`"
                @click="toggle(index)"
              >
                <van-checkbox :name="item.code" ref="checkboxes" />
              </van-cell>
            </van-cell-group>
          </van-checkbox-group>
        </div>
        <div slot="footer">
          <van-button size="small" :disabled="step === 0" @click="preStep">{{ $t('preStep') }}</van-button>
          <van-button type="info" size="small" @click="complete" v-if="step === 2">{{ $t('complete') }}</van-button>
          <van-button type="info" size="small" :disabled="canNext" @click="nextStep" v-else>{{ $t('nextStep') }}</van-button>
        </div>
      </van-panel>
    </div>
  </div>
</template>

<script>
  import { setLocal } from "../config/mUtils";

  export default {
    name: 'guide',
    data () {
      return {
        step: 0,
        langRadio: 'zh_CN',
        cityRadio: 'wx',
        moduleResult: [],
        lists: [
          {code: 'swipe', text: this.$t('swipe')},
          {code: 'weather', text: this.$t('weather')},
          {code: 'news', text: this.$t('news')}
        ],
        canNext: false
      }
    },
    methods: {
      preStep() {
        if (this.step > 0) {
          this.step -= 1;
        } else {
          this.step = 0;
        }
      },
      nextStep() {
        this.step = ++this.step % 3;
        if (this.step === 1) {
          this.$i18n.locale = this.langRadio;
          setLocal('lang', this.langRadio);
          setLocal('city', this.cityRadio);
        }
      },
      complete() {
        this.step = 3;
        setLocal('guide', 1);
      }
    }
  }
</script>

<style scoped>

</style>
