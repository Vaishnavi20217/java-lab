class ArrayImplementation {
    public static void main(String[] args) {
        int arr[] = new int[6]; // array of size 6

        // fill array with values 1 to 5
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }

        // print array values
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}