package com.anurag.design.patterns.observer;


/**
 * observer pattern defines a one-to-many dependency bw objects so that when one object changes state, 
 * all its dependents are notified and updated automatically.
 * In observer pattern, there are many observers (subscriber objects) that are observing a 
 * particular subject (publisher object). 
 * Observers register themselves to a subject to get a notification 
 * when there is a change made inside that subject.
 * A real world example of observer pattern can be any social media platform such as Twitter. 
 * When a person updates his status – all his followers/subscribers(observers) gets the notification.
 */
public class ObserverPatternMain {

	public static void main(String[] args) {
		
		MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
        MessageSubscriberThree s3 = new MessageSubscriberThree();
         
        MessagePublisher p = new MessagePublisher();
        
        p.attach(s1);
        p.attach(s2);
        
        p.notifyUpdate(new Message("First Message"));   //s1 and s2 will receive the update
        
        p.detach(s1);
        p.attach(s3);
         
        p.notifyUpdate(new Message("Second Message")); //s2 and s3 will receive the update
    }
}
