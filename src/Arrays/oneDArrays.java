public class oneDArrays {
    public static void main(String[] args) {
        // Create & Read
        int[] myArr = new int[10];
        int[] arr = {1,2,3,4};

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        // for - each loop
        System.out.println(arr); // [I@71623278 ([ -> Array, I -> Integer, @71623278 -> Hash)

        String[] languages = {"Java", "C++", "Python"};
        for(String lang : languages) {
            System.out.println(lang);
        }

        // Basic Problems
        // Search
        int[] numArr = {1,2,3,4};
        int target = 2;
        int idx = -1;
        for(int i=0; i<numArr.length; i++) {
            if(numArr[i] == target) {
                idx = i;
                break;
            }
        }

        if(idx != -1) System.out.println("Found at " + idx);
        else System.out.println("Not Found");

        // Maximum
        int[] toFindMaxArr = {-15, -3, -42, -7, -1};
        int flag = Integer.MIN_VALUE;
        for(int i=0; i<toFindMaxArr.length; i++){
            if(toFindMaxArr[i] > flag) {
                flag = toFindMaxArr[i];
            }
        }
        System.out.println("Max: "+flag); 
    }
}
