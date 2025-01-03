class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[]= new int[nums.length*2];
        int k = 0;
        for(int i=0; i<ans.length; i++){
            ans[i] = nums[k];
            k++;
            if(k == (nums.length))
                k = 0;
        }

        return ans;

    }
}
