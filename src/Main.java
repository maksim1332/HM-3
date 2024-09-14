public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//                                         tesk 1
        int a = 150;
        byte b = 4;
        short c = 100;
        long d = 2000L;
        float f = 12.5f;
        double g = 4.1234567890;
        System.out.println("Значение переменной "+"int "+"с типом "+"Целочисленные "+"равно "+a);
        System.out.println("Значение переменной "+"byte "+"с типом "+"Целочисленные "+"равно "+b);
        System.out.println("Значение переменной "+"short "+"с типом "+"Целочисленные "+"равно "+c);
        System.out.println("Значение переменной "+"long "+"с типом "+"Целочисленные "+"равно "+d);
        System.out.println("Значение переменной "+"float "+"с типом "+"С плавающей точкой "+"равно "+f);
        System.out.println("Значение переменной "+"double "+"с типом "+"С плавающей точкой "+"равно " +g);
        //                                  tesk 2
        float aa = 27.12f;
        long ab = 987678965549L;
        float ac =2.786f;
        int ad = 569;
        short aaa = -159;
        short aab = 27897;
        byte aac = 67;
        //                                  tesk 3
        byte lpClass = 23;
        byte asClass = 27;
        byte eaClass = 30;
        int totalStudents = lpClass + asClass + eaClass;
        int paperPurchased = 480;
        int separation = paperPurchased / totalStudents;
        System.out.println("На каждого ученика рассчитано " + separation + " листов бумаги");
//                                         tesk 4
        byte efficiency = 16;
        byte time = 2;
        byte aTime= 20;
        byte hour1Day = 24;
        byte hour = 60;
        int efficiencyTime20 = aTime / time * efficiency;
        int efficiencyDay1Hour = hour1Day * hour / time * efficiency;
        int efficiencyDay3Hour = hour1Day * 3 * hour / time * efficiency;
        int efficiencyDay30Hour = hour1Day * 30 * hour / time * efficiency;
        System.out.println("За" + " 20 минут" + " машина произвела " + efficiencyTime20 + " штук бутылок");
        System.out.println("За " + "1 день" + " машина произвела " + efficiencyDay1Hour + " штук бутылок");
        System.out.println("За " + "3 дня" + " машина произвела " + efficiencyDay3Hour + " штук бутылок");
        System.out.println("За " + "1 Месяц" + " машина произвела " + efficiencyDay30Hour + " штук бутылок");
//                                             tesk 5
        byte cansOfPaint = 120;
        byte ofrOneClass = 6;
        int totalClasses = cansOfPaint / ofrOneClass;
        byte whitePaintOfrOneClass = 2;
        byte brownPaintOfrOneClass = 4;
        int whitePaintTotalClasses = totalClasses * whitePaintOfrOneClass;
        int brownPaintTotalClasses = totalClasses * brownPaintOfrOneClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaintTotalClasses + " банок белой краски и " + brownPaintTotalClasses + " банок коричневой краски");
//                                           tesk 6
        short bananas5Grams = 5 * 80;
        byte milk100Grams = 105;
        int milk200MlGpams = milk100Grams * 2;
        short sieCreamSundae2Briquette = 100 * 2;
        short eggs4 = 4 * 70;
        int sharedBreakfast = bananas5Grams + milk200MlGpams + sieCreamSundae2Briquette + eggs4;
        int kilograms = sharedBreakfast / 1000;
        System.out.println(sharedBreakfast + "гр");
        System.out.println(kilograms + ",90кг");
        //                                    tesk 7
        short kg7 = 7 * 1000;
        short hteAverageDiet = 250;
        short heavyDiet = 500;
        int averageDay = kg7 / hteAverageDiet;
        int heavyDay = kg7 / heavyDiet;
        System.out.println(averageDay + " Дней потребуется для похудения!");
        System.out.println(heavyDay + " Дней потребуется для похудения!");
        //                                    tesk 8
        int zpM = 67760;
        int zpD = 83690;
        int zpK = 76230;
        int zpMadd = zpM / 100 * 10;
        int zpDadd = zpD / 100 * 10;
        int zpKadd = zpK / 100 * 10;
        int zpM1 = zpM + zpMadd;
        int zpD1 = zpD + zpDadd;
        int zpK1 = zpK + zpKadd;
        int zpM12 = zpM * 12;
        int zpD12 = zpD * 12;
        int zpK12 = zpD * 12;
        int zpM12add = zpM1 * 12;
        int zpD12add = zpD1 * 12;
        int zpK12add = zpK1 * 12;
        int zpM12add1 = zpM12add - zpM12;
        int zpD12add1 = zpD12add - zpD12;
        int zpK12add1 = zpK12add - zpK12;
        System.out.println("Маша теперь получает " + zpM1 + " рублей. Годовой доход вырос на " + zpM12add1 + " рублей");
        System.out.println("Кристина теперь получает " + zpK1 + " рублей. Годовой доход вырос на " + zpK12add1 + " рублей");
        System.out.println("Динис теперь получает " + zpD1 + " рублей. Годовой доход вырос на " + zpD12add1 + " рублей");
    }
}

