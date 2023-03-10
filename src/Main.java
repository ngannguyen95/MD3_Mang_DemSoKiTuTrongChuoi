public class Main {
    public static void main(String[] args) {
        String string = "xinchaoccc";
        char c = 'c';
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện kí tự trong chuỗi: "+count);

    }
}