<template>
  <div id="app">
    <Navbar />
  
    <div class="container">
      <Home />
      <HelloWorld msg="Xinghufu - Portal do Atleta"/>
    </div>
  
  </div>
</template>

<script>
import Navbar from './components/Navbar'
import Home from './components/Home'

export default {
  name: 'App',
  components: {
    Navbar,
    Home,
  }
}
</script>

<style>
  @import './assets/css/bulma.min.css';
  @import './assets/css/xinghufu-main-style.css';

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
