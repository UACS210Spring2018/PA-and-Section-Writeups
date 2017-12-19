# PA1 Gradenator

Getting started with Java and figuring out how to calculate your
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

Example input:
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
  final, 20%, 80
  programming assignments, 25%, 76.66666666666667
  TOTAL = 35.17% out of 45%

This program assumes that all input follows the format. Any input that does
not follow the input format will result in undefined behavior.

