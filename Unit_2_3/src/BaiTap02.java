public class BaiTap02 {
        public static void main(String[] args) {
            int[] testData = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int[] oddArray = new int[testData.length];
            int oddIndex = 0;

            for (int i = 0; i < testData.length; i++) {
                if (testData[i] % 2 != 0) {
                    oddArray[oddIndex] = testData[i];
                    oddIndex++;
                }
            }

            testData = oddArray;

            System.out.print("testData Array: ");
            for (int i = 0; i < oddIndex; i++) {
                System.out.print(testData[i] + " ");
            }
        }
    }

}
