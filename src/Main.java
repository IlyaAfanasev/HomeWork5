public class Main {
    public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
       task5();
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
        int clientOS = 3;
        int clientDeviceYear = 2012;
        if (clientOS ==0 && clientDeviceYear >= 2015) {
                            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        else if (clientOS ==0) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
        else  if (clientOS == 1 && clientDeviceYear >= 2015) {
                            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOS == 1)  {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Для вашей операционной системы нет приложения");
        }
    }// task2

    public static void task3() {
        System.out.println("            Задача 3.1");
        int year = 2003;
        int every4Year = year % 4;
        int every400Year = year % 400;
        int every100Year = year % 100;

        if (every400Year == 0) {
             System.out.println(year +" Год является високосным");
        }
        else if (every100Year ==0){
            System.out.println(year +" Год не является високосным");
        }
        else if (every4Year ==0){
            System.out.println(year +" Год является високосным");
        }
        else{
            System.out.println(year +" Год не является високосным");
        }
        System.out.println("            Задача 3.2");
        if (every4Year ==0 && every100Year !=0 || every400Year ==0) {
            System.out.println(year +" Год является високосным");
        }
        else{
            System.out.println(year +" Год не является високосным");
        }
    } //task3
    public static void task4() {
        System.out.println("            Задача 4.1");
         int distance = 780;
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
        System.out.println("            Задача 4.2");
         int days1 = 1;
         if (distance >= 20) {
             days1 ++;
         }
        if (distance >= 60) {
            days1 ++;
        }
        if (distance <100) {
            System.out.println("Потребуется дней: "+days1);
        }
        else {
            System.out.println("Доставки нет");
        }
    }//task4
    public static void task5() {
        System.out.println("            Задача 5");
        int monthNumber = 11;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц принадлежит к сезону зимы");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц принадлежит к сезону весны");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц принадлежит к сезону лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит к сезону осени");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}// класс Main


