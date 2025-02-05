public class check_stringSwap_equals {
    class Solution {
        public boolean areAlmostEqual(String s1, String s2) {
            if(s1.equals(s2)) return true;
            int c=0,fm=-1,sm=-1;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    c++;
                    if(c>2) return false;
                    if(fm==-1) fm=i;
                    else sm=i;
                }
            }
            return c==2 && s1.charAt(fm)==s2.charAt(sm) && s1.charAt(sm)==s2.charAt(fm);
        }
    }
}
