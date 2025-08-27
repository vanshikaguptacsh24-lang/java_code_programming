class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int first = firstOcc(arr,x);
        int last = lastOcc(arr,x);
        
        ArrayList<Integer> res = new ArrayList<>();
        res.add(first);
        res.add(last);
        
        return res;
    }
    int firstOcc(int arr[], int target)
    {
        int left=0;
        int right = arr.length-1;
        
        while (left <= right)
        {
            int mid = left+(right-left)/2;
            
            if (arr[mid]== target)
            {
                left = mid;
                right = mid-1;
                
            }else if (arr[mid]< target)
            {
                left = mid +1;
                
            }
            
        }
        return -1;
    }
    int lastOcc(int arr[], int target)
    {
        int left=0;
        int right = arr.length-1;
        
        while (left <= right)
        {
            int mid = left+(right-left)/2;
            
            if (arr[mid]== target)
            {
                left = mid;
                right = mid-1;
                
            }else if (arr[mid]< target)
            {
                right = mid -1;
                
            }
            
        }
        return -1;
        
    }
}
