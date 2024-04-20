public class Main {
    public static void main(String[] args) {

    System.out.println("Task 1");

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
System.out.println("значение переменной " + "D " + "с типом " + "double " + "равно " + D );

    System.out.println("Task 2");

float F2 = 27.12f;
long L2 = 987678965549L;
float F3 = 2.786f;
short S2 = 569;
short S4 = -159;
short S5 = 27897;
byte B2 = 67;

    System.out.println("Task 3");

byte LP = 23;
byte AS = 27;
byte EA = 30;
short TotalP = 480;
int ForEveryone = TotalP / (LP+AS+EA);
System.out.println("На каждого ученика рассчитано " + ForEveryone + " листов бумаги");

    System.out.println("Task 4");

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

    System.out.println("Task 5");

byte WhiteForClass = 2;
byte BrownForClass = 4;
int PaintsForClass= BrownForClass + WhiteForClass;
byte Cans = 120;
int Classes = Cans / PaintsForClass;
int TotalW = Classes * WhiteForClass;
int TotalB = Classes * BrownForClass;
System.out.println ("В школе, где " + Classes + " классов, нужно " + TotalW + " банок белой краски и " + TotalB + " банок коричневой краски. ") ;

    System.out.println("Task 6");

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

    System.out.println("Task 7");

short WeightKg = 7;
int WeightGr = WeightKg * 1000;
short GrFirst = 250;
short GrSecond = 500;
int SpeedWeightLoss1 = WeightGr / GrFirst;
int SpeedWeightLoss2 = WeightGr / GrSecond;
int AverageSpeed = (SpeedWeightLoss1 + SpeedWeightLoss2 ) / 2;
System.out.println ( AverageSpeed + " день в среднем потребуется для похудения") ;

    System.out.println("Task 8");

int SalaryM = 67760;
int SalaryD = 83690;
int SalaryK = 76230;
double Bonus = 1.1;
int onYear = 12;
double finalMMonth = SalaryM * Bonus;
double finalDMonth = SalaryD * Bonus;
double finalKMonth = SalaryK * Bonus;

int SalMYear = SalaryM * onYear;
int SalDYear = SalaryD * onYear;
int SalKYear = SalaryK * onYear;

double finalMYear = finalMMonth * onYear;
double finalDYear = finalDMonth * onYear;
double finalKYear = finalKMonth * onYear;

double FinalSalM = finalMYear - SalMYear;
double FinalSalD = finalDYear - SalDYear;
double FinalSalK = finalKYear - SalKYear;

System.out.println (" Маша теперь получает " + finalMMonth + " рублей." +
                " Годовой доход вырос на " + FinalSalM + " рублей."
                + " Денис теперь получает " + finalDMonth + " рублей." +
                " Годовой доход вырос на " + FinalSalD + " рублей. "
                + " Кристина теперь получает " + finalKMonth + " рублей." +
                " Годовой доход вырос на " + FinalSalK + " рублей");
    }
}