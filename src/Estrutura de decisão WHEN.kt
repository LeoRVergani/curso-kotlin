fun main() {
    var cargo:String = "Gerente"
        when(cargo){
            "Presidente" -> println(6000f)
            "Gerente" -> println(4500f)
            "Coordenador" -> println(3000f)
            "Analista" -> println(2400f)
            "Estágiario" -> println(1600f)
            else -> println("Cargo não identificado")
        }

    var imc:Int = 67
    when(imc) {
        10 -> println("IMC está baixo")
        20 -> println("IMC está médio")
        30 -> println("IMC está alto")
        50 -> println("IMC está muito alto")
        else -> println("IMC não identificado")
    }
}