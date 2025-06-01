package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String EAmount = "Earned amount:\n";
        int bgum = 202, tof = 118, ic  = 2250, milkchoco = 1680, doug = 1075, panpan = 80;
        int income = bgum + tof + ic + milkchoco + doug + panpan;
        String nl = "\n";
        System.out.print(EAmount + "Bubblegum: $" + bgum + nl + "Toffee: $" + tof + nl + "Ice cream: $" + ic + nl
        + "Milk Chocolate: $" + milkchoco + nl + "Doughnut" + doug + nl + "Pancake: $" + panpan + nl + nl + "Income: $" +
                income);
        System.out.printf("%sStaff expenses: %s",nl,nl);
        int staffExpenses = sc.nextInt();
        System.out.printf("%sOther expenses: %s",nl,nl);
        int otherExpenses = sc.nextInt();
        int netIncome = income - staffExpenses - otherExpenses;
        System.out.printf("Net income: $%d",netIncome);
        sc.close();
    }
}