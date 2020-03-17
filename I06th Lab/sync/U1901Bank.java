package sync;

public class U1901Bank {
    public int intTo;
    public int intFrom = 220;

    synchronized void calc(int intTransaction, long lngTimeout) {
        System.out.println("Before:" + intTo + ','  + intFrom + ',' + Thread.currentThread().getName());
        intFrom -= intTransaction;
        try {
            Thread.sleep(lngTimeout);
        } catch (Exception e) {
            System.out.println(e);
        }
        intTo += intTransaction;
        System.out.println("After:" + intTo + ','  + intFrom + ',' + Thread.currentThread().getName());


    }

}
