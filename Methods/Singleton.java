public class Singleton {
    private static Singleton instance; // that will be returned
    private static String name;

    private Singleton() {
        // to prevent access from outside
        name = "Default name";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // initialize the variable
        }
        return instance;
    }

    public static String getName() {
        return Singleton.name;
    }

    public static void setName(String newName){
        if(newName!= null && !newName.trim().isEmpty()){
            Singleton.name = newName;
        }else{
            System.out.println("Passing invalid name");
        }
    }
}
