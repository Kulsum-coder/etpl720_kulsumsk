package com.evergent.corejava.Task3;

import java.util.HashSet;
import java.util.Set;

import com.evergent.corejava.Task2.Book;

public class FlowersImp implements FlowerInterface{
	Set<Flowers> flowerset=null;
	public FlowersImp() {
		flowerset=new HashSet<Flowers>();
	}
	
	public String addFlower(Flowers b) {
		flowerset.add(b);
		return b.getflower();
	}
		
	public String addflower(Flowers b) {
		boolean b1=false;
		if(flowerset.size()>0 && flowerset!=null){
			for(Flowers flower:flowerset){
				if(flower.getflower().equals(flower)){
					System.out.println(flower.getflower()+" "+flower.getcolor()+" "+flower.getPrice());	
					b1=true;
					break;	
				}
			}
		}
		if(!b1)
			System.out.println("The flower is not found");
		return null;
			
	}

	@Override
	public void searchBycolor(String flower) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllFlowers() {
		// TODO Auto-generated method stub
		
	}

}


