class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        // Note: using same logic from first pascal problem with some MODs

        List<List<Integer>> triangle = new ArrayList<>();
        // Starts the triangle
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        // MOD 0.5: "Base case"
        if (rowIndex == 0) return firstRow;

        // MOD 1: Build the triangle up to the desired rowIndex
        int numRows = rowIndex + 1;
        
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

        // MOD 2: Return the last element (row) in the triangle list
        return triangle.get(triangle.size() - 1);


    }
}
