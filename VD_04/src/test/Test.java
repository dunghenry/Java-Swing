package test;

import model.CounterModel;
import view.CounterView;

public class Test {
	public static void main(String[] args) {
		CounterModel counter = new CounterModel();
		counter.increasement();
		counter.increasement();
		counter.increasement();
		System.out.println(counter.getValue());
		
		CounterView counterView = new CounterView();
		
	}
}
