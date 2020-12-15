import java.util.Scanner;
class Stack {
    int top;
    int maxSize = 5;
    int[] myArray = new int[maxSize];

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        if (top == -1) {
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }

    void sizeOfStack() {
        if (top > -1) {
            int size = 0;
            for (int i = top; i >=0; i--) {
                size += 1;
            }
            System.out.println("size: " + size);
        }
        else {
            System.out.println("size: " + 0);
        }
    }

    boolean push(Scanner input) {
        if (top == maxSize-1) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            top++;
            System.out.println("Enter element to push: ");
            int inputElement = input.nextInt();
            myArray[top] = inputElement;
            return true;
        }
    }

    boolean pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return false;
        }
        else {
            top--;
            return true;
        }
    }

    void displayStackElements() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        }
        else {
            System.out.print("Stack Elements..\n");
            for (int i = top; i >= 0; i--) {
                System.out.print(myArray[i]);
                System.out.println("");
            }
        }
    }
}

class ArrayStack {
    public static void main (String[] args) {
        int choice=0;
        Scanner input = new Scanner(System.in);
        Stack myStack = new Stack();
        while(choice != 6) {
            System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Size\n5.isEmpty\n6.Exit");
            System.out.println("\n Enter any choice \n");
            choice = input.nextInt();
            switch(choice) {
                case 1: {
                    myStack.push(input);
                    break;
                }
                case 2: {
                    myStack.pop();
                    break;
                }
                case 3: {
                    myStack.displayStackElements();
                    break;
                }
                case 4: {
                    myStack.sizeOfStack();
                    break;
                }
                case 5: {
                    myStack.isEmpty();
                    break;
                }
                case 6:{
                    System.out.println("Exiting....");
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("Please Enter valid choice ");
                }
            };
        }
    }
}		