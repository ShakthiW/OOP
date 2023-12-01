// Manually throw an exception
class ThrowExample {
    public static void main(String args[]) {
        try{
            System.out.println("Before throw.");
            throw new ArithmeticException();
        }
        catch (ArithmeticException exc){
            // Catch the exception
            System.out.println ("Exception caught.");
        }
        System.out.println("After try/catch block.");
    }
}