import java.util.ArrayList;
import java.util.List;

class pascaltriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        sublist.add(1);  // adding initial value of 1 of the top of the triangle to the sublist
        ans.add(sublist); // init answer by sublist val 1 so as to avoid later issues of the 1st row 0 index
        int row = 1; //initiliasing row as 1
        while (row < numRows) { 
            List<Integer> newlist = new ArrayList<>();
            List<Integer> prevlist = ans.get(row - 1); // storing value of previous rows
            for (int i = 0; i <= row; i++) { // loop runs row+1 times, from 0 index (1st element) till the row number across the column of 1 row of the triangle. <=row is for checking the i<row condition of the right value below, else it will be out of bound
                int leftval = i >= 1 ? prevlist.get(i - 1) : 0; // checking boundary condition of left and right, for left if index is 0 i.e. no left val
                int rightval = i < row ? prevlist.get(i) : 0; // for right boundary if index is = row number(i.e. number of elements) then no right val
                newlist.add(leftval + rightval); // adding left and right val for element of pascals triangle
            }
            ans.add(newlist);
            row++;
        }
        return ans;

    }
}
