package com.github.arobie1992.daggertest;

import com.github.arobie1992.daggertest.component.DaggerGreeterComponent;

public class Greeter {

	public static void main(String[] args) {
		var greeter = DaggerGreeterComponent.create().greeter();
		System.out.println(greeter.greet("Billy"));
	}
	
}
