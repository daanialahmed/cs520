SUMMARY

I implemented TicTacToe using the Model-View-Controller design pattern.

TicTacToe.java represents the Model
TicTacToeController.java represents the Controller
TicTacToeView.java represents the View
And finally TicTacToeDriver.java is the main driver class which runs the entire program

Running the driver should run the entire program

### How to run (from Terminal):

   After building the project (i.e., running `ant`), run:
   `java -cp bin TicTacToeDriver`


VIOLATIONS

No separation of components/concern-
	Previously, all source code was lumped into a single class. There was no design pattern that was being followed. I separated the class into multiple classes in accordance to the MVC model. The controller is the bridge between the model and the view.

Information hiding-
	Information hiding, the ability to prevent certain aspects of a class or software component from being accessible to its clients was another principle being violated as a result of all source code being in a single class. To address this, classes are separated and methods take in variables as arguments rather than having full global access.

Modularity/Extendability-
	The previous code was not modular and therefore not extendable. This was fixed by developing individual modules which help minimize coupling and lead to easier-to-maintain code. The view for example can easily be extended to incorporate a different data visualization.

Open/Closed Principle-
	Final violation in the original code was the violation of the open/closed principle. The code was not extendable without modification. Although my code does not 100% support this quite yet either, it still makes use of it by hiding certain features from others.











# TicTacToe
TicTacToe.java is a basic Java implementation of the well-known Tic Tac Toe game.

### How to build and test (from Terminal):

1. Make sure that you have Apache Ant installed.

2. Run `ant` in the root directory, which contains the `build.xml` build file.

3. Compiled java classes will be in the `bin` directory.

4. Run `ant test` to run all unit tests.

### How to run (from Terminal):

1. After building the project (i.e., running `ant`), run:
   `java -cp bin TicTacToe`

### How to clean up (from Terminal):

1. Run `ant clean` to clean the project (i.e., delete all generated files).
