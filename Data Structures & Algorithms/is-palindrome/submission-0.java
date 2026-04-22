class Solution {
    public boolean isPalindrome(String s) {
        String a = s.toLowerCase();

        System.out.println(a);
        boolean fin = true;

        int i=0, j=a.length()-1;
    
        while(i<=j)
        {
            if(Character.isLetterOrDigit(a.charAt(i)) && Character.isLetterOrDigit(a.charAt(j)))
            {
                if(a.charAt(i)==a.charAt(j))
                {
                    i++;
                    j--;
                    continue;
                }

                else{
                    fin = false;
                    System.out.println(fin);
                    return fin;
                }
            }

            else if(!Character.isLetterOrDigit(a.charAt(i)))
            {
                i++;
            }

            else{
                j--;
            }
        }

        return fin;
    }
}
