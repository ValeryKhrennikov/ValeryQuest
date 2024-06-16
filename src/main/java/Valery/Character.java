package Valery;

import java.util.Scanner;

public class Character {
   private String Name;
   private int age;
   private String skill;
   private String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCharacterName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public static int getAge(Scanner scanner) {
        int age;
        while (true) {

            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера после считывания числа
                if (age > 0 && age <= 100) {
                    break; // Выход из цикла, если возраст корректный
                } else {
                    System.out.println("Ошибка: Возраст должен быть положительным числом от 1 до 100.");
                }
            } else {
                System.out.println("Ошибка: Введите корректный возраст (число).");
                scanner.next(); // Очистка буфера
            }
        }
        return age;
    }
    public static void getCommentAboutAge(int characterAge) {
        if (characterAge <= 10) {
            System.out.println("Малолетка!\n");
        } else if (characterAge <= 40) {
            System.out.println("Норм возраст, одобряю!\n");
        } else if (characterAge <= 50) {
            System.out.println("Стареешь\n");
        } else {
            System.out.println("А не поздно? Хотя, тебе виднее...\n");
        }
    }
}
