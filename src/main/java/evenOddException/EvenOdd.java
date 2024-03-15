package evenOddException;

public class EvenOdd {
    public void setN(int n) {
        this.n = n;
    }

    private int n ;

    public int getN() {
        return n;
    }

    public EvenOdd(int n) {
        this.n = n;
    }

    public int even () throws OddNumberException {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    System.out.println("even number " + i);
                } else {
                    System.out.println("given number is odd " + i);
                   n++;
                    throw new OddNumberException(ErrorCode.ODD_NUMBER.code);
                }
            }
           return n;
        }
    }

