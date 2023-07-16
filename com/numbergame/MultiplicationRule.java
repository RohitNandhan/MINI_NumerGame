package com.numbergame;
import java.util.Arrays;

public class MultiplicationRule implements GameRule {


    @Override
    public int calculateResult(int[] input) {
        int result=1;
        for(int in:input){
            result*=in;
        }
        return result;
    }


}
