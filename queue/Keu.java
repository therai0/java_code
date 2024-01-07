class Keu {
    static class K {
        int size;
        int front = -1;
        int rare = -1;
        int[] arr;

        K(int n) {
            arr = new int[n];
            this.size = n;
        }

        boolean isFull() {
            return (rare + 1) % size == front;
        }

        boolean isEmpty() {
            return rare == -1 && front == -1;
        }

        void enque(int n) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rare = (rare + 1) % size;
            arr[rare] = n;
        }

        void dequ() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            //if the single element is there

            if(rare == front)
            {
                rare = front = -1;
            }
            else {
                front = (front + 1) % size;
            }
        }

        int peek() {
            return arr[front];
        }

        public static void main(String ar[]) {

            K obj = new K(4);
            obj.enque(90);
            obj.enque(45);
            obj.enque(34);
            obj.enque(35);
            
            while(!obj.isEmpty())
            {
                System.out.println(obj.peek());
                obj.dequ();
            }
        }
    }
}