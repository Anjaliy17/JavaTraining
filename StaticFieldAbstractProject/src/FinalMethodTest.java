
public class FinalMethodTest {

	public static void main(String[] args) {
		Chess chess = new Chess();
		chess.moveKight();
		chess.moveRook();
		
//		GraphicalChess ghchess = new GraphicalChess();
//		ghchess.moveKight();
//		ghchess.moveRook();
		
//		WebGraphicalChess webchess = new WebGraphicalChess();
//		webchess.moveKight();
//		webchess.moveRook();


//		Chess chess1 = new GraphicalChess();
//		Game.upload(chess1);
	}

}

class Game{
	
	static void upload(Chess chess) {
		System.out.println("Game is being Uploading....");
	}
	
}

final class Chess {

	void moveKight() {
		System.out.println("Math moving in L shape 2.5 steps");
	}
	
	void moveRook() {
		System.out.println("Math moving horizontal/vertical bidirectional.... 1/N steps");
	}
	
}

//class GraphicalChess extends Chess {
//	
//	void moveKight() {
//		System.out.println("Graphically moving in L shape 2.5 steps");
//		
//	}
//	
//	void moveRook() {
//		System.out.println("Graphically moving horizontal/vertical bidirectional.... 1/N steps");
//	}
//	
//	
//}
//
//class WebGraphicalChess extends Chess {
//	
//	void moveKight() {
//		System.out.println("WebGraphically moving in L shape 2.5 steps");
//	}
//	
//	void moveRook() {
//		System.out.println("WebGraphically moving horizontal/vertical bidirectional.... 1/N steps");
//	}
//}
