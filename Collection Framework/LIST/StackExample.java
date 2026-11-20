/* Stack : it follws LIFO principle . It inherits Vector Functionality and add stack specific operations ,
It provides push(),pop(),empty() and search() methods.
*/

import java.util.Stack;

class StackExample{
public static void main(String[] args) {
    
Stack<String> stack = new Stack<>();

stack.push("Rohan");
stack.push("Ashish");
stack.push("Ben");
stack.push("Sagar");
 stack.pop();
String top = stack.peek();
int result = stack.search("Rohan");
System.out.println(stack);
System.out.println(top);
System.out.println(result);
}
}