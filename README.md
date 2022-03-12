## 1.Test code for Git
> easy for use 

##### In this code, you can see the use of the scanner class as well as the calculation of a simple formula 
- x = (a - b) * (c - d)
#### and the application of conditional operators:
- if
- else
****
## 2.Java Quick Sort method
##### Quicksort is one of the fastest sorting algorithms in existence and has algorithmic complexity. In this method, the task is divided into subtasks until there is an elementary unit. The same with the algorithm: the array is divided into several arrays, each of which is sorted separately and then combined into one array.
*Step-by-step description of how the quick sort algorithm works:*

- select a pivot from the array, the supporting element is the middle element,
- we divide the array into two subarrays: elements, less than the pivot one and elements, more than the pivot one,
- Recursively apply the sort to the two subarrays.
##### We specify two methods in the code: the quicksort method and the main method.
##### In the first case, we write the algorithm for calculating the pivot element, dividing into subarrays, call recursion to sort 2 parts.
##### In the second case, we specify the value of the array itself and print the already sorted values to the console.
> there are also other options for writing code, where specific values in the array are indicated, and not random numbers, with the use of additional conditions if-else
****
*Thank you for the attention!* 
*****
## Inheritance in Java
##### Inheritance is a mechanism in programming, including Java, that allows you to describe a new class based on an existing one. The derived class thus gains access to the fields and methods of the parent class.
##### for example, I created 3 classes: 
1. сlass LessonInheritance with the main method;
2. class Employee;
3. class Lawyer, which is inherited from class Employee.
#####Even without even starting to write code, I know for sure that these classes have something in common: they are company employees who have a name and age, they perform certain work functions, and so on. In this example, when creating class Lawyer using the word extends, I removed the common methods from class Employee. 
#####The logic of the work of both classes is very similar, but the methods from the parent class do not exactly fit the child class ( public void work (), public void eat (), etc.). In this case, ***'redefining (replacing) methods'*** comes to the rescue. If a method is inherited that does not do exactly what is needed in the new class, you can replace this method with another one, which I did. 
>Java instanceof operator
#####To check whether an object was created on the basis of some class, Java has a special operator - instanceof. It returns true if the test was true, or false if the result was false.
#####In my code, such a check is made in the main method of the LessonInheritance class. The check with the instanceof operator returned true because we have an object of the Lawyer class that inherits from the Employee class.
#####Pay attention to the instanceof operator: it is written without a dot, since it is an operator, not a method (“instanceof class object”).
****
*That's all, thanks for your attention!*

