
package com.mycompany.introducaojunit5;

public class MathUtiil {
    public static int mdc(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        
        // Propriendade 6
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
        
        // Propriedade 1
        if (b > 0 && a % b == 0){
            return b;
        }
        
        // Propriendade 3
        if(b == 0){
            return Math.abs(a);
        }
        
        // Propriendade 5
        if(a % b != 0){
            return 1;
        }
        
        return -1;
    }
}
