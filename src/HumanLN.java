import java.util.Comparator;

public class HumanLN implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getLastname().compareTo(o2.getLastname());
    }
}
