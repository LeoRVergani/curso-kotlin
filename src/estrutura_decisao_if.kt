fun main() {
    val idade = 20
    if(idade >= 60){
        println("Essa pessoa é idosa.")
    } else if (idade<=59 && idade>=21){
        println("Essa pessoa é adulta.")
    } else if (idade<=20 && idade>=13){
        println("Essa pessoa é jovem.")
    } else {
        println("Essa pessoa é criança.")
    }
}