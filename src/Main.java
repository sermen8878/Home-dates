public class Main {
    public static void main(String[] args) {
        // Исходные данные
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        // Задача 1: Формирование Ф.И.О.
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("1. Ф. И. О. сотрудника — " + fullName);

        // Задача 2: Преобразование в верхний регистр
        String reportFullName = fullName.toUpperCase();
        System.out.println("2. Данные Ф. И. О. сотрудника для заполнения отчета — " + reportFullName);

        // Задача 3: Замена буквы "ё"
        String russianName = "Иванов Семён Семёнович";
        String correctedName = russianName.replace('ё', 'е');
        System.out.println("3. Данные Ф. И. О. сотрудника — " + correctedName);
    }
}