import java.util.ArrayList;

public class Groupe {

  ArrayList<Personnels> next;
  
  Personnels premier;

  public Groupe(Personnels persAvant) {
      premier = persAvant;
      next = new  ArrayList<Personnels>();
  }
  
  
  
  private class GroupeIterator implements Iterator<Object>{
      int index =0;
      
      public GroupeIterator() {
          
        next.add(premier);
          
          int i =0;
          
          while(i < next.size()) {
              if(next.get(i) instanceof CompositePersonnel) {
                  for(Personnels p : next.get(i).getPersonnels()) {
                    next.add(p);
                  }
              }
              i++;
          }
          
      }
      
      public boolean hasNext() {
          if(index < next.size()) {
              return true;
          }
          
          return false;
      }

      public Personnels next() {
        Personnels gp = next.get(index);
          index++;
          return gp;
      }
  }
  
  public Iterator<?> getIterator() {
      return new GroupeIterator();
  }

  
  
  
}
