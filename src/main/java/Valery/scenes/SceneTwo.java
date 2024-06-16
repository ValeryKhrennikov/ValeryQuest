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
    public void enter() throws Exception {

        print("\nВы подходите к столу и видите два ноутбука:"+
                "Выберите ноутбук (1 или 2): \n");

        int result = makeChoice(new String[]{
                "Старый компьютер с пылью на клавиатуре",
                "Современный ноутбук, который так и манит",
                "вернуться назад (в холл)"
        });

        if (result == 0) {
            print("\nВы пытаетесь включаете старый компьютер, но он не загружается."+
                    "Похоже, он давно не использовался, а поскольку вы нуб, вам его не починить"+
                    "        |.-----.|\n" +
                    "        ||x . x||\n" +
                    "        ||_.-._||\n" +
                    "        `--)-(--`\n" +
                    "       __[=== o]___\n" +
                    "      |:::::::::::|\\\n" +
                    "      `-=========-`()");
            getSceneManager().enterScene(SceneNames.SCENE_TWO);
        } else if (result == 1) {
            print("Похоже у тебя есть шанс чего-то достичь"+
                    "Ты получаешь призвание \"программист\" и новый ноутбук"+
                    "||            ||\n" +
                    "||            ||\n" +
                    "||            ||\n" +
                    "||            ||\n" +
                    "||____________||\n" +
                    "|______________|\n" +
                    " \\\\############\\\\\n" +
                    "  \\\\############\\\\\n" +
                    "   \\      ____    \\   \n" +
                    "    \\_____\\___\\____\\");

            print(getSceneManager().getCharacter().getCharacterName()+" встает на новый путь, да ему "
                    +getSceneManager().getCharacter().getAge()+" но это не важно. Не важно что он раньше" +
                    " говорил о своих навыках \""+getSceneManager().getCharacter().getAnswer()+"\" - забыто, " +"теперь он Нуб Программист с хорошим ноутбуком," +
                    " пожелаем ему успехов!");
            getSceneManager().enterScene(SceneNames.SCENE_THREE);
        }else {
            getSceneManager().enterScene(SceneNames.SCENE_ONE);
        }
    }
}