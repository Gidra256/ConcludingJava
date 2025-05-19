

public class TestArray {
    int[] scores = new int[5];
    
    public static void main(String[] args){
        int[] scores = {90, 50, 65, 40, 80}; // array initialization
        System.out.println(scores[0]+"\t=\tThis is out side the loop\n"); // accessing array elements
        scores[4] = 30;
        //looping arrays
        for(int i = 0; i < scores.length; i++){
            System.out.println(scores[i]);
        }
    }

}
