package com.wdsun.summary.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * 缓存线程
 */
public class CreateCacheThreadPool {
    public static void main(String[] args) throws InterruptedException{
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;

            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("线程：" + Thread.currentThread().getName()
                                + " 正在执行 的 task: " + taskId);
                        Thread.sleep(500);
                    } catch (InterruptedException ignored) {
                    }
                }
            });
        }
        cachedThreadPool.shutdown();
    }
}
