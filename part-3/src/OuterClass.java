// Outer class definition
public class OuterClass {

    private String outerField = "Outer Field";

    // 1. Non-Static (Regular) Inner Class
    class NonStaticInnerClass {
        private String innerField = "Non-Static Inner Field";

        // Method inside the Non-Static Inner Class
        void display() {
            System.out.println("Inside Non-Static Inner Class");
            System.out.println("Accessing: " + outerField); // Access outer class field
        }
    }

    // 2. Static Nested Class
    static class StaticNestedClass {
        private static String staticNestedField = "Static Nested Field";

        // Method inside the Static Nested Class
        void display() {
            System.out.println("Inside Static Nested Class");
            System.out.println("Accessing: " + staticNestedField);
        }
    }

    // Method in the outer class
    void outerMethod() {
        // 3. Local Inner Class
        class LocalInnerClass {
            private String localInnerField = "Local Inner Field";

            // Method inside the Local Inner Class
            void display() {
                System.out.println("Inside Local Inner Class");
                System.out.println("Accessing: " + outerField); // Access outer class field
            }
        }

        // Instantiating and using Local Inner Class
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.display();
    }

    // Method to demonstrate Anonymous Inner Class
    void anonymousClassMethod() {
        // 4. Anonymous Inner Class implementing Runnable interface
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Anonymous Inner Class");
                System.out.println("Accessing: " + outerField); // Access outer class field
            }
        };
        runnable.run();
    }

    public static void main(String[] args) {
        // Creating instance of the outer class
        OuterClass outer = new OuterClass();

        // 1. Instantiating Non-Static Inner Class
        NonStaticInnerClass nonStaticInner = outer.new NonStaticInnerClass();
        nonStaticInner.display();

        // 2. Instantiating Static Nested Class
        StaticNestedClass staticNested = new StaticNestedClass();
        staticNested.display();

        // Calling the method containing the Local Inner Class
        outer.outerMethod();

        // Calling the method that demonstrates Anonymous Inner Class
        outer.anonymousClassMethod();
    }
}
