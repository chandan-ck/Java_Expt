package com.test;
public class Person {
    private String name;
    private int age;
    // ...

    @Override
    public int hashCode() {
    	String abc="aaa";
        return this.name.hashCode()+this.age;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
    public boolean equals(Object obj) {
       if (!(obj instanceof Person))
            return false;
        if (obj == this && this.name.equals(obj.getClass().getName()) ) {
        	
        	
        	 return true;
        }
		return false;
           

        
    }

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}