public class Main {
    public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
    }
    public static void task1() {
        System.out.println ("            Задача 1");
        int clientOS = 1;
        if (clientOS ==0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
           else  if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
               else {
            System.out.println("Для вашей операционной системы нет приложения");
        }
    }// task1
    public static void task2() {
        System.out.println ("            Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS ==0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
            else {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
        }
        else  if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        else {
            System.out.println("Для вашей операционной системы нет приложения");
        }
    }// task2

    public static void task3() {
        System.out.println("            Задача 3");
        int year = 2100;
        int every4Year = year % 4;
        int every400Year = year % 400;
        int every100Year = year % 100;

        if (every400Year == 0) {
             System.out.println("Год является високосным");
        }
        else if (every100Year ==0){
            System.out.println("Год не является високосным");
        }
        else if (every4Year ==0){
            System.out.println("Год является високосным");
        }
        else{
            System.out.println("Год не является високосным");
        }

    } //task3
    public static void task4() {
        System.out.println("            Задача 4");
         int distance = 10;
         int days = 0;
         if (distance< 20) {
             days = days +1;
             System.out.println("Потребуется дней: "+days);
         }

         else if (distance>=20 && distance <60){
              days = days +2;
             System.out.println("Потребуется дней: "+days);
         }

         else if (distance >=60 && distance < 100) {
             days = days +3;
                         System.out.println("Потребуется дней: "+days);
         }
         else {
             System.out.println("Доставки нет");
         }
    }//task4
}// класс Main


