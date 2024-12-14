class Exercise_1 {

    //number of elements we want to check for
    public static final int numElements = 100;
    public static void main(String[] args) {
        

        // Check if given a single argument
        if(args.length != 1) {
            System.out.println("./Exercise_1 <value>");
            return;
        }

        int n = Integer.parseInt(args[0]);

        //create new array of numElements long
        int[] arr = new int[numElements];
        for (int i = 0; i < numElements; i++){
            arr[i] = i;
        }

        
        //find Divisable by n
        findDivisableBy(arr, n);
    }

    public static void findDivisableBy(int[] arr, int n) {
        System.out.print(n);

        // for every element of the array
        for(int i = 0; i < arr.length; i++) {

            // check if element is divisible by n
            if(arr[i] % n == 0) {
                //print if divisibile
                System.out.println(arr[i] + ",");
            }
        }
        System.out.println("");
    }
}
