<template>
    <v-content>
        <div class="menu-bar bar-type" @click="menuToggle">
            <span></span>
            <span></span>
        </div>
    </v-content>

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

    /* bar-type-1 */

    .bar-type span {
        transform-origin: center;
        transition: transform 0.4s cubic-bezier(0.18, 0.89, 0.32, 1.28);
    }

    .bar-type span:nth-child(1) {
        margin-top: 6px;
    }

    .bar-type.active span:nth-child(1) {
        transform: translate3d(0, 5px, 0) rotate(45deg);
    }

    .bar-type.active span:nth-child(2) {
        transform: translate3d(0px, -7px, 0) rotate(-45deg);
    }

    .bar-type.active span:nth-child(3) {
        width: 50%;
        transform: translateY(-12px) rotate(-315deg);
    }

</style>