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
}
