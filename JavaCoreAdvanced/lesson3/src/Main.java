import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Ананас");
        arrayList.add("Банан");
        arrayList.add("Персик");
        arrayList.add("Яблоко");
        arrayList.add("Ананас");
        arrayList.add("Киви");
        arrayList.add("Груша");
        arrayList.add("Банан");
        arrayList.add("Гранат");
        arrayList.add("Манго");
        arrayList.add("Виноград");
        arrayList.add("Апельсин");
        arrayList.add("Яблоко");


        Map<String, Integer> uniqueMap = new HashMap<>();
        Integer score;
        for (String item : arrayList) {
            if (uniqueMap.containsKey(item)) {
                score = uniqueMap.get(item) + 1;
                uniqueMap.put(item, score);
            } else {
                uniqueMap.put(item, 1);
            }
        }
        System.out.println("Количество повторений слов в коллекции:");
        for (Map.Entry<String, Integer> stringIntegerEntry : uniqueMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + ": " + stringIntegerEntry.getValue());
        }

        System.out.println("\nУникальные слова:");
        for (Map.Entry<String, Integer> stringIntegerEntry : uniqueMap.entrySet()) {
            if (stringIntegerEntry.getValue() == 1) {
                System.out.println(stringIntegerEntry.getKey());
            }
        }
    }
}
