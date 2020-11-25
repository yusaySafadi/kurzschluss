package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean foo = und(true, true);
        boolean bar = und(true, false);
        boolean var = und(false, false);

        boolean foo2 = oder(true, true);
        boolean bar2 = oder(true, false);
        boolean var2 = oder(false, false);

        System.out.println(foo);
        System.out.println(bar);
        System.out.println(var);

        System.out.println(foo2);
        System.out.println(bar2);
        System.out.println(var2);

    }

    public static boolean und(boolean a, boolean b){
        if(a == true && b == true){
            return true;

        }else{
            return false;
        }
    }
    public static boolean oder(boolean a, boolean b){
        if(a ==true || b == true){
            return true;
        }
        else{
            return false;
        }
    }
}
