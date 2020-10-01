class ProfessorTitular(nome:String,
                       sobrenome:String,
                       codigo:Int,
                       private val especialidade:String) : Professor(nome, sobrenome, codigo)