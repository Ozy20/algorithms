
package laptask3;

/**
 *
 * @author ozzxx
 */
public class LapTask3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int mas_position(int low,int high,double[]s){
        int position;
        if(low==high)
            return low;
        else{
            position=mas_position(low+1,high,s);
            if(s[low]>s[position])
                position=low;
            return position;
        }
        
        
    }
}
