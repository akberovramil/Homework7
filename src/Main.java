public class Main {
    public static void main(String[] args) {
        //Задание 1
        int pay = 15_000;
        int total = 0;
        int months = 0;
        while (total <= 2_459_000) {
            total = total + pay;
            months++;
            System.out.println(" Месяц " + months + " сумма накоплений равна " + total);
        }
        System.out.println(months);
        //Задание 2
        int numbers = 1;
        while (numbers > 0 && numbers <= 10) {
            System.out.print(numbers);
            numbers++;
        }
        System.out.print("\n");
        for (numbers = 10; numbers >= 1; numbers--) {
            System.out.print(numbers);
        }
        System.out.print("\n");

        //Задание 3
        int population = 12_000_000;
        for (int y = 1; y <= 10; y++) {
            int fertilityYear = (population / 1000) * 17;
            int mortalityYear = (population / 1000) * 8;
            population = population + fertilityYear - mortalityYear;
            System.out.println("Год " + y + " численность населения составляет " + population);
        }
        //Задание 4
        double deposit = 15_000;
        int monthsForMoney = 1;
        while (deposit < 12_000_000) {
            deposit = deposit + (deposit * 7 / 100);
            System.out.printf("Месяц %d, сумма накоплений равна %.2f\n", monthsForMoney, deposit);
            if (deposit >= 12_000_000) {
                System.out.println("Василию нужно копить деньги " + monthsForMoney + " месяцев, чтобы накопить 12 миллионов рублей");
            }
            monthsForMoney++;

        }
        //Задание 4
        double depositNew = 15_000;
        for (int monthsNew = 1; depositNew < 12_000_000; monthsNew++) {
            depositNew = depositNew + (depositNew * 7 / 100);
            if (monthsNew % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f\n", monthsNew, depositNew);
            }
            if (depositNew >= 12_000_000) {
                System.out.println("Василию нужно копить деньги " + monthsNew + " месяцев, чтобы накопить 12 миллионов рублей");
            }
        }
        //Задание 5
        double deposit1 = 15_000;
        for (int newMonths = 1; newMonths <= 12 * 9; newMonths++) {
            deposit1 = deposit1 + (deposit1 * 7 / 100);
            if (newMonths % 6 == 0) {
                System.out.printf("Сумма накоплений Василия за %d месяцев составила %.2f рублей\n", newMonths, deposit1);
            }
        }
        System.out.printf("За 9 лет Василий накопит %.2f рублей\n", deposit1);
        //Задание 6
        int day = 1;
        while (day <= 31) {
            if (day <= 7) {
                System.out.println("Сегодня пятница, " + day + " число. Необходимо подготовить отчет");
            } else if (day > 7) {
                System.out.println("Сегодня пятница, " + day + " число. Необходимо подготовить отчет");
            }
            day = day + 7;

        }
        //Задание 7
        int currentYear = 2022;
        int period = 79;
        int since = currentYear - 200;
        int before = currentYear + 100;
        for (int year = 0; year <= before; year = year + period) {
            if (year >= since) {
                System.out.println(year);
            }
        }
        //Задание 8
        int factor = 2;
        int result = 0;
        for (int number = 1; number <= 10; number += 1) {
            result = factor * number;
            System.out.println(factor + "*" + number + "=" + result);
        }
    }
}







