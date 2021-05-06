package theoryLec17_OOPWithFile_Collection_Generics;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

import java.util.*;
public class JavaCollectionFramework {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		  
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		  
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		  
		Stack<Integer> s = new Stack<Integer>(); // LIFO
		s.push(10);
		s.pop();
		  
		Queue<Integer> q = new PriorityQueue();  // FIFO
		s.push(10);
		s.pop();
		  
		Deque<Integer> dq = new ArrayDeque<Integer>();  
		dq.add(20); 
		  
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();  
		pq.add(30); 
		
		//QUEUE = First in First Out[FIFO]
		//STACK = Last in Last Out [LIFO]

	}

}
