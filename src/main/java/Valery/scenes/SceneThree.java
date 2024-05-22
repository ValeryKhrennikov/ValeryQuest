package Valery.scenes;

import Valery.AbstractScene;
import Valery.SceneManager;
import Valery.constans.SceneNames;

import java.util.Scanner;

public class SceneThree extends AbstractScene {
    public SceneThree( Scanner scanner, SceneManager sceneManager) {
        super(SceneNames.SCENE_THREE, "sceneDescription", scanner, sceneManager);
    }

    @Override
    public void enter() throws Exception {

    }
}
