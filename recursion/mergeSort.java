//Sort an array A using Merge Sort.
Change in the input array itself. So no need to return or print anything.
*/

public class solution {

    public static void mergeSort(int[] input){
        // Write your code here
        
        mergeSort(input,0,input.length - 1);
        
    }
    
    private static void mergeSort(int[] input, int startIndex, int endIndex){
        if(startIndex >= endIndex){
            return;
        }
        int mid = (startIndex + endIndex) / 2;
        mergeSort(input,startIndex,mid);
        mergeSort(input,mid + 1,endIndex);
        merge(input,startIndex,mid,endIndex);
    }
    
    private static void merge(int[] input,int startIndex,int mid,int endIndex){

        int n1 = mid - startIndex + 1 ;
        int n2 = endIndex - mid;
        int l[] = new int[n1];
        int r[] = new int[n2];
        int k = startIndex;
        for(int i = 0; i < n1;i++){
            l[i] = input[startIndex+i];
        }
        for(int j = 0;j< n2;j++){
            r[j] = input[mid+1+j];
        }
        int i = 0,j = 0;
        
        while(i < n1 && j < n2){
        if(l[i] <= r[j]){
            input[k] = l[i];
            i += 1;
        }
        else{
            input[k] = r[j];
            j += 1;
        }
        k += 1;
        }
        
        while ( i < n1){
            input[k] = l[i];
            i += 1;
            k +=1;
        }
        while(j < n2){
            input[k] = r[j];
            k +=1;
            j +=1;
        }
        
    }
            
        }
    

