## Setting up

We’re anticipating you using [Intellij IDEA](https://www.jetbrains.com/idea). You can downloading it [here](https://www.jetbrains.com/idea/download/). The ‘Community’ version is fine, if you don't have a license for ‘Ultimate’.

You’ll need Java 8 or later. If for some reason you don’t already have it, you can either:
- `brew install java` (if you are on macOS and use `brew`)
- `sdk install java` (if you use [sdkman](https://sdkman.io/))
- install it yourself from [here](https://aws.amazon.com/corretto/)

## Running the tests

Open the `build.gradle` file in IntelliJ using `File --> Open…`. It should detect gradle automatically and start downloading dependencies.

If you don't have Java at this point then IntelliJ will complain and walk you through installing it. If for some reason it doesn’t, use `File -> Project structure -> Project SDK --> Add SDK --> Download SDK` default values are fine.

When the IDE opens, expand the `src/test` directory. Right click it, and half way down choose `Run 'tests in '…'`. The tests should run, and they should all pass (green ticks).

If you have any problems, let one of the people running the boot camp know and we will happily help! :) 