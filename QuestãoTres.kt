class Calculadora {
    fun somar(a: Int, b: Int): Int {
        return a + b
    }

    fun subtrair(a: Int, b: Int): Int {
        return a - b
    }

    fun multiplicar(a: Int, b: Int): Int {
        return a * b
    }

    fun dividir(a: Int, b: Int): Int {
        if (b != 0) {n é divide por 0}
        return a / b
    }
}

fun main() {
    val calculadora = Calculadora()

    println("Soma: " + calculadora.somar(5, 3))
    println("Subtração: " + calculadora.subtrair(10, 4))
    println("Multiplicação: " + calculadora.multiplicar(6, 7))
    println("Divisão: " + calculadora.dividir(10, 2))
}
