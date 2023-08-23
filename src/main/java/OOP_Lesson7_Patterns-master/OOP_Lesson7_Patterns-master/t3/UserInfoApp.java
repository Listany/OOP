import java.text.ParseException;
import java.lang.NumberFormatException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class UserInfoApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные (в формате: фамилия имя отчество дата_рождения номер_телефона пол):");

        String input = scanner.nextLine();



        try {

            String[] data = input.split(" ");

            if (data.length != 5) {

                throw new IllegalArgumentException("Количество данных не соответствует требуемому");

            }



            String lastName = data[0];

            String firstName = data[1];

            String middleName = data[2];

            Date dateOfBirth = parseDate(data[3]);

            int phoneNumber = Integer.parseInt(data[4]);

            char gender = data[5].charAt(0);



            // Вывод обработанных данных

            System.out.println("Фамилия: " + lastName);

            System.out.println("Имя: " + firstName);

            System.out.println("Отчество: " + middleName);

            System.out.println("Дата рождения: " + formatDate(dateOfBirth));

            System.out.println("Номер телефона: " + phoneNumber);

            System.out.println("Пол: " + gender);


        } catch (NumberFormatException e) {

            System.out.println("Ошибка: Неверный формат номера телефона");

        } catch (IllegalArgumentException e) {

            System.out.println("Ошибка: " + e.getMessage());

        } catch (ParseException e) {

            System.out.println("Ошибка: Неверный формат даты");



        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Ошибка: Недостаточно данных");

        }

    }



    private static Date parseDate(String dateStr) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        return format.parse(dateStr);

    }



    private static String formatDate(Date date) {

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        return format.format(date);

    }

}
