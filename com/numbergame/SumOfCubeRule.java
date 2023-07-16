package com.numbergame;

public class SumOfCubeRule implements GameRule {

    @Override
    public int calculateResult(int[] input) {
        int result=0;
        for(int in:input){
            result+=Math.pow(in,3);
        }
        return result;
    }
    public String toString() {
        return "SumOfCubeRule";
    }
}
