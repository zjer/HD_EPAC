import fetch from '@/config/fetch'

// 获取Token返回信息
export const GetAccesstoken = data => fetch('api/Suggestion/GetAccesstoken)', data, 'POST')
