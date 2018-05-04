public class Pinpad {

    private int[] myArray;

    public Pinpad(int sideLength) {

        int arrayLength = sideLength * sideLength;

        int[] ephemeralArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            ephemeralArray[i] = i;
        }
        myArray = ephemeralArray;

    }

    public int getArrayLength() {

        return myArray.length;
    }
}
