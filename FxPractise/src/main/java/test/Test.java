package test;

import model.GameCharacter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Test {

    private static List<GameCharacter> allChar = new ArrayList<>();

    private Integer times = 0;

    private static Integer ssrQty = 0;
    private static Integer srQty = 0;
    private static Integer rQty = 0;

    public List<GameCharacter> getcards10() {
        Map<String, Map<Integer,GameCharacter>> all = character();

        Map<Integer, GameCharacter> ssrMap = all.get("ssr");
        Map<Integer, GameCharacter> srMap = all.get("sr");
        Map<Integer, GameCharacter> rMap = all.get("r");

        // 清空之前的結果
        allChar.clear();

        for (int i = 0; i < 10; i++) {
            drawsCard(ssrMap, srMap, rMap);
        }
        System.out.println(srQty+ssrQty+rQty);

        times += 10;

        return allChar;
    }

    public List<GameCharacter> getcard(){
        Map<String, Map<Integer,GameCharacter>> all = character();

        Map<Integer, GameCharacter> ssrMap = all.get("ssr");
        Map<Integer, GameCharacter> srMap = all.get("sr");
        Map<Integer, GameCharacter> rMap = all.get("r");

        // 清空之前的結果
        allChar.clear();

            drawsCard(ssrMap, srMap, rMap);

            times++;

        return allChar;
    }

    public void reset(){
        ssrQty = 0;
        srQty = 0;
        rQty = 0;
    }

    public List<GameCharacter> firstSsr() {
        Map<String, Map<Integer, GameCharacter>> all = character();

        Map<Integer, GameCharacter> ssrMap = all.get("ssr");
        Map<Integer, GameCharacter> srMap = all.get("sr");
        Map<Integer, GameCharacter> rMap = all.get("r");

        allChar.clear();

        int pro;
        do {
            pro = (int) ((Math.random() * 100) + 1);
            if (pro == 1) {
                System.out.println("恭喜抽中SSR:" + getCharacter(ssrMap));
                allChar.add(getCharacter(ssrMap));
                ssrQty++;
            } else if (pro <= 11) {
                System.out.println("恭喜抽中SR:" + getCharacter(srMap));
                allChar.add(getCharacter(srMap));
                srQty++;
            } else {
                System.out.println("恭喜抽中R:" + getCharacter(rMap));
                allChar.add(getCharacter(rMap));
                rQty++;
            }

            times++;
        } while (pro != 1);
        return allChar;
    }

    private static GameCharacter getCharacter(Map<Integer,GameCharacter> characterMap) {
        int randomIndex=ThreadLocalRandom.current().nextInt(1,characterMap.size()+1);
        return characterMap.get(randomIndex);
    }

    private static Map<String, Map<Integer, GameCharacter>> character(){
        HashMap<Integer, GameCharacter> ssrMap = new HashMap<>();
        ssrMap.put(1, new GameCharacter("SSR","Kai Viper"));
        ssrMap.put(2, new GameCharacter("SSR","Nova Wisp"));
        ssrMap.put(3, new GameCharacter("SSR","Niko Flame"));

        HashMap<Integer, GameCharacter> srMap = new HashMap<>();
        srMap.put(1, new GameCharacter("SR", "Luna Storm"));
        srMap.put(2, new GameCharacter("SR", "Nova Valor"));
        srMap.put(3, new GameCharacter("SR", "Sage Viper"));
        srMap.put(4, new GameCharacter("SR", "Kai Frost"));
        srMap.put(5, new GameCharacter("SR", "Theo Frost"));
        srMap.put(6, new GameCharacter("SR", "Niko Viper"));
        srMap.put(7, new GameCharacter("SR", "Aria Frost"));

        HashMap<Integer, GameCharacter> rMap = new HashMap<>();
        rMap.put(1, new GameCharacter("R", "Max Frost"));
        rMap.put(2, new GameCharacter("R", "Sage Shade"));
        rMap.put(3, new GameCharacter("R", "Kai Valor"));
        rMap.put(4, new GameCharacter("R", "Aria Blaze"));
        rMap.put(5, new GameCharacter("R", "Kai Rune"));
        rMap.put(6, new GameCharacter("R", "Kai Valor"));
        rMap.put(7, new GameCharacter("R", "Niko Shade"));
        rMap.put(8, new GameCharacter("R", "Sage Shade"));
        rMap.put(9, new GameCharacter("R", "Niko Frost"));
        rMap.put(10, new GameCharacter("R", "Ivy Rune"));
        rMap.put(11, new GameCharacter("R", "Ivy Blaze"));
        rMap.put(12, new GameCharacter("R", "Theo Rune"));
        rMap.put(13, new GameCharacter("R", "Luna Shade"));
        rMap.put(14, new GameCharacter("R", "Aria Valor"));
        rMap.put(15, new GameCharacter("R", "Aria Frost"));
        rMap.put(16, new GameCharacter("R", "Sage Wisp"));
        rMap.put(17, new GameCharacter("R", "Theo Gale"));
        rMap.put(18, new GameCharacter("R", "Theo Gale"));
        rMap.put(19, new GameCharacter("R", "Aria Frost"));
        rMap.put(20, new GameCharacter("R", "Kai Valor"));

        Map<String,Map<Integer,GameCharacter>> allch = new HashMap<>();
        allch.put("ssr",ssrMap);
        allch.put("sr",srMap);
        allch.put("r",rMap);

        return allch;
    }

    private static void drawsCard(Map<Integer,GameCharacter> ssr,
                                  Map<Integer,GameCharacter> sr,
                                  Map<Integer,GameCharacter> r
                                  ) {
        int pro = (int) ((Math.random() * 100) + 1);
        if (pro == 1) {
            allChar.add(getCharacter(ssr));
            ssrQty++;
        } else if (pro <= 11) {
            allChar.add(getCharacter(sr));
            srQty++;
        } else {
            allChar.add(getCharacter(r));
            rQty++;
        }
    }
    public Integer getQuantity() {
        return ssrQty+srQty+rQty;
    }

    public Integer getSsrQty() {
        return ssrQty;
    }

    public Integer getSrQty() {
        return srQty;
    }

    public Integer getrQty() {
        return rQty;
    }

    public Integer getTimes() {
        return times;
    }
}
