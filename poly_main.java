//this is second concept of polymerphism.- it says we can pass either super or subclass
//object to final class-method and access any component of those classes in final class
//here poly1 and poly2 are subclass ; poly_super is father of those two
//poly_final is accessing subclass and superclass by having argument as "CLASS OBJECT"
//poly main is just header class to invoke those final class


package poly_concept2;

public class poly_main {

	public static void main(String args[]){
		
		//now we need objects of final; super and subclass , so define as shown
		poly_final objfinal = new poly_final();
		poly_super objsuper = new poly_super();
		poly1_supp obj1 = new poly1_supp();
		
		
		objfinal.getfinalname(objsuper);
		//below obj1 is inherited from super so it canbe also be passed as object even if final has class
		//specified as super in its argument
		objfinal.getfinalname(obj1);
		
	}
	
}
