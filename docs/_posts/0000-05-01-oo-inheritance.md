## Inheritance

+ What is it?
    + Some notion of linking types together
        + Super classes and subclasses
        + Parents and children
        + Prototypical inheritance
    + Sharing functionality between classes
    + Extending functionality
+ Why do we do it?
    + Code reuse, save duplication

{% include background-image.html file="spoons.jpg" %}
<p style="float:bottom;font-size:15px">
<a href="https://flic.kr/p/qjSADb">Gorham Sterling Silver Spoons-1</a>
by <a href="https://www.flickr.com/photos/twintiger/">twintiger007</a> is licensed under 
<a href="https://creativecommons.org/licenses/by/2.0/">CC BY 2.0</a>
</p>

Note:
Ask these questions to the group and whiteboard their answers.  

--

### Inheritance an example

<mermaid>
classDiagram
  Vehicle <|-- Car : extends
  Vehicle <|-- Motorbike : extends
</mermaid>

Note:
Point out which class is the parent/super class and which is the child/sub class


--


### Inheritance - sharing functionality

<mermaid>
classDiagram
  Vehicle <|-- Car : extends
  Vehicle <|-- Motorbike : extends
  class Vehicle {
    getPrice()
  }
</mermaid>

Note:
The benefit of inheritance is it saves us from having to implement getPrice in both sub classes - duplication


--

### Inheritance - extending functionality

<mermaid>
classDiagram
  Vehicle <|-- Car : extends
  Vehicle <|-- Motorbike : extends
  class Vehicle {
    getPrice()
  }
  class Car {
    getDoors()
  }
</mermaid>

Note:
We can add different behaviours to sub classes as appropriate

--

### Inheritance - altering functionality

<mermaid>
classDiagram
  Vehicle <|-- Car : extends
  Vehicle <|-- Motorbike : extends
  class Vehicle {
    getPrice()
  }
  class Motorbike {
    getPrice()
  }
  class Car {
    getDoors()
  }
</mermaid>

+ This technique is called overriding

Note:
We can replace implementations in sub classes if we need different functionality - overriding

--

## Exercise - modelling cards with inheritance (15mins)

* How might you use inheritance to model the classes in your card code?
  * Consider all your card and deck classes
* Draw a class diagram to show how the classes would relate to one another

Note:
Work in language groups to collaboratively come up with a diagram

--

## Exercise Review and Implementation

<mermaid>
classDiagram
    Card <|-- AnimalCard : extends
    Card <|-- PlayingCard : extends
    class PlayingCard {
        snap(Card)
    }
    class AnimalCard {
        snap(Card)
    }
    Deck <|-- AnimalDeck : extends
    Deck <|-- PlayingCardDeck : extends
    class PlayingCardDeck {
        getCards()
        deal()
        shuffle()
    }
    class AnimalDeck {
        getCards()
        deal()
        shuffle()
    }
</mermaid>

+ Now change your code to use inheritance as shown above (15mins)

--

## Exercise remove duplication (30mins)

* Remove duplication from your code by moving common functionality into the parent classes
* Your code should resemble the diagram below:

<mermaid>
classDiagram
    Card <|-- AnimalCard : implements
    Card <|-- PlayingCard : implements
    class PlayingCard {
        snap(Card)
    }
    class AnimalCard {
        snap(Card)
    }
    Deck <|-- AnimalDeck : implements
    Deck <|-- PlayingCardDeck : implements
    class Deck {
        getCards()
        deal()
        shuffle()
    }
</mermaid>

--

## Exercise review

+ How does the code compare to before?
+ What's the difference between this version and the interface based one?
  + It's subtle and depends upon your language
  + Inheritance is a form of abstraction 

--

## Inheritance is hard to get right

+ It tends to come with a rigid set of rules
+ A more common way to model relationships between objects is via _associations_
+ An _association_ is just when one class references another
+ A special type of _association_ is `composition`

Note: similarly aggregation is also association where many objects are aggregated (stored in a collection) by another object.   

--

### Associations between our card classes

```java
class PlayingCard extends Card {  //inheritance
    private Suit suit;  //association (composition)
}

class Deck {
    protected Card[] cards;  //association (composition)
}
```

--

## Association vs. Inheritance

<div align="left">
<p>
_"A car
<span class="fragment highlight-red" data-fragment-index="1">**is a**</span>
kind of vehicle"_
<span class="fragment fade-in" data-fragment-index="2" style="color:red"> - **inheritance**</span>
</p>

<p>
<span class="fragment" data-fragment-index="3">
_"A car
<span class="fragment highlight-green" data-fragment-index="4">**has a**</span>
steering wheel"_
<span class="fragment fade-in" data-fragment-index="5" style="color:lime"> - **association**</span>
</span>
</p>

<p class="fragment">
_"A car **does not** have a vehicle"_ - **X**
</p>
<p class="fragment">
_"A steering wheel **is not** a kind of car"_ - **X**
</p>
</div>

--

> Favor object composition over class inheritance.

—[Design Patterns: Elements of Reusable Object-Oriented Software](https://uk.bookshop.org/books/design-patterns-elements-of-reusable-object-oriented-software/9780201633610)  
by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides  
(AKA the ‘Gang of Four’ book)

--

> **Tight coupling**. Classes that are tightly coupled are hard to reuse in isolation, since they depend on each other. Tight coupling leads to monolithic systems, where you can’t change or remove a class without understanding and changing many other classes. The system becomes a dense mass that’s hard to learn, port, and maintain.

—[Design Patterns: Elements of Reusable Object-Oriented Software](https://uk.bookshop.org/books/design-patterns-elements-of-reusable-object-oriented-software/9780201633610)  

--

### Class Inheritance vs Object Composition

+ **Class Inheritance**: Classes inherit behaviour from parent class <span style="color:red">(tightest coupling)</span>
  + **White-box reuse**—often the internals of parent classes are visible to subclasses
+ **Object Composition**: Classes are composed of objects whose behaviour they can access <span style="color:green">(looser coupling)</span>
  + **Black-box reuse**—objects are ‘black boxes’ and only see what is explicitly exposed of each other
+ Both achieve code reuse, both are OO

--

### Playing Card Example

<mermaid>
classDiagram
    PlayingCardDeck o-- PlayingCard : Aggregation
    PlayingCard <-- Suit : Composition
    PlayingCard <-- FaceValue : Composition
</mermaid>

+ Lets compare composition and inheritance
+ This is a simple example—our Playing Card isn’t very complex
+ Playing Cards composed of a Suit and a FaceValue

--

### Doing the same without composition

<mermaid>
classDiagram
    AbstractPlayingCard <|-- HeartPlayingCard
    AbstractPlayingCard <|-- ClubPlayingCard
    AbstractPlayingCard <|-- SpadePlayingCard
    AbstractPlayingCard <|-- DiamondPlayingCard
    HeartPlayingCard <|-- AceOfHeartsPlayingCard
    HeartPlayingCard <|-- TwoOfHeartsPlayingCard
    HeartPlayingCard <|-- ThreeOfHeartsPlayingCard
    HeartPlayingCard <|-- FourOfHeartsPlayingCard
    HeartPlayingCard <|-- FiveOfHeartsPlayingCard
    HeartPlayingCard <|-- SixOfHeartsPlayingCard
    HeartPlayingCard <|-- SevenOfHeartsPlayingCard
    HeartPlayingCard <|-- EightOfHeartsPlayingCard
    HeartPlayingCard <|-- NineOfHeartsPlayingCard
    HeartPlayingCard <|-- TenOfHeartsPlayingCard
    HeartPlayingCard <|-- JackOfHeartsPlayingCard
    HeartPlayingCard <|-- QueenOfHeartsPlayingCard
    HeartPlayingCard <|-- KingOfHeartsPlayingCard
</mermaid>

+ Without using composition we have to rely on inheritance
+ 57 tightly coupled classes
+ Hard to reuse these classes elsewhere

Note: There was only space for one of the suits!  