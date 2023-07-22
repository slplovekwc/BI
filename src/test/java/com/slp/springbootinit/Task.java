package com.slp.springbootinit;

import java.util.UUID;

/**
 * @author 孙乐平
 * @version 1.0
 */
public class Task implements Runnable{
    public static void main(String[] args) {
        Task task = new Task();
        String taskId = task.getTaskId();
        System.out.println("taskId: " + taskId);
        new Thread(task,"T1").start();
    }

    private String taskId;

    public String getTaskId() {
        return taskId;
    }

    public Task() {
        this.taskId =UUID.randomUUID().toString();
    }

    @Override
    public void run() {
        System.out.println("我运行啦！");
    }
}
