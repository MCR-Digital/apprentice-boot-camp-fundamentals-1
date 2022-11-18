## Setting up

You will need npm and node v14.15.0 or later. 

There are [many ways to install it](https://nodejs.dev/en/learn/how-to-install-nodejs/) but running `nvm install 14` should do the trick. 

There are also some [Windows setup instructions](https://phoenixnap.com/kb/install-node-js-npm-on-windows).

Once you have node and npm installed, you will need to navigate into the typescript project using the command line: 
- `cd exercises/typescript`

You will then need to install the dependencies required by the project, this is done by running: 
- `npm install`

## Running tests

On the command line, make sure you are within the typescript project (`exercises/typescript`) 

To run the tests you can use either of the commands below:

- `npm test` - this will run all the tests in the project once
- `npm run test:watch` - this will run all the tests continuously in watch mode, everytime you make a change, your tests will automatically run

To exit out of watch mode, press `q`.

If you have any problems, let one of the people running the boot camp know, we will happily help! :)

## Running exercises

On the command line, make sure you are within the typescript project (`exercises/typescript`).

You can then run each of the exercises using the following commands: 

- `npm run cards` - run the cards exercise
- `npm run snap` - run the snap exercise

If you would like to see how these work, take a peek at the `scripts` section in the `package.json` file.