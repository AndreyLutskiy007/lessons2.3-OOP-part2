public class PrintServiceEmployee implements PrintService {
    @Override
    public void print(Person[] people) {
        System.out.println("Размер списка для сотрудников " + people.length);
        System.out.print("Имя ");
        printPeople(people);

        System.out.println();
    }

    @Override
    public void print(Customer[] customers) {
        System.out.println("Списк покупателей крупы для сотрудников " + customers.length);
        System.out.println("Покупаль");
        printPeople(customers);
        System.out.println();
    }

    @Override
    public void print(Gamers[] gamers) {
        System.out.println("Список геймеров для сотрудников " + gamers.length);
        System.out.println("Игрок");
        printPeople(gamers);
        System.out.println();
    }

    private void printPeople(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println(person.getName()
                    + "; Возраст "
                    + person.getAge()
                    + "; Телефон " + person.getPhone());
        }

    }



}
