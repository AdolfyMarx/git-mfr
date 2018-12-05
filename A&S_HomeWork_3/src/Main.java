public class Main {

    public static void main(String[] args) {
        Stack st_1 = new Stack(5);
        Queue qu_1 = new Queue(5);
        RtoLReader str_1 = new RtoLReader("Маленький цифровой ревербиратор");

        // проверка стека
        /*
        st_1.push(1);
        st_1.push(2);
        st_1.push(3);
        st_1.push(4);
        st_1.push(5);
        st_1.push(6);

        System.out.println(st_1.peek());

        while (!st_1.isEmty()) {
            System.out.println(st_1.pop());
        }

        st_1.pop();
        */

       // проверка очереди

        /*
        qu_1.insert(1);
        qu_1.insert(2);
        qu_1.insert(3);
        qu_1.insert(4);
        qu_1.insert(5);
        qu_1.insert(6);

        System.out.println(qu_1.queueSize());

        System.out.println(qu_1.peek());

        while (!qu_1.isEmty()) {
            System.out.println(qu_1.remove());
        }

        qu_1.remove();
        */

        // проверка разворачивателя

        System.out.println(str_1.LtoR());
        System.out.println(str_1.RtoL());
    }
}
