import axios from '@/axios';

export const queryUserInfo = () => {
  return axios.get('/dpp/user/getUserInfo');
}
