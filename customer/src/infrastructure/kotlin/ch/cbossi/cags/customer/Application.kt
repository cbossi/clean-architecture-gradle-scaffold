package ch.cbossi.cags.customer

fun main() {
    val customerService = CustomerService(CustomerRepositoryImpl())

    println(customerService.loadCustomers())
}