package com.aurionpro.composite.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements IBox{

	private final List<IBox> iboxes = new ArrayList<>();
	
	public CompositeBox(IBox...boxes) {
		iboxes.addAll(Arrays.asList(boxes));
	}
	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return iboxes.stream()
				.mapToDouble(IBox::calculatePrice)
				.sum();
	}

}
