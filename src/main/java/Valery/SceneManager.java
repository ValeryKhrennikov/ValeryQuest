package Valery;

import Valery.constans.SceneNames;

import java.util.HashMap;

public class SceneManager {
    HashMap<SceneNames, AbstractScene> scenes = new HashMap<>();
    Character character;

    public SceneManager(Character character) {
        this.character = character;
    }

    public void registerScene(AbstractScene scene) {
        scenes.put(scene.sceneName, scene);
    }

    public void enterScene(SceneNames sceneName) throws Exception {
        if (!scenes.containsKey(sceneName)) {
            throw new Exception("scene not found");
        }
        AbstractScene nextScene = scenes.get(sceneName);
        nextScene.enter();
    }

    public Character getCharacter() {
        return character;
    }


}
