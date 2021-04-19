<template>
  <ul>
    <li v-for="item in data" :key="item">{{ item }}</li>
  </ul>
</template>

<script>
  import { onMounted} from 'vue'
  export default {
    name: "TableList",
    props: {
      data: {
        type: Array,
      },
    },
    setup () {
      onMounted(() => {
        console.log(123456)
      })
    }
  }
</script>

<style scoped>

</style>
