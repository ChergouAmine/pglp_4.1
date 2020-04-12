import java.util.ArrayList;


public class Personnel implements Personnels{
  
  private String nom;
  private String prenom;
  private String fonction;
  private java.time.LocalDateTime date_naissance;
  private ArrayList<Integer> num_tel;
  
  public static class Builder{
      private String nom;
      private String prenom;
      private String fonction = "fonction";
      private java.time.LocalDateTime date_naissance;
      private ArrayList<Integer> num_tel;
      
      public Builder(String n, String p,java.time.LocalDateTime date_n) {
          nom = n;
          prenom = p;
          date_naissance = date_n;
          num_tel = new ArrayList<Integer>();
      }
      
      public Builder function(String f) {
          this.fonction = f;
          return this;
      }
      
      public Builder add_tel(int t) {
          this.num_tel.add(t);
          return this;
      }
      
      public Personnels build() {
          return new Personnel(this);
      }
  }
  public Personnel(Builder builder) {
      nom = builder.nom;
      prenom = builder.prenom;
      fonction = builder.fonction;
      num_tel = builder.num_tel;
      date_naissance = builder.date_naissance;
  }
  
  public void print() {
      System.out.println("nom : "+nom+"\nprenom : "+prenom+"\nfonction : "+fonction+"\nnuméro : "+num_tel+"\n Date de Naissance : "+date_naissance);
  }

  public ArrayList<Personnels> getPersonnels() {
    // TODO Auto-generated method stub
    return null;
  }



}
