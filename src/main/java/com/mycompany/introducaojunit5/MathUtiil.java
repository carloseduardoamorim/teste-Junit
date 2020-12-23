
package com.mycompany.introducaojunit5;

public class MathUtiil {
    public static int mdc(int a, int b) {
        if (b > 0 && a % b == 0){
            return b;
        }
        return 0;
    }
}
