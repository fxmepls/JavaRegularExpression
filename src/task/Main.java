package task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu = 1;
        do {
            System.out.println("1. IPv4\n" +
                    "2. GUID\n" +
                    "3. URL\n" +
                    "4. Password\n" +
                    "0. Выход"
            );
            System.out.println("Выберите: ");
            Scanner scanner = new Scanner(System.in);
            menu = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите строку: ");
            String str = scanner.nextLine();
            switch (menu) {
                case 1: {
                    boolean isPattern = RegularRegex.IPv4(str);
                    if (isPattern) System.out.println("IPv4 введен корректно");
                    else System.out.println("IPv4 введен не корректно");
                }
                break;
                case 2: {
                    boolean isPattern = RegularRegex.GUID(str);
                    if (isPattern) System.out.println("GUID-строка введена корректно");
                    else System.out.println("GUID-строка введена не корректно");
                }
                break;
                case 3: {
                    boolean isPattern = RegularRegex.URL(str);
                    if (isPattern) System.out.println("URL введен корректно");
                    else System.out.println("URL введен не корректно");
                }
                break;
                case 4: {
                    boolean isPattern = RegularRegex.Password(str);
                    if (isPattern) System.out.println("Пароль введен корректно");
                    else System.out.println("Пароль введен не корректно");
                }
                break;
            }
        }while(menu != 0);
    }
}