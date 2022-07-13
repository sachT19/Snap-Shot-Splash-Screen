public class SnapShot
{
    public static void main(String[] args)
    {
      
        String[] welcome = {"Welcome", "to", "the snap shot", "app!"};
        for (int i = 0; i <= welcome.length - 1; i++){
            System.out.println(welcome[i]);
        }
        
        System.out.println();
        
        welcome[0] = "Upgrade";
        welcome[3] = "premium app!";
        for (int i = 0; i <= welcome.length - 1; i++){
            System.out.println(welcome[i]);
        }
    }
}
