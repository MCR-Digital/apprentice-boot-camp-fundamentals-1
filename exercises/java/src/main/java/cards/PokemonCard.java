package cards;

public class PokemonCard extends Card {

    private final Pokemon pokemon;

    PokemonCard(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public boolean snap(Card otherCard) {
        return otherCard != null && this.pokemon.equals(((PokemonCard)otherCard).pokemon);
    }

    @Override
    public String toString() {
        return pokemon.toString();
    }
}
