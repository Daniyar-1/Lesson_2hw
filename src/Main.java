public class Main {

    public static void main(String[] args) {
        int age = 18;

        if (age >= 0 && age < 1) {
            System.out.println("Младенческий возраст");
        } else if (age >= 1 && age < 11) {
            System.out.println("Детский возраст");
        } else if (age >= 11 && age < 17) {
            System.out.println("Подрастковый возраст");
        } else if (age >= 17 && age < 20) {
            System.out.println("Юный возраст");
        } else if (age >= 20 && age < 30) {
            System.out.println("Молодой возраст");
        } else if (age >= 30 && age < 60) {
            System.out.println("Зрелый возраст");
        } else if (age >= 60 && age < 110) {
            System.out.println("Пожилой возраст");
        } else {
            System.out.println("Возраст не определен");
        }

    }
}













