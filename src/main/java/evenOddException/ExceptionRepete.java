package evenOddException;
public class ExceptionRepete {

    public int ProcessRepete(EvenOdd evenOdd) throws OddNumberException {
        int a = 3;
        boolean repete = true;

        while (repete) {
            //for (int i = 0; i < a; i++) {
                if (a < 3) {
                    // repeat 3 times

                    evenOdd.setN(evenOdd.getN() + 1); // increment n before calling even()
                    evenOdd.even();
                    a++;
                    repete = true;
                } else {
                    repete = false;
                }

        //    }

        }
        return 0;
    }

}
