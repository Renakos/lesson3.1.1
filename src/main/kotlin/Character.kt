sealed class Character(val name: String, val weaponType: WeaponType) {


    class Warrior(name: String, val ability: String) : Character(name, WeaponType.SWORD)
    class Mage(name: String, val spell: String) : Character(name, WeaponType.STICK)
    class Archer(name: String, val ability: String) : Character(name, WeaponType.BOW)

    companion object {
        const val WARRIOR_NAME = "WarriorName"
        const val MAGE_NAME = "MageName"
        const val ARCHER_NAME = "ArcherName"
    }
}
