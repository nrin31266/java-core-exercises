public class Main {
    public static int addDigits(int num) {
        if(num == 0) return 0;
        String digits = Integer.toString(num);
        while (digits.length() > 1){

            int sum = 0;
            for(int i = 0; i< digits.length(); i++){
                int value = Integer.parseInt(digits.substring(i, i+1));
                sum = sum + value;
            }
            digits = Integer.toString(sum);
        }
        return Integer.parseInt(digits);
    }
    public static void main(String[] args) {
        int num = 123;
        System.out.println(addDigits(num));
    }
}