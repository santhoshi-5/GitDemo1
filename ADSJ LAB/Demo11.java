class Demo11{

    public static Deque<Integer> queueFunction(Deque<Integer> stack){
	Deque<Integer> outQueue=new ArrayDequeue<Integer>();
	Deque<Integer> tempQueue=new ArrayDequeue<Integer>();

	while(stack.peek()!=null) {
		Integer value=stack.pop();
		if(value%2 == 0)
			outQueue.add(value);
	else
		tempQueue.add(value);
	}
	Integer temp=0;
	while(tempQueue.peek()!=null) {
		temp +=tempQueue.poll();
		outQueue.add(temp);
	}
	return outQueue;
}
public static void main(String[] args)
{
    Deque<Integer> d = new Deque<>();
    d.add(7);
    d.add(6);
    d.add(9);
    d.add(1);
    d.add(2);
    queueFunction(d);
    System.out.println("chceking git again");
    System.out.println("i am f direcoty one ");
    System.out.println("this code is written by develp branch")
}
}