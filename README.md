# FizzBuzzBackend

BackEnd для игры FizzBuzz.

## Run application

1. `git clone https://github.com/Evgeny-Mosiychuk/FizzBuzzBackend`
2. `cd FizzBuzzBackend`
3. `(mvnw build (unix) || mvnw.cmd build (win))`
5. `java -jar build/libs/fizzBuzz-0.0.1-SNAPSHOT.jar`

FrontEnd для этого приложения вы можете найти здесь https://github.com/Evgeny-Mosiychuk/FizzBuzz/tree/master


## Сборка докер образа

docker build -t fizzbuzz . 

## Запуск контейнера

docker run -p 8080:8080 -t fizzbuzz

Open http://localhost:8080 to view it in your browser.
