package ch.cbossi.cags.customer

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class CustomerTest {

    @Test
    fun test() {
        val repository: CustomerRepository = CustomerRepositoryImpl()
        val service = CustomerService(repository)

        val customers = service.loadCustomers()

        assertTrue(customers.size == 2)
        assertTrue(customers.containsAll(setOf(Customer("John Doe"), Customer("Jane Smith"))))
    }

}
