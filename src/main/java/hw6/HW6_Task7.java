package hw6;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
In the Example class, correct a couple of equals / hashCode methods in accordance with the rules for implementing these methods (check details with your favorite search engine).
Both the first and last strings should participate in the comparison using the equals method and the hashcode calculation.
public class Example {
    private final String first, last;
    public Example(String first, String last) {
        this.first = first;
        this.last = last;
    }
    @Override
    public boolean equals(Object o) {
        return false;
    }
    @Override
    public int hashCode() {
        return 0;
    }
    public static void main(String[] args) {
        Set<Example> s = new HashSet<>();
        s.add(new Example("Donald", "Duck"));
        System.out.println(s.contains(new Example("Donald", "Duck")));
    }
}
*/
public class HW6_Task7 {
    private final String first, last;

    public HW6_Task7(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HW6_Task7 hw6_task7 = (HW6_Task7) o;
        return first.equals(hw6_task7.first) &&
                last.equals(hw6_task7.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    public static void main(String[] args) {
        Set<HW6_Task7> s = new HashSet<>();
        s.add(new HW6_Task7("Donald", "Duck"));
        System.out.println(s.contains(new HW6_Task7("Donald", "Duck")));
    }
}