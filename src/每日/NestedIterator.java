//package 每日;
//
//import java.util.ArrayDeque;
//import java.util.Iterator;
//
///**
// * @author zhang dong
// * @Description https://leetcode-cn.com/problems/flatten-nested-list-iterator/  341. 扁平化嵌套列表迭代器
// * @date 2021/3/11-10:57
// */
///**
// * // This is the interface that allows for creating nested lists.
// * // You should not implement it, or speculate about its implementation
// * public interface NestedInteger {
// *
// *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
// *     public boolean isInteger();
// *
// *     // @return the single integer that this NestedInteger holds, if it holds a single integer
// *     // Return null if this NestedInteger holds a nested list
// *     public Integer getInteger();
// *
// *     // @return the nested list that this NestedInteger holds, if it holds a nested list
// *     // Return null if this NestedInteger holds a single integer
// *     public List<NestedInteger> getList();
// * }
// */
//public class NestedIterator implements Iterator<Integer> {
//    private ArrayDeque<Integer> deque=new  ArrayDeque<Integer>();
//
//    public NestedIterator(List<NestedInteger> nestedList) {
//          put(nestedList);
//    }
//
//    private void put(List<NestedInteger> nestedList){
//       for(NestedInteger n:nestedList){
//            if(n.isInteger()){
//                   deque.push(n.getInteger());
//                   System.out.println(deque.peek());
//            }else{
//                List<NestedInteger> list=n.getList();
//                put(list);
//            }
//        }
//    }
//
//    @Override
//    public Integer next() {
//      return  deque.poll();
//    }
//
//    @Override
//    public boolean hasNext() {
//        return !deque.isEmpty();
//    }
//}
//
///**
// * Your NestedIterator object will be instantiated and called as such:
// * NestedIterator i = new NestedIterator(nestedList);
// * while (i.hasNext()) v[f()] = i.next();
// */