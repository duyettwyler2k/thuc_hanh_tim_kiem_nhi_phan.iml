public class BinarySearch {
    static int[] list={1,2,4,432,345};
    public static int binarySearch(int[]list,int key){
        int left=0;
        int right=list.length-1;
         do{
             int mid=(left+right)/2;
             if(key==list[mid]){
                 return mid;
             } else if(key>list[mid]){
                 left=mid+1;
             } else {
                 right=mid-1;
             }
         } while (left<=right);
         return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,1));
        System.out.println(binarySearch(list,4));
        System.out.println(binarySearch(list,432));
        System.out.println(binarySearch(list,345));
    }
}
