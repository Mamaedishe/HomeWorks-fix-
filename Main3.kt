fun main() {
    val nums = intArrayOf(44,70,6,12,0,1)

    calcChairs(*nums)
}
fun calcChairs(vararg value: Int){
    for(values in value){
        val value2 = values/2
        val result = values + value2
        print("$result, ")
    }

}