package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Main {
    public static int sum(int a, int b) {
        int keepA = 0;
        int keepB = 0;
        int min = 0;
        if(a == b) {
            return a;
        }
        else {
            min = Math.min(a, b);
            if(a == min) {
                for(int i = a; i < b; i++) {
                    keepA+=i;
                }
                return keepA + b;
            }else {
                for(int i = b; i < a; i++) {
                    keepB+=i;
                }
                return keepB + a;
            }
        }
    }

}



