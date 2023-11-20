package com.example.calculater;

import java.util.Stack;

interface stack<E> {
    int size();

    boolean isEmpty();

    void push(E e);

    E top();

    E pop();
}

class LinkedList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void addLast(E e) {
        Node<E> newst = new Node<>(e, null);
        if (isEmpty()) {
            head = newst;
        } else {
            tail.setNext(newst);
        }
        tail = newst;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E ans = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return ans;
    }
}

class LinkedStack<E> implements stack<E> {
    private LinkedList<E> list = new LinkedList<>();

    public LinkedStack() {
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }
}

public class Calculator {
    public static double calculate(String input) {
        LinkedStack<Double> numbers = new LinkedStack<>();
        LinkedStack<Character> operators = new LinkedStack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c) || c == '.') {
                StringBuilder sb = new StringBuilder();
                while (i < input.length() && (Character.isDigit(input.charAt(i)) || input.charAt(i) == '.')) {
                    sb.append(input.charAt(i));
                    i++;
                }
                i--;
                numbers.push(Double.parseDouble(sb.toString()));
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (!operators.isEmpty() && operators.top() != '(') {
                    numbers.push(applyOperator(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.pop();
            } else if (isOperator(c)) {
                while (!operators.isEmpty() && checkOlaviat(c, operators.top())) {
                    numbers.push(applyOperator(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty()) {
            numbers.push(applyOperator(operators.pop(), numbers.pop(), numbers.pop()));
        }

        return numbers.pop();
    }

    public static boolean checkOlaviat(char c1, char c2) {
        int p1 = olaviat(c1);
        int p2 = olaviat(c2);

        if ((p1 == '^' || p1 == '!') && p1 <= p2) {
            return false;
        }
        return p1 <= p2;
    }

    public static int olaviat(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
            case '!':
                return 3;
        }
        return -1;
    }

    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '/' || c == '^' || c == '!';
    }

    public static double applyOperator(char ope, double b, double a) {
        switch (ope) {
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a - b;
            }
            case '*' -> {
                return a * b;
            }
            case '/' -> {
                if (b == 0)
                    throw new ArithmeticException("error : divided by zero");
                return a / b;
            }
            case '^' -> {
                return Math.pow(a, b);
            }
            case '!' -> {
                if (a < 0)
                    throw new ArithmeticException("error");
                return factorial(a);
            }
        }
        throw new IllegalArgumentException("error");
    }

    public static double factorial(double n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
