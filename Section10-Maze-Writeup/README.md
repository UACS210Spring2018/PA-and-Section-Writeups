# Section10-Maze-GUI-Output

## Introduction 

The goal of today's section is to practice using JavaFX. We will be building off of the
brief introduction in lecture so that you have a deeper understanding of how to use 
JavaFX, especially for visual representations. Through this section, you will gain 
experience creating a graphical user interface (GUI) that displays a corn maze. This 
section will prepare you for the GUI output aspect of PA8, displaying your garden. 

## Assignment

### Setup
Go to the course webpage, click resources, and then click on the Section 10 URL. It will be 
the URL for accepting the github classroom assignment for Section 10.

Then do the following:

Click on the green "Clone or download" button on the right of the web page and copy the provided URL.

Import your Section 10 repository into Eclipse.

open Eclipse
File —> Import —> Git —> Projects from Git, Next, Clone URI, Next, paste in repository URL from github
Next, Select the master branch, Next, make the local destination the following path: 
/home/username/eclipse-workspace/Section10-Maze-GUI-Output-yourgithubid.
Next, Import existing Eclipse projects, Next, Finish.

### Overview 
The Drawing class will turn an ascii representation of a corn maze into a GUI representation. 
The first step is to process the ascii file by reading it in and changing it into a 2D array 
of characters representation. This array will be iterated over when drawing each element in the 
corn maze. When drawing the maze, each ascii character corresponds to a unique shape and color 
combination. The start location should be represented by a triangle and a color of your 
choosing. The corn walls should be represented by yellow squares and the end location should be 
a square and a color of your choosing. The file input file is hardcoded in the start method, so 
change the file name there to demo the different representations of the maze.

Example input file: 

```
5 5
*****
S   *
** **
*   E
*****
```

As seen above, the input file will have the length and width of the maze on the first line. Each 
of the following lines will correspond to a row of the maze, using the following characters to 
represent the maze according to the legend below. 

```
	* - A corn wall that cannot be passed through. 
	S - The start location in the maze. 
	E - The end location. 
	  - A space represents an open path in the maze. 
```

### Part One - File Processing
Complete the readMaze Method in Drawing. Open and process the ascii file in this method. You 
can create a 2D array of chars to hold the character representation of the maze. Initialize 
the array to the height and width described in the first line of the file. No error checking 
is necessary as all given input files will be valid. 

### Part Two - Drawing 
There are two TODO's to complete for this section. The first TODO updates main and the second 
updates the initScreenMaze method, where the drawing occurs. 

The input mazes can be different sized rectangles, so you will have to update main to create a
Canvas that corresponds to the size of the input file. Each character in the input file 
corresponds to a square on the canvas that is 25 x 25 pixels. This magic number of 25 has been 
extracted and set as a constant at the beginning of the class. 

The initScreenMaze method has two examples of drawing shapes already in place. One draws a 
yellow square and the other draws a blue triangle. You can paramaterize these two equations 
so that you can iterate over the 2D array and draw the corresponding shape for each character. 
Nested loops are acceptable for iterating over the 2D array.

If you finish Section early and are interested in drawing more interesting shapes, check out:
https://docs.oracle.com/javase/8/javafx/api/javafx/scene/canvas/GraphicsContext.html 

This is a great resource to explore to help you come up with create representations for PA8! 
