class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        // "Base case"
        if (numRows == 0) return triangle;
    
        // Starts the triangle
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        // Builds next row. i = 1 since we need to always have a previous row to work from
        for (int i = 1; i < numRows; ++i) {
            // Accesses previous row
            List<Integer> prevRow = triangle.get(i - 1);
            // Creating the current row to build
            List<Integer> currRow = new ArrayList<>();

            // Adds starting 1
            currRow.add(1);

            // Build the middle of the current row
            for(int j = 1; j < prevRow.size(); ++j) {
                // Using the data from the previous row to build the current row
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Adds ending 1
            currRow.add(1);

            triangle.add(currRow);

        }

        return triangle;

    }
}
