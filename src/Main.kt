fun main(args: Array<String>) {
    val gary = Player("Gary")
    val jen = Player("Jen", level = 10)
    val lily = Player("Lily",level = 4, lives = 8)
    val gizmo = Player("Gizmo", level = 2, lives = 5, score = 1000)

    val sword = Weapon("Master Sword", 50)
    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    gary.inventory.add(redPotion)

    gary.showInventory()

}
