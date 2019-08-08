import MySQLService from '../services/MySQLService'
import store from './store'
// import router from '../routers/router'

export default {
    // 회원
    setUsers: async function () {
        store.dispatch('setUsers', await MySQLService.getUsers());
    },
    getUsers: function () {
        return store.getters.getUsers;
    }
}
