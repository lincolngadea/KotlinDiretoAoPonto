package Arrays

fun main(){
    /**
     * SEJA BEM VINDO E BEM VINDA AO CANAL KOTLIN DIRETO AO PONTO
     * SE ESSE CONTEÚDO FOR RELAVANTE CURTA, SE INSCREVE E ACIONA O SININHO PARA RECEBER MAIS CONTEÚDOS COMO ESSE
     *
     * CONTEÚDO DE HOJE: COMO CRIAR ARRAYS DE INTEIRO COM KOTLIN
     */

    //Opção 01
    var numero01 = IntArray(4) //Informando o tamanho do Array

    //Informando os valores do Array pelo índice
    numero01[0] = 10
    numero01[1] = 100
    numero01[2] = 1000
    numero01[3] = 10000

    //Imprimindo o valor do array
    print(numero01.contentToString())

    println()
    //Opção 02
    var numero02 = intArrayOf(10,100,1000,10000) //valores inseridos diretamento ao declarar o array
    print(numero02.contentToString())

    println()
    //Opção 03
    var numero03 = intArrayOf(10,100,1000,10000)
    numero03.forEach { print("$it ") } //Usando o iterador da função forEach

    println()
    //Opção 04
    var numero04 = intArrayOf(10,100,1000,10000)

    //Usando o for para percorrer e imprimir o array
    for(numero in numero04){
        print("$numero ")
    }

    /**
     * ESSE FOI O CONTEÚDO DE HOJE, GRANDE ABS E ATÉ A PRÓXIMA
     * LINCOLN S GADÉA
     */

}