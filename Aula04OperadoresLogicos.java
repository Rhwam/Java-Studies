package DevDojo.Iniciando;

import javax.print.attribute.HashDocAttributeSet;

public class Aula04OperadoresLogicos {
    public static void main(String[] args) {
        // && (AND) || (OR)
        int age = 35;
        float salary = 3500F;
        boolean isLegalGreater = age > 30 && salary >= 4612;
        boolean isLegalMinor = age < 30 && salary >= 3381;

//        System.out.println(isLegalGreater);
//        System.out.println(isLegalMinor);
        double currentAccount = 200;
        double totalInvestments = 10000;
        float playstation5 = 4000;
        boolean isPlaystationAffordable = currentAccount >= playstation5 || totalInvestments >= playstation5;

        System.out.println(isPlaystationAffordable);
    }
}