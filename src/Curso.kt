class Curso(val codigo: Int,
            val nomeCurso: String,
            val qtdMaxAlunos: Int) {

    var profTitular: ProfessorTitular? = null
    var profAdjunto: ProfessorAdjunto? = null
    private var listaAlunosMatriculados = mutableListOf<Aluno>()


    fun adicionarAluno(aluno: Aluno): Boolean {
        if (listaAlunosMatriculados.size < qtdMaxAlunos) {
            listaAlunosMatriculados.add(aluno)
            println("Aluno ${aluno.nome} Adicionado com sucesso !")
            return true
        }
        return false
    }


    fun excluirAluno(aluno: Aluno) {
        listaAlunosMatriculados.remove(aluno)
        println("Aluno: $aluno Excluido com sucesso !")
    }


}