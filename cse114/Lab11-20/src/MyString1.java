public class MyString1 {

    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] subChars = new char[end - begin];
        for (int i = begin; i < end; i++) {
            subChars[i - begin] = chars[i];
        }
        return new MyString1(subChars);
    }

    public MyString1 toLowerCase() {
        char[] lowerChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            lowerChars[i] = Character.toLowerCase(chars[i]);
        }
        return new MyString1(lowerChars);
    }

    public boolean equals(MyString1 s) {
        if (chars.length != s.length()) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        if (i == 0) {
            return new MyString1(new char[]{'0'});
        }
        boolean negative = false;
        if (i < 0) {
            negative = true;
            i = -i;
        }
        int digits = (int) Math.floor(Math.log10(i)) + 1;
        char[] valueChars = new char[digits + (negative ? 1 : 0)];
        if (negative) {
            valueChars[0] = '-';
        }
        for (int j = digits - 1; j >= 0; j--) {
            valueChars[negative ? j + 1 : j] = (char) ((i % 10) + '0');
            i /= 10;
        }
        return new MyString1(valueChars);
    }

    public MyString1[] split(String s) {
        int count = 1;
        int start = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i + s.length() > chars.length) {
                break;
            }
            boolean match = true;
            for (int j = 0; j < s.length(); j++) {
                if (chars[i + j] != s.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
                i += s.length() - 1;
            }
        }

        MyString1[] parts = new MyString1[count];
        count = 0;
        start = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i + s.length() > chars.length) {
                break;
            }
            boolean match = true;
            for (int j = 0; j < s.length(); j++) {
                if (chars[i + j] != s.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                parts[count++] = substring(start, i);
                start = i + s.length();
                i = start - 1;
            }
        }
        parts[count] = substring(start, chars.length);
        return parts;
    }
}