package currencyCalculator;

public class Driver {

    public static void main(String[] args) {

        double userCad = 0.0;
        double userUsd = 0.0;
        int userChoice = 0;
        boolean looper = true;
        int currencyChoice = 0;

        User user = new User();
        Money money = new Money();

        while (looper) {

            System.out.println("What currency would you like to convert from?");
            System.out.println("1. CAD");
            System.out.println("2. USD");
            System.out.println("3. Pounds");
            System.out.println("4. Francs");
            System.out.println("5. Euros");
            System.out.println("6. Yen");
            System.out.println("7. Zimbabwean Dollar");
            System.out.println("0. Exit");

            currencyChoice = user.inputInt("Enter a choice", 0, 7);
            if (currencyChoice == 0) {
                System.out.println("Exiting program.");
                break;
            }

            switch (currencyChoice) {
                case 1:
                    System.out.println("1. CAD to USD");
                    System.out.println("2. CAD to Pound");
                    System.out.println("3. CAD to Franc");
                    System.out.println("4. CAD to Euro");
                    System.out.println("5. CAD to Yen");
                    System.out.println("6. CAD to Zimbabwean Dollar");

                    userChoice = user.inputInt("Enter a number from the list", 1, 6);
                    userCad = user.inputDouble("Enter an amount of money in CAD", 0, 999999999);
                    switch (userChoice) {
                        case 1:
                            System.out.println("That amount in USD is " + money.findMonneyAmmount(userCad, 0.73) + "$");
                            break;
                        case 2:
                            System.out.println("That amount in Pounds is " + money.findMonneyAmmount(userCad, 0.54) + "$");
                            break;
                        case 3:
                            System.out.println("That amount in Francs is " + money.findMonneyAmmount(userCad, 0.58) + "$");
                            break;
                        case 4:
                            System.out.println("That amount in Euros is " + money.findMonneyAmmount(userCad, 0.63) + "$");
                            break;
                        case 5:
                            System.out.println("That amount in Yen is " + money.findMonneyAmmount(userCad, 108.17) + "$");
                            break;
                        case 6:
                        	System.out.println("that amount in Zimbabwean Dollar is " + money.findMonneyAmmount(userCad, 233) + "$");
                    }
                    break;

                case 2:
                    System.out.println("1. USD to CAD");
                    System.out.println("2. USD to Pound");
                    System.out.println("3. USD to Franc");
                    System.out.println("4. USD to Euro");
                    System.out.println("5. USD to Yen");
                    System.out.println("6. USD to Zimbabwean Dollar");

                    userChoice = user.inputInt("Enter the number that corresponds to the currency you would like to convert to", 1, 6);
                    userUsd = user.inputDouble("Enter an amount of money in USD", 0, 999999999);
                    switch (userChoice) {
                        case 1:
                            System.out.println("That amount in CAD is " + money.findMonneyAmmount(userUsd, 1.37) + "$");
                            break;
                        case 2:
                            System.out.println("That amount in Pounds is " + money.findMonneyAmmount(userUsd, 0.74) + "$");
                            break;
                        case 3:
                            System.out.println("That amount in Francs is " + money.findMonneyAmmount(userUsd, 0.80) + "$");
                            break;
                        case 4:
                            System.out.println("That amount in Euros is " + money.findMonneyAmmount(userUsd, 0.85) + "$");
                            break;
                        case 5:
                            System.out.println("That amount in Yen is " + money.findMonneyAmmount(userUsd, 148.5) + "$");
                        case 6:
                        	System.out.println("That amount in CAD is " + money.findMonneyAmmount(userUsd, 322) + "$");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("1. Pound to CAD");
                    System.out.println("2. Pound to USD");
                    System.out.println("3. Pound to Franc");
                    System.out.println("4. Pound to Euro");
                    System.out.println("5. Pound to Yen");
                    System.out.println("6. Pound to Zimbabwean Dollar");

                    userChoice = user.inputInt("Enter the number that corresponds to the currency you would like to convert to", 1, 6);
                    double userPound = user.inputDouble("Enter an amount of money in Pounds", 0, 999999999);
                    switch (userChoice) {
                        case 1:
                            System.out.println("That amount in CAD is " + money.findMonneyAmmount(userPound, 1.86) + "$");
                            break;
                        case 2:
                            System.out.println("That amount in USD is " + money.findMonneyAmmount(userPound, 1.35) + "$");
                            break;
                        case 3:
                            System.out.println("That amount in Francs is " + money.findMonneyAmmount(userPound, 1.09) + "$");
                            break;
                        case 4:
                            System.out.println("That amount in Euros is " + money.findMonneyAmmount(userPound, 1.15) + "$");
                            break;
                        case 5:
                            System.out.println("That amount in Yen is " + money.findMonneyAmmount(userPound, 200.5) + "$");
                        case 6:
                        	System.out.println("that amount in Zimbabwean Dollar is " + money.findMonneyAmmount(userPound, 449) + "$");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("1. Franc to CAD");
                    System.out.println("2. Franc to USD");
                    System.out.println("3. Franc to Pound");
                    System.out.println("4. Franc to Euro");
                    System.out.println("5. Franc to Yen");
                    System.out.println("6. Franc to Zimbabwean Dollar");

                    userChoice = user.inputInt("Enter the number that corresponds to the currency you would like to convert to", 1, 6);
                    double userFranc = user.inputDouble("Enter an amount of money in Francs", 0, 999999999);
                    switch (userChoice) {
                        case 1:
                            System.out.println("That amount in CAD is " + money.findMonneyAmmount(userFranc, 1.72) + "$");
                            break;
                        case 2:
                            System.out.println("That amount in USD is " + money.findMonneyAmmount(userFranc, 1.25) + "$");
                            break;
                        case 3:
                            System.out.println("That amount in Pounds is " + money.findMonneyAmmount(userFranc, 0.92) + "$");
                            break;
                        case 4:
                            System.out.println("That amount in Euros is " + money.findMonneyAmmount(userFranc, 1.05) + "$");
                            break;
                        case 5:
                            System.out.println("That amount in Yen is " + money.findMonneyAmmount(userFranc, 186.3) + "$");
                            break;
                        case 6: 
                        	System.out.println("that amount in Zimbabwean Dollar is " + money.findMonneyAmmount(userFranc, 345) + "$");
                    }
                    break;

                case 5:
                    System.out.println("1. Euro to CAD");
                    System.out.println("2. Euro to USD");
                    System.out.println("3. Euro to Pound");
                    System.out.println("4. Euro to Franc");
                    System.out.println("5. Euro to Yen");
                    System.out.println("6. Euro to Zimbabwean Dollar");

                    userChoice = user.inputInt("Enter the number that corresponds to the currency you would like to convert to", 1, 6);
                    double userEuro = user.inputDouble("Enter an amount of money in Euro", 0, 999999999);
                    switch (userChoice) {
                        case 1:
                            System.out.println("That amount in CAD is " + money.findMonneyAmmount(userEuro, 1.59) + "$");
                            break;
                        case 2:
                            System.out.println("That amount in USD is " + money.findMonneyAmmount(userEuro, 1.18) + "$");
                            break;
                        case 3:
                            System.out.println("That amount in Pounds is " + money.findMonneyAmmount(userEuro, 0.87) + "$");
                            break;
                        case 4:
                            System.out.println("That amount in Francs is " + money.findMonneyAmmount(userEuro, 0.95) + "$");
                            break;
                        case 5:
                            System.out.println("That amount in Yen is " + money.findMonneyAmmount(userEuro, 173.9) + "$");
                            break;
                        case 6:
                        	System.out.println("that ammount in Zimbabwean Dollar is " + money.findMonneyAmmount(userEuro, 398.41) + "$");
                    }
                    break;

                case 6:
                    System.out.println("1. Yen to CAD");
                    System.out.println("2. Yen to USD");
                    System.out.println("3. Yen to Pound");
                    System.out.println("4. Yen to Franc");
                    System.out.println("5. Yen to Euro");
                    System.out.println("6. Yen to Zimbabwean Dollar");

                    userChoice = user.inputInt("Enter the number that corresponds to the currency you would like to convert to", 1, 6);
                    double userYen = user.inputDouble("Enter an amount of money in Yen", 0, 999999999);
                    switch (userChoice) {
                        case 1:
                            System.out.println("That amount in CAD is " + money.findMonneyAmmount(userYen, 0.0126) + "$");
                            break;
                        case 2:
                            System.out.println("That amount in USD is " + money.findMonneyAmmount(userYen, 0.0067) + "$");
                            break;
                        case 3:
                            System.out.println("That amount in Pounds is " + money.findMonneyAmmount(userYen, 0.0050) + "$");
                            break;
                        case 4:
                            System.out.println("That amount in Francs is " + money.findMonneyAmmount(userYen, 0.0054) + "$");
                            break;
                        case 5:
                            System.out.println("That amount in Euros is " + money.findMonneyAmmount(userYen, 0.0057) + "$");
                            break;
                        case 6:
                        	System.out.println("that amount in Zimbabwean Dollar is " + money.findMonneyAmmount(userYen, 453) + "$");
                    }
                    break;
                 
                case 7:
                	System.out.println("1. Zimbabwean Dollar to CAD");
                    System.out.println("2. Zimbabwean Dollar to USD");
                    System.out.println("3. Zimbabwean Dollar Pound");
                    System.out.println("4. Zimbabwean Dollar to Franc");
                    System.out.println("5. Zimbabwean Dollar to Euro");
                    
                    userChoice = user.inputInt("Enter the number that corresponds to the currency you would like to convert to", 1, 6);
                    double userZimbabweanDollar = user.inputDouble("Enter an amount of money in Yen", 0, 999999999);
                    switch (userChoice) {
                        case 1:
                            System.out.println("That amount in CAD is " + money.findMonneyAmmount(userZimbabweanDollar, 0.00426) + "$");
                            break;
                        case 2:
                            System.out.println("That amount in USD is " + money.findMonneyAmmount(userZimbabweanDollar, 0.00311) + "$");
                            break;
                        case 3:
                            System.out.println("That amount in Pounds is " + money.findMonneyAmmount(userZimbabweanDollar, 0.00223) + "$");
                            break;
                        case 4:
                            System.out.println("That amount in Francs is " + money.findMonneyAmmount(userZimbabweanDollar, 0.00290) + "$");
                            break;
                        case 5:
                            System.out.println("That amount in Euros is " + money.findMonneyAmmount(userZimbabweanDollar, 0.00251) + "$");
                            break;
                        case 6:
                        	System.out.println("that ammount in Yen is " + money.findMonneyAmmount(userZimbabweanDollar, 0.0022) + "$");
                    }
                    break;
            }
        }
    }
}