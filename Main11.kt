fun main(array: Array<String>){
    val input: Array<Int?> = arrayOf(82,null, null, null, null,null, 7, 55)
    calcNullValues(input)

}
fun calcNullValues(input: Array<Int?>) {
    var sum = 0
    var sumNll=0
    for (i in input) {
        if(i!=null){
            sum+=i
        }else if(i==null){
            sumNll++
        }
    }
    print(sumNll)
    print(" ")
    print(sum)

}