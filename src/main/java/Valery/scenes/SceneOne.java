package Valery.scenes;

import Valery.AbstractScene;
import Valery.SceneManager;
import Valery.constans.SceneNames;

import java.util.Scanner;

public class SceneOne extends AbstractScene {

    public SceneOne(Scanner mainScanner, SceneManager sceneManager) {

        super(SceneNames.SCENE_ONE, "\nИ так, начнем...", mainScanner, sceneManager);
        System.out.println("in constructor");
    }

    @Override
    public void enter() throws Exception {
        System.out.println(getSceneDescription());
        System.out.println(getSceneManager().getCharacter().getCharacterName() + " " + getSceneManager().getCharacter().getSkill() + "\n");
        System.out.println("Ты находишься в заброшенной старой усадьбе и перед тобой стоит выбор:");

        System.out.println("1. Подойти к столу и выбрать себе подходящее \"оружие\".");
        System.out.println("2. Идти направо по коридору в неизвестность.");

        System.out.print("Выберите действие (1 или 2): ");

        int choice = makeChoice(getScanner());

        if (choice == 1) {
            getSceneManager().enterScene(SceneNames.SCENE_TWO);
        } else  {
            getSceneManager().enterScene(SceneNames.SCENE_FIRST_DEATH);
        }
    }
    private static int makeChoice (Scanner scanner) {
        int choice;
        while (true) {

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера после считывания числа
                if (choice > 0 && choice <= 2) {
                    break; // Выход из цикла, если возраст корректный
                } else {
                    System.out.println("Ошибка: Выберите либо 1, либо 2, других вариантов нет.");
                }
            } else {
                System.out.println("Ошибка: Лапушка, пока без отсебятины, выбери корректный вариант (число).");
                scanner.next(); // Очистка буфера
            }
        }
        return choice;
    }
}
