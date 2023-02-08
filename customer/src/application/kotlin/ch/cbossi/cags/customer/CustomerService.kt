package ch.cbossi.cags.customer

class CustomerService internal constructor(private val customerService: CustomerRepository) {

    fun printCustomers() {
        customerService.getCustomers().forEach(::println)
    }

}
