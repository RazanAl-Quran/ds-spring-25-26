
/**
 * @author Sara.Abdo
 */
public class IntArrayList {
    private int arr[];
    private int size;
    
    public IntArrayList(){
        arr = new int[5];
        size = 0;
    }
    
    public void resize(){
        int newCapcity=arr.length *2;
        int temp[]=new int[newCapcity];
        for(int i=0; i<size;i++){
            temp[i]=arr[i];
        }
        //System.arraycopy(arr, 0, temp, 0, arr.length);
        arr=temp;
    }
    
    //Insert At Last
    public void insert(int val) {
        if(size == arr.length){
            resize();
        }
        arr[size]=val;
        size++;
        
    }
    
    //remove at Last
    public int remove() {
        int deletedValue=arr[size-1];
        size--;
        return deletedValue;
    }
    public void display() {
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public int get(int index) {
        if(index<0 || index>=size){
            System.out.println("You exceed the elements");
            return -1;
        }
        return arr[index];
    }
    
 // Insert element at the beginning
    public void insertFirst(int val) {
        if (size == arr.length - 1) resize();
	    for (int i = size + 1; i > 0; i--) {
	        arr[i] = arr[i - 1];
	    }
	    arr[0] = val;
	    size++;
    }

    // Delete first element
    public void deleteFirst() {
	if (size == 0) {
	    System.out.println("List is empty!");
	    return;
	}
	for (int i = 0; i < size; i++) {
	    arr[i] = arr[i + 1];
	}
	size--;
    }    

    public int remove(int index) {
        int deletedValue=arr[index];
        for(int i=index; i<size; i++){
            arr[i]=arr[i+1];
        }
        size--;
       return deletedValue; 
    }

    public int size(){
        return size;
    }

}
