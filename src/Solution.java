import java.util.Stack;

public class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> mystack=new Stack<>();
        int i=0;
        for (int temp : pushed)
        {
            mystack.push(temp);
            while(!mystack.isEmpty())
            {
                if (mystack.peek()==popped[i])
                {
                    i++;
                    mystack.pop();
                }
                else
                    break;

            }

        }
        if (!mystack.isEmpty())
            return false;
        return true;
    }
}
