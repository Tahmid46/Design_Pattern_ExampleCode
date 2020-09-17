package facade_design_pattern

import java.math.BigDecimal

interface IAccount {
    fun deposit(amount: BigDecimal)
    fun withdraw(amount: BigDecimal)
    fun transfer(destination: IAccount, amount: BigDecimal)
    fun getAccountNumber(): Int
    fun checkBalance(): BigDecimal
}