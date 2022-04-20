fun main() {
    val percent = 0.0075
    val amount = 100
    val minCommission = 35
    val commission = amount * percent

    val result = if (commission < minCommission) minCommission else commission
    println("Сумма перевода: $amount Коммиссия: $result")


}
