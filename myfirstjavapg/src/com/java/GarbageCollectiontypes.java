package com.java;

public class GarbageCollectiontypes {

	    GarbageCollectiontypes ref;

	    // Method to demonstrate local reference
	    void localReference() {
	        GarbageCollectiontypes obj = new GarbageCollectiontypes();
	        System.out.println("5. Local Reference Object Created");
	    }

	    public static void main(String[] args) {

	        // 1. Nullifying the reference
	    	GarbageCollectiontypes obj1 = new GarbageCollectiontypes();
	        obj1 = null;
	        System.out.println("1. Object is eligible for GC by Nullifying Reference");

	        // 2. Reassigning the reference
	        GarbageCollectiontypes obj2 = new GarbageCollectiontypes();
	        GarbageCollectiontypes obj3 = new GarbageCollectiontypes();
	        obj2 = obj3;
	        System.out.println("2. Old Object is eligible for GC by Reassigning Reference");

	        // 3. Anonymous Object
	        new GarbageCollectiontypes();
	        System.out.println("3. Anonymous Object is eligible for GC");

	        // 4. Island of Isolation
	        GarbageCollectiontypes obj4 = new GarbageCollectiontypes();
	        GarbageCollectiontypes obj5 = new GarbageCollectiontypes();

	        obj4.ref = obj5;
	        obj5.ref = obj4;

	        obj4 = null;
	        obj5 = null;

	        System.out.println("4. Island of Isolation Objects are eligible for GC");

	        // 5. Local Reference Variable
	        GarbageCollectiontypes g = new GarbageCollectiontypes();
	        g.localReference();

	        System.out.println("5. Local Reference Object becomes eligible after method execution");

	        // Request Garbage Collection
	        System.gc();
	        System.out.println("Garbage Collection Requested");
	    }

}
