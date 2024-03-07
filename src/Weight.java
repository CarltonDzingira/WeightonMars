public class Weight {
    public static void main(String[] args) {


        float earthWeightCarlton;
        float marsWeightCarlton;
        double marsWeightInDouble;
        int marsWeightInInt;

        earthWeightCarlton = 86;
        marsWeightCarlton = (earthWeightCarlton * 0.38F);
        System.out.println(earthWeightCarlton + " kg on Earth is " +marsWeightCarlton + " kg on Mars");

        //assignment (compatible types) from float to double
        marsWeightInDouble = marsWeightCarlton;
        System.out.println("Kilograms on Mars after converting to double "+marsWeightInDouble);

        //printing a variable limiting the length of printing to 4 decimal places
        System.out.printf("Kilograms on Mars displayed to four decimal places: %.4f %n", marsWeightInDouble);

        //a floating point type cast to integer
        marsWeightInInt = (int)marsWeightInDouble;
        System.out.println("Kilograms on Mars when casted to integer " + marsWeightInInt);
//
//        //casting an int type to char
        char c = (char)marsWeightInInt;
        System.out.println("The ASCII table equivalent of masrWeigtInInt is: " + c);

//        //assign the value of performing some mathematical operation on the char character to the new int variable
        int exampleOfMathOnChar = c * c;
        System.out.println("An example of a mathematical operation on the char type: "+ exampleOfMathOnChar);

    }
}



