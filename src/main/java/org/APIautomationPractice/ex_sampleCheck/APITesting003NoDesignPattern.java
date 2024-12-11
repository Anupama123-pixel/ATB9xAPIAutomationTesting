package org.APIautomationPractice.ex_sampleCheck;

public class APITesting003NoDesignPattern {
    public void step1(){
        System.out.println("Step1");

    }
    public void step2(){
        System.out.println("Step2");

    }

    public void step3(String name){
        System.out.println("Step3");
    }

    public static void main(String[] args) {
        APITesting003NoDesignPattern np = new APITesting003NoDesignPattern();
        np.step1();
        np.step2();
        np.step3("pramod");
    }
}
