# Programming Assignment (PA) Creation

This will create a key that after being scraped out can be copied 
into a repository that github will use to start each of the student 
assignments.  Want to do a separate one for each assignment and 
section so the eclipse project name is different per assignment.  
These instructor/TA instructions require using the command line, 
but the students should not have to use the command line.

1. Create a subdirectory here (e.g. PA1-Gradenator/)

2. Create a README.md file in that subdirectory.  It will be the
assignment writeup.  Can always copy from a previous assignment to
get started.

3. Add all created files to this git repository.

4. In Eclipse create a project (e.g. PA1-Gradenator) and pick its
home to be the subdirectory created in this git repository.
  New --> Java Project, uncheck "Use default location"
Use all defaults for the rest of the project setup.

5. Do commit and push of .project, .classpath, and .gitignore
into the github repository.

6. From Eclipse create a new class for the main class (e.g., PA1Main).

7. Implement the assignment.  Add any other classes needed as well.
For 210, we are just going to have classes all in the default package.

8. Copy in a grading script from a previous assignment and create
test cases in PublicTestCases/ that the students will be able to use.
Also create some PrivateTestCases/ for use in grading.

9. The instructor will need to create the github assignment from the key.


## Creating the Github Assignment

1. Gets everything so somewhat inconvenient.
```
    svn export https://github.com/UACS210Spring2018/CS210Spring2018.git
```
2. Go into Classes/CS210Spring2018/ProgrammingAssignmentStarts on local machine.

3. Copy the key directory there.

4. Take out all of the solution.

5. Create a private github repository in the class organization.

6. Create a new assignment that links to that private repository for starter code.

