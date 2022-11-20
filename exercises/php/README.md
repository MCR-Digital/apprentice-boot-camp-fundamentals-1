## Setting Up

You will need to install `PHP` v8.0 or later, there are multiple ways of achieving this depending on the machine you are
using.

### Mac

- If you have previously installed `brew`, run the following in a new terminal prompt:

```shell
brew install php
```

- Otherwise, follow the instructions [here](https://www.geeksforgeeks.org/how-to-install-php-on-macos/) to
  install `brew` and `PHP` at the same time.

### Windows

- Follow the instructions [here](https://www.geeksforgeeks.org/how-to-install-php-in-windows-10/).

### Installing dependencies

Once `PHP` is installed, you will need to install the dependencies from `composer` (which is `PHP`'s package manager
ala `npm`). To do this:

- Open a new terminal prompt pointing to this repository
- Navigate to `exercises/php`, e.g.

```shell
cd exercises/php/
```

- Run the following `PHP` command:

```shell
php composer.phar install
```

## Running tests

- Open a new terminal prompt pointing to this repository
- Navigate to `exercises/php`, e.g.

```shell
cd exercises/php/
```

- Run the following command:

```shell
./vendor/bin/phpunit --testdox tests
```

You should see an output with the tests that have run and how many passed/failed, _no_ tests should fail so let someone
know if they do!
