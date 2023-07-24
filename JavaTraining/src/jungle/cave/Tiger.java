package jungle.cave;

import jungle.tree.Bear;

public class Tiger {
	private void privateMethodA() {  
		System.out.println("Tiger is privateMethodA...");
	}
	
	protected void privateMethodB() {
		System.out.println("Tiger is protectedMethodB...");
	}
	
    public void privateMethodC() {
		System.out.println("Tiger is publicMethodC...");
	}

    void privateMethodD() {
    	System.out.println("Tiger is defaultMethodD...");
    }
}


class WhiteTiger extends Tiger {
	
	void roaming(Tiger tiger) {
		Bear bear = new Bear();
//	bear.huntHoney();
		
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
