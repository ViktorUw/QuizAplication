# QuizAplication

A simple Android quiz app written in Java. It asks 10 general-knowledge questions with four answers each and shows your score at the end.

## Features

- 10 multiple-choice questions (geography, literature, chemistry, astronomy and more)
- Answer selection with radio buttons
- Question counter and progress bar
- 10 points for each correct answer, total score on the final screen
- Current question and score are kept when the screen rotates (`onSaveInstanceState`)

## Tech stack

- **Java**
- Android Views (XML layouts, `RadioGroup`, `ProgressBar`, `CardView`)
- View Binding
- Min SDK 28, target SDK 34

## Project structure

```
app/src/main/java/com/example/quiz/
├── MainActivity.java   # Quiz logic and UI
├── DataProvider.java   # List of questions
└── questions.java      # Question model
```

To change the questions, edit `DataProvider.fillList()`.

## Getting started

1. Clone the repository:
   ```bash
   git clone https://github.com/ViktorUw/QuizAplication.git
   ```
2. Open the project in **Android Studio** and let Gradle sync.
3. Run the app on an emulator or a device with Android 9.0 (API 28) or newer.

> The questions and the interface are in Polish.

See also: [QuizCompose](https://github.com/ViktorUw/QuizCompose), a version of this quiz built with Jetpack Compose.
