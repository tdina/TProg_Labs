public class U0901Main {
    public static void main(String[] args) {
        Integer intArr[] = {10,20,15};
        Float floatArr[] = new Float[4];
        for (int i = 0; i < floatArr.length; i++) {
            floatArr[i] = (float)Math.random();
            System.out.printf(floatArr[i] + " ");
        }


        String[] arrayString = {"4", "5", "6"};
        U0901WorkArray insWorkArrayInt = new U0901WorkArray(intArr);

        U0901WorkArray insWorkArrayFloat = new U0901WorkArray(floatArr);
        /*U0901WorkArray WorkArrayString = new U0901WorkArray(Double.valueOf(arrayString));*/



        System.out.println();
        System.out.println(insWorkArrayInt.sum());
        System.out.println(insWorkArrayFloat.sum());
        System.out.println("KEKEKEKEKEKKEKEKEKEKEKEK!!!!!!!!!!!!!!!!!!!!!!!!");


    }
}
