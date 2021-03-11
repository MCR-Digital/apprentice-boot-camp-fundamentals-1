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
+ Make the snap game work with both decks of cards from the previous exercise
+ Decks should be interchangable
+ Cards with the same face-value are a valid _Snap!_
+ Let’s discuss the change first as a group

Note:
Use interfaces (in dotnet and Java) to represent Cards and Decks  
ES6 doesn’t support interfaces natively, but they should make the snap game take multiple decks. They’ll need to make decks have the same functions so that they are interchangeable.  
Increased time. Took 1hr45m last time, but hopefully less this time.

--

### Exercise review

+ What did you do?
+ What's better about the new version?
+ Is anything worse?

Note:
Whiteboard their answers to these questions.  
See if there's a consensus, discuss differences.  

