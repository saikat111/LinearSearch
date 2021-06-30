public class LinearSearch {
    public static void main(String args[]){
        int [] arr = {50,100,60,120};
        int key = 120;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println("Data found " + "in index number = " + i);
                return;
            }
            else {
                System.out.println("Data not found" + "in index number = " + i);
            }
        }
    }
}
