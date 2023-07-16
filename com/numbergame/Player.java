package com.numbergame;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class Player {
    private int[] values;


    public Player(int[] values){
        this.values=values;
    }

    public GameRule findBest(GameRule[] rules){
       // int in=rules[0].calculateResult(values);
        int in=0;
        GameRule result=null;
        for(int i=0;i<rules.length;i++){
            if(rules[i].calculateResult(values)>in) {
                result = rules[i];
                in = rules[i].calculateResult(values);
            }

        }
        return result;
    }

    public List<GameRule> gameResult(GameRule[] rules){
        int in=0;
        List<GameRule> result=new ArrayList<>();
        Map<GameRule,Integer> map=new HashMap<>();
        for(GameRule rule:rules){
            if(map.containsKey(rule)){
                continue;
            }else {
                map.put(rule, rule.calculateResult(values));
            }}
        int max=0;
     //   map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for(Map.Entry<GameRule,Integer> entry : map.entrySet()){
            if(entry.getValue()>max){
               //  result[i]= entry.getKey();

                max= entry.getValue();
            }
        }
        for(Map.Entry<GameRule,Integer> entry : map.entrySet()){
            if(entry.getValue().equals(max)){
                result.add(entry.getKey());
                }
            }
        return result;

    }
}
