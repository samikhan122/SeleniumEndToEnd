package HashMaP;

import java.util.HashMap;

public class HashMapConecept1 {
    private String getUserCred(String role) throws Exception {
        HashMap<Integer, String> emp = new HashMap<>();
        emp.put(1, "ALi");
        emp.put(2, "Ayesa");
        emp.put(3, "bella");
        emp.put(1, "billu");
        emp.put(1, null);
        emp.put(null, null);
        emp.put(null, null); //{null=null, 1=null, 2=Ayesa, 3=bella}


        HashMap<String, String> emp1 = new HashMap<>();
        emp1.put("2", "Ayesha");
        emp1.put("3", "bella");
        emp1.put("4", "billu");
        emp1.put("5", "elmaz");
        emp1.put("6", "fahad");
        emp1.put("$", "Fahad");
        emp1.put("1", "Ali");
        emp1.put("7", "vipra");
        emp1.put("8", "Karishma");
        //System.out.println(emp);
        // emp.forEach((k, v) -> System.out.println(emp)); // lambda expression.
        //map is an interface and under map is going to be entry
//        return emp1.get(role);
        if (emp1.containsKey(role)) {
            return emp1.get(role);
        } else {
            throw new Exception("Role not found");
        }
    }

    public void doLogin(String un, String pwd) {
        System.out.println("user logged in with: " + un + " " + pwd);

    }

    public void doLogin(String role) throws Exception {

        String cred = getUserCred(role);

        System.out.println("user logged in with: " + cred);

    }

    public static void main(String[] args) throws Exception {
        String role = "2";
        HashMapConecept1 hp = new HashMapConecept1();
        hp.doLogin(role);
    }

}

