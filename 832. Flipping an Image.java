class Solution {
    public int[][] flipAndInvertImage(int[][] image) 
    {
        
         for(int i=0; i < image.length; i++) 
         {
            int[][] imageCopy = new int[image.length][];
            imageCopy[i] = image[i].clone();
             
            for(int j=0; j < image[i].length; j++) 
            {
                image[i][j] = imageCopy[i][imageCopy[i].length - j - 1]; 
                if(image[i][j] == 1) {
					image[i][j] = 0;
				} else {
					image[i][j] = 1;
				}                                                
                
            }
         }
        return image;
    }
}
