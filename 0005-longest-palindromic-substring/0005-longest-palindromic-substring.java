class Solution {
   public String longestPalindrome(String s) {
	   int n = s.length();
	   char[] c = s.toCharArray();
	   Boolean[][] dp = new Boolean[n][n];
	   int start, end;
	   start = end = 0;
	   for (int i= n-1; i>= 0; i--) {
		   for (int j = i; j<n; j++) {
               if (j-i < 3) { //base case 
                 dp[i][j] = (c[i] == c[j]); 
               } else {
                  dp[i][j] = (c[i] == c[j] && dp[i+1][j-1]);
               }
			   
			   if (dp[i][j] && (end-start <= j-i)) {
				   start = i;
				   end = j;
			   }
		   }
	   }
	   return s.substring(start, end+1);
   }
}