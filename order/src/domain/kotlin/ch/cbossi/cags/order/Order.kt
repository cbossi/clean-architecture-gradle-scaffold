package ch.cbossi.cags.order

import ch.cbossi.cags.customer.Customer

data class Order internal constructor(val customer: Customer, val amount: Int)
