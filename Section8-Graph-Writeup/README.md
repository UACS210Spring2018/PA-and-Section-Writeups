# Section8-Graph-Writeup 

## Introduction 
Today we will be working with undirected graphs. You will be reading in
and processing an input file in order to output to standard out a string and 
write graphical representation of the graph to a file. Section8Graph is a 
completed class, however, you will need to support it's functionality by 
completing the TODOs in the Section8Edge class. 

## Setup

Go to the course webpage, click resources, and then click on the Section 8 URL. 
It will be the URL for accepting the github classroom assignment for Section 8.

Then do the following:

Click on the green "Clone or download" button on the right of the web page and copy the provided URL.

Import your Section 8 repository into Eclipse.

open Eclipse
File —> Import —> Git —> Projects from Git, Next, Clone URI, Next, paste in repository URL from github
Next, Select the master branch, Next, make the local destination /home/username/eclipse-workspace/Section8-Graph-yourgithubid.
Next, Import existing Eclipse projects, Next, Finish.
Now you are ready to start coding.

## The Assignment
Overview : Implement the file processing functionality in Section8Main and complete the 
TODOs in Section8Edges in order to create a textual and visual representation of an 
undirected graph. You will submit your java code to gradescopep and show your SL your 
answers to the conceptual questions. 

### Part One - Decomposition 
After importing the section, your section leader will walk the class through the 
decomposition of the Graph structure. Before they begin their lecture, take a few
minutes to look over the code base in order to familiarize yourself with it.  

### Part Two - Implementation 
Complete the three functions with TODOs above them in Section8Edge. 
Additionally, complete the file processing in Section8Main. If you get stuck on how 
to process the input file and leading comments, check out the Java API for scanner:
https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html

Particularly think about how hasNext and nextInt could help you. 

### Conceptual Questions 

Q1 

```
What is Comparable? Where is it used in this Section and why? 
```

Q2

```
Why is it necessary to override equals and hashCode in Section8Edge? 
```
