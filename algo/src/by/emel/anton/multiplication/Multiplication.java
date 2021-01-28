package by.emel.anton.multiplication;

public class Multiplication {

    public int multiplicate(int number) {
        if (number == 0) return 0;

        int result = 1;

        boolean flag = true;

        while(flag && number > 10) {
            int num = number % 10;
            if(num == 0) {
                result =0;
                flag = false;
            }
            else {
                result = result * num;
                number = number / 10;
            }
//            result = result * number%10;
        }
        return result;
    }
}
