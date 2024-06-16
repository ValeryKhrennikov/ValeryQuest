package Valery.scenes;

import Valery.AbstractScene;
import Valery.SceneManager;
import Valery.constans.SceneNames;

import java.util.Scanner;

public class SceneOne extends AbstractScene {


    public SceneOne(Scanner mainScanner, SceneManager sceneManager) {

        super(SceneNames.SCENE_ONE, "\nИ так, начнем...", mainScanner, sceneManager);
    }

    @Override
    public void enter() throws Exception {
        print(getSceneDescription());
        print(getSceneManager().getCharacter().getCharacterName() + " " + getSceneManager().getCharacter().getSkill() + "\n");
        print("Ты находишься в заброшенной старой усадьбе и перед тобой стоит выбор:");
        print("Выберите действие (1 или 2): ");

        int result = makeChoice(new String[]{
                "Подойти к столу и выбрать себе подходящее \"оружие\".",
                "Идти направо по коридору в неизвестность."
        });

        if (result == 0) {
            getSceneManager().enterScene(SceneNames.SCENE_TWO);
        } else if (result == 1) {
            getSceneManager().enterScene(SceneNames.SCENE_FIRST_DEATH);
        }
    }
}
