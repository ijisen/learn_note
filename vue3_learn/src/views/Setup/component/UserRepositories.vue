<template>
  <div>
    <button @click="getListData">添加数据</button>
    <h1>{{ userIdReverse }}</h1>
    <TableList :data="listData"></TableList>
  </div>
</template>

<script>
  import { ref, onMounted, watch, toRefs, computed } from 'vue'
  import TableList from './TableList'

  export default {
    name: "UserRepositories",
    props: {
      userId: {
        type: Number,
        default: undefined,
        required: true,
      },
    },
    setup(props) {
      // 使用 `toRefs` 创建对prop的 `user` property 的响应式引用
      // 因为 props 是响应式的，不能使用 ES6 解构，因为它会消除 prop 的响应性
      // const { userId } = props; 不能这样解构
      const { userId } = toRefs(props);
      // 创建 ref 的响应式变量
      let listData = ref([])
      // 独立的计算属性
      const userIdReverse = computed(() => userId.value + '_aa')
      console.log(props)
      console.log(userId)
      console.log(2222222222)
      const getListData = () => {
        console.log(userId.value);
        console.log(userIdReverse.value)
        console.log(3333333);
        setTimeout(() => {
          let resData = [];
          const start = Date.now();
          for (let i = 0; i < 5; i++) {
            resData.push(start + i)
          }
          listData.value = resData
        }, 500)
      }
      /** 组件挂载后回调数据 */
      onMounted(getListData);
      /** 监听数据变化 */
      watch(userId, (newValue, oldValue) => {
        console.log(newValue)
        console.log(oldValue)
        console.log(userId)
        getListData()
      })
      return {
        listData,
        userIdReverse,
        getListData,
      }
    },
    data() {
      return {}
    },
    methods: {},
    components: { TableList },
    watch: {
      /** 监听userId 改变 */
      // userId: 'getListData',
    },
    mounted() {
      // this.getListData()
    },
  }
</script>

<style scoped>

</style>
