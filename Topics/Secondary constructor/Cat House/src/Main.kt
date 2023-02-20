@SuppressWarnings("ALL")
class Kitty {
    var color: String = "white"
    var age: Int = 1

    constructor(addColor: String) {
        color = "${color}and$addColor"
    }

    constructor(age: Int) {
        this.age = age
    }

    constructor(color: String, age: Int) {
        this.age = age
        this.color = color
    }

    constructor(age: Int, addColor: String) {
        color = "${color}and$addColor"
        this.age = age
    }
}