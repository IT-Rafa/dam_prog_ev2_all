fun main() {
    // Capturamos cantidad valores; 0 finaliza
    var valores  = mutableListOf<Int>()

    do{
        var cantValores = readln().toInt()
        if(cantValores <= 0){
            break
        }else{
            val valoresSt = readln().split(" ")
            for(valor in valoresSt){
                valores.add(valor.toInt())
            }
        }

        var numeros = listOf<Int>()
        for(valor in valores){
            for(n in numeros){
                if(valor == n){

                }
            }
        }
    }while(true)
}
/*
11
1 2 2 3 3 3 4 4 4 4 5
17
1 8 9 6 3 2 1 5 4 7 9 6 3 2 1 4 7
0

 */
