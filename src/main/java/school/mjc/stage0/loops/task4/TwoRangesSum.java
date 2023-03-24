package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow){
            System.out.println("number to skip is bugger then the last");
        } else if (numberToSkip < 0 && lastInRow < 0 && numberToSkip < lastInRow) {
            System.out.println("last number in row is negative");
        } else if (numberToSkip == lastInRow) {
            int a = 0;
            for (int i = 0; i <= numberToSkip; i++){
                a +=i;
            }
            System.out.println("skipped sum is " + a + "\ncounted sum is 0");
        } else if (numberToSkip < lastInRow ) {
            int a = 0;
            int b = 0;
            for (int i = 1; i <= lastInRow; i++){
                if (i <= numberToSkip){
                    a += i;
                }else {
                    b += i;
                }
            }
            System.out.println("skipped sum is " + a + "\ncounted sum is " + b);
        }
    }
}
