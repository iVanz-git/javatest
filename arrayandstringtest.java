public class arrayandstringtest {
    public static void main(String[] args) {

        //1.替换字符串中特定字符为要求内容
        //替换所有"a"为"_"
        //统计并输出上述字符出现的次数，并将所有出现的索引打印输出

        System.out.println("在主函数中随便说一句话");
        System.out.println("在主函数中随便说一句话");
        System.out.println("在主函数中随便说一句话");
        System.out.println("在主函数中随便说一句话");
        System.out.println("在主函数中随便说一句话");
        String s1 = new String("swreojajqoE DFSAOHJ 23 89ASD Las jopias ds1 d1 324 1aas15fdhdf");
        String s2 = arrayandstringtest.f2(s1);
        System.out.println(s2);        
    
    }


    
        public static String f2(String str) {
            int count = 0;
            char[] c1 = str.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilder1 = new StringBuilder();
            
            for (int i = 0; i < c1.length; i++) {
                if (c1[i] == 'a') {
                    stringBuilder.append("_");
                    count++;                    
                    stringBuilder1.append(i + ",");

                }
                else{
                    stringBuilder.append(c1[i]);
                }
            }

            String res = stringBuilder.toString();
            String indexRes = stringBuilder1.toString();
            System.out.println("在方法中随便说句话");
            return "替换后的字符串为：\n" + res + "\n一共有" + count + "个字符被替换，被替换的字符在原字符串中的索引位置如下：" + indexRes;

            
        }
    
    
}

