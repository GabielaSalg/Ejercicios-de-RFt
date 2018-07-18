
import resources.Script2Helper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author DELL
 */
public class Script2 extends Script2Helper
{
	/**
	 * Script Name   : <b>Script2</b>
	 * Generated     : <b>18/07/2018 15:34:26</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2018/07/18
	 * @author DELL
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		placeOrder().click();
		
		// Frame: Member Logon
		newCustomer().click();
		ok().click();
		
		// Frame: Place an Order
		name().click(atPoint(50,0));
		placeAnOrder().inputChars("gaby");
		creditCombo().click();
		creditCombo().click(atText("Mastercard"));
		quantity().click(atPoint(80,11));
		placeAnOrder().inputChars("8");
		street().click(atPoint(83,14));
		placeAnOrder().inputChars("jacan");
		cityStateZip().click(atPoint(45,7));
		placeOrder2().click();
		
		// 
		aceptar().click();
		
		// Frame: Place an Order
		cityStateZip().click(atPoint(92,11));
		placeAnOrder().inputChars("mex");
		phone().click(atPoint(56,11));
		placeAnOrder().inputChars("12356");
		placeOrder2().click();
		
		// 
		aceptar().click();
		
		// Frame: Place an Order
		cardNumberIncludeTheSpaces().click(atPoint(106,9));
		placeAnOrder().inputChars("gjh");
		expirationDate().click(atPoint(40,9));
		placeAnOrder().inputChars("kjgjy");
		placeOrder2().click();
		
		// 
		aceptar2().click();
	}
}

