<!--- ORGANISER THINGS TO CONSIDER 
- Which technical competencies, behaviours and knowledge module topics does the bootcamp cover/meet
- Structuring retros so that they can inform thinking for individual's personal learning records (off the job training record tab in their learning logs)
- Introducing some sort of test or quiz on basic concept learning points from the bootcamp to validate that they have taken stuff in, and provide organisation mentors with results to help them focus follow ups
--->

# Fundamentals One Boot Camp

## Competencies, Behaviours and Knowledge units

* TC1 Logic: writes good quality code (logic) with sound syntax in at least one language 
* TC4 Test: can test code and analyse results to correct errors found using either V-model manual testing and/or using unit testing
* TC10 Can apply good practice approaches according to the relevant paradigm (for example object oriented, event driven or procedural)

## Resources Required

* Slides
* Laptops
* Internet access
* post-its
* pens
* flips

## Mentors / Languages
 
Two–three mentors required in addition to leads. These should be able to cover support for the required languages.

Several exercises (katas and code starters) will need to be ported to required languages.

## Prep-work for apprentices

None

## Day 1—19th November

**Main presenters:** Mark Crossfield & Alec Tunbridge

**Groups / Pairs:** Presenters to send MD list of activities and what groups are needed
MD to make lists / randomise

### Follow-on tasks

TBC

## DAY 2 - 29th November

**Main presenters:** Mark Crossfield & Alec Tunbridge

**Groups / Pairs:** Some exercises will be done in groups based around the same language where possible. Some exercises will be done in pairs / triples.

### Follow-on tasks

Organisation mentors should look to exercise the knowledge we’ve covered in the boot camp. Below are suggestions for tasks that would do this, but please use your own judgement to work out what to do. There is no need for anything to be returned to MD or the presenters—it’s just a learning exercise.

* Draw a diagram showing how the classes interact in some code you have been working on
* We’d like them to recognise Encapsulation, Abstraction, Inheritance, Polymorphism
* Take a look at one of your codebases and find examples of:
  * Classes with multiple responsibilities
  * Duplication
* Do a kata using the red green refactor practice
  * We will be doing the Bowling Kata as part of the boot camp
* Spend a day doing red green refactor on your codebase with a pair, and leave some time at the end of the day to reflect / retrospect
  * Did you enjoy it
  * What made it difficult
  * What made it easier

## Further reading / learning resources

<!--- For end of boot camp: Signposting for apprentices self study, further learning, online resources, practice etc. --->

* [List of katas](http://codingdojo.org/kata/)
* [Duplicate Code ‘Code Smell’](https://refactoring.guru/smells/duplicate-code)
* [The Practical Test Pyramid](https://martinfowler.com/articles/practical-test-pyramid.html)
* [The Secret behind the Single Responsibility Principle](https://hackernoon.com/the-secret-behind-the-single-responsibility-principle-e2f3692bae25) on Hacker Noon
 
## Slides

The slides can be viewed [here](https://mcr-digital.github.io/apprentice-bootcamp-fundamentals-1/)
<!--- Link to slides used --->.

## Exercises

### Day One

* Identify objects from business scenario (groups)
* Model a pack of playing cards (groups)
* Use abstraction to make the _Snap!_ game work for normal cards (groups)
* Refactor the card model using inheritance (groups)
* Use polymorphism to implement _Super Snap!_ using a mixture of card types

## Day Two

* Adapting Checkout Kata (pairs)
* Separating responsibilities from Checkout Kata (pairs)
* Receipt duplication (pairs)
* TDD Bowling Kata (pairs)

# Boot Camp Summary

## Object Orientation

* Programming paradigms
* Why OO?
* How to think about objects

## Source Control and Git Hub

* Why source control
* Create, clone, commit, push

## OO Principles

* Modelling some classic scenarios with objects
* Principles
  * Encapsulation
    * Apply to modelling
    * Rewrite some existing code to remove inappropriate intimacy and coupling
    * Code review some existing code
  * Abstraction
    * Apply to modelling
    * Rewrite some existing code to abstract complexity
    * Explain difference between encapsulation and abstraction
    * Introduce to interfaces
  * Polymorphism
    * Apply to modelling
    * Give some examples
  * Inheritance

## Single Responsibility Principle

* Cohesion
* Functional Decomposition
* Critiquing and adapting poorly implemented checkout kata

## DRY

* Definition
* Adapting poorly implemented checkout kata with lots of duplication
* How to fix
* Why duplication happens

## Red Green Refactor

* Why do we write tests
* Why do we write tests first
* Why people might not write tests first
* Arrange, Act, Assert
* Red, Green, Refactor
* Bowling Kata with TDD
