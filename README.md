# Welcome to COMP2000 - Object Oriented Programming Practices
## Session 2, 2025

The Design Patterns that have used in this project is the State Pattern, which is a pattern Focusing on using state to change the Object`s behaviour. It is primary used in the way that the cell changes colour based on a Timer use to show the Season changing. Thus avoid a finite of state which an object can be in which it can create a cluttered Conditionals that make pick up a behaviour far slower. It also prevent any further modification should the project evolve according to the need of the client

The usage of State Pattern in this project has allow the program to implementing the season with ease as instead of using the Cell class to change to a new colour for every minute.  Instead another Class which provide context named Season, as well as reference Class which were Summer, Autumn, winter and Spring along with an Interface named SeasonState is used instead. 

With the implementation of State Pattern, the season of each cell can easily change via a timer that track how long does the program run. As each Season behaviours differently in regard to the weather, it can be further added weather phenomenon such as Snow or temperature depending on the season.

For instance the Season file use state to determine the season of each cell and thus switch accordingly to a New Color for each Cell. This allows for frequent state changes for the Cell and make it run more efficiently without the usage of conditional Statement. The usage of State Pattern also allow the programmer to change the season into different State such as Monsoon season instead thus making it highly customisable for the client.

For the usage of Lambda and Stream operation, this primary concern with BuffedReader which is an operation that interpret the raw data from the Website into usable data for the project

In this stream


state- summer/autumn/winter/spring

