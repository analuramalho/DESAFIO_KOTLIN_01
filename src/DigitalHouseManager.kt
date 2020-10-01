class DigitalHouseManager {
    val listaAlunos= mutableListOf<Aluno>()
    val listaProfessores= mutableListOf<Professor>()
    val listaCursos= mutableListOf<Curso>()
    val listaMatriculas= mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int,quantidadeMaximaDeAlunos: Int){
        listaCursos.add(Curso(codigoCurso,nome,quantidadeMaximaDeAlunos))
    }

    fun excluirCurso(codigoCurso: Int){
        val cursoEncontrado= listaCursos.find { it.codigo == codigoCurso }
        listaCursos.remove(cursoEncontrado)
        println("Curso excluido com sucesso !")
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String,codigoProfessor: Int, quantidadeDeHoras: Int){
        listaProfessores.add(ProfessorAdjunto(nome,sobrenome,codigoProfessor,quantidadeDeHoras))
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String,codigoProfessor: Int, especialidade: String){
        listaProfessores.add(ProfessorTitular(nome,sobrenome,codigoProfessor,especialidade))
    }

    fun excluirProfessor(codigoProfessor: Int){
        val profEncontrado= listaProfessores.find { it.codigo == codigoProfessor }
        listaProfessores.remove(profEncontrado)
        println("Professor excluido com sucesso !")

    }

    fun matricularAluno(nome: String , sobrenome: String , codigoAluno: Int){
        listaAlunos.add(Aluno(nome,sobrenome,codigoAluno))
        println("Aluno registrado com sucesso")
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        val aluno = listaAlunos.find { it.codigo == codigoAluno }
        val curso=listaCursos.find{it.codigo==codigoCurso}

        if(aluno!=null && curso!=null){
            val matricula=curso.adicionarAluno(aluno)
            if(matricula){
                listaMatriculas.add(Matricula(aluno,curso))
            } else{
                println("Não foi possível realizar a matrícula do aluno ${aluno.nome} porque não há vagas nesse curso")
            }
        } else{
            println("Não é possivel matricular o aluno")
        }

    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        val profTitular = listaProfessores.find { it.codigo == codigoProfessorTitular }
        val profAdjunto = listaProfessores.find { it.codigo == codigoProfessorAdjunto }
        if (profTitular==null || profAdjunto ==null){
            println("Preencha o professor titular e adjunto")
        }else{
            listaCursos.find{it.codigo==codigoCurso}!!.profTitular= profTitular as ProfessorTitular?
            listaCursos.find{it.codigo==codigoCurso}!!.profAdjunto= profAdjunto as ProfessorAdjunto?

            println("Professores alocados com sucesso")

        }
    }

}