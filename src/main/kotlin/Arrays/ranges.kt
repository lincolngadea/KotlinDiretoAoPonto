package Arrays

fun main(){

    /**
     * SEJA BEM VINDO E BEM VINDA AO CANAL KOTLIN DIRETO AO PONTO
     *
     * SE ESSE CONTEÚDO FOR RELAVANTE, CURTA SE INSCREVE E ACIONA O SININHO PARA RECEBER MAIS CONTEÚDOS COMO ESSE
     *
     * CONTEÚDO DE HOJE: COMO CRIAR RANGES OU INTERVALOS COM KOTLIN
     */

    /**
     * Atalho para executar o código: Ctrl + Shift + f10
     */

    //SINTAXE SHUGAR - SÉRIE DE NÚMEROS INTEIROS PARES DE 0 A 100
    var numerosPares = 0..100 step 2
    for(numeroPar in numerosPares){
        print("$numeroPar ")
    }

    println()
    //IMPRIME UMA SÉRIE DE NÚMEROS INTEIROS PARES DE TRAZ PARA FRENTE
    var numerosParesReverso = 100 downTo 0 step 2
    for(numeroPar in numerosParesReverso){
        print("$numeroPar ")
    }

    println()
    //IMPRIME O ALFABETO DE A A Z
    var alfabeto = 'a'..'z'
    for(letra in alfabeto){
        print("$letra ")
    }
    /**
     * Também seria possível fazer de traz pra frente usando o downto...
     */

    println()
    //VERIFICA SE EXISTE UM DETERMINADO VALOR EM UM INTERVALO QUALQUER
    var intervalo = 1000.00..2000.00 //Verificando em uma lista de doubles
    var busca = 1500.00
    if(busca in intervalo){
        println("O VALOR BUSCADO ESTÁ NO INTERVALO")
    }else{
        println("VALOR BUSCADO INEXISTENTE")
    }

    /**
     * É ISSO PESSOAL,
     *
     * ESPERO QUE TENHA AJUDADO
     *
     * SE AJUDOU, NÃO ESQUEÇA DE DAR O SEU LIKE... E SE ACHAR LEGAL... ACIONE O SININHO PARA AJUDAR O YOUTUBE
     * A DIVULGAR ESSE CONTEÚDO PARA MAIS PESSOAS
     *
     */






}
