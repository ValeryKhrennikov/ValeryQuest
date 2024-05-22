package Valery.scenes;

import Valery.AbstractScene;
import Valery.Character;
import Valery.SceneManager;
import Valery.constans.SceneNames;

import java.util.Scanner;

public class SceneBeginning extends AbstractScene {


    public SceneBeginning(Scanner mainScanner, SceneManager sceneManager) {
        super(SceneNames.BEGINNING, "Добро пожаловать в Valery Quest!\n",mainScanner,sceneManager);
    }

    @Override
    public void enter() throws Exception {
        Character character = getSceneManager().getCharacter();

        System.out.println(this.getSceneDescription());

        System.out.println("Пожалуйста, введите ваше имя: ");
        character.setName(getScanner().nextLine());

        System.out.print("Введите ваш возраст: ");
        character.setAge(getAge(getScanner()));
        getCommentAboutAge(character.getAge());

        System.out.print("Как у вас уровень навыка: ");
        character.setAnswer(getScanner().nextLine());
        System.out.println(character.getAnswer() + " - это херня!!!");
        System.out.println("Пока ты не устроишься на работу,\n" +
                "Ты - нуб");
        character.setSkill("Нуб");
        System.out.println("Твое последнее слово перед началом?");
        getScanner().nextLine(); // Очистка буфера
        System.out.println("Ага, я внимательно слушал... Ладно...");
        getSceneManager().enterScene(SceneNames.SCENE_ONE);
    }
    private static int getAge(Scanner scanner) {
        int age;
        while (true) {

            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера после считывания числа
                if (age > 0 && age <= 100) {
                    break; // Выход из цикла, если возраст корректный
                } else {
                    System.out.println("Ошибка: Возраст должен быть положительным числом от 1 до 100.");
                }
            } else {
                System.out.println("Ошибка: Введите корректный возраст (число).");
                scanner.next(); // Очистка буфера
            }
        }
        return age;
    }
    private static void getCommentAboutAge(int characterAge) {
        if (characterAge <= 10) {
            System.out.println("Малолетка!\n");
        } else if (characterAge <= 40) {
            System.out.println("Норм возраст, одобряю!\n");
        } else if (characterAge <= 50) {
            System.out.println("Стареешь\n");
        } else {
            System.out.println("А не поздно? Хотя, тебе виднее...\n");
        }
    }
}
