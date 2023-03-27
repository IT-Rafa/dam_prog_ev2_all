fun main() {
        val totalDias = 6
        val diasSemana =  listOf("LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES", "SÁBADO", "DOMINGO")
        val valoresDias = mutableListOf<Double>()
        for (indices in 0 until totalDias) {
            valoresDias.add(readln().toDouble())
        }
    
        var indiceMax = 0
        var indiceMin = 0
        var sumaDias = 0.0
        for (index in valoresDias.indices) {
            sumaDias += valoresDias[index]
            if (valoresDias[indiceMax] <= valoresDias[index]) {
                indiceMax = index
            }
            if (valoresDias[indiceMin] >= valoresDias[index]) {
                indiceMin = index
            }
    
        }
        indiceMax++
        indiceMin++
        val media = sumaDias / totalDias
        val domingo = valoresDias[totalDias - 1]
        print(if (indiceMax == indiceMin) "EMPATE" else "${diasSemana[indiceMax]} ${diasSemana[indiceMin]}")
        println(if (domingo >= media) " SI" else " NO")
}
    /*
    -- ENTRADA
    185.50
    250.36
    163.45
    535.20
    950.22
    450.38
    -- SALIDA
    SABADO JUEVES SI
    -- ENTRADA
    -1
    -- FIN
    
    