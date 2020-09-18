package br.digital.com.exercicio3

data class Aluno ( var nome : String, var numeroDeAluno : Int) {
    override fun equals(other: Any?): Boolean {
        return if (other is Aluno){
            other.numeroDeAluno == this.numeroDeAluno
        }
        else false
    }
}