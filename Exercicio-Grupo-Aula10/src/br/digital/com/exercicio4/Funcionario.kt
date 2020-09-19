package br.digital.com.exercicio4

data class Funcionario(var nome :String, var numeroDeRegistro: Int) {
   override fun equals(other: Any?): Boolean {
       return if (other is Funcionario) {
           other.numeroDeRegistro == this.numeroDeRegistro
   }
        else false
   }

}