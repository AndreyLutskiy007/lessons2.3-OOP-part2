public class Main {
    public static void main(String[] args) {




        Customer[] customers = {
                new Customer("Sarah", 23, 234, 345345345),
                new Customer("Djon", 22, 255, 345345),
                new Customer("Luda", 27, 259, 345345345),
                new Customer("Anton", 45, 245, 345345345),
        };
        Gamers [] gamers = {
                new Gamers("Goga", 12, 23124,"PS"),
                new Gamers("Maks", 18, 2343, "PС")
        };

        PrintService printServiceForInvestor = new PrintServiceForInvestor();
        PrintService printServiceEmployee = new PrintServiceEmployee();


        Person[] people = new Person[customers.length + gamers.length];
        for (int i = 0; i < customers.length; i++) {
            people[i] = customers[i];
        }
        for (int i = 0; i < gamers.length; i++) {
            people[i + customers.length] = gamers[i];
        }

        printReport(printServiceForInvestor, customers, gamers, people);
        printReport(printServiceEmployee, customers, gamers, people);

    }

    private static void printReport(PrintService printService, Customer[] customers, Gamers[] gamers, Person[] people) {
        printService.print(customers);
        printService.print(gamers);
        printService.print(people);
    }

}