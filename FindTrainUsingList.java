package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindTrainUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> trainNames=Arrays.asList("Rajasthan","Allapy","Shatharpthy","Allapy","Pallavan","Vaigai");
		List<String> trainNames=new ArrayList<String>();
		trainNames.add("Rajasthan");
		trainNames.add("Allaphy");
		trainNames.add("Shatharpthy");
		trainNames.add("Allaphy");
		trainNames.add("Pallavan");
		trainNames.add("Vaigai");
		
		System.out.println(trainNames);//Default Array(input)
		Collections.sort(trainNames);//Sorted Array
		System.out.println(trainNames);//displays sorted array
		System.out.println(trainNames.size());//Get the Size of the array
		System.out.println(trainNames.get(trainNames.size()-1));//print last train name(size-1)
		System.out.println(trainNames.get(trainNames.size()-2));//print last but one train name(size-2)
	}

}
