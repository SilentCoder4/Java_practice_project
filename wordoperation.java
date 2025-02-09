//WAP to design a String class that perform String Method (Equal, Reverse the string, change case)
class StringOperations {
    String str;

    StringOperations(String str) {
        this.str = str;
    }

    boolean isEqual(String anotherStr) {
        return this.str.equals(anotherStr);
    }

    String reverse() {
        return new StringBuilder(this.str).reverse().toString();
    }

    String changeCase() {
        StringBuilder changedStr = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                changedStr.append(Character.toLowerCase(ch));
            } else {
                changedStr.append(Character.toUpperCase(ch));
            }
        }
        return changedStr.toString();
    }

    void display() {
        System.out.println("Original String: " + str);
    }
}

public class wordoperation {
    public static void main(String[] args) {

        StringOperations word1 = new StringOperations("HelloWorld");
        StringOperations word2 = new StringOperations("helloworld");

        word1.display();

        System.out.println("Are both strings equal? " + word1.isEqual(word2.str));

        System.out.println("Reversed String: " + word1.reverse());

        System.out.println("Case Changed String: " + word1.changeCase());
    }
}