// 7. Integer

class Integer2 {
    int value;

    int getValue() {
        return value;
    }

    void setValue(int n) {
        value = n;
    }

    boolean isEven() {
        boolean isEven = true;
        if (value % 2 == 1) {
            isEven = false;
        }
        return isEven;
    }

    boolean isOdd() {
        boolean isOdd = true;
        if (value % 2 == 0) {
            isOdd = false;
        }
        return isOdd;
    }

    void prettyPrint() {
        System.out.println(value);
    }

    String toString() {
        String valueString;
        valueString = Integer.toString(value);
        return valueString;
    }

}
