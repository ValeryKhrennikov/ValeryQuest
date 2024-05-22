package Valery.scenes;

import Valery.AbstractScene;
import Valery.SceneManager;
import Valery.constans.SceneNames;

import java.util.Scanner;

public class SceneFirstDeath extends AbstractScene {
    public SceneFirstDeath(Scanner mainScanner, SceneManager sceneManager) {
        super(SceneNames.SCENE_FIRST_DEATH, "Death", mainScanner, sceneManager);
    }

    @Override
    public void enter() throws Exception {
        System.out.println("\nВы идете по коридору направо и внезапно оказываетесь в тупике.");
        System.out.println("Вам страшно, вы заблудились в этом коридоре, как в своей жизни," +
                " вы постепенно впадаете  отчаяние");

        System.out.println("1. Остатьс и умереть");
        System.out.println("2. Вернуться назад и продолжить путь");

        System.out.print("Выберите действие (1 или 2): ");

        int choice = makeChoice(getScanner());
        if (choice == 1) {
            System.out.println("За вами пришла смерть");
            System.out.println("\nGAME OVER");
            System.out.println("                                           .\"\"--.._\n" +
                    "                                           []      `'--.._\n" +
                    "                                           ||__           `'-,\n" +
                    "                                         `)||_ ```'--..       \\\n" +
                    "                     _                    /|//}        ``--._  |\n" +
                    "                  .'` `'.                /////}              `\\/\n" +
                    "                 /  .\"\"\".\\              //{///\n" +
                    "                /  /_  _`\\\\            // `||\n" +
                    "                | |(_)(_)||          _//   ||\n" +
                    "                | |  /\\  )|        _///\\   ||\n" +
                    "                | |L====J |       / |/ |   ||\n" +
                    "               /  /'-..-' /    .'`  \\  |   ||\n" +
                    "              /   |  :: | |_.-`      |  \\  ||\n" +
                    "             /|   `\\-::.| |          \\   | ||\n" +
                    "           /` `|   /    | |          |   / ||\n" +
                    "         |`    \\   |    / /          \\  |  ||\n" +
                    "        |       `\\_|    |/      ,.__. \\ |  ||\n" +
                    "        /                     /`    `\\ ||  ||\n" +
                    "       |           .         /        \\||  ||\n" +
                    "       |                     |         |/  ||\n" +
                    "       /         /           |         (   ||\n" +
                    "      /          .           /          )  ||\n" +
                    "     |            \\          |             ||\n" +
                    "    /             |          /             ||\n" +
                    "   |\\            /          |              ||\n" +
                    "   \\ `-._       |           /              ||\n" +
                    "    \\ ,//`\\    /`           |              ||\n" +
                    "     ///\\  \\  |             \\              ||\n" +
                    "    |||| ) |__/             |              ||\n" +
                    "    |||| `.(                |              ||\n" +
                    "    `\\\\` /`                 /              ||\n" +
                    "       /`                   /              ||\n" +
                    "      /                     |              ||\n" +
                    "     |                      \\              ||\n" +
                    "    /                        |             ||\n" +
                    "  /`                          \\            ||\n" +
                    "/`                            |            ||\n" +
                    "`-.___,-.      .-.        ___,'            ||\n" +
                    "         `---'`   `'----'`");
            System.exit(0);
        } else {
            getSceneManager().enterScene(SceneNames.SCENE_ONE);
        }
    }

    private static int makeChoice(Scanner scanner) {
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
                System.out.println("Я понимаю что хочется выбрать свой вариант, но бог здесь Я.");
                System.out.println("Ошибка: Лапушка, пока без отсебятины, выбери корректный вариант (число).");
                scanner.next(); // Очистка буфера
            }
        }
        return choice;
    }
}
