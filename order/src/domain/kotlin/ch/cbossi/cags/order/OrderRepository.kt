package ch.cbossi.cags.order

import ch.cbossi.cags.customer.Customer

interface OrderRepository {

    fun getOrdersForCustomer(customer: Customer): List<Order>

}
