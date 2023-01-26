import java.util.logging.Level

open class Pokemon(
    var name: String,
    var level: Int,
    var trefferpunkte: Int,
    var schadenswert: Double = 0.5 * level,
    var typ: String,
    var isKO: Boolean = false,
) {


    fun looseTP(lost: Int) {
        trefferpunkte -= lost
        if (trefferpunkte <= 0) {
            isKO = true
            println("für pokemon ${this.name}ist game over")
        }
    }


    fun attack(pok: Pokemon) {
        pok.looseTP(schadenswert.toInt())
        println("pokemon ${pok.name} hat noch ${pok.trefferpunkte}")

    }

}