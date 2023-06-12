package arrayListDemo;

import java.util.*;


public class CustomArrayList implements List{
    int initialCapacity = 5;
    int[] a = new int[initialCapacity];
    int lastIndex = 0;
    private class IntIterator {
        int currentIndex = 0;
        public boolean hasNext(){
            return currentIndex!=lastIndex;
        }
        public int next(){
            return a[currentIndex++];
        }
    }
    public IntIterator intIterator(){
        return new IntIterator();
    }


//    public boolean add(int data) {
//        a[lastIndex] = data;
//        lastIndex++;
//        if (lastIndex == initialCapacity) {
//            a = grow();
//        }
//        return true;
//    }

    public int[] grow() {
        initialCapacity *= 2;
        int[] b = new int[initialCapacity];
        System.arraycopy(a, 0, b, 0, a.length);
        return b;
    }

    @Override
    public int size() {
        return lastIndex;
    }

    @Override
    public boolean isEmpty() {
        if(lastIndex==0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean contains(Object o) {
        boolean res = false;
        for(int element : a){
            if(o.equals(element)){
                res= true;
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
//        int[] b = new int[a.length];
//        System.arraycopy(a, 0, b, 0, a.length);
//        return b;
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        a[lastIndex] = (int) o;
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
        for(int i = 0; i < a.length; i++){
            if(o.equals(a[i])){
                deleteIndex = i;
                lastIndex--;
                res = true;
            }
        }

        int[] arr_new = new int[a.length-1];
        int k = 0;
        for(int i=0;i<a.length;i++){
            if(i!=deleteIndex){
                arr_new[k]=a[i];
                k++;
            }
        }
        a = arr_new;
        return res;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }
    public boolean addAll(CustomArrayList customArrayList){
        for(int i=0;i<customArrayList.size();i++){
//            a[lastIndex] = (int) customArrayList.get(i);
//            lastIndex++;
            add(customArrayList.get(i));
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }
    public boolean addAll(int index, CustomArrayList customArrayList){
        int[] b=new int[lastIndex-index];
        int k=0;
        for (int i=index;i<lastIndex;i++){
            b[k] = a[index];
            k++;
        }
        for(int i=0;i<customArrayList.size();i++){
            a[index] = (int) customArrayList.get(i);
            index++;
            lastIndex++;
        }
        for(int i=0; i<b.length; i++){
            a[lastIndex] = b[i];
            lastIndex++;
        }
        return true;
    }

    @Override
    public void clear() {
        a = new int[initialCapacity];
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

    @Override
    public Object get(int index) {
        return a[index];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
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
        int[] arr_new = new int[a.length-1];
        int k = 0;
        for(int i=0;i<a.length;i++){
            if(i!=index){
                arr_new[k]=a[i];
                k++;
            }
        }
        a = arr_new;
        return true;
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
//        IntArrayList ial = new IntArrayList("int");
        CustomArrayList ial = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            ial.add(i);
        }
        IntIterator intIterator = ial.intIterator();
        while (intIterator.hasNext()){
            System.out.println(intIterator.next());
        }
        System.out.println("size:"+ial.size());
        System.out.println("contains:"+ial.contains(5));
        System.out.println("get(10):"+ial.get(5));


        System.out.println("before removing");
        for(int i=0;i<ial.size();i++){
            System.out.println(ial.get(i));
        }
//        Object[] newArray = ial.toArray();
//        for(int i=0; i<newArray.length;i++){
//            System.out.println(newArray[i]);
//        }

        System.out.println("remove:"+ial.remove((Object)5));
//        System.out.println("remove:"+ial.remove(5));


        System.out.println("after removing");
        for(int i=0;i<ial.size();i++){
            System.out.println(ial.get(i));
        }

//        CustomArrayList ial2 = new CustomArrayList();
//        for (int i = 0; i < 5; i++) {
//            ial2.add(i);
//        }
//        ial.addAll(ial2);
//        for(int i=0;i<ial.size();i++){
//            System.out.println(ial.get(i));
//        }
//        ial.addAll(5,ial2);
    }
}
