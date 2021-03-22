<template>
    <section id="home">

        <div class="">
            <img :src="fullbodylogo" alt="Xinghufu - Portal do Atleta" class="fullbodylogo">      
        </div>

    </section>
</template>

<script>
import fulllogourl from '../assets/imgs/main-full-logo.png'

export default {
    data(){
        return{
            fullbodylogo : fulllogourl
        }
    }
}
</script>

<style scoped>
    .fullbodylogo{
        max-width: 60%;
        margin-top: 6%;
    }
</style>