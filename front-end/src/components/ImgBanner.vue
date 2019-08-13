<template>
    <div>
        <v-img class="background" :src="getImgUrl('test_bg.jpg')"/>
<!--        <div class="inner">-->
<!--            <h2 class="visual_title">-->
<!--                <span class="title_text"></span>-->
<!--                <p class="title_text_slide"></p>-->
<!--                <span class="text_hide">NY KIM</span>-->
<!--                <svg class="title_logo" enable-background="new 0 0 240 236" version="1.1" viewBox="0 0 236 236"-->
<!--                     xml:space="preserve" xmlns="http://www.w3.org/2000/svg">-->
<!--                <polygon points="49 236 49 52.2 178.9 236 240 236 240 0 191 0 191 174.7 69.8 0 0 0 0 236"-->
<!--                         fill="#ffce48"/>-->
<!--            </svg>-->
<!--            </h2>-->

<!--            <p class="scroll-text" style="cursor:default">-->
<!--                scroll down-->
<!--            </p>-->
<!--        </div>-->
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
