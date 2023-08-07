package com.unitedcoder.datatypes;

public class LogicalOperators {
    public static void main(String[] args) {
        // &&, ||, !

        // &&: and and operator
        System.out.println(true&&false); //false
        System.out.println( 7>8 && 9>6); //false
        System.out.println(true && true); //true

        System.out.println(8==8 && 7>5); // true

        System.out.println(false && false); //false
        System.out.println(8 !=8 && 5>7); //false

        // || or or operator
        System.out.println(true || false); //true
        System.out.println( 7>8 || 9>6); //true
        System.out.println(true || true); //true

        System.out.println(8==8 || 7>5); // true

        System.out.println(false || false); //false
        System.out.println(8 !=8 || 5>7); //false

        // ! not
        // !true = false
        // !false = true
        System.out.println(!(true && true)); //false
        System.out.println(!(false || false)); //true
        System.out.println(!(4>3) && !(8==8)); // false



    }
}
