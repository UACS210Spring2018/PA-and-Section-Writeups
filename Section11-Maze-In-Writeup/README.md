# Section11-Maze-GUI-Input

## Introduction

Today we will be building off of Section10  to explore receiving 
input from a graphical user interface. We will be adding a TextField and 
Button to the GUI so we can control the movement through the maze using 
the simple commands 'RIGHT', 'LEFT', 'UP' and 'DOWN'. This GUI input setup
is identical to the GUI input you will be adding to update PA8 to match 
the PA9 spec. 

You will need the code completed from last week's section  to 
complete this section. If you have not finished this section already, 
look on Piazza for the post holding the key. All of the code to implement
your GUI will be added to the Drawing class. 



## Assignment

### Setup
Utilize your code from last week and complete it based on the screenshots
posted on Piazza of last week's section key if necessary. 


### Part One - Additional Objects Setup 
You will need to add six class variables into the Drawing class. Two ints
will need to be added to represent the coordinates where the triangle is 
in the maze and one int constant will be used to represent the number of 
squares the triangle moves. I suggest you name the coordinates x, y and the
constant MOVE to match later code that is given to you. Additionally, you 
will have to make the 2D char array a class variable. 

A TextField, Button, and GraphicsContext are what we will be adding to take in GUI Input. Insert the code below at the top of your Drawing class. 

```
    // GUI objects
    Button nextMove;
    TextField command;
    GraphicsContext gc;
```

### Part Two - Updating readMaze and start
Add code to readMaze to initialize the x and y coordinates. Remember
the x and y coordinates are the location of the triangle in the maze, 
so when you read in the maze the x and y coordinates should be initialized
to the start location ('S') of the maze. 

Now update start to format the additional elements of the GUI. 

Add the code below to initialize and format the new GUI objects. 

```
        // Text field to take in maze command
        command = new TextField();

        // Border pane will contain canvas for drawing and text area underneath
        BorderPane p = new BorderPane();

        // Input Area + nextMove Button
        Label cmd = new Label("Type Command in TextField");
        HBox hb = new HBox(3);

        // Input + Text Output
        VBox vb = new VBox(2);

        setupNodes(hb, cmd, vb);
        setupEventHandlers();

        p.setCenter(canvas);
        p.setBottom(vb);
```

You will notice the method setupNodes is not implemented yet, copy over
the code below to implement this method. 

```
    /*
     * Sets up the TextField, label, and button to be
     * in the bottom
     */
    private void setupNodes(HBox hb, Label cmd, VBox vb) {

        nextMove = new Button("Simulation Step");

        hb.setSpacing(15);
        hb.getChildren().add(cmd);
        hb.getChildren().add(nextMove);

        vb.getChildren().add(hb);
        vb.getChildren().add(command);
    }
```

Now you will have to update your code to set up the primaryStage 
to accept p to so the new set up can be displayed. The code below
replaces the primaryStage setup with new Scene(root). To maintain 
good style, you should remove all code from section 10 referencing 
the Group root. 

```
        primaryStage.setScene(new Scene(p));

```

### Part Three - Button EventHandler
The TextField takes in the typed user input. Remember we can control 
the movement through the maze using the simple commands 'RIGHT', 'LEFT', 
'UP' and 'DOWN'. However, typing the these commands into the TextField 
and clicking the button will have no effect unless we implement a 
EventHandler. For this section, a button EventHandler will be used. Any time 
the button is clicked it will read in the text in TextField and process
if it is a valid command and move. The button EventHandler is a class method. 

Copy the code below into your code to implement the Button EventHandler. 

```
    /*
     * Button EventHandler to take input command
     * when button is clicked.
     */
    private void setupEventHandlers() {
        nextMove.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                parseLine(command.getText());
            }
        });
    }
```

parseLine is the function you will be implementing to validate the user
input. command.getText() retrieves the string of text from the command 
TextField. 

### Part Three - Additional Functions to Implement Input Response 

Now that the button EventHandler is implemented we need to implement two 
functions. One function will check if the input is valid and the second
function update GraphicsContext of the maze. The command must be spelled 
correctly, but capitilization does not matter. A line for debugging and
one example validation check is included below. You must implement the 
three other validation checks and print to the console if the input 
command is invalid. 

```
    public void parseLine(String line) {
        System.out.println("reading " + line); // Print line for debugging
        if (line.toLowerCase().compareTo("up") == 0 && y - MOVE >= 0
                && maze2[y - MOVE][x] != '*') {
            move(y - MOVE, x);
        } 
    }
```

We are giving you the function code to redraw the triangle based on an 
already validated move. 

```
    /**
     * This function 'erases' the old triangle and redraws
     * it in the next move location to make it appear that
     * the triangle is navigating the maze. int newY and 
     * int newX represent the coordinates of the valid move. 
     */
    public void move(int newY, int newX) {
        gc.clearRect(x * SIZE, y * SIZE, SIZE, SIZE);
        double[] yPoints = new double[] { (double) (newY * SIZE + SIZE),
                (double) SIZE * newY, (double) (SIZE * newY + SIZE) };
        double[] xPoints = new double[] { (double) newX * SIZE,
                (double) (SIZE * newX + (SIZE / 2)),
                (double) (SIZE * newX + SIZE) };
        gc.setFill(Color.BLUE);
        gc.fillPolygon(xPoints, yPoints, TRIANGLE);
        x = newX;
        y = newY;
    }

```


After you are able to navigate through both of the mazes, show your SL your
output to receive credit for this section. 
