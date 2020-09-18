package br.digital.com.exercicio2

data class Coca (var tamanho: Int, var preco: Double){
    override fun equals(other: Any?): Boolean {
        if(other !is Coca) return false
        return (tamanho == other.tamanho)
    }
}