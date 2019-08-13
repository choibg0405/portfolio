<template>
    <div>
        <ImgBanner></ImgBanner>
        <div class="background">
            <span>여기는 홈페이지 입네다.</span>
            <v-flex v-for="user in getUsers" :key="user">
                <span>아이디: {{user.id}}</span>
                <br>
                <span>비밀번호: {{user.password}}</span>
                <br>
                <span>이름: {{user.name}}</span>
                <br>
            </v-flex>
            <span>위는 유저들</span>
        </div>
    </div>
</template>

<script>
    import MainRepository from '../vuex/MainRepository'
    import ImgBanner from '../components/ImgBanner'

    export default {
        name: "HomePage",

        components: {
            ImgBanner
        },

        data() {
            return {
                result: []
            }
        },

        mounted() {
            MainRepository.setUsers();
        },

        methods: {

        },
        computed: {
            getUsers: function () {
                return MainRepository.getUsers();
            }
        },
    }
</script>

<style scoped>
    .background {
        height: 100vh;
        background-color: beige;
        /* background-repeat: no-repeat;
         background-position: center;
         background-size: cover;
         */
    }
</style>
