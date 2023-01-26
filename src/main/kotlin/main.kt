fun main() {


    var pokemon1: Pokemon = Pokemon("PICATSU", 3, 50, 5.5, "Elektro")
    var pokemon2: Pokemon = Pokemon("Glumanda", 2, 50, 5.5, "Feuer")
    var pokemon3: Pokemon = Pokemon("schigi", 5, 50, 6.0, "wasser")


//    pokemon1.attack(pokemon2)
//    pokemon2.attack(pokemon1)
//
//    pokemon1.attack(pokemon2)
//    pokemon2.attack(pokemon1)
//    pokemon3.attack(pokemon1)
//
//    pokemon1.attack(pokemon2)
//    pokemon2.attack(pokemon1)


    fun fight(pok1:Pokemon,pok2: Pokemon) {
        while(pok1.isKO === false) {
            pok1.attack(pok2)
            pok2.attack(pok1)

        }

    }
    fight(pokemon1,pokemon2)

}






