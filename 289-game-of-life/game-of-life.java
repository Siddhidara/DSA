class Solution {
    public void gameOfLife(int[][] board) {
    int[][] dirs={{-1,-1},{1,1},{-1,1},{1,-1},{1,0},{0,1},{-1,0},{0,-1}};
    int[][] nums=new int[board.length][board[0].length];
    for(int i=0;i<board.length;i++)
    {
        for(int j=0;j<board[i].length;j++)
        {
            int count=0;
            for(int k=0;k<dirs.length;k++)
            {
                int xidx=i+dirs[k][0];
                int yidx=j+dirs[k][1];
                if(xidx<0 ||yidx<0||xidx>board.length-1||yidx>board[i].length-1)
                {
                    continue;
                }
                count+=board[xidx][yidx];
            }
            
                if(count<2||count>3)
                {
                    nums[i][j]=0;
                }
                if(count==3)
                {
                    nums[i][j]=1;
                }
                if(count==2)
                {
                    nums[i][j]=board[i][j];
                }
        }
    }
    for(int i=0;i<board.length;i++)
    {
        board[i]=nums[i].clone();
    }
    }
} 