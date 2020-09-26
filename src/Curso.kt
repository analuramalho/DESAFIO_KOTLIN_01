class Curso(private val codigo:Int,
            private val nomeCurso:String,
            private val profTitular:ProfessorTitular,
            private val profAdjunto:ProfessorAdjunto, private val qtdMaxAlunos: Int) {
    private val listaAlunosMatriculados= mutableListOf<Aluno>()

    private fun adicionarAluno(aluno: Aluno):Boolean{
        if(aluno!=null){
            listaAlunosMatriculados.add(aluno)
            println("Aluno: $aluno Adicionado com sucesso !")
            return true
        }
        return false
    }

    private fun excluirAluno(aluno: Aluno){
        listaAlunosMatriculados.indexOf(aluno)
        if(aluno!=null){
            listaAlunosMatriculados.remove(aluno)
            println("Aluno: $aluno Excluido com sucesso !")
        }
    }


}