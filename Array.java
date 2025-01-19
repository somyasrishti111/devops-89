public class Array {
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50, 60, 70};
            
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

            // Fix string immutability issue
            String Str = "HELLO WORLD";
            Str = Str.replace("E", "F"); // Assign the result back to Str
            System.out.println(Str);
        }
    }
