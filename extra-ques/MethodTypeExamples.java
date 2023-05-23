public abstract class MethodTypeExamples {
    // Instance method
    public void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Getter method
    public String getGreeting() {
        return "Hello!";
    }

    // Setter method
    public void setGreeting(String greeting) {
        System.out.println("Setting greeting: " + greeting);
    }

    // Constructor
    public MethodTypeExamples() {
        System.out.println("Constructor called.");
    }

    // Overloaded method
    public void overloadedMethod() {
        System.out.println("Overloaded method without parameters.");
    }

    public void overloadedMethod(int num) {
        System.out.println("Overloaded method with parameter: " + num);
    }

    // Abstract method
    public abstract void abstractMethod();

    // Final method
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        MethodTypesExample obj = new MethodTypesExample(); // Creating an object

        // Calling instance method
        obj.instanceMethod();

        // Calling static method
        staticMethod();

        // Calling getter method
        String greeting = obj.getGreeting();
        System.out.println("Greeting: " + greeting);

        // Calling setter method
        obj.setGreeting("Hi!");

        // Calling overloaded methods
        obj.overloadedMethod();
        obj.overloadedMethod(42);

        // Calling final method
        obj.finalMethod();
    }
}

