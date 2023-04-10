import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FamilyTree test = new FamilyTree();
        Services service = new Services(test);

        service.addHuman("Максим", "Бикир", LocalDate.of(1999, 12, 29), Sex.male);
        service.addHuman("Артур", "Бучацкий", LocalDate.of(1970, 04, 25), Sex.female);
        service.addHuman("Артем", "Сумин", LocalDate.of(1968, 03, 8), Sex.male);
        service.addHuman("Полина", "Смусина", LocalDate.of(1990, 03, 24), Sex.female);
        service.addHuman("Витя", "Альварес", LocalDate.of(1958, 02, 15),
                Sex.female, service.getFamilyGroup().familyTree.get(2),service.getFamilyGroup().familyTree.get(3));

        service.sortByLastName();
        for (Human item: test) {
            System.out.println(item);

        }
    }
}