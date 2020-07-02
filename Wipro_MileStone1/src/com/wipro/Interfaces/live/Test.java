package com.wipro.Interfaces.live;
import com.wipro.Interfaces.music.*;
import com.wipro.Interfaces.music.string.*;
import com.wipro.Interfaces.music.wind.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veena a=new Veena();
		Saxophone b=new Saxophone();
		a.play();
		b.play();
		Playable oa = new Veena();
		Playable ob = new Saxophone();
		oa.play();
		ob.play();
	}

}
