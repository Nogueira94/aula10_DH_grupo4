package Equals




fun main(){
    val funcionario1 = Funcionario("Danilo",1000)
    val funcionario2 = Funcionario("Murilo",2000)
    val funcionario3 = Funcionario("Rodrigo",3000)
    val funcionario4 = Funcionario("Daniel",4000)
    var listaFuncionarios = mutableListOf<Funcionario>()
    listaFuncionarios.add(funcionario1)
    listaFuncionarios.add(funcionario2)
    listaFuncionarios.add(funcionario3)
    listaFuncionarios.add(funcionario4)
    val funcionario5 = Funcionario("Murilo", 2000)

    println(listaFuncionarios.contains(funcionario5))
    println (listaFuncionarios.forEach{println(it.equals(funcionario5.numeroDeRegistro))})


}