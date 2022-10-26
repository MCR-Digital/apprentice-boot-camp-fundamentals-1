## Polymorphism

+ What is it?
  + The ability to interact with objects without caring about their specific type
  + Those objects will respond appropriately depending upon their type without us having to worry about it

{% include background-image.html file="pasta.jpg" %}
<p style="float:bottom;font-size:15px">
<a href="https://flic.kr/p/6iYRpr">Ancora Pasta Fresca</a>
by <a href="https://www.flickr.com/photos/hotelrealfini/">Hotel Real Fini</a> is licensed under 
<a href="https://creativecommons.org/licenses/by/2.0/">CC BY 2.0</a>
</p>

--

### Existing examples

* We already have examples of polymorphism in our code

```java
  Deck deck = new PlayingCardDeck();
  deck.shuffle();
  deck.deal();
  
  Card card = deck.deal();
  card.snap(previousCard);
```

--

### How do we use polymorphism?

* We achieve polymorphism by using inheritance / interfaces to express relationships between classes
+ Why is it useful?
    + Simplifies our code
    + Removes `if` checks



Note:
Again prompt for suggestions and discuss.  
Interfaces not really required in JS, but there are mechanisms.  

--


### Exercise (30mins)

* Make a game of _**Super-Snap**_ by creating a new MixedDeck class
* The deck consists of a full set of playing cards and a full set of animal cards
* The rules for calling _Snap!_ are the same as before
    + a playing card will only match a playing card of the same face value
    + an animal card will only match another animal card of the same creature
* Make your Snap class use the new MixedDeck

--

### Where's the polymorphism?

         ┌───────────────────────────────────────────────┐
         │  MixedDeck                                    │
         │                                               │
         │  Card[] cards = { "The ace of spades",        │
         │                   "Gorilla",                  │
         │                   "Cheeta",                   │
         │                   "The seven of diamonds" };  │
         │                                               │
         │                                               │
         └───────────────────────────────────────────────┘


+As well as the existing ways in which the Snap game interacts with the Card and Deck classes

--

### The design

```text

      
                        ┌──────────────┐
                        │  Deck        │
                        │              │
                        │  shuffle()   │
                        │  deal()      │
                        │  getCards()  │
                        └──────▲───────┘
                               │
                               │
                               │
                        ┌──────┴───────┐
                        │  MixedDeck   │
                        └──────────────┘


```

--

### Questions?

+How are you going to build your MixedDeck?
+You may struggle to get access to the cards in the existing AnimalDeck and PlayingCardDeck classes


Notes:
Building the deck feels like a job for the constructor which could be a useful conversation.
The Deck interface doesn't have a handy way to get access to the cards which gives you a chance to talk about encapsulation.
With a bit of lateral thinking you can deal() cards from the existing decks into a new MixedDeck without having to change the api.

--

### Exercise review

+ What did you do?
+ How did you find it?

