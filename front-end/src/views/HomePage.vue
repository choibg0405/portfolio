<template>
    <div>
        <span>여기는 홈페이지</span>
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
</template>

<script>
    import MainRepository from '../vuex/MainRepository'

    export default {
        name: "HomePage",

        data() {
            return {
                result: []
            }
        },

        mounted() {
            MainRepository.setUsers();
        },
        computed: {
            getUsers: function () {
                return MainRepository.getUsers();
            }
        },
    }
</script>

<style scoped>

</style>