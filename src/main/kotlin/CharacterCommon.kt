object CharacterCommon {
    fun attack(character: Character) {
        with(character) {
            when (this) {
                is Character.Warrior -> println("$name с атакой ${weaponType.weapon} наносит урон.")
                is Character.Mage -> println("$name использует заклинание $spell.")
                is Character.Archer -> println("$name выстреливает из ${weaponType.weapon}.")
            }
        }
    }

    fun defend(character: Character) {
        with(character) {
            when (this) {
                is Character.Warrior -> println("$name с абилкой $ability защищает группу.")
                is Character.Mage -> println("$name создает защитное поле с помощью заклинания $spell.")
                is Character.Archer -> println("$name использует свою способность $ability для уклонения.")
            }
        }
    }
}
