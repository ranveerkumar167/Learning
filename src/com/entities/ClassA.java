package com.entities;

public class ClassA {
private int a;
private int b;
public int getA() {
	return a;
}

public ClassA() {
	this(10, 20);
}

public ClassA(int a , int b) {
	this.a = a;
	this.b = b;
}

public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
@Override
public String toString() {
	return "ClassA [a=" + a + ", b=" + b + "]";
}

public void setB(int b) {
	this.b = b;
}

public static int sum(int a , int b) {
	return a+b;
}
}

