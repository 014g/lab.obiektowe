package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class Main {
    static int iteratorKangurow = 0;
    public static void main(String[] args) {
        System.out.println("\n\n");
        var kangury = new ArrayList<Kangur>(3);

        for(int i=0; i<3; i++) {
            kangury.add(nowyKangur());
            System.out.println("Kangur nr " + kangury.get(i).skok() + " skacze");
        }
        System.out.println("\n\n");
        int i=0;
        while (kangury.iterator().hasNext()) {
            if (i<3) {
                System.out.println("Kangur nr " + kangury.get(i).skok() + " skacze");
                i++;
            } else break;
        }
        System.out.println("\n\n");
        HashMap<String, Kangur> mapaKangurow = new HashMap<>(3);
        mapaKangurow.put("Michal", kangury.get(0));
        mapaKangurow.put("Marcin", kangury.get(1));
        mapaKangurow.put("Mateusz", kangury.get(2));

        Iterator<String> iter = mapaKangurow.keySet().iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            Kangur value = mapaKangurow.get(key);
            System.out.println(key + " nr " + value.skok());
        }
        System.out.println("\n\n");
        var treemapaKangurow = new TreeMap<String, Kangur>();
        for (var element : mapaKangurow.entrySet()) {
            treemapaKangurow.put(element.getKey(), mapaKangurow.get(element.getKey()));
        }
        for (var element : treemapaKangurow.entrySet()) {
            System.out.println(element.getKey() + " nr " + treemapaKangurow.get(element.getKey()).skok());
        }
    }
    static Kangur nowyKangur() {
        Kangur kanagur = new Kangur(iteratorKangurow+1);
        iteratorKangurow++;
        return kanagur;
    }
}
