fun main() {
    var cantValores: Int
    // Salimos si son 0
    do {
        cantValores = readln().toInt()
    
        // Capturamos los valores
        if (cantValores in 1..25_000) {
            var valores = mutableListOf<Int>()
            val valoresSt = readln().split(" ")
            for (index in valoresSt.indices) {
                valores.add(valoresSt[index].toInt())
            }
            // Ordenamos valores
            valores.sort()
    
            // Calculamos mediana (si impar, el medio * 2; si no sumamos dos del medio
            val medio = valores.size / 2
            if (valores.size % 2 == 0) {
                println(valores[medio - 1] + valores[medio])
            } else {
                println(valores[medio] * 2)
            }
        } else if (cantValores <= 0) {
                break
            } else {
                println("Error en cant. valores. Repetimos")
            }
    } while (true)
}
    