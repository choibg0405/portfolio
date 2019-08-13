<template>
    <div>
        <v-img class="background" :src="getImgUrl('test_bg.jpg')"/>
    </div>
</template>

<script>
    export default {
        name: 'ImgBanner',
        props: {
            imgSrc: {type: String},
        },
        methods: {
            getImgUrl(img) {
                return require('../assets/' + img)
            }
        }
    }
</script>

<style scoped>
    .background {
        /* Set rules to fill background */
        width: 100%;
        height: 100vh;
        color: #ffffff;
        padding: 40vh;
    }

    .scroll-text {

    }
</style>
