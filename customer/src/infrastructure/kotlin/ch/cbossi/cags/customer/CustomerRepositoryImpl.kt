package ch.cbossi.cags.customer

class CustomerRepositoryImpl : CustomerRepository {
    override fun getCustomers(): List<Customer> {
        return listOf(
            Customer("John Doe"),
            Customer("Jane Smith"),
        )
    }
}
