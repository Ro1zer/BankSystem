package models

class SavingsAccount(
    accountNumber: String,
    accountHolderName: String,
    balance: Double,
    private val interestRate: Double,
) : BankAccount(accountNumber = accountNumber, accountHolderName = accountHolderName, balance = balance) {
    fun applyInterest(): Boolean {
        super.balance *= (1 + interestRate / 100)
        return true
    }
}