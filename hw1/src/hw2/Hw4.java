package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw4 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double[] weight = new double[4];
		double sum = 0;
		
		for(int i = 0; i < 4; i++) {
			System.out.print("몸무게를 입력하시오 : ");
			double user = Double.parseDouble(br.readLine());
			weight[i] = user;
			sum += user;
		}
		
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		
		for(int j = 0; j < 4; j++) {
			if(weight[j] > max){
				max = weight[j];
			}
			if(weight[j] < min) {
				min = weight[j];
			}
		}
		System.out.printf("최대값 = %.2f\n",max);
		System.out.printf("최소값 = %.2f\n",min);
		System.out.printf("합 = %.2f\n",sum);
		System.out.printf("평균 = %.2f\n",sum/4.0);
		
	}

}
