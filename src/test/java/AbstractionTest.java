import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AbstractionTest {

    @Test
    public void getDeckInOrder_return52CardsCorrectlyFormatted() {
        Abstraction abstraction = new Abstraction();
        assertThat(abstraction.getDeckInOrder()).containsExactly(
                "aardvark",
                "aardvark",
                "baboon",
                "baboon",
                "camel",
                "camel",
                "deer",
                "deer",
                "elephant",
                "elephant",
                "frog",
                "frog",
                "gorilla",
                "gorilla",
                "hare",
                "hare",
                "impala",
                "impala",
                "jaguar",
                "jaguar",
                "kangaroo",
                "kangaroo",
                "lion",
                "lion",
                "moose",
                "moose",
                "newt",
                "newt",
                "octopus",
                "octopus",
                "penguin",
                "penguin",
                "quetzal",
                "quetzal",
                "rabbit",
                "rabbit",
                "salmon",
                "salmon",
                "tortoise",
                "tortoise",
                "uakaris",
                "uakaris",
                "vaquita",
                "vaquita",
                "whale",
                "whale",
                "x_ray_tetra",
                "x_ray_tetra",
                "yak",
                "yak",
                "zebra",
                "zebra"
        );
    }

    @Test
    public void snap_twoIdenticalAnimals_returnsTrue(){
        Abstraction abstraction = new Abstraction();
        assertThat(abstraction.snap(Animal.AARDVARK, Animal.AARDVARK )).isTrue();
    }

    @Test
    public void snap_twoDifferentAnimals_returnsFalse(){
        Abstraction abstraction = new Abstraction();
        assertThat(abstraction.snap(Animal.HARE, Animal.ZEBRA)).isFalse();
    }
}