public class Stack {

    private int size;
    private int top;
    private int[] stack;

    public Stack(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new int[this.size];
    }

    public void push (int num) {
        if (isFull()) {
            System.out.println("Добавление элемента невозможно, стек заполнен.");
            return;
        }
        this.stack[++this.top] = num;
    }

    public int pop() {
        if (isEmty()) {
            System.out.println("Удаление элемента невозможно, стек пуст.");
            return -1;
        }
        return this.stack[this.top--];
    }

    public int peek() {
        if (isEmty()) {
            System.out.println("Cтек пуст.");
            return -1;
        }
        return this.stack[this.top];
    }

    public boolean isEmty () {
        return (this.top == -1);
    }

    public boolean isFull () {
        return (this.top == this.size-1);
    }
}
