
public class DPLQ {
	private Node head;
	private Node tail;
	private int size;

	int last0; int last1;int last2;int last3;int count0;int count1;int count2;int tour0;int tour1;int tour2;int tour3;

//DOUBLE PRIORITY LINK QUEUE
	public DPLQ()
	{
		size = 0;
		head = null;
		tail = null;
		last0 = 0;
		last1 = 0;
		last2 = 0;
		last3 = 0;
		tour0 = 1;
		tour1 = 1;
		tour2 = 1;
		tour3 = 1;
		count0 = 0;
		count1 = 0;
		count2 = 0;
	}

	public void add(Customer p)
	{  
		Node newnode = new Node(p);
		boolean flag = true;
		boolean flag1 = true;
		boolean flag2 = true;

		if(p.getPriority() == 0){count0++;}
		else if(p.getPriority() == 1){count1++;}
		else if(p.getPriority() == 2 ){count2++;}

		if(head == null && tail == null)
		{
			head = newnode;
			tail = newnode;
			if(p.getPriority() == 0){p.setTour(tour0);}
			else if(p.getPriority() == 1){p.setTour(tour1);}
			else if(p.getPriority() == 2 ){p.setTour(tour2);}
			else if(p.getPriority() == 3) {p.setTour(tour3); tour3++;}
			size++;
		}

		else{
			Node temp1=head;  
			int c = 1;
			int c1 = 0;

			if( p.getPriority() == 0 && count0 == 6)
			{
				int x = 1;
				c1 = last0;
				size++;
				while(c1 != c)
				{
					temp1 = temp1.getNext();
					c++;
				}
				while( temp1.getNext() != null)
				{
					
					if(temp1.getX().getTour() != temp1.getNext().getX().getTour())
					{break;}
					temp1 = temp1.getNext();
					x++;
					
				}
				if(temp1.getNext() == null)
				{
					newnode.setPrev(tail);
					tail.setNext(newnode);
					tail = newnode;
				}
				else
				{
					temp1.getNext().setPrev(newnode);
					newnode.setNext(temp1.getNext());
					newnode.setPrev(temp1);
					temp1.setNext(newnode);
				}
				tour0 = tour0 + 1;
				newnode.getX().setTour(tour0);
				last0 = last0 + x;
				if(last1 > last0){last1++;}
				else{last1 = last0;}
				if(last2 > last0){last2++;}
				else{last2 = last0;}
				if(last3 > last0){last3++;}
				else{last3 = last0;;}
                 tour1++;
                 tour2++;
                tour3++;
				count0 = 1;
				count1 = 0;
				count2 = 0;
				flag = false;


			}
			else if(p.getPriority() == 1 && count1 == 4)
			{
				int x1 = 1;
				c1 = last1;
				size++;
				while(c1 != c)
				{
					temp1 = temp1.getNext();
					c++;
				}
				while( temp1.getNext() != null)
				{
				
					if(temp1.getX().getTour() != temp1.getNext().getX().getTour())
					{break;}
					temp1 = temp1.getNext();
					x1++;
					
				}
				if(temp1.getNext() == null)
				{
					newnode.setPrev(tail);
					tail.setNext(newnode);
					tail = newnode;
				}
				else
				{
					temp1.getNext().setPrev(newnode);
					newnode.setNext(temp1.getNext());
					newnode.setPrev(temp1);
					temp1.setNext(newnode);
				}
				tour1 = tour1+1;
				newnode.getX().setTour(tour1);
				last1 = last1+ x1;

				if(last2 > last1){last2++;}
				else{last2 = last1;}
				if(last3 > last1){last3++;}
				else{last3 = last1;}
				count1 = 1;
				count2 = 0;
				tour2++;
				tour3++;
				flag1 = false;

			}
			else if(p.getPriority() == 2 && count2 == 3)
			{
				size++;
				int x2 = 1;
				c1 = last2;
				size++;
				while(c1 != c)
				{
					temp1 = temp1.getNext();
					c++;
				}
				while( temp1.getNext() != null)
				{
					
					if(temp1.getX().getTour() != temp1.getNext().getX().getTour())
					{break;}
					temp1 = temp1.getNext();
					x2++;
					
				}
				if(temp1.getNext() == null)
				{
					newnode.setPrev(tail);
					tail.setNext(newnode);
					tail = newnode;
				}
				else
				{
					temp1.getNext().setPrev(newnode);
					newnode.setNext(temp1.getNext());
					newnode.setPrev(temp1);
					temp1.setNext(newnode);
				}
				tour2 = tour2 + 1;
				newnode.getX().setTour(tour2);
				last2 = last2+ x2;


				if(last3 > last2){last3++;}
				else{last3 = last2;;}
				count2 = 1;
				tour3++;

				flag2 = false;
			}

			if(p.getPriority() == 0 && flag == true ){ c1 = last0; p.setTour(tour0);}
			else if(p.getPriority() == 1&& flag1 == true){c1 = last1; p.setTour(tour1);}
			else if(p.getPriority() == 2&& flag2 == true){ c1 = last2; p.setTour(tour2);}
			else if(p.getPriority() == 3){c1 = last3; p.setTour(tour3); tour3 = tour3+1; }


			if(flag == true && flag1 == true && flag2 == true )
			{	
				if(c1 - size == 0)
				{

					newnode.setPrev(tail);
					tail.setNext(newnode);
					tail = newnode;
					size++;
				}
				else if(c1 == 0)
				{
					newnode.setNext(head);
					head.setPrev(newnode);
					head = newnode;
					size++;
				}


				else{
					while(c1 != c)
					{
						temp1 = temp1.getNext();
						c++;
					}
					temp1.getNext().setPrev(newnode);
					newnode.setNext(temp1.getNext());
					newnode.setPrev(temp1);
					temp1.setNext(newnode);
					size++;
				}

			}
		}


		if(p.getPriority() == 0 && flag == true){ last0++; last1++; last2++; last3++;}
		else if(p.getPriority() == 1 &&flag1 == true  ){last1++; last2++; last3++;}
		else if(p.getPriority() == 2 && flag2 == true){last2++; last3++;}
		else if(p.getPriority() == 3){last3++;}




	}
	public void Remove()
	{
		Node temp3;
		temp3 = head;
		System.out.print(temp3.getX().getName() + " is process - " + temp3.getX().getPriority());
		head=temp3.getNext();
		if(temp3.getX().getPriority() == 0)
		{ last0--; last1--; last2--; last3--;}
		else if(temp3.getX().getPriority() == 1)
		{ last1--; last2--; last3--;}
		else if(temp3.getX().getPriority() == 2)
		{ last2--; last3--;}
		else if(temp3.getX().getPriority() == 3){last3--;}
		size--;

	}
	public void Display()
	{
		String output = "";

		Node temp = head;

		while(temp != null)
		{
			output += temp.getX().getPriority() + "       ";
			temp = temp.getNext();
		}

		System.out.println(output);
	}
}
