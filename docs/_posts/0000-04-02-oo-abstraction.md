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
 ┌──────────┐ Must not know  ┌──────────────────┐
 │  Client  ├───────/────────►  Implementation  │
 └─────┬────┘                └───────┬──────────┘
       │                             │  Implements
       │ Calls functions in  ┌───────▼──────────┐
       └─────────────────────►   «Interface»    │
                             └──────────────────┘
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
+ Encapsulation relates to hiding data
+ Abstraction relates to hiding knowledge/implementation

--

### Tenuous example: How do you make a cup of tea?

<backgroundimage>https://live.staticflickr.com/352/19746179658_cd852be093_b.jpg</backgroundimage>
<backgroundimageopacity>0.5</backgroundimageopacity>



<p style="float:bottom;font-size:15px"><a href="https://www.flickr.com/photos/49694447@N00/19746179658">Bed of Tea Plant</a> by <a href="https://www.flickr.com/photos/49694447@N00">Kumaravel</a> is licensed under <a href="https://creativecommons.org/licenses/by/2.0/?ref=ccsearch&atype=html" style="margin-right: 5px;">CC BY 2.0</a></p>

Note: Ask one or more people  
  Question them further on details they missed  
  Ask them how various parts of the process work  
  Highlight that their language changes as they become more detailed  

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

### Exercise (1hr)

+ Abstract away functionality 
+ Make the snap game work with either deck of cards (one at a time) from the previous exercise
+ Decks should be interchangeable (by changing one line of code)
+ Cards with the same face-value are a valid _Snap!_
+ Let’s discuss the change first as a group

Note:
Use interfaces (in dotnet and Java) to represent Cards and Decks  
ES6 doesn’t support interfaces natively, but they should make sure the snap game will work with either deck. They’ll need to make decks have the same functions so that they are interchangeable.  
Increased time. Took 1hr45m last time, but hopefully less this time.

--

## Snap coupled to deck and card implementations

```text
  ┌─────────┐ getCards() ┌──────────────┐
  │  Snap   ├────────────►  AnimalDeck  │
  └────┬────┘ deal()     └──────┬───────┘
       │                        │ contains
       │                 ┌──────▼───────┐
       └─────────────────►  AnimalCard  │
            snap(Card)   └──────────────┘

```

--

## Abstracting cards and decks reduces coupling

```text
  ┌─────────┐ getCards() ┌──────────────┐
  │  Snap   ├────────────►    «Deck»    │
  └────┬────┘ deal()     └──────────────┘
       │                        
       │                 ┌──────────────┐
       └─────────────────►    «Card»    │
            snap(Card)   └──────────────┘

```

--

### Abstract and concrete decks and cards

```text
     ┌────────────────────┐            ┌──────────────────────┐
     │      «Deck»        │            │        «Card»        │
     ├────────────────────┤            ├──────────────────────┤
     │ getCards() : Card[]│            │ snap(Card) : boolean │
     │ deal() : Card      │            │                      │
     └───▲─────────▲──────┘            └───────▲────▲─────────┘
         │         │                           │    │
┌────────┴───┐ ┌───┴─────────────┐ ┌───────────┴┐ ┌─┴───────────┐
│ AnimalDeck │ │ PlayingCardDeck │ │ AnimalCard │ │ PlayingCard │
└────────────┘ └─────────────────┘ └────────────┘ └─────────────┘
```

--

### Exercise review

+ What's better about the new version?
+ Is anything worse?

Note:
Whiteboard their answers to these questions.  
See if there's a consensus, discuss differences.  

