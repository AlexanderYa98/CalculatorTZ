package Calculator;

import java.util.Arrays;

public class Roman {

    public String check2(String a, String b, String operation) throws ArrayIndexOutOfBoundsException {
        try {
            String[] roman = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                    "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                    "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                    "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                    "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                    "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                    "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
            };

            if (Arrays.asList(roman).indexOf(a) >= 1 && Arrays.asList(roman).indexOf(a) <= 10 && Arrays.asList(roman).indexOf(b) >= 1 && Arrays.asList(roman).indexOf(b) <= 10) {
                if (operation.equals("+")) {
                    int p = Arrays.asList(roman).indexOf(a) + Arrays.asList(roman).indexOf(b);
                    System.out.println(roman[p]);
                }
                if (operation.equals("-")) {
                    int m = Arrays.asList(roman).indexOf(a) - Arrays.asList(roman).indexOf(b);
                    System.out.println(roman[m]);
                }
                if (operation.equals("*")) {
                    int u = Arrays.asList(roman).indexOf(a) * Arrays.asList(roman).indexOf(b);
                    System.out.println(roman[u]);
                }
                if (operation.equals("/")) {
                    int d = Arrays.asList(roman).indexOf(a) / Arrays.asList(roman).indexOf(b);
                    System.out.println(roman[d]);
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new ArrayIndexOutOfBoundsException("Не бывает отрицательных римских цифр");
        }
        return a;
    }

        public boolean isDigitRom(String s) {

            String[] roman1 = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            if (Arrays.asList(roman1).indexOf(s) >= 1 && Arrays.asList(roman1).indexOf(s) <= 10 ) {
                return true;
            } return false;
        }

        public boolean ope(String operat) {
            String[] o = {"+", "-", "*", "/"};
            if (Arrays.asList(o).indexOf(operat) >= 0 && Arrays.asList(o).indexOf(operat) <= 3){
                return true;
            }  else {
                return false;
            }
        }
    }
