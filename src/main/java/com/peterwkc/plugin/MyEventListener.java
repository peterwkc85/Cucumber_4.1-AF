package com.peterwkc.plugin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.peterwkc.initializer.ChromeInitializer;
import com.peterwkc.initializer.FirefoxInitializer;

import cucumber.api.event.ConcurrentEventListener;
import cucumber.api.event.EventHandler;
import cucumber.api.event.EventPublisher;
import cucumber.api.event.TestRunFinished;
import cucumber.api.event.TestRunStarted;


public class MyEventListener implements ConcurrentEventListener  {
	private static final Logger logger = LogManager.getLogger(MyEventListener.class);
	
	private ChromeInitializer ci;
	private FirefoxInitializer fi;
	
	private EventHandler<TestRunStarted> setup = event -> {
		logger.info("Testing Suite Setup");
		ci = ChromeInitializer.getInstance();
		fi = FirefoxInitializer.getInstance();
		
		ci.setup();
		fi.setup();
    };

    private EventHandler<TestRunFinished> teardown = event -> {
    	logger.info("Testing Suite teardown");
    	
    	ci.tearDown();
    	fi.tearDown();
    };

	@Override
	public void setEventPublisher(EventPublisher publisher) {
		publisher.registerHandlerFor(TestRunStarted.class, setup);
        publisher.registerHandlerFor(TestRunFinished.class, teardown);
	}

   
}
