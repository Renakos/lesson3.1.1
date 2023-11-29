import java.util.*

fun main() {
    val inputScanner: CustomScanner = Scanner(System.`in`)

    println("Введите 0 для защиты и 1 для атаки:")
    val choice = inputScanner.nextInt()

    when (choice) {
        0 -> {
            val warrior = Character.Warrior(Character.WARRIOR_NAME, "Мощный удар")
            val mage = Character.Mage(Character.MAGE_NAME, "Огненный шар")
            val archer = Character.Archer(Character.ARCHER_NAME, "Меткость")

            CharacterCommon.defend(warrior)
            CharacterCommon.defend(mage)
            CharacterCommon.defend(archer)
        }
        1 -> {
            val warrior = Character.Warrior(Character.WARRIOR_NAME, "Мощный удар")
            val mage = Character.Mage(Character.MAGE_NAME, "Огненный шар")
            val archer = Character.Archer(Character.ARCHER_NAME, "Меткость")

            CharacterCommon.attack(warrior)
            CharacterCommon.attack(mage)
            CharacterCommon.attack(archer)

            val hiller = object {
                val name = "Hiller"
                fun hill() {
                    println("$name вылечил всех!")
                }
            }

            hiller.hill()
        }
        else -> {
            println("Некорректный выбор.")
        }
    }
}
