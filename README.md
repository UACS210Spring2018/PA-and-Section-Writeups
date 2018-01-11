# CS210Spring2018
Main repository for organizing CS 210 in Spring 2018.  Contains links 
to private instructor, TA, and SL notes.  Issues associated with this repository 
will be action items for course staff.

## Notes hosted as google docs
* cs210-learning-objectives, google sheet that links learning objectives to various course activities
* cs210-spring2018-schedule (https://docs.google.com/spreadsheets/d/1Jg00DvNr9IKLWqdqsBmAjsVe1xl-Dsr13aYjhpzbI7U/edit?usp=sharing)
* reading-assignment-ideas (https://docs.google.com/document/d/1xTjAsOAzuHfNfqYO1nGnk8fWS45kqHuflq8n3jKojW0/edit?usp=sharing)
* Staff Expectations and prep meeting notes (https://drive.google.com/drive/u/1/folders/1UGUUJ4ITIa3PajWyCCPILVoktPTffCEE)
* class-setup-notes, how piazza, github classroom, Travis CI, aropa, and other tools were setup at the beginning of the semester. (https://docs.google.com/document/d/1DRv36D19OVPVcCEVT03aGrcrOgwkjUEXnFQV3Be5F4U/edit?usp=sharing)
* syllabus (just the dept template right now, https://docs.google.com/document/d/1GvVzKxGsGCB99qgeVWYbls_MYaqd0f1ALpF8BACB5V0/edit?usp=sharing)

## Notes stored in this repository

* section-creation-instructions, explains how to setup a section writeup 
and key in eclipse and github, also how to scrape it out to make an 
assignment start

* PA-creation-instructions, will explain how to set up an assignment writeup 
and key in eclipse and github, how to scrape it out to make a github 
assignment, etc.


## Writeups for Section and Programming Assignments (public)

Assignment writeups often need minor updates.  Therefore all of
the assignment writeups will be put into a single public repository.
This repository will also contain the public test cases and any
shared/example code for each of the assignments AND
the grading script(s) used by Travis CI.

https://github.com/UACS210Spring2018/PA-and-Section-Writeups

In piazza, we will put links to the assignment writeups.
SIDE-EFFECT: Yes this means that students will be able
to navigate to assignment writeup drafts.  They will be
able to see assignment AND section plans ahead of time.
That is ok.  I will be accepting edits to these writeups
from you all as pull requests (see the github-usage-policy.txt 
file).  Therefore, I take full responsibility for what 
the students can see.  We will also start the 
initial drafts of assignment writeups in the key 
repositories and then move them over when they are ready for 
posting.


## Starts for Section and Programming Assignments (public)

There will be a start repository for each section and PA.
It will include things like the .travis.yml and starter
code that will be copied into each student's github repository
when they accept an assignment.

## Keys for Section and Programming Assignments (PRIVATE)

Each assignment will also have a key repository.  It is easier
to have each of these in their own repository because then
we can see how the .travis.yml files are working as we do
the key.

This private key repository for each assignment will also be
where we collect the private test cases for grading purposes.


## General Course Organization

* Lectures: Most likely, usage of electronic devices will not be allowed 
in lecture.  This will also apply to all of you.

* Sections: Google docs for section notes and instructions and Github for
example and starter code.  (These will be the focus of the weekly prep meeting.)

* Drills: CloudCoder will be used, (Problems will need to be tested by TAs
all before we give them to students)

* Programming Assignments (PAs): Github classroom will be used in 
  coordination with Eclipse.
  * The 210 students will NOT need (or be taught) ANY command-line.
  * Travis CI will be used to ensure that student projects compile and 
    run on public test cases with the grading scripts.
  * PAs will need proofread and done by most TAs before being given 
    to students.

* Grading PAs for code decomposition and style: Investigating 3 possible 
tool options for this.

* Quizzes and Exams: Gradescope.  There will be a quiz every Monday in 
class over assigned reading material.  We will be scanning them in and 
using the Gradescope online SW. (Should be doing a demo quiz during the 
TA orientation for CS 210.)

* Peer Reviews: Still working on this but probably Aropa.

* Grades: D2L for students to access, Google sheet copies for TAs?

* Reading assignments: Will be posted on Piazza.  Pulling from various sources.

* Web page, syllabus, and discussion forum: piazza,
https://piazza.com/arizona/spring2018/csc210/home

* Slack to communicate amongst TAs: cs210spring2018ua.slack.com


## Suggested local file Organization

On my machine, I have a clone of the CS210Spring2018 main repository.
Inside it, I have organized the other repositories for this class.
They are not part of that private repository, just hanging out as
subdirectories.

    CS210Spring2018/
		ClassNotes/
		README.md
		ReadingAssignmentsArchive/
		github-usage-policy.txt

		// Things are a little out of order for illustrative purposes.
		
		// Here are the subdirectories NOT in this repository.
		PA-and-Section-Writeups/ 
		(https://github.com/UACS210Spring2018/PA-and-Section-Writeups)
		
			PA1-Gradenator-Writeup/
			
			Section0-Eclipse-Writeup/

			PA2-...-Writeup/
			
			...

		PA-and-Section-Keys/
			PA1-Gradenator-Key/
			(https://github.com/UACS210Spring2018/PA1-Gradenator-Key)
			
			Section1-...-Key/
			(https://github.com/UACS210Spring2018/Section1-...-Key)
			
			PA2-...-Key/
			(https://github.com/UACS210Spring2018/PA2-...-Key)
			

		PA-and-Section-Starts/
			PA1-Gradenator-Start/
			(https://github.com/UACS210Spring2018/PA1-Gradenator-Start)

			Section1-...-Start/
			(https://github.com/UACS210Spring2018/Section1-...-Start)
			
			PA2-...-Start/
			(https://github.com/UACS210Spring2018/PA2-...-Start)

			
