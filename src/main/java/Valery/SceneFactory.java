package Valery;


import Valery.scenes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SceneFactory {
    private static final Class<?>[] allSceneClasses = {
            SceneBeginning.class, SceneOne.class, SceneTwo.class, SceneFirstDeath.class, SceneThree.class
    };
    private final List<AbstractScene> scenes = new ArrayList<>();

    public SceneFactory(Scanner scanner, SceneManager sceneManager) {
        for (Class<?> sceneClass : allSceneClasses) {
            try {
                AbstractScene scene = (AbstractScene) sceneClass
                        .getConstructor(Scanner.class, SceneManager.class)
                        .newInstance(scanner, sceneManager);
                scenes.add(scene);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public AbstractScene getScene(Class<?> sceneClass) {
        for (AbstractScene scene : scenes) {
            if (scene.getClass() == sceneClass) {
                return scene;
            }
        }
        return null;
    }
}

