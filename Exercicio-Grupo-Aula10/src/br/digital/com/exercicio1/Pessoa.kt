package br.digital.com.exercicio1

class Pessoa (var nome: String, var rg: Int) {
    override fun equals(other: Any?): Boolean{
        if (other !is Pessoa) return false
        return (rg == other.rg)
    }
}