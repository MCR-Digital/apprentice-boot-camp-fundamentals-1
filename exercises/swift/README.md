## Useage

#### To use: 
clone to local and open ```SnapGameOOP.xcodeproj``` in Xcode. 

Keep in mind you do not need to sign a team to run the project. However, you may need to change the bundle identifier. 

####  To Run: 
1. First choose a device. This will be at the top bar of Xcode next to the scheme.

2. Next go to `Product` -> `Run` or you can use the command `Command + R` or you can also go to the top bar and press the `play button`.

### Navigating the code
### Game Logic
The snap game logic is held in a folder called `GameLogic` which has `Player` and `Cards` 

`Player` holds a few classes that are related to the player

`Cards` holds all the game logic and the actual snap game class. This would be the equivelent of the `Snap` Class in the Java example.

`SnapGame` 
has 6 instance variables. These are the 2 players scores, the current card and the previous card, the deck and also a protocol called `gameDelegate`

This protocol is used to pass data from this class to the `GameViewController`

Methods from the protocol are called when certain things happen in the game, which fires that method on the `GameViewController` Class

The rest of the classes in the `Cards` folder are similar to those on the Java example

### GameViewController
Controls the game view

There is an instance of `SnapGame` in the variable `game`

When the view first loads it will set the `gameDelegate` property to `self` so that this `GameViewController` can implement all the protocol methods.

Then there is an action for each player button. When these buttons are pressed the `pressedPlayer` Methods is called in the `game`
