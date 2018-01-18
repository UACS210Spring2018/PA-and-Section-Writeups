# Programming Assignment (PA) and Section Creation

All Sections and PAs have a Key repository and a Start repository
already in the UACS210Spring2018 organization.  To work on one,
use the git-usage-notes.txt file to create a fork of that repository.
You will do a pull request to get your changes incorporated into
the main repository.

1. When in your git clone of your fork on your machine,
   grab a copy of the template Eclipse project files.
```
	cd CS210Spring2018
	git archive master PAnSectionTemplate | tar -x -C PA-and-Section-Keys/Section1-HashMap-Key/
	// note that I am keeping my Key clones in a CS210Spring2018
	// subdirectory on my local machine
	
	// the above copies the whole subdirectory, so cleanup is needed
	cd PA-and-Section-Keys/Section1-HashMap-Key/
	more README.md  // did this to copy the README.md that will be overwritten
	mv PAnSectionTemplate/* .
	rm -rf PAnSectionTemplate/
	
	// rename the main Java file
	cd src
	mv PA1Main.java Section1Main.java
	
	// add all these files to your repository
	cd ..
	git add *
	git commit
	git push
```

2. Edit the .travis.yml, .project, and README.md file to
   indicate the correct Section or PA.

3. Draft the assignment writeup in the README.md file.  It will 
   eventually be moved to the public writeups repository.
   
4. Also draft the answer key in src/Section1Main.java (or whichever).
   Add any other classes needed as well.
   For 210, we are just going to have classes all in the default package.
   
5. Do commit and push of .project, .classpath, and .gitignore
   into the github repository.  At github website, do a pull request.

6. Create some test cases and check that they are passing the grade script.

7. The instructor will need to create the Start repository and the github 
   assignment from the key.


## Creating the Github Assignment

1. Create a Start repository for the Section or PA.

2. Clone it onto machine.

3. Copy over the key.

4. Take out all of the solution.

6. Create a new assignment that links to the Start repository for starter code.

