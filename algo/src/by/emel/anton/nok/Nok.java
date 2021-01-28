package by.emel.anton.nok;

public class Nok {

    private int gcb(int a, int b) {
        if(b == 0)
            return a;
        else
            return gcb(b, a% b);
    }
    public int lcm(int a, int b) {
        return a * b / gcb(a,b);
    }
}
