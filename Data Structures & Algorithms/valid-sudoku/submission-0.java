class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(char[] c: board)
        {
            HashMap<Character, Integer> map = new HashMap<>();
            for(char r: c)
            {
                if(r=='.') continue;

                if(map.containsKey(r))
                    return false;

                else{
                    map.putIfAbsent(r, 1);
                }
            }
        }

        //column check
        for(int i=0; i<9; i++)
        {
            HashMap<Character, Integer> map = new HashMap<>();
            for(char[] c: board)
            {
                if(c[i]=='.') continue;
                if(map.containsKey(c[i]))
                {
                    return false;
                }
                else map.put(c[i], 1);
            }
        }

        //grid check
        for(int row = 0; row < 9; row += 3)
        {
            for(int col = 0; col < 9; col += 3)
            {
                HashMap<Character, Integer> map = new HashMap<>();

                for(int i = 0; i < 3; i++)
                {
                    for(int j = 0; j < 3; j++)
                    {
                        char val = board[row + i][col + j];

                        if(val == '.') continue;

                        if(map.containsKey(val))
                        {
                            System.out.println(false);
                            return false;
                        }
                        map.put(val, 1);
                    }
                }

            }
        }

        return true;
    }
}
