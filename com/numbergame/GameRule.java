package com.numbergame;

public interface GameRule {
    int calculateResult(int[] input);
    String toString();
}
