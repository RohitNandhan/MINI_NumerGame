package com.numbergame;

public class MaxRule implements GameRule {
    @Override
    public int calculateResult(int[] input) {
        int result=0;
        for(int in:input){
            result=Math.max(result,in);
        }
        return result;
    }
    public String toString(){
        return "MaxRule";
    }

}
