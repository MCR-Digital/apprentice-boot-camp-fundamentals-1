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

abstract (*adjective*)

1. existing in thought or as an idea but not having a physical or concrete existence.
1. disassociated from any specific instance.

abstract (*verb*)

1. to consider apart from application to or association with a particular instance

Note: These definitions are not complete, but are dictionary definitions and have been hand picked to position this concept.  
  abstract classes, interfaces

--

We achieve ***abstraction*** by hiding
***implementation*** behind interfaces

```text
┌───────────┐     ┌───────────────┐      ┌────────────────┐
│           │     │               │      │                │
│   Client  ├─────► <<Interface>> ◄──────┤ Implementation │
│           │     │               │      │                │
└───────────┘     └───────────────┘      └────────────────┘
```

--

### Example

Once you learn to write, you can write with any number of instruments.

```text
 ┌──────────┐ Writes with    ┌──────────────────────┐
 │  Person  ├────────────────► «Writing Instrument» │
 └──────────┘                └──────────▲───────────┘
                                        │
                                        │Implements
                             ┌───────┐  │  ┌─────────┐
                             │  Pen  ├──┼──┤  Quill  │
                             └───────┘  │  └─────────┘
                                        │
                          ┌──────────┐  │  ┌─────────┐
                          │  Pencil  ├──┴──┤  Chalk  │
                          └──────────┘     └─────────┘
```

--

### Abstraction vs Encapsulation

+ How does Abstraction differ from Encapsulation
+ Can you see an overlap?
+ Encapsulation relates to hiding data and behaviour within classes
+ Abstraction relates to hiding **classes**

--

### Animal Snap!

<img src="{{ "/images/animalSnap.jpg" | absolute_url }}" alt="animal snap cards">

--

### Rules

+ Deal cards from the deck
+ When two identical cards appear next to each other...
+ The first player to call _Snap!_ gains a point
+ If a player calls _Snap!_ incorrectly then they lose a point

--

Walk through the Snap example

--

### Exercise - Introduce a Card interface (20mins)

* What methods does Snap call on the AnimalCard?
* Put these methods in a new Card interface
* Make the AnimalCard implement the Card interface
* Make the Snap game refer to the new interface **not** the AnimalCard class
* The game should still work...

--

### What have we done?

```text
Before:

┌────────┐
│        │  snap(Card) ┌────────────┐
│  Snap  ├─────────────► AnimalCard │
│        │             └────────────┘
└────────┘

After:

┌────────┐
│        │  snap(Card) ┌────────────┐ implements ┌────────────┐
│  Snap  ├─────────────►  <<Card>>  ◄────────────┤ AnimalCard │
│        │             └────────────┘            └────────────┘
└────────┘
```

--

### Exercise - Introduce a Deck interface (40mins)

* What methods does Snap call on the AnimalDeck?
* Put these methods in a new Deck interface
* Make the AnimalDeck implement the Deck interface
* Make the Snap game refer to the new interface **not** the AnimalDeck class
* The game should still work...

--

### What have we done?

```text
Before:

┌────────────┐  getCards()  ┌────────────┐
│            ├─────────────►│            │
│            │              │            │
│            │  deal()      │            │
│    Snap    ├─────────────►│ AnimalDeck │
│            │              │            │
│            │  shuffle()   │            │
│            ├─────────────►│            │
└────────────┘              └────────────┘

```

--

### What have we done?

```text
After:

┌──────────┐  getCards()  ┌──────────┐
│          ├─────────────►│          │
│          │              │          │
│          │  deal()      │          │ implements ┌────────────┐
│   Snap   ├─────────────►│ <<Deck>> ◄────────────┤ AnimalDeck │
│          │              │          │            └────────────┘
│          │  shuffle()   │          │
│          ├─────────────►│          │
└──────────┘              └──────────┘

```

--

### Exercise - Make your playing card classes implement the interfaces (30 mins)

* Make your PlayingCard class implement the Card interface
  * Cards with the same face-value are a snap (ignore the suit)
* Make your PlayingCardDeck class implement the Deck interface
* Make the Snap game use your PlayingCardDeck
  * You should only need to change one line of code in Snap
* The game should still work...



--

### What have we ended up with?

```text
                                      implements  ┌────────────┐
┌────────┐                                 ┌──────┤ AnimalCard │
│        │  snap(Card)  ┌───────────┐      │      └────────────┘
│        ├──────────────►  <<Card>> ◄──────┤
│        │              └───────────┘      │      ┌────────────┐
│        │                                 └──────┤PlayingCard │
│        │  getCards()  ┌────────────┐            └────────────┘
│  Snap  ├──────────────►            │
│        │              │            │            ┌────────────┐
│        │  deal()      │            │    ┌───────┤ AnimalDeck │
│        ├──────────────►  <<Deck>>  ◄────┤       └────────────┘
│        │              │            │    │
│        │  shuffle()   │            │    │  ┌─────────────────┐
│        ├──────────────►            │    └──┤ PlayingCardDeck │
└────────┘              └────────────┘       └─────────────────┘
```
Notes:
Emphasise that we can now toggle between different types of card without making significant changes to Snap.
We could even let the user decide at runtime.

--

### Exercise review

+ What's better about the new version?
+ Is anything worse?

Note:
Whiteboard their answers to these questions.  
See if there's a consensus, discuss differences.  

