class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] arr = my_string.split("");
        
        for(String a : arr){
            answer += Integer.parseInt(a);
           
        }
        return answer;
    }
}