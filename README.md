Objective of the exercise: Create an Android application that displays a simple questionnaire with checkboxes, radio buttons, and navigation buttons.

Views used in the project:

TextView: To display the title and questions.
RadioButton and RadioGroup: For the single-choice question.
Button: For the "Exit" and "Next" buttons.
Main steps of the Java code:

Declare variables for the important views (CheckBox, RadioButton, Button).
Initialize these variables in the onCreate() method.
Implement an OnClickListener for the "Next" button:
Retrieve the selected answers.
Create an Intent to move to the next activity with the answers.
Start the new activity.
Implement an OnClickListener for the "Exit" button:
Use finish() to close the current activity.


https://github.com/user-attachments/assets/1129d05f-9bcd-4487-88de-0db4f8bfcbd0

