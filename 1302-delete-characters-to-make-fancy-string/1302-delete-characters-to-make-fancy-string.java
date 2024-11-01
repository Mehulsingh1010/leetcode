class Solution {
    public String makeFancyString(String s) {
    StringBuilder ans = new StringBuilder();
    int n=s.length();

    for(int i=0;i<n;i++){
        int anslength=ans.length();
        if(anslength>=2 && ans.charAt(anslength-1)==s.charAt(i) && ans.charAt(anslength - 2) == s.charAt(i) ){
            continue;
        }
        ans.append(s.charAt(i));

    }
    return ans.toString();
    }
}