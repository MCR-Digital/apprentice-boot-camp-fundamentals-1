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

--

### Associations between our card classes

```java
class PlayingCard extends Card {  //inheritance
    private Suit suit;  //association
}

class Deck {
    protected Card[] cards;  //association
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





