public class BaiTap03 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                count++;
            }
        }

        System.out.println("Số lượng các số chia hết cho 7 từ 1 đến 100 là: " + count);
    }
}
