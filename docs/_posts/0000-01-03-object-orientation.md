## Object Orientation

<img src="{{ site.github.url }}/images/programmingParadigms.png" style="height: 450px;" alt="diagram of different programming paradigms">

\*[Van Roy](https://www.info.ucl.ac.be/~pvr/VanRoyChapter.pdf)

Note:
There are many different programming paradigms - take a moment to talk through the diagram.  
From imperative languages such as C through Java and object-orientation through to functional.  
Emphasise the distinction is fuzzy.  
**Mention the "Turing Completeness" line.**  

--

<img src="{{ site.github.url }}/images/alanTuring.jpg" style="height: 400px;" alt="Alan Turing aged 16">

1912-1954

[Alan Turing: The Enigma](https://www.amazon.co.uk/dp/B009H4ZB3G) <!-- .element: class="fragment" -->

Note:
Alan Turing - who is he?  
The notion of Turing Completeness and the fact that all the languages below the line on the previous slide have the same programming power.  

---

## What are objects

* A combination of data and behaviour
* Just like in the real world

--

## A simple object-oriented modelling technique

For a given scenario:

* Nouns == Things == Objects
* Verbs == Doing Words == Methods

--

## Example

_The
<span class="fragment highlight-red" data-fragment-index="1">cat</span>
<span class="fragment highlight-blue" data-fragment-index="2">sat</span>
on the
<span class="fragment highlight-red" data-fragment-index="1">mat</span>_

<span class="fragment" data-fragment-index="1" style="color:red">Classes: Cat, Mat</span>

<span class="fragment" data-fragment-index="2" style="color:#1b91ff">Methods: sit</span>

--

## Enterprise Cat Application Using Blockchain Technology

```java
class Cat {
    void sit(){
        System.out.println("I'll sit when I'm good and ready.");
    }
}

class Mat {
    double width;
    double length;
    double height;
}
```

--

## Exercise (30mins)

Here's a simple description of an online car advertising business <a href="#/4/5">Mini AT Scenario</a>

Identify the following:

* The Objects
* Their attributes
* Their behaviours

--

{% include_relative oo_modelling.md %}

--

## Exercise review

+ What objects, attributes and methods did you come up with?
+ What object oriented principles did we use in our design?
+ Abstraction
+ Encapsulation
+ Inheritance
+ Polymorphism

Note: Get them to describe their designs.  
  Draw designs up at the front as they go.  
  Ask whose design changed  
  Paper designs easy to change, designs in code much harder.  
  Good to do a little up front design.  

---

## Object-Oriented Concepts

<img src="{{ site.github.url }}/images/fourPillarsVenn.png" alt="Venn diagram of inheritance, encapsulation, polymorphism and abstraction">

Note:
Needs a better diagram, but the point is here that these concepts are not distinct, there is often quite a lot of overlap between these language features.  

---

## Encapsulation

+ Also known as data-hiding
+ How do we achieve it?
+ Why do we do it?

{% include background-image.html file="capsule.jpg" %}
<p style="float:bottom;font-size:15px">
<a href="https://commons.wikimedia.org/wiki/File:Reocef_capsule.jpg">Reocef capsule</a>
by Alamfarial is licensed under 
<a href="https://creativecommons.org/licenses/by-sa/3.0/deed.en">CC BY-SA 3.0</a>
</p>

Note:
Prompt them for suggestions - the answer we're looking for is "by using objects".  
Naturally there are other language features which enable it but the concept of the
object is the main one.  

--

## Playing Card Example

- Say we want to model a pack of playing cards
- And print them out in order
- There are four suits
- Cards have a value of ace through to king
- There are 4 * 13 = 52 cards in a pack

--

- Walk through the `Cards` class...

Note:
The code is not nice.  
We've chosen to model a playing card by two int values, one representing suit, one value.  
Therefore a pack is made up of an array of 52 pairs of int values - making a 2D array.  
It's probably best to walk through the current version of the code and make sure it's understood.  
It may be necessary to explain `switch` statements for example.  

--

### What's wrong with the current code?

+ There are numbers everywhere
+ Everyone knows everybody else's business

Note:
Get them to critique the existing code, see what they come up with - write up their answers somewhere and discuss.  
Note the error prone use of ints, and the fact that the Cards class knows how many cards are in a suit etc.  

--

## Exercise (30 mins)

- What new classes would you introduce to better encapsulate the existing code? 

Note:
Get them to work in small groups.  
Once complete get them to describe their designs.  
Draw designs up at the front as they describe.  

--

## Exercise Review

+ How many classes did you come up with?
+ What were they?

Note: Conduct a straw poll and see how many classes they came up with.  
  See if there's any commonality, do they come up with the same names / concepts?  
  Obviously there are many possible answers.  

--

### Possible solutions - 1

```java
class Card {
    private int suit;
    private int value;
}
```

--

### Possible solutions - 2

```java
class Card {
    private Suit suit;
    private int value;
}

class Suit {
    private String name;
}
```

--

### Possible solutions - 3

```java
class Card {
    private Suit suit;
    private int value;
}

class Suit {
    private String name;
}

class Deck {
    private Card[] cards;
}
```

Note:
Revisit this later - we can go even further if we bring in inheritance.  

---

## Lunch?

---

## Abstraction

{% include background-image.html file="jacksonPollock.jpg" %}

+ What is it?
+ Generalising
+ Taking a step-back
+ Hiding complexity
+ How do we achieve it?
+ Code structure - methods, objects
+ Inheritance?
+ Polymorphism?
+ Encapsulation?

<p style="float:bottom;font-size:15px">Background Copyright © 2011-Present www.Jackson-Pollock.org. All Rights Reserved.</p>

Note:
Get them to make suggestions, and write them up on the white-board, discuss their answers.  
Stress that many of the simple ways we structure our code in order to make it more legible are in fact abstractions.  
If it comes up, emphasise that abstraction is not just using the java _abstract_ keyword (although it is a valid example).  
Expect them to mention inheritance, which is fair enough as these distinctions all get a little fuzzy.  
In a Java context we could argue that using an interface would give us a similar effect, but is that just inheritance by the back door?  

--

### Animal Snap!

<img src="{{ site.github.url }}/images/animalSnap.jpg" alt="animal snap cards">

--

### Rules

+ Deal cards from the deck
+ When two identical cards appear next to each other...
+ The first player to call _Snap!_ gains a point
+ If a player calls _Snap!_ incorrectly then they lose a point

--

Walk through the Snap example

--

### Exercise (30mins)

+ By abstracting away functionality 
+ Make the snap game work with the normal deck of cards from the previous exercise
+ Cards with the same face-value are a valid _Snap!_

Note:
We're looking for them to use interfaces here to represent Cards and Decks  

--

### Exercise review

+ What did you do?
+ What's better about the new version?
+ Is anything worse?

Note:
Whiteboard their answers to these questions.  
See if there's a consensus, discuss differences.  

---

## Inheritance

+ What is it?
+ Sharing functionality
+ How do we achieve it?
+ Some notion of linking types together
+ Classes and subclasses
+ Proto-typical inheritance
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

### Example

```java
class Vehicle {
    void accelerate(){
        System.out.println("Getting faster");
    }
}

class Car extends Vehicle {
    private SteeringWheel steeringWheel;
}
```

Note:
Ask what Car inherits from Vehicle - i.e. the fact that it can accelerate.  
Ask what a Car has that a Vehicle doesn't - namely a SteeringWheel.  

--

## Exercise (30mins)

* Re-write your card classes to use inheritance.
* How many classes can you come up with?

--

## Exercise review

+ How many classes did you come up with?
+ What were they?

Note:
Poll them to see what classes they came up with.  
Maybe draw some class diagrams.  
Discuss commonalities / differences.  

--

## Class Diagrams

* Useful to have a standard way of drawing designs
* Unified Modelling Language
* Simplified version

--

<img src="{{ site.github.url }}/images/class-diagrams.png" alt="Components of a class diagram">

--

### Possible solutions - 3+ Classes

<img src="{{ site.github.url }}/images/Cards1.png" alt="Class diagram showing a PlayingCard and an AnimalCard extending a Card class">

--

### Possible solutions - 6+ Classes

<img src="{{ site.github.url }}/images/Cards2.png" alt="Class diagram which introduces the notion of a Deck extended by AnimalDeck and PlayingCardDeck">


--

### Possible solutions - 20+ Classes

<img src="{{ site.github.url }}/images/Cards3.png" alt="Class diagram where every Suit and every FaceValue is a class in its own right">


---

## Polymorphism

+ What is it?
+ How do we use it?
+ Mainly via inheritance mechanisms
+ Why is it useful?
+ Simplifies our code

{% include background-image.html file="pasta.jpg" %}
<p style="float:bottom;font-size:15px">
<a href="https://flic.kr/p/6iYRpr">Ancora Pasta Fresca</a>
by <a href="https://www.flickr.com/photos/hotelrealfini/">Hotel Real Fini</a> is licensed under 
<a href="https://creativecommons.org/licenses/by/2.0/">CC BY 2.0</a>
</p>

Note:
Again prompt for suggestions and discuss.  

--

### Example - Lights on a car

+ A car has many lights
+ Headlights
+ Side-lights
+ Indicators
+ Fog-lights
+ All lights can be turned on and off by controls on the dashboard

--

```java
class Light {
    void turnOn(){}
    void turnOff(){}
}

class Headlight extends Light {}
class Indicator extends Light {}
class FogLight extends Light {}

class Car {
    Light[] lights = {
        new Headlight(),
        new Indicator(),
        new FogLight()
    };

    Car(){
        for (Light light : lights) {
            light.turnOn();
        }
    }
}
```

--

### Exercise (30mins)

* Make a game of _**Super-Snap!**_
* The deck consists of a full set of playing cards and a full set of animal cards
* The rules for calling _Snap!_ are the same as before
    + a playing card will only match a playing card of the same value
    + an animal card will never match a normal playing card

--

### Exercise review

+ What did you do?
+ How did you find it?

--

There are other kinds of polymorphism...