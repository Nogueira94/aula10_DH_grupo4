package br.digital.com.exercicio1

fun main(){
    val pessoa1 = Pessoa("Matheus", 12345)
    val pessoa2 = Pessoa("José", 12345)

    if (pessoa1 == pessoa2) println("${pessoa1.nome} é igual a ${pessoa2.nome}.")
    else println("${pessoa1.nome} é diferente de ${pessoa2.nome}.")
}