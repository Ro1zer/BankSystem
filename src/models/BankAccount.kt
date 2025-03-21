package models

open class BankAccount(
    private val accountNumber: String,
    private val accountHolderName: String,
    protected var balance: Double,
) {

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

    fun getAccountBalance(): Double = this.balance

    fun getAccountInfo(): String =
        "Account Number: $accountNumber\nAccount Holder: $accountHolderName\nBalance: $balance"
}