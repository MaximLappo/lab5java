import java.util.Scanner;


public class Main{
      
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        SortString input = new SortString(sc.nextLine());
        input.SortPrint();
         
    }
}
class SortString{
     
    String text;
    String [] Massive;
    String [] AMassive;
    String [] OtherMassive;
    char[] vowels={'а','е','у','и','і','о'};

    SortString(String n)
    {
        this.text = n;
        this.Massive = new String [n.length()];
        this.AMassive = new String [n.length()];
        this.OtherMassive = new String [n.length()];
    }
    void SortPrint(){
        int j = 0;
        for (String retval : text.split(" ")) {
            Massive[j] = retval;
            j++;
        }
        int o = 0;
        int f = 0;
        for (int i=0;i<j;i++){
            for(char c:vowels){
            if(Massive[i].charAt(0)==c){
                AMassive[o] = Massive[i];
                o++;
            }
        }
        if (o != 0){
            if (Massive[i] != AMassive[o-1]){
                 OtherMassive[f] = Massive[i];
                 f++;
        }
        }
        else {
            if (Massive[i] != AMassive[o]){
                 OtherMassive[f] = Massive[i];
                 f++;
        }
        }
        }
       int i = 0;
       int n = o;
       while (i < n - 1) {
            if (AMassive[i].charAt(1) > AMassive[i + 1].charAt(1)) {
                String t = AMassive[i];
                AMassive[i] = AMassive[i + 1];
                AMassive[i + 1] = t;
                i = 0;
            } else i++;
        }
        for (i =0;i<o;i++)
        System.out.print(AMassive[i] + " ");
        for (i=0;i<f;i++)
        System.out.print(OtherMassive[i] + " ");
    }
}