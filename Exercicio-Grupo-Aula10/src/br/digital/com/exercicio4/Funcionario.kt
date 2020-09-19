package Equals

data class Funcionario(var nome :String, var numeroDeRegistro: Int) {
    override fun equals(other: Any?): Boolean {
        if (numeroDeRegistro != other) return false
        return true
    }

}