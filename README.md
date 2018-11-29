# KualiAssesment

I only got around 35-40 minutes to work on this assignment because my wife needed help with something
and she's more important to me. Sorry if this is not the best quality work. I hope you guys understand
and can see my thought process because I would love to switch from working at Qualtrics to be with you guys.

I didn't want to cheat and come back allowing me more time to think.
I tried to put everything I was thinking in comments that I didn't have time for to code.

I picked Java because it is the most common language for Object oriented programming which is good for system design
because it is a system design problem. I didn't use JavaScript because I'd rather not use a functional programming
language for a system design problem. My current job at Qualtrics uses a lot of JS so I am still very familiar with it.
It's just that I think Java is a better fit for this problem.

My code is split into two major parts: The Elevator_Manager and the Elevator

Elevator_Manager:
This class has all of the elevator objects in it. I put the logic in comments on how to pick the best elevator.
If I had known I had more time, I'd put more time in this part.

Elevator:
I use the State design pattern for the Elevator class. It uses polymorphism rather than using a whole bunch if/else to
decide what to do depending on what button is pressed. Polymorphism allow for the code to be cleaner and makes it easy
to add or take away states.
