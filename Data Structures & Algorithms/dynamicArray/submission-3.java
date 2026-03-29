class DynamicArray {

    int[] arr;
    int capacity;
    int length;


    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.length = 0;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (length == capacity) {
            resize();
        }
        arr[length] = n;
        length++;
    }

    public int popback() {
        if (length > 0) {
            length--;
        }
        return arr[length];
    }

    private void resize() {
        int[] newArray = new int[capacity * 2];
        for (int i = 0; i < capacity; i++) {
            newArray[i] = arr[i];
        }
        arr = newArray;
        capacity = capacity * 2;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
