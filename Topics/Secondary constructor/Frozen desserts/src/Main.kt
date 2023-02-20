const val POPSICLE_PRICE = 7
const val SCOOP_PRICE = 5
const val TOPPING_PRICE = 2
@SuppressWarnings("ALL")
class IceCreamOrder() {
    var price: Int = 0

    constructor(popsicles: Int) : this() {
        this.price = popsicles * POPSICLE_PRICE
    }

    constructor(scoops: Int, toppings: Int) : this() {
        this.price = scoops * SCOOP_PRICE + toppings * TOPPING_PRICE
    }
}