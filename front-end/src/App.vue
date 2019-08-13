<template>
    <div id="app">
        <!-- 헤더 -->
        <Header></Header>
        <!-- 메인페이지 -->
        <router-view/>
        <!-- 푸터 -->
        <Footer></Footer>
    </div>
</template>

<script>
    import Header from './components/layouts/Header'
    import Footer from './components/layouts/Footer'

    export default {
        name: 'app',
        components: {
            Header,
            Footer
        }
    }
</script>

<style>
    body {
        margin: 0;
    }

    #app {
        font-family: 'Avenir', Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
        color: #2c3e50;
    }
</style>
