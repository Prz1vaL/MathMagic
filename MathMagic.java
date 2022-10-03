

public class MathMagic {
    public static void main(String[] args) {
        int myNumber = 10; // We will refer to myNumber as the Original Number from now onwards.
        int stepOne   = myNumber;
        int stepTwo   = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour  = stepThree + 17;
        int stepFive  = stepFour;
        int stepSix   = stepFive / 6;
        System.out.println(stepSix);
    }
}
