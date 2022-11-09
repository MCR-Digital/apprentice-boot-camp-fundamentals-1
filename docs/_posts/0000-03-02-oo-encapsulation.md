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

We achieve ***encapsulation*** by wrapping
***state*** and ***behaviour*** inside objects


<mermaid>
classDiagram
    class Object {
        state
        behaviour()
    }
</mermaid>

--

### Why do we encapsulate things?

+ Organisation
+ Maintainability
+ Safety
+ Reuse

Note:

* Organisation of our code, smaller chunks are easier to understand - legibility
* Maintainability - we can change the internals without anyone else needing to know
* Safety - protecting access to data and behaviour - fewer bugs
* Reuse - our nicely packaged code is easier to use elsewhere

--

## Playing Card Example

<backgroundimage>{{ "/images/playing_cards.jpeg" | absolute_url }}</backgroundimage>
<backgroundimageopacity>0.20</backgroundimageopacity>

- Say we want to model a pack of playing cards
- And print them out in order
- There are four suits
- Cards have a value of ace through to king
- There are 4 * 13 = 52 cards in a pack

<small><a href="https://commons.wikimedia.org/wiki/File:AcetoFive.JPG">Ron Maijen</a>, <a href="https://creativecommons.org/licenses/by-sa/3.0">CC BY-SA 3.0</a>, via Wikimedia Commons</small>

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

## Exercise incoming…

Throughout the boot camp, we have some good practices we want you to follow:

+ 🏃‍♀️ Run all of the tests when you start and after each change
+ 💥 If you introduce a compilation failure, fix it before moving on
+ ✅ When the tests pass, commit and say where you are up to in the message

Note: This will help you avoid getting into a mess and having to throw away lots of progress  

--

## Exercise (15 mins)

- What new classes would you introduce to better encapsulate the existing code? 
- What attributes do those classes have?
- Don't write any code - this is a pens and paper exercise

Note:
Get them to work in small groups.  
Once complete get them to describe their designs.  
Draw designs up at the front as they describe.  

--

## Exercise Review

+ How many classes did you come up with?
+ What were they?
+ What were their attributes?

Note: Conduct a straw poll and see how many classes they came up with.  
  See if there's any commonality, do they come up with the same names / concepts?  
  Obviously there are many possible answers.  

--

### One possible solution

<mermaid>
classDiagram
    class PlayingCard {
        Suit suit
        int faceValue
    }
    class Suit {
        String name
    }
    class PlayingCardDeck {
        Card[] cards
    }
</mermaid>

--

## Exercise - introduce a playing card (20mins)

* Create a playing card class
* Make the existing code use it
* The test should still pass

<mermaid>
classDiagram
    class PlayingCard {
        int suit
        int faceValue
    }
</mermaid>

--

## Exercise - introduce a suit (20mins)

* Create a suit class
* Make the existing code use it
* You'll need to change the playing card class to use it
* The test should still pass

<mermaid>
classDiagram
    PlayingCard *-- Suit : Composition
    class PlayingCard {
        Suit suit
        int faceValue
    }
    class Suit {
        String name
    }
</mermaid>

Note: The relationship shown here is composition. PlayingCard is composed of a Suit.

--

## Exercise - introduce a deck (20mins)

* Create a deck class
* Make the existing code use it
* The test should still pass

<mermaid>
classDiagram
    class PlayingCardDeck {
        Card[] cards
    }
</mermaid>

--

## Exercise - reflection

* How does our code compare to the original version?
* What's better?
* What's worse?