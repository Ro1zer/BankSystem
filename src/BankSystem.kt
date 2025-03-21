import models.SavingsAccount

class BankSystem(
    private val account: SavingsAccount,
) {
    fun deposit(amount: Double) {
        println("Depositing: $amount...")
        if (account.deposit(amount)) {
            println("New balance: ${account.getAccountBalance()}")
        } else {
            println("Error, couldn't make a deposit with value: $amount")
        }
    }

    fun withdraw(amount: Double) {
        println("Withdrawing: $amount...")
        if (account.withdraw(amount)) {
            println("New balance: ${account.getAccountBalance()}")
        } else {
            println("Error, couldn't make a withdraw with value: $amount")
        }
    }

    fun applyInterest() {
        println("Applying interest...")
        if (account.applyInterest()) {
            println("New Balance with Interest: ${account.getAccountBalance()}")
        } else {
            println("Error, couldn't make a interest")
        }
    }

    fun accountInfo() {
        println(account.getAccountInfo())
    }
}