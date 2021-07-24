package Calculator;

import java.util.Arrays;

public class Arabic {

    public int check(String a, String b, String operation) {
        int num = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        if (operation.equals("+")) {
            System.out.println(num + num2);
        }
        if (operation.equals("-")) {
            System.out.println(num - num2);
        }
        if (operation.equals("*")) {
            System.out.println(num * num2);
        }
        if (operation.equals("/")) {
            System.out.println(num / num2);
        }
        return 0;
    }


    public boolean isDigit(String r) throws NumberFormatException {
        try {
            int result = Integer.parseInt(r);
            if (result > 0 && result <= 10)
                return true;
        } catch (NumberFormatException e) {
            return false;
        }
        return false;
    }


    public boolean op(String operat) {
        String[] o = {"+", "-", "*", "/"};
        if (Arrays.asList(o).indexOf(operat) >= 0 && Arrays.asList(o).indexOf(operat) <= 5){
            return true;
        } else {
            return false;
        }
    }
}