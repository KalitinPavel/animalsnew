fun main(args: Array<String>) {
    val list = mutableListOf<Animal>()
    val herbivores1 = Herbivores(name = "elephan", weight = 4500.50, colo = "gray", food = "grass")
    val carnivores1 = Carnivores(name = "bear", weight = 500.55, colo = "blak", habitat = "forest")
    list.add(herbivores1)
    list.add(carnivores1)
    print(list)


}



    open class Animal(var name: String, var weight: Double, var colo: String){
        override fun toString(): String {
            return "Animal(name='$name', weight=$weight, colo='$colo')"
        }
    }
    class Herbivores(name:String, weight: Double, colo:String, var food:String): Animal(name, weight, colo){
        override fun toString(): String {
            return "Herbivores(food='$food') ${super.toString()}"
        }
    }
    class Carnivores(name:String, weight:Double, colo:String, var habitat:String): Animal(name, weight, colo){
        override fun toString(): String {
            return "Carnivores(habitat='$habitat') ${super.toString()}"
        }
    }
