package arrayListDemo;

import java.util.*;

public class CustomGenericsArrayList<T> implements List {
    int initialCapacity = 5;
    Object[] a = new Object[initialCapacity];
    int lastIndex = 0;

    private class IntIterator {
        int currentIndex = 0;

        public boolean hasNext() {
            return currentIndex != lastIndex;
        }

        public Object next() {
            return a[currentIndex++];
        }
    }

    public CustomGenericsArrayList<T>.IntIterator intIterator() {
        return new CustomGenericsArrayList<T>.IntIterator();
    }

    @Override
    public int size() {
        return lastIndex;
    }

    @Override
    public boolean isEmpty() {
        if (lastIndex == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains(Object o) {
        boolean res = false;
        for (Object element : a) {
            if (o.equals(element)) {
                res = true;
            }
        }
        return res;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        T[] b = (T[]) new Object[lastIndex];
        System.arraycopy(a, 0, b, 0, b.length);
        return b;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public boolean add(Object data) {
        a[lastIndex] = data;
        lastIndex++;
        if (lastIndex == initialCapacity) {
            a = grow();
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int deleteIndex = 0;
        boolean res = false;
        for (int i = 0; i < a.length; i++) {
            if (o.equals(a[i])) {
                deleteIndex = i;
                lastIndex--;
                res = true;
            }
        }

        Object[] arr_new = new Object[a.length - 1];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (i != deleteIndex) {
                arr_new[k] = a[i];
                k++;
            }
        }
        a = arr_new;
        return res;
    }

    @Override
    public boolean addAll(Collection c) {
        for (Object e : c)
            add(e);
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        Object[] b = new Object[lastIndex - index];
        int k = 0;
        for (int i = index; i < lastIndex; i++) {
            b[k] = a[index];
            k++;
        }
        for (Object e : c) {
            a[index] = e;
            index++;
            lastIndex++;
        }
        for (int i = 0; i < b.length; i++) {
            a[lastIndex] = b[i];
            lastIndex++;
        }
        return true;
    }

    @Override
    public void clear() {
        a = new Object[initialCapacity];
        lastIndex = 0;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    public Object[] grow() {
        initialCapacity *= 2;
        Object[] b = new Object[initialCapacity];
        System.arraycopy(a, 0, b, 0, a.length);
        return b;
    }

    public Object get(int index) {
        return a[index];
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        Object res = a[index];
        Object[] arr_new = new Object[a.length - 1];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (i != index) {
                arr_new[k] = a[i];
                k++;
            }
        }
        a = arr_new;
        lastIndex--;
        return res;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    public static void main(String[] args) {
        CustomGenericsArrayList<Integer> ial = new CustomGenericsArrayList<>();
        for (int i = 0; i < 10; i++) {
            ial.add(i);
        }
        CustomGenericsArrayList <Integer>.IntIterator intIterator = ial.intIterator();
        while (intIterator.hasNext()){
            System.out.println(intIterator.next());
        }
        System.out.println(Arrays.toString(ial.toArray()));

//        System.out.println("get :"+ial.get(5));
//
//        System.out.println("contains:" + ial.contains(5));
//        System.out.println("get(10):" + ial.get(5));
//
//        System.out.println("before removing");
//        System.out.println("size: " + ial.size());
//        for (int i = 0; i < ial.size(); i++) {
//            System.out.println(ial.get(i));
//        }

//        System.out.println("remove: " + ial.remove(new Integer(5)));
//
//        System.out.println("after removing");
//        System.out.println("size: " + ial.size());
//        for (int i = 0; i < ial.size(); i++) {
//            System.out.println(ial.get(i));
//        }
//
//        CustomGenericsArrayList<String> ial = new CustomGenericsArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            ial.add("hello");
//        }
//
//        CustomGenericsArrayList <String>.IntIterator intIterator = ial.intIterator();
//        while (intIterator.hasNext()){
//            System.out.println(intIterator.next());
//        }
    }
}
