<template>
    <div class="coba">
        <Coba msg="Welcome to coba page"/>
    </div>
</template>

<script>
import Coba from '@/components/Coba.vue'

export default {
    name: 'coba',
    components: {
        Coba
    }
}

var demo = new Vue({
  el: '#demo',
  data: {
    coba: coba
  },
  methods: {
  	makeFolder: function (item) {
    	Vue.set(item, 'children', [])
      this.addItem(item)
    },
    addItem: function (item) {
    	item.children.push({
        name: 'new stuff'
      })
    }
  }
})
</script>

