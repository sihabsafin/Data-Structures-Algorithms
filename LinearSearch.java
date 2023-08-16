public class Test{
    public static int binarySearch(int numbers[],int key){
    int start=0; int end=numbers.length-1;
    while(start<=end){
    int mid=(start+end)/2;
    //Comparisons
    if(numbers[mid]==key){ //found
    return mid;
    }
    if(numbers[mid]<key){ //right
    start=mid+1;
    }else{   //left
    end=mid-1;
    }
    }
    return -1;
    }
    public static void main(String args[]){
    int numbers[]={14,25,48,29,59,90,44,85,19,28};
    int key=85;
    System.out.println("The Position is:"+binarySearch(numbers,key));
    }
}
