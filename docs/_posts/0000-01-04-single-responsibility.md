# Boot-camp
## Fundamentals 1
# Day Two

---

# Quick Recap

+ Positioned OO alongside other programming styles
+ Encapsulation
+ Abstraction
+ Inheritance
+ Polymorphism

--

So… Object Orientation makes your code good?

Note: Danger of thinking OO == good code

--

# Objects make sense in the real world

Note: Think in terms of objects  
Very natural

--

# Sometimes less so in software

Note: e.g. Car, Advert, Customer    
Real life things  
OOP attempts to model the tangible real world  
Technology (DB/events etc) often not tangible

--

## There are some principles to help!

Note: Many principles in software  
Explain principles vs practices  
Usually hold true across most examples  
Not always easy to apply  

---

## Single Responsibility Principle

Putting the ‘S’ in S.O.L.I.D.

Note: Actually five principles:  
  Single Responsibility  
  Open / Closed Principle  
  Liskov Substitution Principal  
  Interface Segregation  
  Dependency Injection

--

“every module or class should have responsibility over a single part of the functionality provided by the software, and that responsibility should be entirely encapsulated by the class.”  
—[Wikipedia](https://en.wikipedia.org/wiki/Single_responsibility_principle) 

Note: every module or class should have responsibility over a single part of the functionality provided by the software, and that responsibility should be entirely encapsulated by the class

--

# Robert C Martin

(Uncle Bob)

Note:
  Term introduced by Robert C Martin / Uncle Bob  
  Co-author of the Agile Manifesto  
  Also introduced ‘Clean Code’ term  
  Position these contributions  

--

“A class should have only one reason to change.”  
—Robert C Martin in ‘Agile Software Development, Principles, Patterns, and Practices’

--

# Good code is organised

Organisation more important as code base grows

Note: Discuss importance with 50k+ LOC across thousands of classes  
  Can’t have order if unclear where to put things  
  Broken window theory  

--

# Cohesion

“degree to which the elements inside a module belong together.”  
—Edward Yourdon & Larry L. Constantine in ‘Structured Design: Fundamentals of a Discipline of Computer Program and Systems Design’

Note: Cohesion is a good quality  
  Code highly cohesive when single responsibility described in one place

--

# Classic Examples

Shout them out

+ Gaffa tape: stops things moving
+ Hammer: hammers things
+ Mug: holds liquid

--

# Classic Counter-Examples

+ Food processor: chops, mixes, whips, grates, slices
+ Swiss army knife: cuts, screws, unpicks, de-corks
+ Spork: cuts, spoons

--

# Consider Fizz Buzz…

How many responsibilities?

Note: Hard to say  
  Not cut and dry

--

# Responsibility is hard

It’s not always black and white

Note: There’s more than one correct answer

--

<backgroundimage>{{ site.github.url }}/images/car-diagram.jpg</backgroundimage>
<backgroundimageopacity>0.25</backgroundimageopacity>


# What about a car?

Is it one responsiblity or more?

+ Engine
+ Wheels
+ Indicators
+ Dashboard
+ Wipers
+ Radio
+ Seats
+ …

---

# Functional Decomposition

“… the process of taking a complex process and breaking it down into its smaller, simpler parts.”  
—[Stack Overflow](https://stackoverflow.com/questions/947874/what-is-functional-decomposition)

Note: FD critical skill when designing systems
  Decisions about responsibility solidify  
  Microservices based around brave decisions about responsibility boundaries  

--

# How deep?

You can keep decomposing the functions into smaller components:

- Car
  - Dashboard
    - Speed indicator
      - Speedometer
        - Magnet
          - Atoms

--

# Keep it sensible

Don’t decompose too far.

--

# 🙅‍

Trading off cohesion and reduced responsibility

Note: When responsibility too small you lose cohesion  
  May need to perform shotgun surgery across many components to make a single change

--

# Aim for sensible outcomes

When requirements change, should have one change to make

Note: E.g. choice of using set or list
  Should be able to swap out in one place  
  This is the thing that is responsible for storing that thing  

--

# Abstraction

(not the OO principle)

Stay at one level of abstraction within a component

Note: Don’t describe a bathroom as a toilet, a bath and a flow control valve—you call it a tap. 

--

# General rules

Stuff inside a class should change together

Stuff outside a class should change independently

Note: We want to make changes carefully  
  Working in small areas allows us to be more organised  
  Allows us to be more methodical and have less context  
  Two bits of code that change together, live together  

--

# Negative Indicators

Visual signs that a class might have multiple responsibilities:

+ It’s massive
+ Multiple constructors
+ Name doesn’t match contents
+ Name is confusing/too generic/contains ‘And’
+ People are scared to change it

Note: Generally classes grow as extra responsibility creeps in  
  Classes generally need one set of collaborators  
  Bad names are like a bad foundation  
  Multiple responsibilities can cause surprises when changing things  
  Think at the method level too.  

---

# Checkout Kata

[Checkout kata](http://codekata.com/kata/kata09-back-to-the-checkout/)

```plain
  Item   Unit      Special
         Price     Price
  --------------------------
    A     50       3 for 130
    B     30       2 for 45
    C     20
    D     15
```

Note: Kata requires code to handle running total and offers  
  This is all done (badly)

--

# Coding Exercise (20 mins)

* Split into groups
* Make some changes:
  + Change it so that you can have 4 ‘C’ for 70
  + Change it so that you can have 5 ‘D’ for 60
  + Change it so that you can have 4 ‘A’ for 180

Note: Do changes one by one as you don't want them to know that ‘A’ will change

--

# Reflection Exercise (10 mins)

* Discuss our crude Checkout implementation
* Write three sets of post-its:
  - What responsibility does Checkout have?
  - How could you split it up?
  - What problems does/will this design face?

--

# Review post-its

## What responsibility does Checkout have?

+ Pricing
+ Tracking running total
+ Reductions

Note: Where would you add new functionality?  

--

# Review post-its

## How could you split it up?

Note: May need to prompt: Scanner, Item, Offer Rule  

--

# Review post-its

## What problems will this design face?

Note: Was it readable?  
  Was it clear where to add new functionality?  
  Ask if they had to change original tests  
  Point out original tests still valid and shouldn’t have changed  
  Highlight that rules are a separate responsibility  

--

# Exercise (30 mins)

Improve the design by separating responsibility

Note: Skip this if running behind.

---

## Retro/stand-up

