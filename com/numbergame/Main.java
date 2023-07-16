package com.numbergame;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] input=new int[]{-1,1,1,0};
        Player player=new Player(input);
        GameRule[] rules=new GameRule[]{new AdditionRule(),new MaxRule(), new MultiplicationRule(), new SumOfCubeRule()};
       // to print the Single Class obj
        GameRule gameRule=player.findBest(rules);
        System.out.println(gameRule);
        // to print list of class obj (if values are equal)
        System.out.println("----------");
        List<GameRule> gameResult=player.gameResult(rules);
        for(GameRule game:gameResult)
        System.out.println(game);
    }
}
