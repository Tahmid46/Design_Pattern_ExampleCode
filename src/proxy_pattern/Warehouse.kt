package proxy_pattern

import java.util.Hashtable

class Warehouse : IOrder {

    private val stock: Hashtable<String, Int> = Hashtable()
    //private val address: String

    override fun fulFillOrder(order: Order) {
        
    }
}