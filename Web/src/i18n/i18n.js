import Vue from 'vue'
import VueI18n from 'vue-i18n'
import {getLocal} from "../config/mUtils";

Vue.use(VueI18n);

const messages = {
  'zh_CN': require('./langs/cn'),
  'en_US': require('./langs/en')
}

export default new VueI18n({
  locale : getLocal('lang') || 'zh_CN',
  messages : messages
})
