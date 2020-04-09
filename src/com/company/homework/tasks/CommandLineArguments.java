package com.company.homework.tasks;

public class CommandLineArguments {
    public static void main(String[] args) {
        float result;
        float num1 = Float.parseFloat(args[0]);
        float num2 = Float.parseFloat(args[2]);
        if (args[1].equals("+")) {
            result = num1 + num2;
            System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
        } else if (args[1].equals("-")) {
            result = num1 - num2;
            System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
        } else if (args[1].equals("/")) {
            result = num1 / num2;
            System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
        } else if (args[1].equals("*")) {
            result = num1 * num2;
            System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
        } else {
            System.out.println("impossible to complete such a task");
        }
    }
}
