<template>
    <div>
        <div class="menu-bar bar-type" @click="menuToggle">
            <span></span>
            <span></span>
            <span></span>
        </div>

        <transition name="slide">
            <div id="gnb" v-if="menuFlag">
                <ul>
                    <li><a href="#">MENU 01</a></li>
                    <li><a href="#">MENU 02</a></li>
                    <li><a href="#">MENU 03</a></li>
                </ul>
            </div>
        </transition>

    </div>
</template>

<script>
    export default {
        name: "Header",

        data() {
            return {
                menuFlag: false
            }
        },

        methods: {
            menuToggle: function (event) {
                event.currentTarget.classList.toggle("active");
                this.menuFlag = !this.menuFlag;
            }
        }

    }
</script>

<style scoped>
    .menu-bar {
        position: fixed;
        top: 20px;
        right: 20px;
        width: 30px;
        height: 30px;
        z-index: 100;
        cursor: pointer;
    }

    .menu-bar span {
        position: relative;
        top: 0;
        display: block;
        width: 100%;
        height: 3px;
        background-color: #ffffff;
        transform-origin: center;
        border-radius: 3px;
        margin-top: 9px;
    }

    .menu-bar span:nth-child(1) {
        margin: 0;
    }

    .menu-bar span:nth-child(2) {
    }

    .menu-bar span:nth-child(3) {
    }

    /* bar-type */

    .bar-type span {
        transition: all 0.3s cubic-bezier(0.18, 0.89, 0.32, 1.28);
    }

    .bar-type span:nth-child(3) {
        width: 80%;
    }

    .bar-type.active span:nth-child(1) {
        width: 100%;
        transform: translate3d(0, 11px, 0) rotate(225deg);
    }

    .bar-type.active span:nth-child(2) {
        width: 100%;
        transform: translate3d(0, -1px, 0) rotate(-225deg);
    }

    .bar-type.active span:nth-child(3) {
        width: 0;
    }

    #gnb {
        z-index: 10;
        position: absolute;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        background-color: #ededed;

    }

    #gnb ul {
        width: 300px;
        position: absolute;
        top: 80px;
        left: 50%;
        margin-left: -150px;
    }

    #gnb li {
        width: 100%;
        list-style: none;
        margin-bottom: 16px;
        font-size: 36px;
        color: #222;
        text-align: center;
    }

    #gnb a {
        color: #333;
        text-decoration: none;
    }

    .slide-enter-active {
        -moz-transition-duration: 0.5s;
        -webkit-transition-duration: 0.5s;
        -o-transition-duration: 0.5s;
        transition-duration: 0.5s;
        -moz-transition-timing-function: ease-in;
        -webkit-transition-timing-function: ease-in;
        -o-transition-timing-function: ease-in;
        transition-timing-function: ease-in;
    }

    .slide-leave-active {
        -moz-transition-duration: 0.5s;
        -webkit-transition-duration: 0.5s;
        -o-transition-duration: 0.5s;
        transition-duration: 0.5s;
        -moz-transition-timing-function: cubic-bezier(0, 1, 0.5, 1);
        -webkit-transition-timing-function: cubic-bezier(0, 1, 0.5, 1);
        -o-transition-timing-function: cubic-bezier(0, 1, 0.5, 1);
        transition-timing-function: cubic-bezier(0, 1, 0.5, 1);
    }

    .slide-enter-to, .slide-leave {
        max-height: 100vh;
        overflow: hidden;
    }

    .slide-enter, .slide-leave-to {
        overflow: hidden;
        max-height: 0;
    }

</style>
