import java.util.HashSet;

public class App {
  private static HashSet<String> voters = new HashSet<String>();
public static void checkVoter(String name) {
    if (voters.contains(name)) {  
        System.out.println("Этот человек уже голосовал");  
    } else {
        voters.add(name);
        System.out.println("Этот человек голосует впервые");
    }
}
public static void main(String[] args) {   
    checkVoter("Artorias"); 
    checkVoter("Aiku"); 
    checkVoter("Artorias");
}

}
