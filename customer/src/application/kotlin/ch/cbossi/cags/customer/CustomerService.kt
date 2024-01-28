package ch.cbossi.cags.customer

class CustomerService internal constructor(private val customerService: CustomerRepository) {

    fun loadCustomers(): List<Customer> {
        return customerService.getCustomers()
    }

}
