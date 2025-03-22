package models

open class BankAccount(
    private val accountNumber: String,
    private val accountHolderName: String,
    balance: Double,
) {
    var balance = balance
        protected set

    fun deposit(amount: Double): Boolean {
        if (amount > 0) {
            balance += amount
            return true
        }
        return false
    }

    fun withdraw(amount: Double): Boolean {
        if (amount <= balance) {
            balance -= amount
            return true
        }
        return false
    }

    fun getAccountInfo(): String =
        "Account Number: $accountNumber\nAccount Holder: $accountHolderName\nBalance: $balance"
}