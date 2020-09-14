## ![Logo](http://skilldistillery.com/downloads/sd_logo.jpg) Aaron Cottrell
## Jets Project

## Overview
The purpose of the program is to allow user interaction with a pre-existing library of Jets in a virtual airfield. Users are allowed to make additions and removals from the index along with a few limited interactions and commands for the Jets to complete virtually.

## Step by Step (Short Version)
1. Welcome
2. Interact with Main Menu
3. Navigate (Add/Subtract Jets from the airfield)
4. Quit from Main Menu, Sub-Menu or Search Menu
5. Goodbye

## Walkthrough (Long Version)
The focus on the most recent upgrade was on UI and overall functionality. The Main Menu is the first option that the user sees. The main menu contains calls from the user to the Airfield class. The user gets to navigate the menu which controls the switch statement. Jets are constructed off a master abstract class "Jet" but sub-classed into other public classes. These are where all information and methods are stored for the user to call from the Airfield.

As the Main Menu loads we used a Buffered Reader to load a preset fleet of Jets for the user to start with. Throughout the use of the program the user will be able to manipulate that initial list but they can stick with this list if they choose. All changes by the user are tracked until they exit. Unfortunately, we are working on a 2.0 which will save those changes to use on the next launch but we're not there yet. Users can tell the fleet to fly, load cargo, or fight. Loading cargo or fighting are implemented through instances of interfaces which allowed specific types of subclasses to call their appropriate method. The user may also search and recall fleet information in a number of different ways. Artwork for the menus is randomized. The user may quit the program from any menu they are presented.  


## Struggles
There are moments all throughout this project but I probably struggled the most just with filling the ArrayList from the text file. Not with the Buffered Reader but that I didn't remember to call the method before running through the switch so I spent a lot of time very frustrated that I could get PrintFleet to work but then when I would look to activate the secondary options in the menu, the ArrayList was empty.

I also had issues with the Try/Catch Block with getting the Try statement to return the value that we were testing. I ended up looking up how to do that online and ended up changing the return from void to int which is what the user was entering in.


## Lessons Learned
I was pretty comfortable with this concept for whatever reason it just clicked to have classes looking into other classes and interfaces. I learned a little bit about ASCII art but that really isn't all that useful. I had made the mistakes in storing "highest rate" (speed, range) in FoodTruck so I was on top of those statements for this project. I tried to work on formatting and making things more readable (Tell the story better). I was going to work on the stretch goals but decided to go for the life balance a little bit instead. I felt fairly comfortable that I could have accomplished those goals if I had spent more time with it.

## New Course Material
1. Abstract Classes
2. Interfaces
3. Buffered Reader
4. ArrayList
5. Exceptions
6. Polymorphism
7. Encapsulation
8. Wrapper Classes  
9. Try/Catch Block
10. UML Mapping
