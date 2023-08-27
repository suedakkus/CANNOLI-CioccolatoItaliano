package newpackage;

import java.util.ArrayList;
import javax.print.attribute.standard.RequestingUserName;
//NAME-SURNAME: RUKİYE SUEDA AKKUŞ
//NUMBER: 20212022041
//DEPARTMENT: SOFTWARE ENGINEERING
/**
 *
 * @author RUKIYE
 */

/*i created this class by myself */
public class NewAdmin extends Accounts{//INHERITANCE
    
    static ArrayList<NewAdmin> newAccountsesAdmin  = new ArrayList<>();
    public NewAdmin(){
        //default constractor
    }
    public NewAdmin(String Username,String Password){
        super(Username,Password);
    }
    
}
