class Solution
{   public void helper(String s, String tempAns, int index, List<String> ll) {
    
        if (s.length() == index) {
            if (tempAns.isEmpty()) {
                return;
            }
            ll.add(tempAns);
            return;
        }
        helper(s,tempAns+s.charAt(index),index+1,ll);
        helper(s,tempAns,index+1,ll);
    }
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String> ans = new ArrayList<>();
        helper(s,"",0,ans);
        Collections.sort(ans);
        return ans;
    }
}
