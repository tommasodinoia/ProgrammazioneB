package it.poliba.sisinflab.programmazioneB.liste;


public class SimplyLinkedList<E> {
    private SimpleNode<E> head;
    private SimpleNode<E> tail;
    private int size;

    public SimplyLinkedList(){
         head = null;
         tail = null;
         size = 0;
    }

    public SimpleNode<E> getHead(){
        return head;
    }

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        if(size == 0)
            return true;
        return false;
    }
    public E getFirst(){
        if(this.isEmpty())
            return null;
        return head.getElement();
    }
    public E getLast(){
        if(this.isEmpty())
            return null;
        return tail.getElement();
    }

    public void addFirst(E e){
        head = new SimpleNode<E>(e,head);
        if(this.isEmpty())
            tail = head;
        size++;
    }

    public void addLast(E e){
        SimpleNode<E> nuovo = new SimpleNode<E>(e,null);
        if(this.isEmpty())
            head = nuovo;
        else
            tail.setNext(nuovo);
        tail = nuovo;
        size++;
    }

    public E removeFirst(){
        if(this.isEmpty())
            return null;
        E elemento = head.getElement();
        head = head.getNext();
        size--;
        if(head == null)
            tail = null;
        return elemento;
    }

    public E removeLast(){
        SimpleNode<E> cursore;
        if(this.isEmpty())
            return null;
        if(this.getSize() == 1)
            return this.removeFirst();

        E elemento = tail.getElement();
        cursore = head;

        while (cursore.getNext()!= tail)
            cursore = cursore.getNext();

        tail = cursore;
        tail.setNext(null);
        size--;
        return elemento;
    }

    public E removeLastBySize(){
        SimpleNode<E> cursore;
        if(this.isEmpty())
            return null;
        if(this.getSize() == 1)
            return this.removeFirst();

        E elemento = tail.getElement();
        cursore = head;

        for(int i=1;i<size;i++)
            cursore = cursore.getNext();

        tail = cursore;
        tail.setNext(null);
        size--;
        return elemento;
    }

    public int getPosition(E e){
        SimpleNode<E> cursore;
        int index;

        if(this.isEmpty())
            return 0;
        cursore = head;
        index = 1;
        while(!cursore.getElement().equals(e) && cursore.getNext() != null) {
            cursore = cursore.getNext();
            index++;
        }
        if(cursore.getNext() == null)
            return 0;
        return index;
    }

    public void addBefore(E newElement, E e){
        if (this.isEmpty() || head.getElement().equals(e)) {
            this.addFirst(newElement);
            return;
        }

        SimpleNode<E> precedente = null;
        SimpleNode<E> cursore = head;

        while (cursore != null && !cursore.getElement().equals(e)) {
            precedente = cursore;
            cursore = cursore.getNext();
        }

        if (cursore == null) return; // elemento e non trovato

        SimpleNode<E> newNode = new SimpleNode<>(newElement, cursore);
        precedente.setNext(newNode);

        size++;
    }

    public void addAfter(E newElement, E e){
        if (this.isEmpty()) return;

        SimpleNode<E> cursore = head;
        while (cursore != null && !cursore.getElement().equals(e)) {
            cursore = cursore.getNext();
        }

        if (cursore == null) return; // elemento e non trovato

        SimpleNode<E> newNode = new SimpleNode<>(newElement, cursore.getNext());
        cursore.setNext(newNode);
        if (cursore == tail)
            tail = newNode;
        size++;
    }

    public void printList(){
        SimpleNode<E> cursore = head;
        while (cursore != null) {
            System.out.println(cursore.getElement());
            cursore = cursore.getNext();
        }
    }

}
