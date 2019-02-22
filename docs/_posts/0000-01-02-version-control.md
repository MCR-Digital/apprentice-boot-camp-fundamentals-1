## Version Control

+ What is it?
+ A means of tracking changes to text
+ Why do we use it?
+ Audit trail
+ Archive
+ Versioning
+ Collaboration
    
Note:
Ask these questions to the group, get them to suggest answers and whiteboard them.
Summarise the points, with the aid of the bullet points.

--

_"If you're not using version control you're not writing software
you're just playing around."_

Note:
There is no attribution here, this is just me saying it but I don't think there are many professionals who would disagree.
Encourage them to use version control for everything, from the smallest of their pet projects.
If it's text check it in.

--

### Version Control an example

+ Git
+ Key features?
    + Distributed
    + Strong support for branching
    + Fast
    + Open

Note:
See how many people use Git
Explain why we're using it as an example; widely used, modern.

--

### Centralized Version Control

<img src="{{ site.github.url }}/images/centralized.png" style="height: 500px;" alt="A diagram showing a centralized version system">

<p style="float:bottom;font-size:15px">
<a href="https://git-scm.com/book/en/v2">Pro Git</a>
by Scott Chacon and Ben Straub is licensed under 
<a href="https://creativecommons.org/licenses/by-nc-sa/3.0/">CC BY-NC-SA 3.0</a>
</p>

Note:
Advantages are easy to administer, remote copies.
Disadvantages, single point of failure.

--

### Distributed Version Control

<img src="{{ site.github.url }}/images/distributed.png" style="height: 500px;" alt="A diagram showing a centralized version system">

<p style="float:bottom;font-size:15px">
<a href="https://git-scm.com/book/en/v2">Pro Git</a>
by Scott Chacon and Ben Straub is licensed under 
<a href="https://creativecommons.org/licenses/by-nc-sa/3.0/">CC BY-NC-SA 3.0</a>
</p>

Note:
Advantages, no single point of failure - built-in redundancy.
Also supports many more ways of working - open-source.
Disadvantages - adds complexity.

--

### Exercise (20mins) - Clone the slides

* These slides are in version control
* If you don't have a GitHub account create one
* _**Fork**_ these slides into your own repository
https://github.com/MCR-Digital/apprentice-bootcamp-fundamentals-1
* Install Git on your machine if you don't already have it
https://git-scm.com/
* Clone your newly created repository onto your local machine 

--

#### Extra notes for Java users

* If you're using IntelliJ chose the _Open_ option and select the following file:
`exercises/java/build.gradle`
* Choose _Open As Project_
* If given the option choose _Import From External Model_

--

### Exercise (20mins) - Simple Git Workflow

* Create a simple "Hello World!" program in your local repository.
* Add the file to version control using
`git add`
* Commit the file to your repository using
`git commit`
* Check on GitHub and see that your remote repository hasn't changed.
* Push your changes using
`git push`
* Re-check GitHub and see your changes appear.