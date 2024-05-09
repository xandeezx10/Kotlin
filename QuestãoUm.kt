class Pessoa(var nome: String, var idade: Int, var altura: Double) {
    fun apresentar(): String {
        return "Nome: $nome\nIdade: $idade anos\nAltura: $altura metros"
    }
}

fun main() {
    val pessoa = Pessoa("Xande", 18, 1.75)
    println(pessoa.apresentar())
}
