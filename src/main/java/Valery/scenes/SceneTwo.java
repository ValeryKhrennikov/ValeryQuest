package Valery.scenes;

import Valery.AbstractScene;
import Valery.SceneManager;
import Valery.constans.SceneNames;

import java.util.Scanner;

public class SceneTwo extends AbstractScene {

    public SceneTwo(Scanner mainScanner, SceneManager sceneManager) {
        super(SceneNames.SCENE_TWO, "sceneDescription", mainScanner, sceneManager);
    }

    @Override
    public void enter() {

        System.out.println("\nВы подходите к столу и видите два ноутбука:");

        System.out.println("1. Старый компьютер с пылью на клавиатуре.");
        System.out.println("2. Современный ноутбук, который так и манит.");
        System.out.print("Выберите ноутбук (1 или 2): ");

        int choise = makeChoice(getScanner());

        if (choise == 1) {
            System.out.println("Похоже у тебя есть шанс чего-то достичь");
            System.out.println("Ты получаешь призвание \"программист\" и новый ноутбук");
            System.out.println("||            ||\n" +
                    "||            ||\n" +
                    "||            ||\n" +
                    "||            ||\n" +
                    "||____________||\n" +
                    "|______________|\n" +
                    " \\\\############\\\\\n" +
                    "  \\\\############\\\\\n" +
                    "   \\      ____    \\   \n" +
                    "    \\_____\\___\\____\\");

            System.out.println(getSceneManager().getCharacter().getCharacterName()+" встает на новый путь, да ему "
                    +getSceneManager().getCharacter().getAge()+" но это не важно. Не важно что он раньше" +
                    " говорил о своих навыках \""+getSceneManager().getCharacter().getAnswer()+"\" - забыто, " +"теперь он Нуб Программист с хорошим ноутбуком," +
                    " пожелаем ему успехов!");

        }
    }

    private static int makeChoice(Scanner scanner) {
        int choice;
        while (true) {

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера после считывания числа
                if (choice == 1) {
                    break; // Выход из цикла, если выбор корректный
                } else if (choice == 2) {
                    System.out.println("\nВы пытаетесь включаете старый компьютер, но он не загружается.");
                    System.out.println("Похоже, он давно не использовался, а поскольку вы нуб," +
                            " вам его не починить");
                    System.out.println("        |.-----.|\n" +
                            "        ||x . x||\n" +
                            "        ||_.-._||\n" +
                            "        `--)-(--`\n" +
                            "       __[=== o]___\n" +
                            "      |:::::::::::|\\\n" +
                            "      `-=========-`()");
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