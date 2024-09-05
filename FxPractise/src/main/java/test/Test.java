package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Test {
    public static void main(String[] args) {

        HashMap<Integer,String> ssrMap = new HashMap<>();
        ssrMap.put(1,"Kai Viper");
        ssrMap.put(2,"Nova Wisp");
        ssrMap.put(3,"Niko Flame");

        System.out.println(ssrMap.get(1));
        HashMap<Integer,String> srMap = new HashMap<>();
        srMap.put(1,"Luna Storm");
        srMap.put(2,"Nova Valor");
        srMap.put(3,"Sage Viper");
        srMap.put(4,"Kai Frost");
        srMap.put(5,"Theo Frost");
        srMap.put(6,"Niko Viper");
        srMap.put(7,"Aria Frost");

        HashMap<Integer,String> rMap = new HashMap<>();
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
        for(int i=0; i<10; i++) {
            int pro = (int) ((Math.random() * 100) + 1);
            if (pro == 1) {
                System.out.println("恭喜抽中SSR:" + getCharacter(ssrMap));
            } else if (pro<=11) {
                System.out.println("恭喜抽中SR:" + getCharacter(srMap));
            } else {
                System.out.println("恭喜抽中R:" + getCharacter(rMap));
            }
        }
    }
    private static String getCharacter(HashMap<Integer,String> characterMap) {
        int randomIndex=ThreadLocalRandom.current().nextInt(1,characterMap.size()+1);
        return characterMap.get(randomIndex);
    }
}
