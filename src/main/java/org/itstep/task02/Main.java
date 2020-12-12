package org.itstep.task02;

public class Main {
    public static void main(String[] args) {
        try {
            getPositiveLessHundredNumber(-7);
        } catch (NegativeNumberException exp) {
            exp.printStackTrace();
        } catch (GreatHundredException exp) {
            exp.printStackTrace();
        }

    }
    public static void getPositiveLessHundredNumber (int num)throws NegativeNumberException, GreatHundredException
    {
        if (num<0){
throw new NegativeNumberException("Число меньше 0");
        }
        if(num>100){
            throw new GreatHundredException("Число больше 100");
        }
    }
}
