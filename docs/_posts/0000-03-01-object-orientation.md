## Object Orientation

<img src="{{ site.github.url }}/images/programmingParadigms.png" style="height: 450px;" alt="diagram of different programming paradigms">

\*[Van Roy](https://www.info.ucl.ac.be/~pvr/VanRoyChapter.pdf)

Note:
There are many different programming paradigms - take a moment to talk through the diagram.  
From imperative languages such as C through Java and object-orientation through to functional.  
Emphasise the distinction is fuzzy.  
**Mention the "Turing Completeness" line.**  

--

<backgroundimage>{{ site.github.url }}/images/manchester-baby.jpg</backgroundimage>
<backgroundimageopacity>0.25</backgroundimageopacity>

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
