# Encapsulation

Refer to <a href="Encapsulation.java">Basic Banking Portal through Encapsulation</a> for more details.

- Encapsulation is defined as the wrapping up of data, or the bundling of the implementation of data members and methods, instance variables of a class etc. It hides the code in a single entity that can be protected from the outside world (Data Hiding).

- **Data Hiding** is a sub-domain of Encapsulation where we define private instance variables and use getters and setters to get their access outside the domain of the class. This means that we can set password, but can't view the real raw password, and can probably hash it and return using the getter. This way the password is protected but still returnable.

- The difference between Encapsulation and Data Hiding is that Encapsulation brings about the knowledge and wraps entire data where variables may or may not be private. But in Data hiding, there is an advanced level of data security where variables are private. 

- Data Hiding focuses on securing the internal state of an object, while Encapsulation combines data and methods into a single unit to ensure maintainability of code.