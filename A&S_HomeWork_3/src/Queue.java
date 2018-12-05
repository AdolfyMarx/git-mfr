public class Queue {

    private int maxSize;
    private int front;
    private int rear;
    private int curSize;
    private int[] queue;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queue = new int[this.maxSize];
        this.front = 0;
        this.rear = -1;
        this.curSize = 0;
    }

    public void insert (int num) {
        if (isFull()) {
            System.out.println("Добавление элемента невозможно, очередь полна.");
            return;
        }
        if (this.rear == this.maxSize - 1) this.rear = -1;
        this.queue[++this.rear] = num;
        this.curSize++;
    }

    public int remove () {
        if (isEmty()) {
            System.out.println("Удаление элемента невозможно, очередь пуста.");
            return -1;
        }
        int temp = this.queue[front++];
        if (front == this.maxSize) this.front = 0;
        this.curSize--;
        return temp;
    }

    public int peek () {
        if (isEmty()) {
            System.out.println("Очередь пуста.");
            return -1;
        }
        return this.queue[this.front];
    }

    public boolean isEmty () {
        return (this.curSize == 0);
    }

    public boolean isFull () {
        return (this.curSize == this.maxSize);
    }

    public int queueSize () {
        return this.curSize;
    }
}
