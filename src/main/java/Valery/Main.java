package Valery;


import Valery.constans.SceneNames;
import Valery.scenes.SceneBeginning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Character character = new Character();

        SceneManager sceneManager = new SceneManager(character);

        SceneFactory sceneFactory = new SceneFactory(scanner, sceneManager);

        sceneManager.enterScene(SceneNames.BEGINNING);
    }
}
