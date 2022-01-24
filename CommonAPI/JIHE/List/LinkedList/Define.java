package CommonAPI.JIHE.List.LinkedList;

import java.util.LinkedList;

public class Define {
    /*
    java.util.LinkedList集合数据存储结构是链表结构，方便元素添加、删除。
    LinkedList是一个双向链表，查询慢，增删快。找到头和尾非常方便，有大量的操作首尾元素的方法。
    LinkedList是List的子类，List中的方法LinkedList都是可以使用，在开发时，LinkedList集合也可以作为堆栈，队列的结构使用。
    实际开发中对一个集合元素的添加与删除经常涉及到首尾操作，而LinkedList提供了大量首尾操作的方法：
        public void addFirst(E e) :将指定元素插入此列表的开头。
        public void addLast(E e) :将指定元素添加到此列表的结尾。
        public E getFirst() :返回此列表的第一个元素。
        public E getLast() :返回此列表的最后一个元素。
        public E removeFirst() :移除并返回此列表的第一个元素。
        public E removeLast() :移除并返回此列表的最后一个元素。
        public E pop() :从此列表所表示的堆栈处弹出一个元素。
        public void push(E e) :将元素推入此列表所表示的堆栈。
        public boolean isEmpty() ：如果列表不包含元素，则返回true。
     */
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();
        link.add("小李");
        link.add("小王");
        link.addFirst("first");
        link.addLast("last");
        System.out.println(link.getFirst());
        System.out.println(link.getLast());
        link.push("小琳"); // 将元素推入此列表所表示的堆栈 栈顶
        System.out.println(link);
        System.out.println(link.pop()); // 弹出栈顶元素
        System.out.println(link.removeFirst());
        System.out.println(link.removeLast());
        System.out.println(link.isEmpty()); // 非空判断，包含元素返回false，无元素返回true
        System.out.println("--------------");
        System.out.println(link);
        while (! link.isEmpty()) {
            System.out.println(link.pop()); // 弹出栈顶元素
        }
    }
}
