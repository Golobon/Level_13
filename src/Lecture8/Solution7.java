package Lecture8;

public class Solution7 {
    public static void main(String[] args) {
        Human grandPha1 = new Human("Ян1", true, 80);
        Human grandMa1 = new Human("Аня1", false, 80);
        Human grandPha2 = new Human("Ян2", true, 80);
        Human grandMa2 = new Human("Аня2", false, 80);
        Human father = new Human("Ян3", true, 60, grandPha1, grandMa1);
        Human mother = new Human("Аня3", false, 60, grandPha2, grandMa2);
        Human brother = new Human("Ян4", true, 30, father, mother);
        Human sister = new Human("Аня4", false, 30, father, mother);
        Human cat = new Human("Ян5", true, 30, father, mother);

        System.out.println(grandPha1);
        System.out.println(grandMa1);
        System.out.println(grandPha2);
        System.out.println(grandMa2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(brother);
        System.out.println(sister);
        System.out.println(cat);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human() {
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
