package br.digital.com.exercicio3

fun main(){
    val aluno1 = Aluno("Guilherme",1)
    val aluno2 = Aluno("Matheus",2)
    val aluno3 = Aluno("Arthur",3)
    val aluno4 = Aluno("Danilo",4)
    val listaAluno = mutableListOf<Aluno>()

    listaAluno.add(aluno1)
    listaAluno.add(aluno2)
    listaAluno.add(aluno3)
    listaAluno.add(aluno4)

    val aluno5 = Aluno("João",2)

    println(listaAluno.contains(aluno5))


}