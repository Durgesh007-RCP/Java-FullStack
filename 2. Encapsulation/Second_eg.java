package Exception;

public class Second_eg {


        public static void main(String[] args) {

            try {

                int arr[] = {10,20,30};

                int result = arr[2] / 0;

            }

            catch(ArrayIndexOutOfBoundsException e){

                System.out.println("Array Error");

            }

            catch(ArithmeticException e){

                System.out.println("Arithmetic Error");

            }

        }

    }


