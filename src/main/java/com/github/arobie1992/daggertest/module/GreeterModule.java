package com.github.arobie1992.daggertest.module;

import com.github.arobie1992.daggertest.greeter.Greeter;
import com.github.arobie1992.daggertest.greeter.InformalGreeter;

import dagger.Binds;
import dagger.Module;

@Module(includes = InformalGreeterModule.class)
public interface GreeterModule {

	@Binds 
	Greeter bindsGreeter(InformalGreeter greeter);
	
}
