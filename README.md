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
##### Even without even starting to write code, I know for sure that these classes have something in common: they are company employees who have a name and age, they perform certain work functions, and so on. In this example, when creating class Lawyer using the word extends, I removed the common methods from class Employee. 
##### The logic of the work of both classes is very similar, but the methods from the parent class do not exactly fit the child class ( public void work (), public void eat (), etc.). In this case, ***'redefining (replacing) methods'*** comes to the rescue. If a method is inherited that does not do exactly what is needed in the new class, you can replace this method with another one, which I did. 
>Java instanceof operator
##### To check whether an object was created on the basis of some class, Java has a special operator - instanceof. It returns true if the test was true, or false if the result was false.
##### In my code, such a check is made in the main method of the LessonInheritance class. The check with the instanceof operator returned true because we have an object of the Lawyer class that inherits from the Employee class.
##### Pay attention to the instanceof operator: it is written without a dot, since it is an operator, not a method (“instanceof class object”).
****
*That's all, thanks for your attention!*
****
## Writing files.
##### In Java, the File class represents files and directory paths in an abstract manner. This class is used to create, search, delete files and directories, etc.
##### The constructor is passed either a path to a file as a string, or a File object referring to a specific text file. We use StringBuilder to work with strings with less overhead and also use the append parameter to add additional text to the written file.
##### In order to work with a file, you first need to create it and determine its name and path, and only then, using the call in the main writePersonToFile(person) method, write some text to the created file, in my case, the text is entered from the keyboard (PersonScanner class) and written directly to a file, where the document name is the person's name (FileWriter class). In addition to the first name, the surname, reporting and age are also entered into the file. A small input validation (TextValidation class) has been added to the code if the input is incorrect.
> There is another point, in addition to data validation, custom exceptions are implemented in the code, for example, when creating a file that will match the name of an already created file, an exception inherited from RuntimeException (FileAlreadyCreatedException class) will be thrown, which helps to stop the program execution at the stage creating an existing file.
****
*That's all, thanks for your attention!*
****
## input-Output Java
##### I/O is used to access or process input and produce output based on the input. Java uses the concept of streams, which speed up I/O operations.
##### There are symbolic abstract classes (working with text data) - these are Writer and Reader; and byte abstract classes (working mainly with audio, video, images) -InputStream and OutputStream.
##### In this example, the file "test_data.txt" is given, there are 100 records (lines) inside - full name, gender, age, phone number.
##### It is necessary to read the file, find all people of retirement age, then write them to the output file "result _data .txt": each line should look like - "Name" "Phone number".
##### First of all, objects were created for reading a file and writing to another file using FileReader and Writer (do not forget about try-catch blocks, where in the try parameters we will immediately close the streams using try-with-resource ). Using the BufferedReader class, we read text from the character input stream, buffering the characters read. Using the Split method, we split the lines in the file into an array of lines. Next, you need to select a record in our "result _data .txt" file. To do this, we immediately use the Integer.parseInt wrapper class method to validate the age (since strings are accepted for reading, but we need a number), and the equals method is used to select the gender.
****
*That's all, thanks for your attention!*