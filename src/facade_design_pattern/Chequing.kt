package facade_design_pattern

import java.math.BigDecimal

class Chequing(
        private val amount: Int = 0
) : IAccount {

    private var balance: BigDecimal = BigDecimal(amount)

    override fun deposit(amount: BigDecimal) {
    }

    override fun withdraw(amount: BigDecimal) {
        TODO("Not yet implemented")
    }

    override fun transfer(destination: IAccount, amount: BigDecimal) {
        TODO("Not yet implemented")
    }

    override fun getAccountNumber(): Int {
        TODO("Not yet implemented")
    }

    override fun checkBalance(): BigDecimal {
        TODO("Not yet implemented")
    }
}