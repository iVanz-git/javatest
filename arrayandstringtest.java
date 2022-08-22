public class arrayandstringtest {
    public static void main(String[] args) {

        //1.替换字符串中特定字符为要求内容
        //替换所有"a"为"_"

        String s1 = new String("sadasdaasds1 d1 324 1aas15fdhdf");
        String s2 = arrayandstringtest.f2(s1);
        System.out.println(s2);        
    
    }


    
        public static String f2(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : str.toCharArray()) {
                if (c == 'a') {
                    stringBuilder.append("_");
                    
                }
                else{
                    stringBuilder.append(c);
                }
            }
            return stringBuilder.toString();
        }
    
    
}

