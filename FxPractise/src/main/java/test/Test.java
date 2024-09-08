package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Test {

    private List<String> allChar = new ArrayList<>();


    public List<String> getcards10() {
        Map<String, Map<Integer,String>> all = character();

        Map<Integer, String> ssrMap = all.get("ssr");
        Map<Integer, String> srMap = all.get("sr");
        Map<Integer, String> rMap = all.get("r");

        // 清空之前的結果
        allChar.clear();

        for (int i = 0; i < 10; i++) {
            int pro = (int) ((Math.random() * 100) + 1);
            if (pro == 1) {
                System.out.println("恭喜抽中SSR:" + getCharacter(ssrMap));
                allChar.add(getCharacter(ssrMap));
            } else if (pro <= 11) {
                System.out.println("恭喜抽中SR:" + getCharacter(srMap));
                allChar.add(getCharacter(srMap));
            } else {
                System.out.println("恭喜抽中R:" + getCharacter(rMap));
                allChar.add(getCharacter(rMap));
            }

        }
        return allChar;
    }

    public List<String> getcard(){
        Map<String, Map<Integer,String>> all = character();

        Map<Integer, String> ssrMap = all.get("ssr");
        Map<Integer, String> srMap = all.get("sr");
        Map<Integer, String> rMap = all.get("r");

        // 清空之前的結果
        allChar.clear();


            int pro = (int) ((Math.random() * 100) + 1);
            if (pro == 1) {
                System.out.println("恭喜抽中SSR:" + getCharacter(ssrMap));
                allChar.add(getCharacter(ssrMap));
            } else if (pro <= 11) {
                System.out.println("恭喜抽中SR:" + getCharacter(srMap));
                allChar.add(getCharacter(srMap));
            } else {
                System.out.println("恭喜抽中R:" + getCharacter(rMap));
                allChar.add(getCharacter(rMap));
            }


        return allChar;
    }
    private static String getCharacter(Map<Integer,String> characterMap) {
        int randomIndex=ThreadLocalRandom.current().nextInt(1,characterMap.size()+1);
        return characterMap.get(randomIndex);
    }

    private static Map<String, Map<Integer, String>> character(){
        HashMap<Integer, String> ssrMap = new HashMap<>();
        ssrMap.put(1, "Kai Viper");
        ssrMap.put(2, "Nova Wisp");
        ssrMap.put(3, "Niko Flame");

        HashMap<Integer, String> srMap = new HashMap<>();
        srMap.put(1, "Luna Storm");
        srMap.put(2, "Nova Valor");
        srMap.put(3, "Sage Viper");
        srMap.put(4, "Kai Frost");
        srMap.put(5, "Theo Frost");
        srMap.put(6, "Niko Viper");
        srMap.put(7, "Aria Frost");

        HashMap<Integer, String> rMap = new HashMap<>();
        rMap.put(1, "Max Frost");
        rMap.put(2, "Sage Shade");
        rMap.put(3, "Kai Valor");
        rMap.put(4, "Aria Blaze");
        rMap.put(5, "Kai Rune");
        rMap.put(6, "Kai Valor");
        rMap.put(7, "Niko Shade");
        rMap.put(8, "Sage Shade");
        rMap.put(9, "Niko Frost");
        rMap.put(10, "Ivy Rune");
        rMap.put(11, "Ivy Blaze");
        rMap.put(12, "Theo Rune");
        rMap.put(13, "Luna Shade");
        rMap.put(14, "Aria Valor");
        rMap.put(15, "Aria Frost");
        rMap.put(16, "Sage Wisp");
        rMap.put(17, "Theo Gale");
        rMap.put(18, "Theo Gale");
        rMap.put(19, "Aria Frost");
        rMap.put(20, "Kai Valor");

        Map<String,Map<Integer,String>> allch = new HashMap<>();
        allch.put("ssr",ssrMap);
        allch.put("sr",srMap);
        allch.put("r",rMap);

        return allch;
    }
}
