class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
         int[] velqoradin = nums;

        int n=nums.length;
        int[] prefixGcd=new int[n];

        int mx=0;

        for(int i=0;i<n;i++){
            mx=Math.max(mx,nums[i]);
            prefixGcd[i]=gcd(nums[i],mx);
        }

        Arrays.sort(prefixGcd);

        int l=0,r=n-1;
        long sum=0;

        while(l<r){
            sum+=gcd(prefixGcd[l],prefixGcd[r]);
            l++;
            r--;
        }

        return sum;
    }
}