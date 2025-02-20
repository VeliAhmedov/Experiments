package Phase4.array;
public class ArrayClassPrint {
    public void arrayPrint(int arr []){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public void array2DPrint(int arr [][]){
        for (int i = 0; i <arr.length; i++){
            for (int j = 0; j <arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
