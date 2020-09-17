package facade_design_pattern

import java.math.BigDecimal
import java.util.*

class BankService {

    private val bankAccount: Hashtable<Int, IAccount> = Hashtable<Int, IAccount>()

    fun createAccount(type: AccountType, initAmount: Int): Int {
        var accountNumber: Int = -1
        var newAccount: IAccount? = null
        newAccount = when(type) {
            AccountType.SAVINGS -> Saving(initAmount)
            AccountType.CHEQUING -> Chequing(initAmount)
            AccountType.INVESTMENT -> Investment(initAmount)
        }
        if(newAccount != null) {
            accountNumber = newAccount.getAccountNumber()
            this.bankAccount[accountNumber] = newAccount
        }
        return accountNumber
    }

    fun transferMoney(to: Int, from: Int, amount: BigDecimal) {
        val toAccount: IAccount? = bankAccount[to]
        if (toAccount != null) {
            bankAccount[from]?.transfer(toAccount, amount = amount)
        }
    }


}