package com.github.arobie1992.daggertest.module;

import com.github.arobie1992.daggertest.greeter.InformalGreeter;

import dagger.Module;
import dagger.Provides;

@Module
public class InformalGreeterModule {

	@Provides
	public InformalGreeter providesInformalGreeter() {
		return new InformalGreeter();
	}
	
}
