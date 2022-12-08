package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Function function;
        if (args.length == 6)
            function = new Function(Double.parseDouble(args[0]),
                    Double.parseDouble(args[1]),
                    Double.parseDouble(args[2]),
                    Double.parseDouble(args[3]),
                    Double.parseDouble(args[4]),
                    Double.parseDouble(args[5]));
        else
            function = new Function();

        function.count();
        function.printResults();
    }
}