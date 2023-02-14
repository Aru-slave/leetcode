class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] isVisited = new boolean[arr.length];
        return dfs(arr,start,isVisited);
    }
    public boolean dfs(int[] arr, int start,boolean[] isVisited){
        if(start > arr.length - 1) return false;
        if(start < 0) return false;
        if(arr[start] == 0) return true;
        if(isVisited[start]) return false;
        isVisited[start] = true;
        return dfs(arr,start - arr[start],isVisited) || dfs(arr,start + arr[start],isVisited);
        
    }
}