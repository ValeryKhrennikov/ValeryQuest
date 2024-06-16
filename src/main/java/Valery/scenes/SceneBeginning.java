package Valery.scenes;

import Valery.AbstractScene;
import Valery.Character;
import Valery.SceneManager;
import Valery.constans.SceneNames;

import java.util.Scanner;

public class SceneBeginning extends AbstractScene {


    public SceneBeginning(Scanner mainScanner, SceneManager sceneManager) {
        super(SceneNames.BEGINNING, "Добро пожаловать в Valery Quest!\n",mainScanner,sceneManager);
    }

    @Override
    public void enter() throws Exception {
        Character character = getSceneManager().getCharacter();

        print(this.getSceneDescription()+
                "\nПожалуйста, введите ваше имя: ");

        character.setName(getScanner().nextLine());

        print("Введите ваш возраст: ");
        character.setAge(Character.getAge(getScanner()));
        Character.getCommentAboutAge(character.getAge());

        print("Как у вас уровень навыка: ");
        character.setAnswer(getScanner().nextLine());
        print(character.getAnswer() + " - это херня!!!");
        print("Пока ты не устроишься на работу,\n" +
                "Ты - нуб");
        character.setSkill("Нуб");
        print("Твое последнее слово перед началом?");
        getScanner().nextLine();
        print("Ага, я внимательно слушал... Ладно...");
        getSceneManager().enterScene(SceneNames.SCENE_ONE);
    }

}
