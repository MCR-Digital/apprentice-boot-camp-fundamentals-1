## Object Orientation

<img src="{{ "/images/programmingParadigms.png" | absolute_url }}" style="height: 450px;" alt="diagram of different programming paradigms">

\*[Van Roy](https://www.info.ucl.ac.be/~pvr/VanRoyChapter.pdf)

Note:
There are many different programming paradigms - take a moment to talk through the diagram.  
From imperative languages such as C through Java and object-orientation through to functional.  
Emphasise the distinction is fuzzy.  
**Mention the "Turing Completeness" line.**  

--

<backgroundimage>{{ "/images/manchester-baby.jpg" | absolute_url }}</backgroundimage>
<backgroundimageopacity>0.25</backgroundimageopacity>

<img src="{{ "/images/alanTuring.jpg" | absolute_url }}" style="height: 400px;" alt="Alan Turing aged 16">

1912-1954

[Alan Turing: The Enigma](https://www.amazon.co.uk/dp/B009H4ZB3G) <!-- .element: class="fragment" -->

Note:
Alan Turing - who is he?  
The notion of Turing Completeness and the fact that all the languages below the line on the previous slide have the same programming power.  

--

## Alan Kay and Smalltalk

+ [Coined the term](https://wiki.c2.com/?HeInventedTheTerm) ‘Object Orientated Programming’ around 1967
  + [May not have invented Objects](https://wiki.c2.com/?HeDidntInventTheTerm)
+ Led research at Xerox PARC which resulted in the Smalltalk language

Note: Origin is disputed. Small talk was an early OO language, but Simula was earlier, credited to Kristen Nygaard and Ole Johan Dahl.

--

Alan Kay also [said this great thing](https://medium.com/javascript-scene/the-forgotten-history-of-oop-88d71b9b2d9f):

> I’m sorry that I long ago coined the term “objects” for this topic because it gets many people to focus on the lesser idea. The big idea is messaging.  

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

<backgroundimage>https://live.staticflickr.com/3097/2522175629_39cd59a95c_b.jpg</backgroundimage>
<backgroundimageopacity>0.25</backgroundimageopacity>

## Nouns and Verbs?

* Basis of Object Orientated languages
* Apollo astronauts used noun & verb combinations to interact with the Apollo Guidance Computer

<p style="font-size: 0.9rem;font-style: italic;"><a href="https://www.flickr.com/photos/7153479@N07/2522175629">"Apollo guidance computer UI"</a><span> by <a href="https://www.flickr.com/photos/7153479@N07">csixty4</a></span> is licensed under <a href="https://creativecommons.org/licenses/by/2.0/?ref=ccsearch&atype=html" style="margin-right: 5px;">CC BY 2.0</a><a href="https://creativecommons.org/licenses/by/2.0/?ref=ccsearch&atype=html" target="_blank" rel="noopener noreferrer" style="display: inline-block;white-space: none;margin-top: 2px;margin-left: 3px;height: 22px !important;"></a></p>

Notes: Although Apollo is an early example of this way of passing commands, this was not an example of an OO language  

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

#### Java

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

#### Javascript

```javascript
class Cat {
  sit() {
    console.log("I'll sit when I'm good and ready.");
  }
}

class Mat {
  constructor(width, length, height) {
    this.width = width;
    this.length = length;
    this.height = height;
  }
}
```

--

## Exercise (30mins)

Here's a simple description of an online car advertising business <a href="#/6/7">Mini AT Scenario</a>

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

<img src="{{ "/images/fourPillarsVenn.png" | absolute_url }}" alt="Venn diagram of inheritance, encapsulation, polymorphism and abstraction">

Note:
Needs a better diagram, but the point is here that these concepts are not distinct, there is often quite a lot of overlap between these language features.  

--

## Discussion: What is Object Orientation trying to achieve?

* What is hard to do without OOP?
* What are the potential benefits?
* If we didn’t use OOP, what might happen to our code?
* In short: what is the point?

--

## What is the point of OOP?

+ Programs are like plants
  + Need a structure to grow around
  + Prone to weeds
+ OOP provides a way to know where to put stuff
+ Using relatable structures (classes) helps people navigate the program

--

## Language support

+ Different languages have different approaches
+ Best to stick with what is idiomatic to your language & community
+ Concepts are relevant on some level to all code
+ If your approach has the same outcome, it’s all good

Note: Explain idiomatic: using, containing, or denoting expressions that are natural to a native speaker.  

--

## OO in JavaScript

+ Seen as a little different to Java and C# (for example)
+ Supports multiple ways to do the same thing:
  + Prototypical inheritance (inheriting from another object)
    + Create objects using the new keyword and modify the constructor function’s ‘prototype’ property
  + ES6 provides class/extends keywords
  + Module based composition
  
Note: Different because most languages only have one way to do this  
  Class based mechanism uses prototypical inheritance behind the scenes, but adds additional features  
  This means there is confusion about what is idiomatic in JS, but class based / prototypical inheritance may be rarer than module based composition  

--

## Class Diagrams

* Useful to have a standard way of drawing designs
* Unified Modelling Language
* Simplified version


--

### A simplified class diagram

```text
                    ┌──────────────┐
                    │  Class Name  │
                    │              │
                    │  Attributes  │
                    │              │
                    │  Methods     │
                    └──────▲───────┘
                           │
                           │inheritance
                     ┌─────┴──────┐
                     │Child Class │
                     │            │
                     └────────────┘
```

