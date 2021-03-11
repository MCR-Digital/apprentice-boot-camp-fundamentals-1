## Inheritance

+ What is it?
    + Sharing functionality
+ How do we achieve it?
    + Some notion of linking types together
        + Classes and subclasses
        + Proto-typical inheritance
    + Composition (sharing functionality without inheritance)
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

<img src="{{ "/images/class-diagrams.png" | absolute_url }}" alt="Components of a class diagram">

--

### Possible solutions - 3+ Classes

<img src="{{ "/images/Cards1.png" | absolute_url }}" alt="Class diagram showing a PlayingCard and an AnimalCard extending a Card class">

--

### Possible solutions - 6+ Classes

<img src="{{ "/images/Cards2.png" | absolute_url }}" alt="Class diagram which introduces the notion of a Deck extended by AnimalDeck and PlayingCardDeck">


--

### Possible solutions - 20+ Classes

<img src="{{ "/images/Cards3.png" | absolute_url }}" alt="Class diagram where every Suit and every FaceValue is a class in its own right">

--

### Composition: the other way

+ Another way to achieve code-reuse
+ Classes are compose of (contain instances of) other classes
+ These instances implement the desired reusable functionality
+ Composition avoids brittle inheritance trees
+ Another way to achieve the same thing—composition is still OO

--

### Our Vehicle example

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

Note: Car contains a steering wheel  
  Go karts and boats also require a steering wheel  
  Car doesn’t attempt to inherit the steering wheel behaviour by inheriting it from some AbstractSteerableVehicle

--

## Another example: Pizza

<img src="{{ "images/pizza-inheritance-composition.webp" | absolute_url }}">

Note: Who likes pineapple on a pizza?  
  Inheritance approach left, composition right  
  Discuss pros/cons  
  What if you want to stop serving margherita?  

--

## Composition powers OO-CSS

+ Caution: CSS
+ OO-CSS splits structure and skin into separate CSS blocks
+ Skin can be reused, being applied to all sorts of different elements
+ Classes are applied to elements to ‘import’ the bits of reusable style