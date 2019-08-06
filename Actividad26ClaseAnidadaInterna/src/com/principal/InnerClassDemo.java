package com.principal;

import com.principal.OuterClass.InnerClass;

public class InnerClassDemo {

	public static void main(String[] args) {
		OuterClass ou = new OuterClass();
		
		OuterClass.InnerClass innerObject = ou.new InnerClass();
	}

}
