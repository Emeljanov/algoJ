package by.emel.anton.maxeven;

public class MaxEven {
    public int findMaxEven(int number) {
        int m;
        int max = 0;

        while (number > 0) {
            m = number % 10;
            if(m > max && m % 2 == 0) max = m;
            number = number/ 10;
        }
        return max;
    }
}
