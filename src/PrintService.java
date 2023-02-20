public interface PrintService {
    default void print(Person[] people) {
        System.out.println("Не положено смотреть такие отчеты");
    }

    void print(Customer[] customers);

    void print(Gamers[] gamers);
}
