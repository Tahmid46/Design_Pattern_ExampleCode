package facade_design_pattern

import java.math.BigDecimal

class Customer {

    private val bankService: BankService = BankService()
    private val mySavings: Int = bankService.createAccount(facade_design_pattern.AccountType.SAVINGS, 500)
    private val myInvestment: Int = bankService.createAccount(facade_design_pattern.AccountType.INVESTMENT, 1000)
    val a = bankService.transferMoney(mySavings, myInvestment, BigDecimal(300))
}