package start;

public class Main42 {

    public static void main(String[] args) {
        // && (conditional AND) 
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "Conditional AND (&&)", "false && false", false,
                "false && true", false,
                "true && false", (true && false),
                "true && true", (true && true));
        // || (OR) 
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "Conditional OR (||)", "false || false", (false || false),
                "false || true", (false || true),
                "true || false", true,
                "true || true", true);
        // & (boolean logical AND) 
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "Boolean logical AND (&)", "false & false", (false & false),
                "false & true", (false & true),
                "true & false", (true & false),
                "true & true", (true & true));
        // | (boolean logical inclusive OR)
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "Boolean logical inclusive OR (|)", "false | false", (false | false),
                "false | true", (false | true),
                "true | false", (true | false),
                "true | true", (true | true));
        // ^ (boolean logical exclusive OR)
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "Boolean logical exclusive OR (^)", "false ^ false", (false ^ false),
                "false ^ true", (false ^ true),
                "true ^ false", (true ^ false),
                "true ^ true", (true ^ true));
        // ! (logical negation) 
        System.out.printf("%s\n%s: %b\n%s: %b\n",
                "Logical NOT (!)", "!false", (!false), "!true", (!true));
    }
}
/*
Conditional AND (&&)
false && false: false
false && true: false
true && false: false
true && true: true

Conditional OR (||)
false || false: false
false || true: true
true || false: true
true || true: true

Boolean logical AND (&)
false & false: false
false & true: false
true & false: false
true & true: true

Boolean logical inclusive OR (|)
false | false: false
false | true: true
true | false: true
true | true: true

Boolean logical exclusive OR (^)
false ^ false: false
false ^ true: true
true ^ false: true
true ^ true: false

Logical NOT (!)
!false: true
!true: false
 */
