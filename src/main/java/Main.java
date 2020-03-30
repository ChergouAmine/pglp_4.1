import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		
		/*Personnel p1= new Personnel.Builder("CHERGOU","Amine").build();
		Personnel p2= new Personnel.Builder("CHERGOU2","Amine2").build();
		
		CompositePersonnel c=new CompositePersonnel();
		
		c.add(p1);
		c.add(p2);
		
		c.print();
*/
	  
	  Personnels p1 = new Personnel
          .Builder("amine", "chergou", LocalDateTime.now())
          .add_tel(0666666666)
          .function("directeur")
          .build();
	  Personnels p2 = new Personnel
          .Builder("aminee", "chergouu", LocalDateTime.now())
          .add_tel(0666666666)
          .function("pdg")
          .build();
	  Personnels p3 = new Personnel
          .Builder("amineee", "chergouuu", LocalDateTime.now())
          .add_tel(0666666666)
          .function("chef d'équipe")
          .build();
	  Personnels p4 = new Personnel
          .Builder("amineeee", "chergouuuu", LocalDateTime.now())
          .add_tel(0666666666)
          .function("programmeur")
          .build();
	  Personnels p5 = new Personnel
          .Builder("amineeeee", "chergouuuuu", LocalDateTime.now())
          .add_tel(0666666666)
          .function("développeur")
          .build();

  
	  CompositePersonnel g1 = new CompositePersonnel(1);
	  g1.add(p1);
	  g1.add(p2);
	  g1.add(p3);
	  CompositePersonnel g2 = new CompositePersonnel(2);
	  g2.add(p4);
	  g2.add(p5);
	  CompositePersonnel g3 = new CompositePersonnel(3);
	  g3.add(g1);
	  g3.add(g2);
	}

}
