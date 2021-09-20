/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodreferencesexamples;

import java.util.function.BiFunction;

/**
 *
 * @author HoangTN
 */
public class MethodReferencesExamples {

    /**
     * @param args the command line arguments
     */
    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
        return merger.apply(a, b);
    }

    public static String appendStrings(String a, String b) {
        return a + b;
    }

    public String appendStrings2(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        MethodReferencesExamples myApp = new MethodReferencesExamples();

        // Calling the method mergeThings with a lambda expression
        System.out.println(MethodReferencesExamples.
                mergeThings("Hello ", "World!", (a, b) -> a + b));

        // Reference to a static method
        System.out.println(MethodReferencesExamples.
                mergeThings("Hello ", "World!", MethodReferencesExamples::appendStrings));

        // Reference to an instance method of a particular object        
        System.out.println(MethodReferencesExamples.
                mergeThings("Hello ", "World!", myApp::appendStrings2));

        // Reference to an instance method of an arbitrary object of a
        // particular type
        System.out.println(MethodReferencesExamples.
                mergeThings("Hello ", "World!", String::concat));
    }
}


