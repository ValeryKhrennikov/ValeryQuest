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

        print("\nВы идете по коридору направо и внезапно оказываетесь в тупике."+
                "\nВам страшно, вы заблудились в этом коридоре, как в своей жизни, вы постепенно впадаете  отчаяние"+
                "\nВыберите действие (1 или 2): ");

        int result = makeChoice(new String[]{
                "Остатьс и умереть",
                "Вернуться назад и продолжить путь"
        });

        if (result == 0) {
            System.out.println("За вами пришла смерть"+"\nGAME OVER"+
                    "                                           .\"\"--.._\n" +
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
        } else if (result == 1) {
            getSceneManager().enterScene(SceneNames.SCENE_ONE);
        }
    }
}
