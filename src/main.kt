val digital = DigitalHouseManager()

fun main() {

    digital.registrarCurso("Analise e desenvolvimento de Sistemas", 1, 3)
    digital.registrarCurso("Gestão de tecnologia da informação", 2, 4)
    digital.registrarCurso("Banco de dados", 3, 4)

//    mostrarCursos()
//
//    digital.excluirCurso(3)
//
//    mostrarCursos()


    digital.registrarProfessorAdjunto("Pedro", "Silva", 1, 50)
    digital.registrarProfessorAdjunto("Maria", "Silveira", 2, 30)


    digital.registrarProfessorTitular("Bernardo", "Mendes", 3, "logica de programacao")
    digital.registrarProfessorTitular("Brenda", "Clara", 4, "Calculo")
//
//    mostrarProfessores()
//
//    digital.excluirProfessor(4)
//    mostrarProfessores()
//
//    digital.matricularAluno("Ana", "Luiza", 1)
//    digital.matricularAluno("Maria", "Clara", 2)
//    digital.matricularAluno("Breno", "Luiz", 3)
//    digital.matricularAluno("Julio", "Cesar", 4)
//
//    mostrarAlunos()
//
//    digital.matricularAluno(1, 1)
//    digital.matricularAluno(2, 1)
//    digital.matricularAluno(3, 1)
//    digital.matricularAluno(4, 1)
//
//    mostrarMatriculas()

    digital.alocarProfessores(1, 3, 1)
//    digital.alocarProfessores(2, 3, 1)
//    digital.alocarProfessores(3, 3, 1)
    mostrarProfessoresAlocados()

}


fun mostrarCursos() {
    for (i in digital.listaCursos) {
        println("Codigo: ${i.codigo}\n Nome: ${i.nomeCurso} \n quantidade maxima alunos ${i.qtdMaxAlunos}")
    }
}

fun mostrarProfessores() {
    for (i in digital.listaProfessores) {
        println("Codigo: ${i.codigo}\n Nome Completo: ${i.nome} ${i.sobrenome}\n")
    }
}

fun mostrarMatriculas() {
    for (i in digital.listaMatriculas) {
        println("Aluno: ${i.aluno.nome}\n Curso ${i.curso.nomeCurso} \n data matricula: ${i.dataMatricula}\n")
    }
}

fun mostrarAlunos() {

    for (i in digital.listaAlunos) {
        println("Codigo: ${i.codigo}\n Nome Completo: ${i.nome} ${i.sobrenome}\n")
    }
}

fun mostrarProfessoresAlocados() {

    for (i in digital.listaCursos) {
        if(i.profTitular!=null && i.profAdjunto !=null){
            println("Codigo: ${i.codigo}\n nome Curso: ${i.nomeCurso}\n prof Titular:${i.profTitular?.nome} \n prof Adjunto: ${i.profAdjunto?.nome}")
        }else println("Curso ${i.nomeCurso} não tem professores alocados")

    }
}

