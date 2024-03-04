package HashMaP;

import java.util.HashMap;

public class HashMapLogin {

    public void doLogin(String role) throws Exception {
        System.out.println("logged in with " + (role));
        String userName = role.split(":")[0];
        String passWord = role.split(":")[1];
        System.out.println("userName is " + userName);
        System.out.println("passWord is " + passWord);
    }


    public String getUserCred(String role) throws Exception {
        if (getUserMap().containsKey(role)) {
            return getUserMap().get(role);
        } else {
            throw new Exception("Role not found ");
        }


    }

    public HashMap<String, String> getUserMap() {
        HashMap<String, String> emp1 = new HashMap<>();
        emp1.put("admin", "Ayesha:Ayesha123");
        emp1.put("user", "bella:bella123");
        emp1.put("seller", "billu:billu123");
        emp1.put("student", "elmaz:elmaz123");
        emp1.put("partner", "fahad:fahad123");
        emp1.put("staff", "Fahad:fahad123");
        emp1.put("student0", "Ali:ali123");
        emp1.put("student1", "vipra:vipra123");
        emp1.put("student2", "Karishma:karishma123");
        return emp1;
    }


    public static void main(String[] args) throws Exception {
        String role = "seller";
        HashMapLogin hp1 = new HashMapLogin();
       hp1.doLogin(hp1.getUserCred(role));
       //logged in with billu:billu123
//        userName is billu
//        passWord is billu123
//        billu:billu123
        System.out.println(hp1.getUserMap().get(role)); //billu:billu123
    }

}
