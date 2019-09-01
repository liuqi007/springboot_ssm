package com.jip.springboot_ssm.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class MyTimer {
	/**
	 * 定时任务
	 * fixedDelay:本次方法开始的时间点是上次任务结束的时候开始计算的
	 * fixedRate:本次方法开始的时间点是上次任务开始的时候计算的
	 * initialDelay:初始化等待的时间
	 * cron:定时任务表达式
	 * 由6(7)部分组成
	 * 秒 分 时 日期 月 星期 (年)
	 */
	@Scheduled(cron="0/2 * * * 1-2 *")
	public void task(){
		System.out.println("this is a timer test");
	}
}
