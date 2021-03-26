
public class Main {

	public static void main(String[] args) {
		Employe testEmp = new Employe("jhon", (float) 9.81, (float) 12.4, 35);
		
		testEmp.addNbHeureSup(4);
		
		float testSalaire = testEmp.getSalaire();
		System.out.println("EMployé salaire ==> " + testSalaire);
		
		Commercial Com1 = new Commercial("Paul", 2800);
		Com1.addChiffreAffaire(100);
		float Com1Salaire = Com1.getSalaire();
		System.out.println("Com1 salaire ==> " + Com1Salaire);
		
		Commercial Com2 = new Commercial("jaque", 3000);
		Com2.addChiffreAffaire(2500);
		float Com2Salaire = Com2.getSalaire();
		System.out.println("Com2 salaire ==> " + Com2Salaire);
		
		Directeur Dir = Directeur.makeNewDir("JP", 5000);
		float DirSalaire = Dir.getSalaire();
		System.out.println("Com2 salaire ==> " + DirSalaire);
		
		Directeur DirCrashTest = Directeur.makeNewDir("JP", 5000);
		if(DirCrashTest == null) {
			System.out.println("Pas de second dir");
		} else {
			System.out.println("Bruh");
		}
	}

}
