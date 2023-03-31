fun main() {
	// Capturamos cantidad valores; 0 finaliza
	var valores = mutableListOf<Int>()

	do {
		// Capturamos los valores de 1 string
		val input = readln()
		if (input.isEmpty()) {
			break
		}
		var cantValores = input.toInt()
		if (cantValores <= 0) {
			break
		} else {
			val valoresSt = readln().split(" ")
			for (valor in valoresSt) {
				valores.add(valor.toInt())
			}
		}

		data class Numbs(val number: Int, var cant: Int)

		var numbs = mutableListOf<Numbs>()
		for (valor in valores) {
			val n = numbs.find { num -> valor == num.number }
			if (n == null) {
				numbs.add(Numbs(valor, 1))
			} else {
				n.cant++
			}
		}
		val max = numbs.maxByOrNull { n -> n.cant }
		if (max != null) {
			println(max.number)
		} else {
			println("Error al buscar máximo")
		}

		valores.clear()
		numbs.clear()
	} while (true)
}
