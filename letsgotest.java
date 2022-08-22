public class letsgotest{
    public static void main(String[] args) {
        //输出原数组中所有偶数
        int[] arr1 = new int[]{12, 23, 234, 2342, 22, 21, 5432, 32};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                System.out.println(arr1[i] + "\t是 偶数，索引为：" + i);
                
            }
            else {
                System.out.println(arr1[i] + "\t是 奇数，索引为：" + i);
                
            }
        }
    }
}