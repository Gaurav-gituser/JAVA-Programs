public class ReverseGivenNumber {

    public static void main(String[] args) {

        int num = 987654321;
        int reverseNum = 0;

        while (num > 0) {

            reverseNum = (reverseNum * 10) + num % 10;
            num = num / 10;

        }

        System.out.print(reverseNum);

    }
}