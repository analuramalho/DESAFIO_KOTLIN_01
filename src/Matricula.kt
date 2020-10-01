import java.time.LocalDateTime
import java.util.*

data class Matricula(val aluno: Aluno,
                     val curso: Curso ){

    val dataMatricula= LocalDateTime.now()

}