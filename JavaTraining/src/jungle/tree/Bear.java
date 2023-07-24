package jungle.tree;
import jungle.cave.Tiger;

public class Bear { //NON-CHILD
	void huntHoney() {
		Tiger tiger = new Tiger();
		
	}
	
	void defaultMethodD() {  // available to default package
		System.out.println("Tiger is defaultMethodD..");		
	}

}

class WhiteTiger extends Tiger {
	
	void roaming(Tiger tiger) {
		Bear bear = new Bear();
		bear.huntHoney();
		
//		tiger.defaultMethodD();
//		tiger.protectedMethodB();  //Tiger is not WhiteTiger
//		tiger.privateMethodA();  //Never
//		tiger.publicMethodC();  //Always
	}
	
	void roaming() {
		
//		super.defaultMethodD();
//		super.protectedMethodB();  //because of entends
//		super.privateMethodA();  //Never
//		super.publicMethodC();  //Always
		
		Tiger tiger = new Tiger();
//		tiger.defaultMethodD();
//		tiger.protectedMethodB();  //same cave
//		tiger.privateMethodA();  //Never-ever
//		tiger.publicMethodC();
	}
}
