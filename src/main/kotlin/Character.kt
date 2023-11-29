sealed class Character(val name: CustomString, val weaponType: WeaponType) {


    class Warrior(name: CustomString, val ability: CustomString) : Character(name, WeaponType.SWORD)
    class Mage(name: CustomString, val spell: CustomString) : Character(name, WeaponType.STICK)
    class Archer(name: CustomString, val ability: CustomString) : Character(name, WeaponType.BOW)

    companion object {
        const val WARRIOR_NAME = "WarriorName"
        const val MAGE_NAME = "MageName"
        const val ARCHER_NAME = "ArcherName"
    }
}
