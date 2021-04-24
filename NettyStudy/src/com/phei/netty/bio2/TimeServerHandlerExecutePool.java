package com.phei.netty.bio2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author lan
 * 2021年4月24日
 * TODO  封装成task，进入线程池
 */
public class TimeServerHandlerExecutePool {
	private ExecutorService executor;

	public TimeServerHandlerExecutePool(int maxPoolSize,int queueSize) {
		executor = new ThreadPoolExecutor(Runtime.getRuntime()
				.availableProcessors(),maxPoolSize,120L,TimeUnit.SECONDS,
				new ArrayBlockingQueue<java.lang.Runnable>(queueSize));
	}
	
	public void execute(java.lang.Runnable task) {
		executor.execute(task);
	}
	
	
}
