package org.zagvladimir.lab1;

public class Task1 {
    public static void main(String[] args) {
        double x = 10;
        int a = 4, b = 10;
        double u = 34;
        double res = 0;


        if(x < a){
            res = Math.pow(x,4) * Math.sin(x);
        } else if(x >= a && x<= b){
            res = Math.sqrt(u - Math.pow(x,2));
        } else if(x > b){
            res = x-1 + (1/(x-1));
        }

        System.out.println(res);

    }
}
