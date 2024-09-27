package com.csplusplus;

public class Unit8 {

    
    public static int sumOfElements(int[][] array) {
        
    	int sum = 0;
    	for (int row = 0; row < array.length; row++ ) {
    		
    		for (int column = 0; column < array[row].length; column++) {
    			sum += array[row][column];
    		}
    		
    	}
        return sum;  
        
    }

    
    public static int countOccurrences(int[][] array, int value) {
        
    	int count = 0;
    	for (int row = 0; row < array.length; row++) {
    		
    		for (int column = 0; column < array[row].length; column++) {
    			
    			if (array[row][column] == value) {
    				count++;
    			}
    			
    		}
    		
    	}
        return count;  
    }

    
    public static int findMax(int[][] array) {
        
    	
    	int currentMax = array[0][0];
    	
    	for (int row = 0; row < array.length; row++) {
    		
    		for (int column = 0; column < array[row].length; column++) {
    			if (array[row][column] > currentMax) {
    				currentMax = array[row][column];
    			}
    			    			
    		}
    		
    	}

    	
        return currentMax;  
    }

    
    public static void reverseRows(int[][] array) {
    	
    	int[][] tempArray = new int[array.length][array[0].length];
    	int currentRow = 0;
    	
    	
    	for (int row = 0; row < array.length; row++) {
    		
    		for (int column = 0; column < array[row].length; column++) {
    			tempArray[row][column] = array[row][column];    			
    		}
    		
    	}
    	
    	
    	for (int rows = tempArray.length - 1; rows >= 0; rows--) {
    		
    		
    		for(int columns = 0; columns < tempArray[rows].length; columns++) {
    			array[currentRow][columns] = tempArray[rows][columns];
    		}
    		currentRow++;
    		
    	}
    }

    
    public static int[][] transpose(int[][] array) {
        
    	
    	int[][] newArray = new int[array[0].length][array.length];

    	for (int row = 0; row < array.length; row++) {
    		
    		for (int column = 0; column < array[row].length; column++) {
    			newArray[column][row] = array[row][column];    			
    		}
    		
    	}
    
        return newArray;  
    }

    // 6. Method to fill a 2D array with random integers
    // Instructions: Create a 2D array of size numRows x numCols and fill it with random integers between min and max.
    public static int[][] fillWithRandom(int min, int max, int numRows, int numCols) {
        // TODO: Implement this method
    	
    	int[][] array = new int[numRows][numCols];
    	
    	for (int row = 0; row < array.length; row++) {
    		
    		for (int column = 0; column < array[row].length; column++) {
    			array[row][column] = (int)((Math.random() * max + min));		
    		}
    		// Math.random() + 2
    	}
    	
        return array;  // Placeholder return value
    }
}