import java.util.Arrays;

public class MaximumUnitsOnTruck {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        // Sort the boxTypes array based on the number of units per box in descending order
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));

        int maxUnits = 0;

        for (int i = 0; i < boxTypes.length && truckSize > 0; i++) {
            // Determine the number of boxes to be loaded from the current type
            int boxesToLoad = Math.min(truckSize, boxTypes[i][0]);

            // Calculate the total units from the current type of boxes
            maxUnits += boxesToLoad * boxTypes[i][1];

            // Update the remaining truckSize
            truckSize -= boxesToLoad;
        }

        return maxUnits;
    }

    public static void main(String[] args) {
        int[][] boxTypes = {{1, 3}, {2, 2}, {3, 1}};
        int truckSize = 4;
        System.out.println("Maximum units on truck: " + maximumUnits(boxTypes, truckSize)); // Output: 8

        //{{1,3}, {2,2}, {3,1}}
        //trucksize = 4, boxes = 1 - > 1*3 = 3 maxunits  =3, trucksize= 4-1 = 3
        //2,3, boxes = 2 - > 2*2 = 4, maxunits = 3+4 = 7, trucksize = 3-2 = 1
        //3,1 boxes  =1 -> 1*1 = 1, maxunits = 7 + 1 = 8, trucksize = 1 - 1 = 0
        //type1 - 1,3- 3, type2 - 2,2 - 4, type3- 1,1 - 1
        // 3 + 4 + 1 = 8
    }
}
