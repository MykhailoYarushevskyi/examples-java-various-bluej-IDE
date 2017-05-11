import com.tasks3.linkedlist.Node;
/*
Створіть клас що описує зв'язний список. Клас повинен мати можливість додавання елементів та вилучення елементів. 
Додавання елементів відбувається в кінець списку, вилучення елементів відбувається за порядковим номером.
Також створіть методи, що дозволяють отримати розмір списку та елемент за його порядковим номером.

Елементи списку повинні бути типу Node

Особливості використання класу Integer Ви зможете знайти за цим посиланням або тут російською мовою, розділ Обертки. 
З особливостями використання обгорток ми з Вам будемо знайомитися быльш детально на наступних тижнях.

Просимо врахувати деякі особливості перевірки завдань:

    Декларація package повинна залишатися незмінною (як у шаблоні), зверніть на це увагу вставляючи Ваш код у вікно перевірки.
    Для перевірки використовуються (беруться до уваги) виключно методи з сигнатурою описаною в шаблоні.
    Кількість та зміст полів та/або методів відмінних від наведених в шаблоні не обмежена.
    В кожному класі повинен бути або конструктор за замовчанням або public безаргументний конструктор.
    Не рекомендовано робити вивід на екран.

package com.tasks3.linkedlist;

class Node{
    private Node next;
    private Integer data;
    
    public Node() {
        this.next = null;
        this.data = null;
    }

    public Node getNext() {
        return this.next;
    }
    public void setNext(Node next) {
        this.next = next;
        
    }
    public Integer getData() {
        return this.data;
    }
    public void setData(Integer data) {
        this.data = data;
    }
}

*/
/**
 * Write a description of class LinkedList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkedList
{
    private Node rootNode;

    private int lengthList = 0;

    
    public LinkedList() {

        this.lengthList = 0;
        this.rootNode = new Node();
    }

    public void add(Integer data) {
       
        if(null == this.rootNode.getNext()){ //create the first entry in the LinkedList
            this.rootNode.setNext(new Node());
            this.rootNode.getNext().setData(data);
        }
        else{
            Node lastNode = searchNode(this.size() - 1);//find the last entry in the LinkedList
            //System.out.println("Node lastNode = " + lastNode);
            lastNode.setNext(new Node());
            lastNode.getNext().setData(data);
        }
        this.lengthList += 1;
    }

    public Integer get(int index) {
        Integer valueElement = new Integer(0);
        if(null == searchNode(index)){
            return null;
        }
        valueElement = searchNode(index).getData();
        
        return valueElement;
    }

    public boolean delete(int index) {
        boolean deleteOk = true;
        Node tempNode = new Node();
        if(0 == index) { //Deleting the first node in the list (index == 0)
            tempNode = this.rootNode;  //delete reference to the first node and create the reference for next node
        }
        else{  //Deleting the node for index > 0
            tempNode = searchNode(index - 1); 
        }
        if(null == tempNode){
             deleteOk = false;
        }
        else {
            Node forChangeNode = tempNode.getNext().getNext();
            tempNode.setNext(forChangeNode); //delete reference to the node for deleting and create the reference for next node
            this.lengthList -= 1;
        }
        return deleteOk;
    }

    public int size() {
        
        return this.lengthList;
    }
    private Node searchNode(int index){
        Node tempNode = new Node();

        if((0 == this.size()) || (index < 0 || index > this.size() - 1)){ //either number of Node is 0 or index is not correct
            return null;
        }
        tempNode = this.rootNode.getNext();

        for(int i = 0; i <= index; i++){
            if(i == index){ //reached of index. Entry in not empty. 
                break;
            }
            else if(null == tempNode.getNext()){ //reached last entry, but no reached index
                return null;
            }
            else{
                tempNode = tempNode.getNext(); //not reached index,  next entry is not empty
            }
        }
        return tempNode;
    }
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        
        boolean deleteTrueFalse;
        
        for(int i = 0; i < 10; i++){
            Integer numInteger = new Integer(i);
            list.add(numInteger);
            System.out.println("size = " + list.size());
            for(int j = 0; j <= i; j++){
                System.out.print("list[" + j + "] = " + (int)list.get(j) + " ; ");
            }
            System.out.println();
        }
        int ii = list.size(); // test for deleting at not correct index
        System.out.println("size = " + list.size());
        deleteTrueFalse = list.delete(ii + 1); //index  > max
        System.out.print("size after deleting = " + list.size());
        System.out.println(" list.delete(" + (ii + 1) + ")= " + deleteTrueFalse + ";  ");
        System.out.print("after deleting: ");
        for(int j = 0; j < list.size(); j++){
            System.out.print("list[" + j + "] = " + (int)list.get(j) + " ; ");
        }
        System.out.println();
        deleteTrueFalse = list.delete(ii - ii -1); //index < 0
        System.out.print("size after deleting = " + list.size());
        System.out.println(" list.delete(" + (ii - ii -1) + ")= " + deleteTrueFalse + ";  ");
        System.out.print("after deleting: ");
        for(int j = 0; j < list.size(); j++){
            System.out.print("list[" + j + "] = " + (int)list.get(j) + " ; ");
        }
        System.out.println();

        for(int i = 9; i >= 0; i--){
            deleteTrueFalse = list.delete(i%5);
            System.out.print("size after deleting = " + list.size());
            System.out.println(" list.delete(" + i%5 + ")= " + deleteTrueFalse + ";  ");
            System.out.print("after deleting: ");
            for(int j = 0; j < i; j++){
                System.out.print("list[" + j + "] = " + (int)list.get(j) + " ; ");
            }
            System.out.println();
        }
        System.out.println("size = " + list.size());
        System.out.print("list[] = " + list.get(list.size() - 1) + " ; ");
    }
}
