<template>
    <div class="coba">
        
    </div>
</template>

<script>
export default {
    name: 'Coba',
    props: {
    msg: String,
    item: Object
  },
  data: function () {
    return {
      isOpen: false
    }
  },
  computed: {
    isFolder: function () {
      return this.item.children &&
        this.item.children.length
    }
  },
  methods: {
    toggle: function () {
      if (this.isFolder) {
        this.isOpen = !this.isOpen
      }
    },
    makeFolder: function () {
      if (!this.isFolder) {
      	this.$emit('make-folder', this.item)
        this.isOpen = true
      }
    }
  }
}
</script>
