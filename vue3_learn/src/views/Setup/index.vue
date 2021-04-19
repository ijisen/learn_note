<template>
  <h1>可复用 & 组合式API</h1>
  <button @click="setUserId">切换用户</button>
  <div>
    <p>当前用户ID： {{ userId }}</p>
    <UserRepositories :userId="userId"></UserRepositories>
  </div>
</template>

<script>
  import { ref } from 'vue'
  import UserRepositories from './component/UserRepositories'

  export default {
    name: "Setup",
    setup() {
      let userId = ref(undefined)
      const setUserId = () => {
        userId.value = Date.now();
      }
      return {
        userId,
        setUserId,
      }
    },
    components: { UserRepositories },
    mounted() {
      // this.setUserId();
    },
  }
</script>

<style scoped>

</style>
