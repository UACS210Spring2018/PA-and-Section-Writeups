# PA1 Gradenator

The goals for PA1 are to get started with Java and figure out how to calculate your
current CS 210 grade.

Each line should be in the following format:
```
  <string with no commas>, <number>%, <number> <number> ...
```
  
Specifically a string with any characters except a comma, a comma, an
double in the inclusive range 0 to 100 [0,100], a comma, and one or more
doubles in the inclusive range 0 to 100 [0,100] separated by one or more
spaces. The Java Scanner class with its nextLine() method can handle whatever
line ending your file system uses.

Example input (see the syllabus for percentages):
```
  final, 20%, 80
  programming assignments, 25%, 90 60 80
```

An overall grade will be calculated by averaging the grades listed at the end
of each line (e.g. avg(90 60 80) ==> 76.67) and then computing a total grade
based on the percentages indicated on each line (e.g. 0.20*80 + 0.25*76.67
==> 35.17). Note that if the input percentages do not add up 100%, then the
total grade will not be out of 100%. In the example above the best possible
grade would be 20% + 25% ==> 45%.

The output will be the average grade per line and a total line. Example
output:
```
  final, 20%, 80
  programming assignments, 25%, 76.66666666666667
  TOTAL = 35.17% out of 45%
```

Your PA1 program can assume that all input follows the format. Any input that 
does not follow the input format will result in undefined behavior.

## Getting Started

0. We will assume you used the provided assignment URL to set up a github
repository.  And then clicked on that repository in your web browser.

1. Now you are reading the README.md file in that repository.  The README.md
files will be the assignment writeups.

2. Click on the green "Clone or download" button on the right of the web page
and copy the provided URL.  It should look like 
(https://github.com/UACS210Spring2018/...).

3. Import your PA1 repository into Eclipse.
 1. Open up Eclipse on a lab machine or your machine (if you are working on
    your own machine, you will need to install Eclipse).
 2. File —> Import —> Git —> Projects from Git, Next, Clone URI, Next,
     paste in repository URL from github

  3. Next, Select the master branch, Next, make the local destination 
     /home/username/eclipse-workspace/PA1-Gradenator-githubid.  
     This is where the local git repository will be placed.

  4. Next, Import existing Eclipse projects, Next, Finish.

  5. Test that it runs.  Highlight the TestAssignmentMain.java file and click on the Run button.



## Testing your program

If your program cannot compile and run, then you should feel very
uncomfortable.  

## Decomposition Ideas

The first set of Drills will help with figuring out how to decompose and
implement this program.  Here are some Java classes and methods that might
also be helpful (lookup online examples of how to use these and what their 
parameter and return values are):
* System.out.println() is your friend
* new Scanner(System.in)
  * hasNextLine()
  * getNextLine()
  * close()
* String
  * substr()
  * indexOf()
  * trim()
  * split()
* Iterating over an array of strings,
  https://www.guru99.com/foreach-loop-java.html


## Grading Criteria

Half of the PA1 grade will be correctness.  For this assignment, if your
program works for all of the test cases in PublicTestCases/, then you will
earn all of the correctness points.

The other half of the PA1 grade will be your decomposition and code clarity.

Decomposition
* Should just use static methods in the single PA1Main class.

* Use a single file.  This should be a small program (<200 lines).

* Each static method should be less than 30 lines.

* Make things as simple as possible.
  * Avoid nested loops.
  * Avoid nesting conditionals.
  * Avoid too many levels of user-defined methods calling other
  user-defined methods.


Code Clarity
* YOU should be able to read, understand, and explain your own code
a couple days after you wrote it.

* The file header should include instructions on how someone would
use this program.

* Use meaningful variable names.  Loop iterators can
be simple (i for integers, s for strings, n for numbers, etc.).

* The clearest code examples will be anonymously shown in class.

* The most obfuscated code examples will be anonymously shown in class
with suggestions for improvement.


The coding style in terms of spacing, etc. should be done automatically
every time you save in Eclipse.  As long as you stick with those defaults,
the syntax style should be fine.

Write your own code.  We will be using a tool that finds overly similar code.
I recommend that when talking with others about the assignment, do not write
anything down.

