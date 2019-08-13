<template>
    <div>
        <div class="menu-bar bar-type" @click="menuToggle">
            <span></span>
            <span></span>
            <span></span>
        </div>
    </div>
</template>

<script>
    export default {
        name: "Header",

        methods: {
            menuToggle: function (event) {
                event.currentTarget.classList.toggle("active");
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


</style>
