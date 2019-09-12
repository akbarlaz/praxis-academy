<template>
    <div class="coba">
        <VTreeview 
          :node="root"
        />
    </div>
</template>

<script>
import Coba from '@/components/Coba.vue'
import VTreeview from '@/components/VTreeview.vue'

export default {
    name: 'coba',
    data() {
      return {
        root: {
          name: '/',
          children: [
            {
              name: 'music',
              children: [
                {
                  name: 'hey-there-delillah.mp3'
                }
              ]
            },
            {
              name: 'video',
              children: [
                {
                  name: 'vina-garut.mp4'
                }
              ]
            }
          ]
        }
      }
    },
    components: {
        Coba,
        VTreeview
    }
}
</script>

