fun main() {
        val totalDias = 6
        val valoresDias = mutableListOf<Double>()
        for(indices in 0 until totalDias){
            valoresDias.add(readln().toDouble())
        }
    
        var indiceMax = 0
        var indiceMin = 0
        var sumaDias = 0.0
        for(index in valoresDias.indices){
            sumaDias += valoresDias[index]
            if(valoresDias[indiceMax] <= valoresDias[index] ){
                indiceMax = index
            }
            if(valoresDias[indiceMin] >= valoresDias[index] ){
                indiceMin = index
            }
        }
        val media = sumaDias / totalDias
        val domingo = valoresDias[totalDias-1]
        val dia = when (indiceMax) {
            0 -> "Martes"
            1 -> "Miércoles"
            2 -> "Jueves"
            3 -> "Viernes"
            4 -> "Sábado"
            5 -> "Domingo"
            else -> "No válido."
        }
        println(dia)
    
        println("max: $indiceMax; min: $indiceMin; domingo superior media: $domingo / $media")
    }
    