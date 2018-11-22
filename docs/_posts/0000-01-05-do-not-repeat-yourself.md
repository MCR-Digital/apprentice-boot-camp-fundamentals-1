## DRY

AKA Don’t Repeat Yourself
AKA Duplication / Repetition

Note: DRY is a principle telling us to avoid duplication in code  

---

“Every piece of knowledge must have a single, unambiguous, authoritative representation within a system.”
	-- The Pragmatic Programmer

---

# Duplication can be…

-[+] The exact same code in more than one place
-[+] Almost identical code in more than one place
-[+] The same String / Number in more than one place
-[+] Conditionals (ifs) using the same value in multiple places
-[+] Code represents knowledge—**repeated knowledge is duplication**

---

# Duplication is (usually) bad

It makes it hard to change code safely

-[+] Have to change tests in more than one place
-[+] Worse… you probably don’t have test coverage
-[+] May not realise you have to change something in many places

Note: Sometimes okay temporarily…  
  because in progress of refactoring  
  getting something working before you understand it  
  in tests?  

---

# Removing duplication can introduce coupling

Takes careful design to reduce duplication while avoiding coupling

---

# Can inheritance help?

-[+] Usually no
-[+] Certainly not until you have learned when not to
-[+] Inheritance by nature is highly coupled
-[+] Overuse is counter-productive to SOLID principles

Note: Discuss Inheritance vs. Composition (Boot camp 3)  
  Danger of Inheritance for code re-use  

---

# How to fix?

-[+] Values are easy
  -[+] Extract variable/field/constant
  -[+] Use caution not to break encapsulation/introduce coupling
  -[+] Sometimes duplicated values hide shared behaviour

---

# Continued…

-[+] De-duplicate behaviour by extracting and centralising methods
  -[+] Extract one method
  -[+] Move method to the correct location
    -[+] Might involve creating previously missing class
  -[+] Introduce parameters to facilitate other usages

---

# Alert: Some duplication is worse…

Duplication gets worse with distance

Note: Duplication better when code is cohesive  
  When code further apart hard to spot code that needs to change together 

---

# Why does duplication happen?

-[+] Copy & paste
-[+] Accidental duplication
-[+] Comments
-[+] Test names
-[+] Independent invention
-[+] Impatience

Note: It is usually unintentional  

---

# Exercise (45 mins)

Pair up to make following changes. Ensure Receipt is correct. **Try to make each change before removing duplication.**

-[+] Change it so that you can have 5 ‘A’ for 220
-[+] Change it so that you can have 4 ‘C’ for 70
-[+] Change it so that you can have 5 ‘D’ for 60
-[+] ‘A’ = Apple, ‘B’ = Banana, ‘C’ = Cherry, ‘D’ = Damson
-[+] Drought! Bananas double in price, no longer on offer

Note: In this case it is intentional  
  Reveal requirements as people reach them

---

# Show and tell

-[+] What made making these changes hard?
-[+] How did you remove the duplication?
-[+] Did you introduce any more duplication?

Note: Solution may include Item class, Offers class, print offer method   

---

```java
    void scannedA() {
        text += "A: 50";
        if (--aCountdown == 0) {
            text += " - 20 (3 for 130)";
            total += 30;
        }
        else {
            total += 50;
        }
        text += "\n";
    }
```
What duplication did we find?
-[+] Names
-[+] Costs
-[+] Offer mechanism
-[+] Offer specification
-[+] Formatting

Note: Names in methods, Strings, variables  
  Costs in text and also as part of offer  
  Offers algorithm duplicated within class and variant of it exists in Checkout (violates SRP)  

---

```java
    @Test
    public void offers() {
        Checkout checkout = new Checkout();
        checkout.scan("A");
        …
        checkout.scan("B");
        assertThat(checkout.receipt()).containsSequence(
                …
                "B: 30 - 15 (2 for 45)\n",
                "Total: 210");
    }
```

## What about in the tests?

-[+] Is the format of receipt duplicated?
-[+] Tests not necessarily duplication
-[+] Offers were tested twice

Note: Mention that tests are declarative, explain declarative

---

## Retro/stand-up