# SE350_sprint1


# Project README

## Sprint 1 Checklist

- **Are you in a Group?**  No (alone)
- **If so, who else is in your group?** No one
- **Do you have your GitHub account set up?** Yes
- **Do you have a public repository for your Project?** Yes
- **What is the link to your GitHub repository?** https://github.com/lfreed123/SE350_sprint1.git
- **If you are in a group, does everyone have write access to the github repo?** Yes (alone)
- **Do you have a "Hello World" program that compiles and runs?** Yes
- **Where is the entry point to your project?** src/Main.java



**This is just added from Project_Plan.md**


# SE 350 - Project Plan
 
**Language:** Java
**Project:** CPU Process Scheduler (desktop simulation)

# Pre-Note Explanation:

- This is a work in progress and this may change drastically. But I wanted to lay this out for Sprint 2. 
- Choose this project because I am learning Python's asyncio (I know this project and asyncio differ heavily) and seemed interested in it.

## Idea
 
A simulation of an OS process scheduler. It will track processes (arrival, burst, priority) through their lifecycle using a tick-by-tick logical clock. Using a Swing GUI (I haven't used before) displaying the ready queue, a chart, and metrics (waiting/turnaround times).
 
## Libraries Used / Needed
 
- **Java SE (core)** - collections, logic. 
- **Java Swing (javax.swing)** - GUI: window, panels, buttons, Gantt charts. 
- **JUnit 5** - unit testing with Arrange-Act-Assert. 
- **JFreeChart** - only if hand-drawn Swing charts prove troubling.

## Design Patterns
**These are some design patterns I looked up and tried to connect them to the required components for this project**
 
- **Strategy** - Swaps scheduling algorithms: (maybe:  FCFS, SJF, Round Robin).
- **State**  - process lifecycle transitions.
- **Singleton**  - the simulation clock, one shared source of the current tick.
- **Observer**  - engine notifies the GUI panels to repaint each tick.
- **Factory Method**  - turns the user's algorithm choice into the right Strategy object.
- **Command**  - button actions as command objects.

 
## How They Connect at Runtime
 
1. User picks an algorithm - Factory Method builds the Strategy.
2. User clicks Start - a Command tells the engine to begin.
3. Each tick: engine reads the Singleton clock, Strategy picks the process, and process State updates.
4. Engine notifies Observers - the GUI panels repaint.
5. When all processes reach Terminated, metrics are computed and displayed.
