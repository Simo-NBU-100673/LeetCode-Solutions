public class Solution {
    public static String addBinary(String a, String b) {
        int bigger = Math.max(a.length(), b.length());

        StringBuilder result = new StringBuilder();
        String carry="";

        //Makes tha pad with Zero's so that both a and b are the same length
        if (a.length() < bigger) {
            a = String.format("%0" + (bigger - a.length()) + "d%s", 0, a);
        } else if (b.length() < bigger) {
            b = String.format("%0" + (bigger - b.length()) + "d%s", 0, b);
        }

//        System.out.println(a);
//        System.out.println(b);

        for(int i=bigger-1;i>=0;i--){
            if((a.charAt(i)=='1' && b.charAt(i)=='0')||(a.charAt(i)=='0' && b.charAt(i)=='1')){
//                System.out.println("1 && 0");
                if(carry.equals("")){
                    result.append('1');
                }else {
                    result.append('0');
                    carry="1";
                }
            }else if(a.charAt(i)=='0' && b.charAt(i)=='0'){
//                System.out.println("0 && 0");
                if(carry.equals("")){
                    result.append('0');
                }else {
                    result.append('1');
                    carry="";
                }
            }else if(a.charAt(i)=='1' && b.charAt(i)=='1'){
//                System.out.println("1 && 1");
                if(carry.equals("")){
                    result.append('0');
                }else {
                    result.append('1');
                }
                carry="1";
            }
//            System.out.println(i+": "+carry);
//            System.out.println(result);
//            System.out.println();
        }
        if(!carry.equals("")){
            result.append(carry);
        }

        return String.valueOf(result.reverse());
    }

    public static String addBinary2(String a, String b){
        StringBuilder result = new StringBuilder();
        String carry="";

        //CAN BE IMPROVED HERE TO MAKE THE CODE MORE EFFICIENT!
        if (a.length() < b.length()) {
            a = String.format("%0" + (b.length() - a.length()) + "d%s", 0, a);
        } else if (a.length() > b.length()){
            b = String.format("%0" + (a.length() - b.length()) + "d%s", 0, b);
        }

        for(int i=Math.max(a.length(), b.length())-1;i>=0;i--){
            if((a.charAt(i)=='1' && b.charAt(i)=='0')||(a.charAt(i)=='0' && b.charAt(i)=='1')){
                if(carry.equals("")){
                    result.append('1');
                }else {
                    result.append('0');
                    carry="1";
                }
            }else if(a.charAt(i)=='0' && b.charAt(i)=='0'){
                if(carry.equals("")){
                    result.append('0');
                }else {
                    result.append('1');
                    carry="";
                }
            }else if(a.charAt(i)=='1' && b.charAt(i)=='1'){
                if(carry.equals("")){
                    result.append('0');
                }else {
                    result.append('1');
                }
                carry="1";
            }
        }

        result.append(carry);

        return String.valueOf(result.reverse());
    }

    //Fastest solution
    public static String addBinary3(String a, String b){
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder result = new StringBuilder();

        while(i>=0 || j>=0) {
            int a1=(i>=0) ? Character.getNumericValue(a.charAt(i--)) : 0;
            int b1=(j>=0) ? Character.getNumericValue(b.charAt(j--)) : 0;
            int sum=a1+b1+carry;
            carry=(sum==3 || sum==2) ? 1:0;
            result.append((sum==1 || sum==3) ? 1:0);
        }
        if(carry>0) result.append(1);

        return result.reverse().toString();
    }
}