package myProject;


public interface Communication {

	String G_Syousai = null;
	void greet(String Aisatu);



	public default void ee(String Aisatu) {
		try {
			if (Aisatu.equals("Hello") == true && this.G_Syousai.equals("上司") != true) {
				System.out.println("Hello");
			} else {
				throw new NotBeenSubmittedDocumentsException("未提出の書類が存在します");
			}
		} catch (Exception e) {
			System.out.println("――スタックトレース（ここから）――");
			e.printStackTrace();
			System.out.println("昨日締切の仕事を思い出し、愛想笑いをした");
			System.out.println("――スタックトレース（ここまで）――");
		}
		
		return ;
	}

}
