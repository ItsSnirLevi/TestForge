# Test Helper

## Overview

The Test Helper is a Java program built with Java and JavaFX for creating and managing question stocks. It allows users to add both open and multiple-choice questions along with answers, which are then saved into a question stock file. Users can then utilize the question stock to generate tests either manually or automatically and export them as text files. Additionally, answers can be exported separately as text files.
* Side note: an "American Question" is a multiple choice question.

## Features

- **Question Management**: Easily add and manage open and multiple-choice questions.
- **Test Generation**: Create tests manually or automatically using the question stock.
- **Export Functionality**: Export tests and answers as separate text files.
- **Intuitive GUI**: User-friendly interface built with JavaFX.

![image](https://github.com/ItsSnirLevi/TestHelper/assets/127433228/98a64e25-bc65-45c1-9b1f-ebdd658f5a07)

## Usage

### Adding Questions

1. Launch the application.
2. Click on the "Add Question and Answer" button.
3. Choose whether to add an open or multiple-choice question.
4. Enter the question and its corresponding answer(s).
5. Click "Finish" to add the question to the question stock.

![image (2)](https://github.com/ItsSnirLevi/TestHelper/assets/127433228/4259df20-2a91-4dcd-bfda-34ec77d346a7)

### Generating Tests

1. Launch the application.
2. Choose whether to generate the test manually ("Create Test") or automatically ("Automatic Test Generator").
3. Follow the prompts to select questions for the test.
4. Click "Generate" to save the generated test as a text file.

![image (1)](https://github.com/ItsSnirLevi/TestHelper/assets/127433228/00058385-a079-4a4c-8e4d-6fbb7b458607)

### Getting the Files

The Files are stores in the same directory as the project.

## Installation

1. Clone the repository to your local machine.
`git clone https://github.com/ItsSnirLevi/TestHelper.git`
2. Open the project in your preferred Java IDE.
3. Run the `Main.java` file to launch the application.

## Dependencies

- JavaFX (included in JDK 8 and later)

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add new feature'`).
5. Push to the branch (`git push origin feature/your-feature`).
6. Create a new Pull Request.
