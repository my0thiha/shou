package com.mmit_day5;

public class Array_3 {
		public static void main(String[] args) {
			int [][] data = {
					{1,2},
					{1,2,3,4},
					{1,2,3}
			};
			
			for(var i= 0;i< data.length;i++) {
				for(var j=0; j < data[i].length;j++) {
					System.out.println(data[i][j] + "\t");
				}
			}
	}
}
