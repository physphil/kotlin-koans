package ii_collections

fun example6() {
    val sum = listOf(1, 5, 3).sum()
}

fun Customer.getTotalOrderPrice(): Double {
    // Return the sum of prices of all products that a customer has ordered.
    // Note: a customer may order the same product for several times.
    val products = orders.flatMap { it.products }
    val prices = products.map { it.price }
    return prices.sum()

    // or can do it one line with:
//    return orders.flatMap { it.products }.map { it.price }.sum()
}
