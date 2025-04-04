# FILE-HANDLING-UTILITY

*COMPANY NAME* : CODTECH IT SOLUTIONS

*NAME* : HARINIKRISHNA

*INTERN ID* :CT04WU169

*DOMAIN NAME* : JAVA PROGRAMMING

*DURATION* : 4 WEEKS

*MENTOR* : NEELA SANTHOSH KUMAR 

*DESCRIPTION* : Platform Used: Visual Studio Code (VS Code)
Programming Language: Java

Project Description:
This project is a beginner-level implementation of file handling in Java. The main objective was to understand and perform basic file operations such as creating a file, writing data into the file, reading data from the file, and modifying the file content by overwriting it. The project was entirely developed and executed on the Visual Studio Code (VS Code) platform, using Java as the core programming language.

The file creation and data writing operations were performed using the FileWriter class. I started the project by creating a new Java file where I initialized a FileWriter object and specified the file name. If the file didn't exist, it was automatically created. I then used the write() method to input content into the file. After writing, the file stream was closed using close() to prevent memory leaks and to ensure the data was saved properly.

To read the data from the file, I used the FileReader class. I created a FileReader object by passing the filename as a parameter and read the content character by character. This content was printed on the console using a loop until the end of the file was reached. Again, the file stream was closed after reading.

To modify the file content, I reused the FileWriter class with overwrite mode. This mode replaces the entire content of the file with new data. This helped me understand how updating file content works in Java and the importance of managing file streams properly during write and overwrite operations.

Throughout this project, I gained hands-on experience with Java I/O (Input/Output) classes and understood how file systems interact with Java applications. I also learned to handle exceptions such as IOException using try-catch blocks, which is essential to make the program robust and avoid runtime errors.

Real-World Use Cases:
File handling in Java is a fundamental concept used in various real-world applications. Some common use cases include:

Data Logging: Writing logs or system events to a file for later analysis or debugging.

Configuration Files: Reading or writing settings from a file such as .properties files used in Java applications.

Saving User Input or Forms: Storing data entered by users into local files when databases aren't necessary.

Local File Management Systems: Applications like text editors or lightweight data organizers use file handling to save and retrieve documents.

Report Generation: Generating and exporting reports in text or CSV format from applications.
