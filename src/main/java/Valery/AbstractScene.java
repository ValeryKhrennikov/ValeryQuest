package Valery;

import Valery.constans.SceneNames;

import java.util.Scanner;

public abstract class AbstractScene {
   final SceneNames sceneName;
   final String sceneDescription;
   final SceneManager sceneManager;
   final Scanner getScanner;

    protected AbstractScene(SceneNames sceneName, String sceneDescription, Scanner scanner, SceneManager sceneManager) {
        this.sceneName = sceneName;
        this.sceneDescription = sceneDescription;
        this.sceneManager = sceneManager;
        this.sceneManager.registerScene(this);
        this.getScanner = scanner;
    }

    public SceneManager getSceneManager() {
        return sceneManager;
    }
    public Scanner getScanner() {
        return getScanner;
    }

    public SceneNames getSceneName() {
        return sceneName;
    }

    public String getSceneDescription() {
        return sceneDescription;
    }



    public abstract void enter() throws Exception;
}
