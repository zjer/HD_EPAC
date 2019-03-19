import fetch from '@/config/fetch'

// 用户登录
export const login = data => fetch('login', data, 'POST');

export const getCompany = data => fetch('/api/Systems/Common/Company', data, 'POST');
