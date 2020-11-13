package myProject;



public class WorkplaceCommunication implements Communication {
String Group;
String G_Syousai;
//String Aisatu;

	public WorkplaceCommunication() {
	}

	public WorkplaceCommunication(String Group) {
		this.Group = Group;
	}

	public WorkplaceCommunication(String Group, String G_Syousai) {
		this.Group = Group;
		this.G_Syousai = G_Syousai;
	}

	public void greet(String Aisatu) {
		if (Aisatu.equals("Hello") == true) {
			System.out.println("Hello");
		}
		return;
	}

	public void GShandan(String Aisatu) {
		if (Aisatu.equals("Hello") == true && Group.equals("職場") == true) {
			System.out.println("Hello");
		} else {
			System.out.println("無言で目の前を通り過ぎた");
		}
		return;
	}

	public void GSShandan(String Aisatu) {
		if (Aisatu.equals("Hello") == true && Group.equals("職場") == true && G_Syousai.equals("上司") != true) {
			System.out.println("Hello");
		} else {
			System.out.println("無言で目の前を通り過ぎた");
		}
		return;
	}
	


}
