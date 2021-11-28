package tb.soft;

import java.util.*;

public class Operations {

    private final List<Person> linkedList;
    private final List<Person> arrayList;

    private final Set<Person> treeSet;
    private final Set<Person> hashSet;

    private final Map<Integer, Person> hashMap;
    private final Map<Integer, Person> treeMap;

    public Operations() {
        this.linkedList = new LinkedList<>();//wskaźnik na kolejne elementy
        this.arrayList = new ArrayList<>();//blok w pamięci
        this.treeSet = new TreeSet<>(Comparator.comparing(Person::hashCode));//uzywa equals, sortuje, nie wyswietla dodatkowych tych samych elementow
        this.hashSet = new HashSet<>();//uzywa compare, nie sortuje
        this.hashMap = new HashMap<>();
        this.treeMap = new TreeMap<>();

    }

    public void addPersonToCollections(Person person) {

        this.linkedList.add(person);
        this.arrayList.add(person);
        this.treeSet.add(person);
        this.hashSet.add(person);
        this.hashMap.put(person.hashCode(), person);
        this.treeMap.put(person.hashCode(), person);

    }

    public void displayPeople() {
        System.out.println("Wyświetlenie dla linkedlisty: ");
        for (Person person : linkedList) {
            System.out.println(person);
        }

        System.out.println("Wyświetlenie dla arratlisty: ");
        for (Person person : arrayList) {
            System.out.println(person);
        }

        System.out.println("Wyświetlenie dla treeSet: ");
        for (Person person : treeSet) {
            System.out.println(person);
        }

        System.out.println("Wyświetlenie dla hashsetu: ");
        for (Person person : hashSet) {
            System.out.println(person);
        }

        System.out.println("Wyświetlenie dla hashmapy: ");
        hashMap.forEach((key, person) -> System.out.println(person));

        System.out.println("Wyświetlenie dla treemapy: ");
        treeMap.forEach((key, person) -> System.out.println(person));
        //System.out.println("Wyświetlenie dla hashmapy: " + hashMap);
        //System.out.println("Wyświetlenie dla treemapy: " + treeMap);


    }

    public void removeFromCollection(Person person) {
        linkedList.remove(person);
        arrayList.remove(person);
        treeSet.remove(person);
        hashSet.remove(person);
        treeMap.remove(person.hashCode());
        hashMap.remove(person.hashCode());
    }

}
