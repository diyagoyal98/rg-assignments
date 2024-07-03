class Singleton {
    // Private static instance of the class
    private static Singleton instance;
    
    // Private constructor to prevent instantiation from other classes
    private Singleton() { }
    
    // Public static method to provide global point of access
    public static Singleton getInstance() {
        if (instance == null) {
            // Lazy initialization
            instance = new Singleton();
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Example of Singleton Class....");
    }
}

public class Test 
{
    public static void main(String[] args)
    {   
        // Get the only object available
        Singleton singleton = Singleton.getInstance();
        
        // Show the message
        singleton.showMessage();
    }    
}
