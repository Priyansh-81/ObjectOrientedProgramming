class Stack {
    int top;
    int maxSize;
    int[] arrayStack;
    
    public Stack(int size){
         maxSize = size;
        arrayStack = new int[maxSize];
         top = -1;
    }
    
    public void push(int value){
        if(top==maxSize-1){
            System.out.println("The stack is full.\n");
        }
        else{
            arrayStack[++top] = value;
            System.out.println("Pushed " + value + " in the stack.");
        }
    }

    public int pop(){
        if(top==-1){
            System.out.println("The stack is empty.\n");
            return -1;
        }
        else{
            int value = arrayStack[top--] ;
            System.out.println("Popped" + value + "out of the stack.");
            return value;
        }
    }

    public int peek(){
        if(top==-1){
            System.out.println("Stack is empty.\n");
            return -1;
        }
        else{
            return arrayStack[top];
        }
    }
        public static void main(String args[]){
            Stack stack = new Stack(4);
            stack.push(50);
            stack.push(60);
            stack.push(70);
            stack.push(30);
            stack.push(80);
            System.out.println("The top of the stack is:" + stack.peek());
            stack.pop();
            stack.pop();
            stack.pop();
            System.out.println("The top of the stack is:" + stack.peek());
            stack.pop();
            stack.pop();

        }
    }

