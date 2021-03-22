<template>
  <section id="navbar">
    <article class="container">
      <nav class="navbar" role="navigation" aria-label="main navigation">
        <div class="navbar-brand">
          <a class="navbar-item" href="/">
            <img :src="logo"/>
          </a>

          <a
            role="button"
            class="navbar-burger"
            aria-label="menu"
            aria-expanded="false"
            data-target="navbarBasicExample"
          >
            <span aria-hidden="true"></span>
            <span aria-hidden="true"></span>
            <span aria-hidden="true"></span>
          </a>
        </div>

        <div id="navbarBasicExample" class="navbar-menu">
          <div class="navbar-start">
            <a class="navbar-item"> Início </a>
            <a class="navbar-item"> Quem Somos </a>
            <a class="navbar-item"> Serviços </a>
            <a class="navbar-item"> Notícias </a>
            <a class="navbar-item"> Anúncios </a>
            <a class="navbar-item"> Contactos </a>
          </div>

          <div class="navbar-end">
            <div class="navbar-item">
              <div class="buttons">
                <a class="button is-primary">
                  <strong>Subscreva-te</strong>
                </a>
                <a class="button is-light"> Entrar </a>
              </div>
            </div>
          </div>
        </div>
      </nav>
    </article>
  </section>
</template>

<script>
import logourl from "../assets/imgs/secondary-full-logo.png"
export default {

    data(){
        return{
            logo: logourl
        }
    }

};
</script>

<style scoped>
#navbar{
    width: 100%;
    padding: 5px 0;
    background-color: rgb(77,77,77);
    border-top: 3px solid rgb(193,39,45);
    border-bottom: 3px solid rgb(193,39,45);
}
.navbar-brand{
    background-color: rgb(77,77,77);
}
.navbar-item{
    margin: 0 5%;
}
</style>