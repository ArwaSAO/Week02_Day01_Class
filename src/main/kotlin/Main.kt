

// class ClassName { }
class House(_color: String) {
    var color: String = _color
    var numberOfRooms: Int = 3
    var isForSale: Boolean = false


    fun putOnSale() {
        isForSale = true
    }
}

fun main(){

    var myHouse = House("Black")

    println(myHouse.color)

    println(myHouse.isForSale)
    myHouse.putOnSale()
    println(myHouse.isForSale)
}