class Solution {
    public int largestRectangleArea(int[] heights) {
     Stack<Integer> stack = new Stack<>();
     int n=heights.length;
     int max=Integer.MIN_VALUE;
     for(int i=0; i<=n; i++){
        int element = (i==n) ? 0 : heights[i];
        while(!stack.isEmpty() && heights[stack.peek()]>element){
            int h=heights[stack.pop()];
            int ps =(stack.isEmpty() ? -1 : stack.peek());
            int w=i-ps-1;
            max=Math.max(max,h*w);

        }
        stack.push(i);
     }
       return (max==Integer.MIN_VALUE) ? 0:max; 
    }
}