public class TestFramework {
    public static void main (String[] args) {
        //int[] array1 = {1};
        //int[] array2 = {1};
        //String[] s = {"a","bb","ccc","edke","kkk"};
        //int[] numbers = {2,3,4,1};

        //boolean testResult = testEqualIntArrays(array1, array2);

        //testSelectionSort (numbers);
        ArrayInt arr1 = new ArrayInt (10, -1);
        testArrayInt(arr1.toString(), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");

    }

    public static boolean testEqualIntArrays (int[] array1, int[] array2) {
        boolean equals = true;

        if(array1.length == array2.length){
            for (int i = 0; i < array1.length; i = i+1) {
                if(array1[i] != array2[i]){
                    equals = false;
                    break;
                } else{equals = true;
                }

            }
        } else{equals = false;
        }
        return equals;
    }    

    public static void testSelectionSort (int[] numbers) {
        boolean result;
        MyCollectionLibrary.selectionSort(numbers);

        for (int i = 0; i < numbers.length-1; i = i+1) {
            if(i<i+1){
                result = true;
            }
            else{
                result=false;
                break;
            }
            if (result=false){ System.out.println("The array is not sorted");
                // <5>
            } else{ System.out.println("The array is sorted");}

        }
    }  

    public static int[] create100LenghtArray () {

        int[] arr;
        arr = new int[100];
        for (int i = 0; i < 100; i = i+1) {
            arr[i] = i;
        }
        return arr;

    }

    public static void testArrayInt(String result, String expected){
        if (result.equals (expected)){

        } else {
            System.out.println ("Error "+result+" != " +expected);
        }
    }

}
