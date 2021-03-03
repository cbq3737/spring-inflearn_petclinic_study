package org.springframework.samples.petclinic.proxy;

import org.springframework.util.StopWatch;

public class Cashpert implements Payment{ //이게 일종의 프록시
	Payment cash =new Cash();
	@Override
	public void pay(int amount) {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		cash.pay(amount); //신용카드를 쓰는데 문제가 있으면 카드를 쓰는 것이다.

		stopWatch.stop();
		System.out.println(stopWatch.prettyPrint());
	}
}
