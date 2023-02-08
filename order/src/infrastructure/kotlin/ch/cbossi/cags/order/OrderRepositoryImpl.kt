package ch.cbossi.cags.order

import ch.cbossi.cags.customer.Customer

class OrderRepositoryImpl : OrderRepository {
    override fun getOrdersForCustomer(customer: Customer): List<Order> {
        return listOf(
            Order(customer, 42),
            Order(customer, 24),
        )
    }
}
