<template>
    <div>
        <div 
            @click="expanded = !expanded"
            :style="{'margin-left': `${depth * 20}px` }"
            class="node"
            >
            <span class="type">{{expanded ? '&#9660;' : '&#9658;'}}</span>
            {{node.name}}
        </div>
        <div v-if="expanded">
            <VTreeview
               
            v-for="child in node.children"
            :key="child.name"
            :node="child"
            :depth="depth + 1"
        />
        </div>
        
    </div>
</template>

<script>
export default {
    name: 'VTreeview',
    props: {
        msg: String,
        node: Object,
        depth: {
            type: Number,
            default: 0,
        }
    },
    data() {
        return {
            expanded: false,
        }
    }
}
</script>

<style scoped>
    .node {
        text-align: left;
    }
</style>