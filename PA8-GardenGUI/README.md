# PA6-GardenGUI-Key (Status: Posted  at )
PA8 key and initial writeup draft.

## Learning Objectives

The goal of this assignment is to use basic Java-Fx to create
a GUI representation of the PA6-Garden program.

## The Assignment

In this assignment, you will use your code(*What about students that couldn't figure out PA6?*) from PA6-Garden to create a GUI
representation of the garden. You will need to think about how you would like to represent each plant in the output as well as handle a 'delay' command from the input file that represents how long to wait between the execution of commands. In the video example, each plant is represented by uniquely colored tile on a canvas, and more/less tiles will be drawn depending on the commands.

** The 'PRINT' command is also completely excluded from this program. ** This means that you should'nt expect any 'PRINT' commands from any input file.


Please open and watch 'Example.mp4' to see an example GUI output for the input file 'Garden.in'.

You should also be looking at the PA6-Garde writeup to refresh your memory on how it works: **Insert Link to PA6-Writeup Here Later**

## Delay command

The input file for this assignment is exactly the same as that of PA6-Garden, the only difference is that you will now have to handle a delay, which will be on the third line of the input file right under 'cols'. An example input is shown below:

```
rows: 1
cols: 1
delay: 3

PLANT (0,0) sunflower
PLANT (2,2) tulip
PLANT (5,5) iris
GROW 1
```

The number after 'delay:' is a **double** that represents the time to wait before each command executed. In the video example, this delay was set to **.5**, therefore, each command was executed after waiting a half second.

### Delay command implementation(Going to need help with this)

**Maybe I need to convert this to a non-lambda expression version, but it might make it more confusing as it would require a private inner class**

We are providing you with the code you will need to pause your program for a set amount of seconds. You do not need to understand how it works(If you want to, then click http://www.oracle.com/webfolder/technetwork/tutorials/obe/java/Lambda-QuickStart/index.html). You can pass in a double where **doubleAmount** is located and this will pause the program by that amount. You should then write the code you need(**Hint:** executing each command from input file) where the first comment is located and call **wait.stop()** when ALL commands have been executed.

```
PauseTransition wait = new PauseTransition(Duration.seconds(delayAmount));
        wait.setOnFinished((e) -> {

            // Code that should be executed after delay goes in here.
            // You should call 'wait.stop()' when there are no more commands to read in.
           
                wait.playFromStart();
        });
        wait.play();
```

## General requirements

This assignment is different from other assignments you've had so far in that you are given a lot more freedom to design your output the way you want. You can try to mimic what was done in the video and get the credit for it, but however you choose to output your garden, the following general requirements must be met:

* Each plant must be **unique**, meaning they must be distinguishable from any other plant and the background. In the example video, this is done by using a different color for each plant against a brown background. You do not have to do it this way, for example, you can choose to use an image for each plant instead of a colored tile.

* Each command must be **visually noticeable**. This means that when 'GROW 1' is called for example, it should be visually obvious that every plant just grew by 1. In the example video, grow commands cause more identical tiles to be drawn in some fashion(depending on the plant type) around every plant.

* There must be a command log which displays commands as they are being executed. In the example video, this is done in a TextArea at the bottom of the garden.

* You must still handle errors. Errors that don't cause the program to stop(such as 'Can't grow here') should be **distinguishable** in the command log. In the video example, the error is fully capitalized and spaced out from surrounding text. For errors that do cause the program to stop, such as 'Invalid dimension input' or 'File not found' should still print to stdout and exit the program as usual.


## Grading Criteria

Half of the PA8 grade will be correctness. For this assignment, this is the GUI output. You should also expect that we will run your program with additional input files besides the ones provided. ** Need to add more input files/Videos later **.

The other half of the PA6 grade will be your decomposition and code clarity.

Decomposition

* Points will be taken off for copy, pasted, and edited code that
  should have been encapsulated in a method.

* **This program should use fewer than 10 .java files.**
  Each of these files should be (<400 lines).

* Each static method should be less than 30 lines.  This INCLUDES
  comments, but not the method header.  It is easier to read a 
  function if it can all fit on one screen.
  
Code Clarity
* YOU should be able to read, understand, and explain your own code
  to someone else a couple days after you wrote it.
  * No magic numbers
  * No methods written to just get the test cases to work

* There needs to be a balance between no comments in the body of the
  methods and a comment for every line in the program.  Either extreme
  will result in points off.

* The file header should include instructions on how someone would
  use this program.  To use the program, one would need to know the
  input file format.

* Use meaningful variable names.  Loop iterators can
  be simple (i for integers, s for strings, n for numbers, etc.).

* The clearest code examples will be anonymously shown in class.

* The most obfuscated code examples will be anonymously shown in class
  with suggestions for improvement.
  
## Submission

Write your own code. We will be using a tool that finds overly similar code. 

It is recommended that when talking with others about the assignment, do not write
anything down.

For this assignment, you are **REQUIRED** to submit all of your java source files
to Gradescope before **Insert date here**. Along with your code, you must also submit a video of your program's GUI output executing the 'Garden' input file that was provided in a similar fashion as the example video. You can use a program to record your screen as you run your program, or you can simply record your screen with your smartphone or tablet. Do note however that the video you submit must be of good enough quality for the SL's to clearly see your garden and command logs.