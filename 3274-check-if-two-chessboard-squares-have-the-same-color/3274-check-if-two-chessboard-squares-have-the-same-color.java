class Solution {
    public boolean checkTwoChessboards(String s1, String s2) {
        
        String a="aceg";
        String b="bdfh";

        int n1=s1.charAt(1)-'0';
        int n2=s2.charAt(1)-'0';

        boolean c1=a.contains(""+s1.charAt(0));
        boolean c2=a.contains(""+s2.charAt(0));
        boolean c3=b.contains(""+s1.charAt(0));
        boolean c4=b.contains(""+s2.charAt(0));

        String color1="";
        String color2="";

        if(n1%2!=0&&c1)
            color1="black";
        else if(n1%2!=0&&c3)
            color1="white";
        else if(n1%2==0&&c1)
            color1="white";
        else
            color1="black";

        if(n2%2!=0&&c2)
            color2="black";
        else if(n2%2!=0&&c4)
            color2="white";
        else if(n2%2==0&&c2)
            color2="white";
        else
            color2="black";

        if(color1.equals("black")&&color2.equals("black"))
            return true;
        if(color1.equals("white")&&color2.equals("white"))
            return true;
        else
            return false;
    }
}