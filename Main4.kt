
fun main() {
    cashAmount(10, 2, 25)
}
fun cashAmount(dayNumber: Int,bugRank: Int, sugarAlien: Int){
    val result = (dayNumber*(bugRank+42))*sugarAlien
    print("Итоговая цена сахара: $result кредитов")
}