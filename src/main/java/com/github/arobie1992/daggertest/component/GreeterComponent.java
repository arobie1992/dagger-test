package com.github.arobie1992.daggertest.component;

import com.github.arobie1992.daggertest.greeter.Greeter;
import com.github.arobie1992.daggertest.module.GreeterModule;

import dagger.Component;

@Component(modules = GreeterModule.class)
public interface GreeterComponent {
	
	Greeter greeter();

}
