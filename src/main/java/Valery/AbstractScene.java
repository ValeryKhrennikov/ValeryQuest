package Valery;

import Valery.constans.SceneNames;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class AbstractScene {
   final SceneNames sceneName;
   final String sceneDescription;
   final SceneManager sceneManager;
   final Scanner scanner;

    protected AbstractScene(SceneNames sceneName, String sceneDescription, Scanner scanner, SceneManager sceneManager) {
        this.sceneName = sceneName;
        this.sceneDescription = sceneDescription;
        this.sceneManager = sceneManager;
        this.sceneManager.registerScene(this);
        this.scanner = scanner;
    }

    public SceneManager getSceneManager() {
        return sceneManager;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public SceneNames getSceneName() {
        return sceneName;
    }

    public String getSceneDescription() {
        return sceneDescription;
    }

    public  void print(String string){
        System.out.println(string);
    }


//    ArrayList<String>

    public abstract void enter() throws Exception;

    public int makeChoice(String[] choices) {
        // Печать доступных вариантов выбора
        for (int i = 0; i < choices.length; i++) {
            print((i + 1) + ": " + choices[i]);
        }

        int choice = -1;

        // Обработка ввода пользователя
        while (true) {
           print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                String validationResult = validateIntegerInput(choice, 1, choices.length);
                if (validationResult != null) {
                    print(validationResult);
                } else {
                    break;
                }
            } else {
                print("Invalid input. Please enter a number.");
                scanner.next(); // Очистка неверного ввода
            }
        }

        return choice - 1;
    }

    // Метод для валидации ввода пользователя
    private String validateIntegerInput(int input, int min, int max) {
        if (input < min || input > max) {
            return "Invalid choice. Please enter a number between " + min + " and " + max + ".";
        }
        return null;
    }
}
