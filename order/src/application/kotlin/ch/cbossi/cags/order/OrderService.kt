package ch.cbossi.cags.order

import ch.cbossi.cags.customer.CustomerRepository

class OrderService(
    private val orderRepository: OrderRepository,
    private val customerRepository: CustomerRepository,
) {

    fun printOrders() {
        customerRepository.getCustomers()
            .flatMap(orderRepository::getOrdersForCustomer)
            .forEach { println(it) }
    }
}
