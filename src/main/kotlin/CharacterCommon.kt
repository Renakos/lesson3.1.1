object CharacterCommon {
    fun attack(character: Character) {
        when (character) {
            is Character.Warrior -> println("${character.name} с атакой ${character.weaponType.weapon} наносит урон.")
            is Character.Mage -> println("${character.name} использует заклинание ${character.spell}.")
            is Character.Archer -> println("${character.name} выстреливает из ${character.weaponType.weapon}.")
        }
    }

    fun defend(character: Character) {
        when (character) {
            is Character.Warrior -> println("${character.name} с абилкой ${character.ability} защищает группу.")
            is Character.Mage -> println("${character.name} создает защитное поле с помощью заклинания ${character.spell}.")
            is Character.Archer -> println("${character.name} использует свою способность ${character.ability} для уклонения.")
        }
    }
}
