public class Method {
    public static Integer arrayMaxFinder(int arr[]){
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > value) {   
                value = arr[i];
            }
        }
        return value;
    }
    public static Integer arrayMinFinder(int arr[]){
        int test = arr[0];
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < test) {
                
                value = arr[i];

            }
        }
        return value;
    }
    public static void averageDifference(int[] arr){
        int total = 0;
        for (int val : arr){
            total += val;
        }
        int average = total / arr.length;
        int differences[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            differences[i] = arr[i] - average;
        }
        System.out.println("The difference from average array is: " + Arrays.toString(differences));
    }
}

