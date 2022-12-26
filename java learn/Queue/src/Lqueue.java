class dqueue{
	int key;
	dqueue next;
	public dqueue(int key){
		this.key=key;
		next=null;
	}
}
public class Lqueue {
    dqueue front,rear;
	public Lqueue() {
		this.front=this.rear=null;
	}
    void enqueue(int key) {
    	dqueue temp=new dqueue(key);
   	if(this.rear==null) {
    	this.rear=this.front=temp;	
    	}
   	this.rear.next=temp;
   	this.rear=temp;
    }
    void dequeue() {
    	if(this.front==null) {
    		return;
    	}
    	dqueue temp = this.front; 
        this.front = this.front.next; 
        if (this.front == null) 
            this.rear = null; 
    }  
    public static void main(String[] args) { 
    	        Lqueue q = new Lqueue(); 
    	        q.enqueue(10); 
    	        q.enqueue(20); 
    	        q.dequeue(); 
    	        q.dequeue(); 
    	        q.enqueue(30); 
    	        q.enqueue(40); 
    	        q.enqueue(50); 
    	        q.dequeue(); 
    	        System.out.println("Queue Front : " + q.front.key); 
    	        System.out.println("Queue Rear : " + q.rear.key); 
    	    } 
    	} 