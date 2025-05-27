//lines 40-45 explanation: the first loop starts at the first element, and copies every array position in a new array 
//called temporary until it reaches smallest_index position. The second loop starts 1 with element after the 
//smallest_index position and copies every array position also into temporary until it reaches the end of arr[]. 
//This effectively "deletes" the smallest_index position since it is the only element not included in the newly
// created temporary array.
public class Realistic{
public static void add(int value){
    int[] tempArr=new int[arr.length+1];
    for (int index = 0; index < array.length; index++) {
        tempArr[i]=arr[i];
    }
    tempArr[arr.length]=value;
    arr=tempArr;
}
}