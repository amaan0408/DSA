package com.algorithmsPractice.Stack;

public class implementation {
    int[] arr = new int[5];
    int top = -1;

    public void push(int value){
        arr[++top] = value;
    }

    public int pop() {
        int value = arr[top];
        top--;
        return value;
    }

    public int peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

}
