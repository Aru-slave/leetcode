class Solution {
    public int passThePillow(int n, int time) {
        int timeTakenForOnePass=n-1;
        int totalPasses=time/timeTakenForOnePass;
        int rem=time%timeTakenForOnePass;
        return totalPasses%2==0?rem+1:n-rem;
    }
}