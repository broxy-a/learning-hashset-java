import java.util.HashSet;

public class App {

  // Хранит имена избирателей, которые уже голосовали
  private static HashSet<String> voters = new HashSet<String>();

  // Проверяет, голосовал человек или нет. Если голосует впервые — добавляет в список и выводит сообщение.
public static void checkVoter(String name) {
    if (voters.contains(name)) {  
        System.out.println("Этот человек уже голосовал");  
    } else {
        voters.add(name);
        System.out.println("Этот человек голосует впервые");
    }
}

  // Тест программы и точка входа в программу.
public static void main(String[] args) {   

    // Проверяем избирателей. Один из них голосует дважды
    checkVoter("Artorias"); 
    checkVoter("Aiku"); 
    checkVoter("Artorias");
}

}
