fun main() {
    var nibirunianClass = NibirunianClass()
    val name = "Marat"
    nibirunianClass.createNamePlate(name)

}
class NibirunianClass() {
    public var namePlate : String? = null

    fun createNamePlate (name : String){

        val message = "Живи долго и счастливо, $name"

        namePlate=message
        println(namePlate)
    }

}