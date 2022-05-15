package controller;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import view.CounterView;

public class CounterController implements Action{
	private CounterView counterView;
	public CounterController(CounterView counterView) {
		this.counterView = counterView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("UP")) {
			System.out.println(src);
			this.counterView.increasement();
		}
		else if (src.equals("DOWN")) {
			System.out.println(src);
			this.counterView.decreasement();
		}
		else if(src.equals("RESET")) {
			System.out.println(src);
			this.counterView.reset();
		}
	}
	@Override
	public Object getValue(String key) {
		return null;
	}
	@Override
	public void putValue(String key, Object value) {
		
	}
	@Override
	public void setEnabled(boolean b) {
		
	}
	@Override
	public boolean isEnabled() {
		return false;
	}
	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		
	}
	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		
	}
}
