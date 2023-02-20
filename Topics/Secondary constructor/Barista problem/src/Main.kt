const val BEANS_WEIGHT_PER_CUP = 10F

data class EspressoMachine(var costPerServing: Float) {

    constructor(coffeeCapsulesCount: Int, totalCost: Float) : this(totalCost / coffeeCapsulesCount)
    constructor(
        coffeeBeansWeight: Float,
        totalCost: Float
    ) : this(totalCost / (coffeeBeansWeight.toInt() / BEANS_WEIGHT_PER_CUP))

}