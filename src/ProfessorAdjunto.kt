class ProfessorAdjunto (nome:String,
                        sobrenome:String,
                        tempoCasa:Int,
                        codigo:Int,
                        private val qtdHorasMonitoria:Int) : Professor(nome, sobrenome, tempoCasa, codigo)