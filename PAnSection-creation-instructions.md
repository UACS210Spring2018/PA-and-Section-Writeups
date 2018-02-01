# Programming Assignment (PA) and Section Creation

All Sections and PAs have a Key repository and a Start repository
already in the UACS210Spring2018 organization.  To work on one,
use the git-usage-notes.txt file to create a fork of that repository.
You will do a pull request to get your changes incorporated into
the main repository.  Your fork of a Section or PA Key repository
is called a "Key Fork" in the below.

1. Draft the assignment writeup in a fork of the public 
   https://github.com/UACS210Spring2018/PA-and-Section-Writeups
   repository.  It will be put into the public repository for 
   all to see after you have done a pull request and the instructor
   has approved the pull request.  Your fork of the assignment writeups
   will be called the "Writeup Fork".

2. Starting the Key.  When in your git clone of your Key Fork on your 
   machine, grab a copy of the template Eclipse project files.
```
	cd CS210Spring2018  // your local clone of the CS210Spring2018 repository
	git archive master PAnSectionTemplate | tar -x -C PA-and-Section-Keys/Section1-HashMap-Key/
```
   Note that I am keeping my Key clones in a CS210Spring2018
   subdirectory on my local machine, thus the relative path
   PA-and-Section-Keys/Section1-HashMap-Key/ is where a copy of the
   template will be placed
	
   The above copies the whole subdirectory, so cleanup is needed.
```
	cd PA-and-Section-Keys/Section1-HashMap-Key/
	more README.md  // did this to copy the README.md that will be overwritten
	mv PAnSectionTemplate/* .
	mv PAnSectionTemplate/.* .
	rm -rf PAnSectionTemplate/

	// rename the main Java file
	cd src
	mv PA1Main.java Section1Main.java
	
	// add all these files to your repository
	cd ..
	git add *
	git add .project .classpath .settings .travis.yml .gitignore
	git commit
	git push
```

3. Edit the .travis.yml, .project, and README.md file to
   indicate the correct Section or PA.

4. Also draft the answer key in src/Section#Main.java or src/PA#Main.java.
   Add any other classes needed as well.
   For 210, we are just going to have classes all in the default package.
   
5. Do commit and push of .project, .classpath, and .gitignore
   into the github repository.  On the github website, do a pull request.

6. Create some test cases and check that they are passing the grade script.

7. The instructor will need to create the Start repository and the github 
   assignment from the key.


## Creating the Github Assignment (Notes for instructor)

1. Create a Start repository for the Section or PA.

2. Clone it onto machine.

3. Copy over the key.

4. Take out all of the solution.

6. Create a new assignment that links to the Start repository for starter code.

