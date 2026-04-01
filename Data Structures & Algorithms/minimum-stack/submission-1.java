class MinStack {
    private int[] data;
    private int[] mins;
    private int ptr;

    public MinStack() {
        data = new int[10];
        mins = new int[10];
        ptr = -1;
    }

    public void push(int val) {
        if (ptr + 1 == data.length) grow();

        ptr++;
        data[ptr] = val;

        if (ptr == 0) mins[ptr] = val;
        else mins[ptr] = Math.min(mins[ptr - 1], val);
    }

    public void pop() {
        if (ptr == -1) return; // or throw exception
        ptr--;
    }

    public int top() {
        return data[ptr];
    }

    public int getMin() {
        return mins[ptr];
    }

    private void grow() {
        int newSize = data.length * 2;

        int[] newData = new int[newSize];
        int[] newMins = new int[newSize];

        for (int i = 0; i <= ptr; i++) {
            newData[i] = data[i];
            newMins[i] = mins[i];
        }

        data = newData;
        mins = newMins;
    }
}
