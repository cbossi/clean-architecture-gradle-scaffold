package ch.cbossi.cags.customer

interface CustomerRepository {

    fun getCustomers(): List<Customer>
}
