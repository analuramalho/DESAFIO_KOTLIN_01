class ProfessorTitular(nome:String,
                       sobrenome:String,
                       tempoCasa:Int,
                       codigo:Int,
                       private val especialidade:String) : Professor(nome, sobrenome, tempoCasa, codigo)