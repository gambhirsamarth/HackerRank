public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    // Write your code here
        ArrayList<Integer> outputArray =  new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> tempArray = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++) tempArray.add(new ArrayList<Integer>());
        int lastAnswer = 0; // int n = 2;
        for (List<Integer> query: queries) {
            
            if (query.get(0) == 1) { // Query 1:
                int idx = (query.get(1) ^ lastAnswer) % n;
                // System.out.println(">> Query 1: idx = " + idx);
                // if (tempArray.size()-1 > idx) {
                    tempArray.get(idx).add(query.get(2));
                // } else {
                    
                // }
                
            } else { // Query 2:
                int idx = (query.get(1) ^ lastAnswer) % n;
                lastAnswer =  tempArray.get(idx).get(query.get(2) % tempArray.get(idx).size());
                outputArray.add(lastAnswer);
                
            }
            
        }
        
        
        return outputArray;

    }
