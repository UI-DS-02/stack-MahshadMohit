package com.example.calculater;

interface stack<E> {
    int size();
    boolean isEmpty();
    void push(E e);
    E top();
    E pop();
}
class LinkedList<E>{
    private static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E e,Node<E> n){
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
    public int size(){return size;}
    public boolean isEmpty(){return size==0;}
    public E first(){
        if (isEmpty()) return null;
        return head.getElement();
    }
    public E last(){
        if (isEmpty()) return null;
        return tail.getElement();
    }
    public void addFirst(E e){
        head = new Node<>(e,head);
        if (size==0){
            tail = head;
        }
        size++;
    }
    public void addLast(E e){
        Node<E> newst = new Node<>(e,null);
        if (isEmpty()){
            head = newst;
        }else{
            tail.setNext(newst);
        }
        tail = newst;
        size++;
    }
    public E removeFirst(){
        if (isEmpty()) return null;
        E ans = head.getElement();
        head = head.getNext();
        size--;
        if (size==0)
            tail = null;
        return ans;
    }
}
class LinkedStack<E> implements stack<E>{
    private LinkedList<E> list = new LinkedList<>();
    public LinkedStack(){}

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

}
