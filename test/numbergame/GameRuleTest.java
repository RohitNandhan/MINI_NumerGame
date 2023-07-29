package test.numbergame;

import com.numbergame.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;

import java.lang.Object;

import static junit.framework.TestCase.assertEquals;

public class GameRuleTest {

    int values[]=new int[]{1,2,3};
    public GameRule[] gameRule=new GameRule[]{new MultiplicationRule(),
            new AdditionRule(),new SumOfCubeRule(),new MaxRule()};
    int answer[]=new int[]{6,6,35,3};

   @RepeatedTest(4)
    @DisplayName("Calculate Result 1")
    public void CalculateResultTest(TestInfo testInfo, RepetitionInfo repetitionInfo){
       int i= repetitionInfo.getCurrentRepetition()-1;
        System.out.println("Running Test:"+(i+1));
        assertEquals(answer[i],gameRule[i].calculateResult(values));
        System.out.println("passed");

    }
    @BeforeEach
    void PrintTest(){
        System.out.println("-------------------------------------");
    }
    @BeforeAll
    void InitTest(){

        System.out.println("-------------------------------------");
    }

//    @Test
//    public void CalculateResultTest2(){
//        GameRule gameRule=new MultiplicationRule();
//        assertEquals(6,gameRule.calculateResult(new int[]{1,2,3}));
//    }
//    @Test
//    public void CalculateResultTest3(){
//        GameRule gameRule=new MultiplicationRule();
//        assertEquals(6,gameRule.calculateResult(new int[]{1,2,3}));
//    }
//    @Test
//    public void CalculateResultTest4(){
//        GameRule gameRule=new MultiplicationRule();
//        assertEquals(6,gameRule.calculateResult(new int[]{1,2,3}));
//    }
//
}
