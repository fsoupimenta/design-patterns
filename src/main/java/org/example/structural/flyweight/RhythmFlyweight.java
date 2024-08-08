package org.example.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class RhythmFlyweight {

    private static Map<String, Rhythm> rhythms = new HashMap<>();

    public static Rhythm getRhythm(String name) {
        Rhythm rhythm = rhythms.get(name);
        if (rhythm == null) {
            rhythm = new Rhythm(name);
            rhythms.put(name, rhythm);
        }
        return rhythm;
    }

    public static int getTotalRhythms() {
        return rhythms.size();
    }
}