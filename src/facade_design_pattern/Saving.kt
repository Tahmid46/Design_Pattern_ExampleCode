package facade_design_pattern

import java.math.BigDecimal

class Saving(
        private var balance: Int = 0
) : IAccount {

    override fun deposit(amount: BigDecimal) {
        TODO("Not yet implemented")
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