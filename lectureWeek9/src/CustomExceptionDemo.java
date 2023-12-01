public class CustomExceptionDemo {
    public static void main(String args[]) {
// Here, numer is longer than denom
        int numer[] = {4, 8, 15, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < numer.length; i++){
            try {
                if (numer[i] % denom[i] != 0) {
                    throw new NonIntResultException(numer[i], denom[i]);
                }
                System.out.println(numer[i] + " / " +
                        denom[i] + " is " +
                        numer[i]/ denom[i]);
            }
            catch (ArithmeticException exc){
                // Catch the exception
                System.out.println ("Can’t divide by zero!");
            }
            catch (NonIntResultException exc) {
                // Catch the exception
                System.out.println(exc);
            } catch (ArrayIndexOutOfBoundsException exc){
                    // Catch the exception
                    System.out.println ("No matching element found.");
                }
            }
        }
}
