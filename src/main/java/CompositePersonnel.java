import java.awt.List;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class CompositePersonnel implements Personnels{
	
  int id;
  public ArrayList<Personnels> personnes = new ArrayList<Personnels>();
  
  
  public CompositePersonnel(int i) {
      id = i;
  }
  
  public ArrayList<Personnels> getPersonnels(){
      return personnes;
  }
  public void print() {
          System.out.println(id);
  }
  
  public void add(Personnels groupe) {
      personnes.add(groupe);
  }
}
