package com.numbergame;

public class AdditionRule implements GameRule{
    @Override
    public int calculateResult(int[] input) {
        int result=0;
        for(int in:input){
            result+=in;
        }
        return result;
    }
    public String toString(){
        return "AdditionRule";
    }
}
