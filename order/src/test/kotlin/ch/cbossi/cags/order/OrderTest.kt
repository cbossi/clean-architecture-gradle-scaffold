package ch.cbossi.cags.order

import ch.cbossi.cags.customer.Customer
import ch.cbossi.cags.customer.CustomerRepository

class OrderTest {

    fun test(customerRepositoryMock: CustomerRepository, customerMock: Customer) {
        val orderService = OrderService(OrderRepositoryImpl(), customerRepositoryMock)

        val order = Order(customerMock, 42)

        orderService.printOrders()
    }
}
