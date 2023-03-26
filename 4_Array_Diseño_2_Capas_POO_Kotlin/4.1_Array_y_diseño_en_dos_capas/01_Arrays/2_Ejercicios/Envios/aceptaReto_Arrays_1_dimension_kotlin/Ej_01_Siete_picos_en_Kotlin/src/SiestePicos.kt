fun main() {
	var cantAlturas: Int
	// Salimos si son 0
	do {
	    cantAlturas = readln().toInt()
    
	    // Capturamos tamaños cada altura
	    if (cantAlturas in 2..1000) {
		val alturas = arrayOfNulls<Int>(cantAlturas)
		var alturasSt = readln().split(" ")
		for (index in 0 until cantAlturas) {
		    alturas[index] = alturasSt[index].toInt()
		}
    
		// Comprobamos alturas
		var picos = 0
    
		for (index in alturas.indices) {
			// Ponemos valores normales
		    var anterior = index - 1
		    var posterior = index + 1
			// Ajustamos para primero y último
		    if (index == 0) {
				anterior = alturas.size - 1
		    } else if (index == alturas.size - 1) {
				posterior = 0
		    }
			// Contamos picos (mayor que anterior y siguiente)
		    if (alturas[index]!! > alturas[anterior]!! && 
				alturas[index]!! > alturas[posterior]!!) {
					picos++
		    }
		}
		// Mostramos picos
		println(picos)
    
    
	    } else if (cantAlturas <= 0) {
			// Fin
			break;
	    } else {
			println("Error en cant. alturas. Repetimos")
	    }
	} while (true)
}
    