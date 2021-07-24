
package Calculator;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws Exception {
        Arabic ar = new Arabic();
        Roman ro = new Roman();
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String operation = scanner.next();
        String b = scanner.next();
        if (ar.isDigit(a) && ar.op(operation) && ar.isDigit(b)) {
            ar.check(a, b, operation);
        } else if (ro.isDigitRom(a) && ro.ope(operation) && ro.isDigitRom(b)) {
            ro.check2(a, b, operation);
        } else {
            throw new Exception("Исключение");
        }
    }
}


