public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");

        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + total/100;
            total = total + salary;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i1 = 1;
        while (i1 <= 10){
            System.out.print(i1++ + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");

        int populationCountry = 12_000_000;
        int birthrate = 17;
        int mortality = 8;
        for ( int year = 1; year <= 10; year++ ) {
           populationCountry = populationCountry + (populationCountry/1000)*(birthrate-mortality);
           System.out.println("Год " + year + ", численность населения составляет " + populationCountry);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int total = 15000;
        int month = 0;
        while (total < 12_000_000) {
            month = month + 1;
            total = total + (total*7/100);
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        int total = 15000;
        int month = 0;
        while (total < 12_000_000) {
            month = month + 1;
            total = total + (total*7/100);
            if ( month % 6 == 0 ) {
                    System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");

        int total = 15000;
        for ( int i = 0; i <= 12*9; i++ ) {
            total = total + (total*7/100);
            if ( i % 1 == 6 ) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");

        int freeday = 5;
        for ( int i = 1; i <= 31; i++ ) {
            if ( (i - freeday) % 7 == 0 ) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        int yearComets = 2022;
        for ( int i = 0; i <= 3000; i += 79 ) {
            if ( i >= yearComets - 200 && i <= yearComets + 100 ) {
                System.out.println( i );
            }
        }
    }
}
