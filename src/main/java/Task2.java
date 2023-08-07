import lombok.*;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//@SuppressWarnings("all")
public class Task2 {
    public static void main(String[] args) {
        Tariff tariff1 = new Tariff(100, "Тариф для бедных");
        Tariff tariff2 = new Tariff(200, "Taриф для средних");
        Tariff tariff3 = new Tariff(300, "Тариф для богатых");
        Tariff tariff4 = new Tariff(100, "Акционный");

        Set<Tariff> tariffs = new TreeSet<>();
        tariffs.add(tariff1);
        tariffs.add(tariff2);
        tariffs.add(tariff3);
        tariffs.add(tariff4);

        System.out.println(tariffs.contains(new Tariff(100, "Тариф для бедных")));

        tariffs.forEach(System.out::println);
    }
}

@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
final class Tariff implements Comparable<Tariff> {
    private final int price;
    private final String name;

    @Override
    public int compareTo(Tariff o) {
        return this.price - o.getPrice();
    }
}
