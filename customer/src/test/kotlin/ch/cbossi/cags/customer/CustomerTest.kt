package ch.cbossi.cags.customer

class CustomerTest {

    fun test() {
        val customer: Customer = Customer("Test Customer")
        val repository: CustomerRepository = CustomerRepositoryImpl()
        val service = CustomerService(repository)

        service.loadCustomers()
        println(customer)
    }

}
