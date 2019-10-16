
/**
 * Write a description of class average here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Average {

  public static double findSum (double[] numbers) {
    double sum = 0.0;

    for (int i = 0; i < numbers.length; i = i + 1) {
      sum = sum + numbers[i];
    }

    return sum;
  }

  public static double computeAverage (double[] numbers) {
    if (numbers.length == 0) {
      return 0.0;
    } else {
      double sum = findSum (numbers);

      return sum/numbers.length;
    }
  }

  public static void main (String[] args) {

    double[] numbers = {1,2,3,4,5};

    double average = computeAverage (numbers);
    
    double numbersPrint = showArray (numbers);
    
    testFindSum(numbers, 17);

    System.out.println ("The average of the numbers is: " + average);
  }

  
  
  public static double showArray (double[] numbers) {
    double sum = 0.0;

    for (int i = 0; i < numbers.length; i = i + 1) {
      System.out.println (i);
    }

    return sum;
  }
 
  public static int[] doubleArray (int[] numbers) {
    int[] result = new int[numbers.length];

    for (int i = 0; i < numbers.length; i = i + 1) {
      result[i] = numbers[i] * 2;
    }

    return result;
  }  
  
  public static void testFindSum (double[] input, double expected) {
      double tolerance = 0.00001;
      double input2 = findSum(input);
      if ((input2 - expected < tolerance) &&
          (expected - input2 < tolerance)) {
            
      } else {
        System.out.println ("Error: the result " + input2 + 
        " does not equal the expected " + expected);
      }
  }
}

    
    
   
