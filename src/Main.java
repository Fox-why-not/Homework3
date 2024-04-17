public class Main {
    public static void main(String[] args) {
    int I = 1111111111;
    byte B = 127;
    short S = 32767;
    long L = 9223372036854775807L;
    float F = 1.1111111f;
    double D = 1.1111111111111111;
    System.out.println("значение переменной " + "I " + "с типом " + "int " + "равно " + I );
    System.out.println("значение переменной " + "B " + "с типом " + "byte " + "равно " + B );
    System.out.println("значение переменной " + "S " + "с типом " + "short " + "равно " + S );
    System.out.println("значение переменной " + "L " + "с типом " + "long " + "равно " + L );
    System.out.println("значение переменной " + "F " + "с типом " + "float " + "равно " + F );
    System.out.println("значение переменной " + "D " + "с типом " + "doudle " + "равно " + D );
    float F2 = 27.12f;
    long L2 = 987678965549L;
    float F3 = 2.786f;
    short S2 = 569;
    short S4 = -159;
    short S5 = 27897;
    byte B2 = 67;
    byte LP = 23;
    byte AS = 27;
    byte EA = 30;
    short TotalP = 480;
    int ForEveryone = TotalP / (LP+AS+EA);
    System.out.println("На каждого ученика рассчитано " + ForEveryone + " листов бумаги");
        byte BottlesInTwoMinutes =16;
        int BottlesPerMinute =BottlesInTwoMinutes / 2;
        byte Hour = 60;
        int Day = Hour * 24;
        int Month = Day * 30;
        int BottlesIn20Minutes = BottlesPerMinute * 20;
        int BottelsPerDay =BottlesPerMinute * Day;
        int BottelsInThreeDays =BottlesPerMinute * (Day * 3);
        int BottelsPerMonth =BottlesPerMinute * Month;
        System.out.println ("за двадцать минут машина произвела " + BottlesIn20Minutes + " штук бутылок");
        System.out.println ("за день машина произвела " + BottelsPerDay + " штук бутылок");
        System.out.println ("за три дня машина произвела " + BottelsInThreeDays + " штук бутылок");
        System.out.println ("за месяц машина произвела " + BottelsPerMonth + " штук бутылок");
        byte WhiteForClass = 2;
        byte BrownForClass = 4;
        int PaintsForClass= BrownForClass + WhiteForClass;
        byte Cans = 120;
        int Classes = Cans / PaintsForClass;
        int TotalW = Classes * WhiteForClass;
        int TotalB = Classes * BrownForClass;
        System.out.println ("В школе, где " + Classes + " классов, нужно " + TotalW + " банок белой краски и " + TotalB + " банок коричневой краски. ") ;
        int SalaryM = 67760;
        byte BananaGr = 80;
        byte Milk100MlGr = 105;
        byte IceCreamGr = 100;
        byte EggGr = 70;
        int TotBanGr = 5 * BananaGr;
        int TotMilkGr = 2 * Milk100MlGr;
        int TotIceCreamGr = 2 * IceCreamGr;
        int TotEggGr = 4 * EggGr;
        int SportsBreakfastGr = TotBanGr + TotMilkGr + TotIceCreamGr + TotEggGr ;
        float SportsBreakfastKg = SportsBreakfastGr / 1000;
        System.out.println ("Вес завтрака составляет " + SportsBreakfastGr + " граммов или " + SportsBreakfastKg + " килограммов. ") ;
        byte WeightKg = 7;
        int WeightGr = WeightKg * 1000;
        short GrFirst = 250;
        short GrSecond = 500;
        int SpeedWeightLoss1 = WeightGr / GrFirst;
        int SpeedWeightLoss2 = WeightGr / GrSecond;
        int AverageSpeed = (SpeedWeightLoss1 + SpeedWeightLoss2 ) / 2;
        System.out.println ( AverageSpeed + " день в среднем потребуется для похудения") ;
        int SalaryD = 83690;
        int SalaryK = 76230;
        double Bonus = 1.1;
        byte Year55 = 12;
        double BonSalMInMonth = SalaryM * Bonus;
        double BonSalDInMonth = SalaryD * Bonus;
        double BonSalKInMonth = SalaryK * Bonus;
        int SalMInYear = SalaryM * Year55;
        int SalDInYear = SalaryD * Year55;
        int SalKInYear = SalaryK * Year55;
        double BonSalMInYear = BonSalMInMonth * Year55;
        double BonSalDInYear = BonSalDInMonth * Year55;
        double BonSalKInYear = BonSalKInMonth * Year55;
        double DifferenceSalM = BonSalMInYear - SalMInYear;
        double DifferenceSalD = BonSalDInYear - SalDInYear;
        double DifferenceSalK = BonSalKInYear - SalKInYear;
        System.out.println (" Маша теперь получает " + BonSalMInMonth + " рублей." +
                " Годовой доход вырос на " + DifferenceSalM + " рублей."
                + " Денис теперь получает " + BonSalDInMonth + " рублей." +
                " Годовой доход вырос на " + DifferenceSalD + " рублей. "
                + " Кристина теперь получает " + BonSalKInMonth + " рублей." +
                " Годовой доход вырос на " + DifferenceSalK + " рублей");
    }
}