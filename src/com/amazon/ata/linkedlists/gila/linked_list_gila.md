# 'ArrayList' v 'LinkedList' GILA

## GILA Roles

Read more about the roles: https://w.amazon.com/bin/view/Amazon_Technical_Academy/Internal/HowTos/GILARoles

## Activity

This activity will explore the runtime complexity differences between several list operations on
`ArrayList`s and `LinkedList`s, for comparison purposes. But we’re engineers! We love data, so
we include running some quick and dirty performance profiling code to compare their performance
empirically (meaning: through testing). This is an approach that we sometimes use to determine in
practice which approach to a problem is faster--though admittedly usually not to verify a
Big-O difference in runtime, as that should be determinable from reading the code itself :).

Note: This is a very basic implementation of profiling by measuring how long our operations take.
There are much more robust frameworks to thoroughly measure Java code, but this approximation
is enough for our activity :)

Before you start, complete the form below to assign a role to each member.
If you have 3 people, combine the *Presenter* and *Reflector*.

|Team Roles	|Team Member	|
|---	|---	|
|**Recorder**: records all answers and questions, provides copies to team and facilitator.	|	|
|**Presenter**: talks to facilitator and other teams.	|	|
|**Manager**: keeps track of time and makes sure everyone contributes appropriately.	|	|
|**Reflector**: considers how the team could work and learn more effectively.	|	|


### Phase 0: Review the classes

|Phase 0                         |Start time: |
|---                             |---         |
|(5 minutes) Review the classes |            |

View the [class diagram for this profiling activity](https://plantuml.corp.amazon.com/plantuml/form/encoded.html#encoded=bLFBJiCm4BpxArOvfK32lOgYLb2aIYrKK0u8SJ3njh5mxCXsG1NmxpXFahH28fV4kpFZyQmpCvPgMsI2988Q0ojkx4Qh7HUexmifKSCd0VUSPvHB_y5gBlVFBnEOmhlYZ7oJ4yI6yi5jMfQtgcduehzo4iqNVHLO0alLlawbajUBicxyTb-8UEphGfgsRIv0esIeZNkRGbWpYIvvNFhZqgBUqGJ7sq4KTRquRaoVjOeCChIfOcPQrIbZDrmRwpDggNDnhGedq-NGG5RqJyGURIqowVfjVSqPSmcD6a7Gc4fHv2xOWIN7Ae-np7A16KfBBLToUyXhbNfK5J1nPzR-sEjS23zHGc1Iybppgbj4jONuUCo32EKRiYR8fxj7MAutgyLwSRjrOH9ouYPvXK43r8CmZ8U37g31Iwc3LGXGEmzK48ndHyZHCB_243pUXc6yFcMkDJrKl7_HVez8PkvskT_a1m00).
Also take a look through the classes in `com.amazon.ata.linkedlists.classroom`  in your Snippets
package.

In particular, we'll be working with the `ProfileableList` interface and you 
will be implementing the `ProfileableLinkedList` for running in the performance simulation in
Phase 2.

Note any questions that your group has about the class structure:
1. 

### Phase 1: Analyze the 'ArrayList' implementation

|Phase 1                                             |Start time: |
|---                                                 |---         |
|(15 minutes) Analyze the 'ArrayList' implementation |            |

We’ve already provided an implementation for `ProfileableArrayList` for you. This class implements
the desired operations using an `ArrayList`.

Let’s try profiling the `ArrayList` operations! All you need to do is run the 
`linked-lists-classroom-performance-report` rde workflow!

Note: `ListProfiler` adds a specified amount of data (random `Double`s) to the different 
`List` implementations and runs operations on them, measuring how long those operations take (on
average) over a large number of repetitions.

Looking at the `ArrayList` output rows from the output of the 
`linked-lists-classroom-performance-report` rde workflow, discuss within your group and answer
the following questions:
 

1. On average, which operation(s) appear to scale with list size?  
   That is, which operations take longer when they process more elements?
    1. 
2. How does `ArrayList`'s implementation cause this behavior?
    1. 
3. On average, which operation(s) appear not to scale with list size?
    1. 
4. How does `ArrayList`'s implementation cause this behavior?
    1. 

 
 
Consider the following `ArrayList`:

|Index |0    |1    |2    |3    |4    |5    |6    |
|---   |---  |---  |---  |---  |---  |---  |---  |
|Value |2    |3    |4    |5    |6    |7    |8    |


5. Draw the end state after executing add(0, 1.0) on the above `ArrayList`:

|Index |0    |1    |2    |3    |4    |5    |6    |7    |
|---   |---  |---  |---  |---  |---  |---  |---  |---  |
|Value |     |     |     |     |     |     |     |     |


6. How many existing elements needed to be moved before we could insert the
      new one? How does this behavior scale as the `ArrayList` grows?
    1. 
7. What runtime complexity is this behavior?
    1. 




### Phase 2: Implement `ProfileableLinkedList`

|Phase 2                                         |Start time: |
|---                                             |---         |
|(10 minutes) Implement `ProfileableLinkedList`  |            |

Currently, our only fully implemented `ProfileableList` is a `ProfileableArrayList`,
but this isn't the `ArrayList` lesson! Using the `ProfileableArrayList` implementation as a
template, we'll finish the `ProfileableLinkedList` implementation and run the 
`linked-lists-classroom-performance-report` rde workflow again.

You will need to implement the following methods, all of which currently throw an 
`UnsupportedOperationException`:

* `addFirst`
* `addLast`
* `getFirst`
* `getMiddle`
* `addAll`

Hint: You can view the [`LinkedList javadocs`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)
to determine which `LinkedList` methods you can use to implement these methods.

When you have successfully made your changes and run the 
`linked-lists-classroom-performance-report` workflow and no longer see any boxes marked “Not
 implemented yet, N/A”, please mark the checkbox next to your role below:

* Manager
* Presenter
* Reflector
* Recorder



### Phase 3: Analyze The 'LinkedList' Implementation

|Phase 3                                               |Start time: |
|---                                                   |---         |
|(10 minutes) Analyze The 'LinkedList' Implementation  |            |

Now that we have implemented the `ProfileableLinkedList` methods, let’s run the
`linked-lists-classroom-performance-report` rde workflow again. Looking at the new
`LinkedList` output rows, use the data to discuss within your group to answer the following
questions:


1. On average, which operation(s) appear to scale with list size? 
    1. 
2. How does `LinkedList`'s implementation cause this behavior?
    1. 
3. On average, which operations appear not to scale with list size?
    1. 
4. How does `LinkedList`'s implementation cause this behavior?
    1. 


Consider the following singly-linked list with no tail node pointer, where the current head node
is in brackets: `[ ]`

`[5.0] -> 6.3 -> 9.0 -> 12.4`


5. Provide the end state after executing `addFirst(2.3)` on the linked list, with brackets around
 the new head node
    1. 
6. What happened to the other elements? How does this behavior scale as we add more elements?
    1. 
7. What runtime complexity is this behavior?
    1. 

 
 
Consider the following singly-linked list with no tail node pointer, where the head node is in 
brackets: `[ ]`, and a node with unknown value is marked as `?`
 
`[2.3] -> 5.0 -> 6.3 -> 9.0 -> 12.4 -> ?`
 

8. Can we directly access the unknown node (?), without checking any other nodes? Why or why not?
    1. 
9. How many nodes must we travel through before we can access the unknown node? How does this 
    behavior scale as we add more elements?
    1. 
10. What runtime complexity is this behavior?
    1. 


## Extensions

If you're interested, we don't want to deprive you of the pleasure of implementing your own
linked list. Here's your chance (if you want it)

You have a few options here:


* Finish the starter `AtaLinkedList` implementation in the 
`com.amazon.ata.linkedlists.classroom.extension.starter` package

* Create your own `LinkedList` implementation using the `AtaNode` class in the
`com.amazon.ata.linkedlists.classroom.extension.starter` package

* Create your own `LinkedList` implementation from scratch!


If you want to profile your implementation, also make sure to implement the `ProfileableList`
interface!

### Extension 1: First Things First


Implement `AtaLinkedList`'s (or your own `List`'s) `addFirst` and `getFirst` methods,
along with any needed unit tests.

Then, in `ListProfilerRunner` add a new `ProfileableList` to our `ListProfiler` with your new
`LinkedList` using the `withListToProfile` method.

Run the `linked-lists-classroom-performance-report` rde workflow to validate your changes.

Does the profiler output match what you expect?


### Extension 2: Middle Of The Pack

Implement  `AtaLinkedList`'s (or your own `LinkedList`'s) `getMiddle` method,
along with any needed unit tests.

Run the `linked-lists-classroom-performance-report` rde workflow to validate your changes. 

Does the profiler output match what you expect?


### Extension 3: Tail End of the Extensions

Add a `deleteLast` method to `AtaLinkedList` (or your own `LinkedList` class) to delete the tail
pointer and update it to point to the new last node.
