import models.SavingsAccount

fun main() {
    val account = SavingsAccount(
        "54792",
        "Holder53",
        3742.56,
        3.75
    )
    val bank = BankSystem(account)
    bank.accountInfo()
    println()
    bank.deposit(500.0)
    println()
    bank.withdraw(200.0)
    println()
    bank.applyInterest()
}