package cards

class AnimalCard(private val animal: Animal) {
    fun snap(otherCard: AnimalCard?): Boolean {
        return (otherCard != null) && animal == otherCard.animal
    }

    override fun toString(): String {
        return animal.toString()
    }
}
