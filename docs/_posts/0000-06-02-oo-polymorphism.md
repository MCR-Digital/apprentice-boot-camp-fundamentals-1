## Polymorphism

+ What is it?
+ How do we use it?
    + Mainly via inheritance mechanisms
+ Why is it useful?
    + Simplifies our code

{% include background-image.html file="pasta.jpg" %}
<p style="float:bottom;font-size:15px">
<a href="https://flic.kr/p/6iYRpr">Ancora Pasta Fresca</a>
by <a href="https://www.flickr.com/photos/hotelrealfini/">Hotel Real Fini</a> is licensed under 
<a href="https://creativecommons.org/licenses/by/2.0/">CC BY 2.0</a>
</p>

Note:
Again prompt for suggestions and discuss.  

--

### Example - Lights on a car

+ A car has many lights
    + Headlights
    + Side-lights
    + Indicators
    + Fog-lights
+ All lights can be turned on and off by controls on the dashboard

--

```java
class Light {
    void turnOn(){}
    void turnOff(){}
}

class Headlight extends Light {}
class Indicator extends Light {}
class FogLight extends Light {}

class Car {
    Light[] lights = {
        new Headlight(),
        new Indicator(),
        new FogLight()
    };

    Car(){
        for (Light light : lights) {
            light.turnOn();
        }
    }
}
```

--

### Exercise (30mins)

* Make a game of _**Super-Snap!**_
* The deck consists of a full set of playing cards and a full set of animal cards
* The rules for calling _Snap!_ are the same as before
    + a playing card will only match a playing card of the same value
    + an animal card will never match a normal playing card

--

### Exercise review

+ What did you do?
+ How did you find it?

--

There are other kinds of polymorphism...