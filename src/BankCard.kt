class BankCard(val cardNumber: Int, private val password: Int, cardCode: Int) {

    val cardCode: Int = cardCode
        get() {
            println("Введите пароль: ")
            try {
                val pass = readln().toInt()
                if (password == pass) println("Код карты: $field") else println("Неправильный пароль")
                return field
            } catch (e: NumberFormatException){
                println("Неправильный пароль")
                return 0
            }
        }

    override fun toString(): String {
        return "BankCard(cardNumber=$cardNumber, password=$password)"
    }
}