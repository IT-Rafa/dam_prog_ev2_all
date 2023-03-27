fun main() {
	val totalDias = 6
	val diasSemana = listOf("LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO")

	val valoresDias = mutableListOf<Double>()
	while (true) {
		// Comprobamos primer valor semana. -1 no entra como double, usamos string
		val input = readln()
		if (input.startsWith("-1")) {
			break
		} else {
			// si no es -1 deberían estar toda la semana
			// Capturamos el primer día y el resto
			valoresDias.add(input.toDouble())
			for (i in 1 until totalDias) {
				valoresDias.add(readln().toDouble())
			}
		}
		// Capturamos mínimo y máximo por índice
		var indiceMax = 0
		var indiceMin = 0
		var sumaDias = 0.0
		for (i in 1 until totalDias) {
			sumaDias += valoresDias[i]
			if (valoresDias[indiceMax] < valoresDias[i]) {
				indiceMax = i
			}
			if (valoresDias[indiceMin] > valoresDias[i]) {
				indiceMin = i
			}
		}
		indiceMax++
		indiceMin++
		if (diasSemana[indiceMax] == diasSemana[indiceMin]) {
			println("EMPATE")
		} else {
			print("${diasSemana[indiceMax]} ${diasSemana[indiceMin]}")
			println(if (valoresDias[totalDias - 1] > (sumaDias / totalDias)) " SI" else " NO")
		}
			
		// Eliminamos días de la semana para empezar de nuevo
		valoresDias.clear()
	}	
}
