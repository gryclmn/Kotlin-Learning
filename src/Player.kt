class Player(val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {

    var weapon: Weapon = Weapon(name = "Fist", damageInflicted = 1)
    val inventory = ArrayList<Loot>()

    fun show() {
        if (lives > 0) {
            println("$name is alive")
        } else {
            println("Is dead :(")
        }
    }

    override fun toString(): String {
        return """
            name: $name
            lives: $lives
            level: $level
            score: $score
            weapon: ${weapon.name}
            weapon damage: ${weapon.damageInflicted}
            """
    }

    fun getLoot(item: Loot) {
        inventory.add(item)
    }

    fun dropLoot(item: Loot): Boolean {
        return if (inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            false
        }
    }

    fun dropLoot(name: String): Boolean {
        for (item in inventory) {
            if (item.name == name) {
                println("$name will be dropped")
                inventory.remove(item)
                return true
            }
        }
        println("$name is not in inventory")
        return false
    }

    fun showInventory() {
        var total = 0.0
        println("$name's Inventory")
        for (item in inventory) {
            println(item)
            total += item.value
        }
        println("=======================")
        println("Total score is: $total")
        println("=======================")
    }
}