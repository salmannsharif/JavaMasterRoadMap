package com.training.sample_projects.calculatordemo;

public interface Addition {
   static Integer addition(Integer a, Integer b){
       return a + b;
   }
   default String toString1(){
       return "Addition";
   }
}
