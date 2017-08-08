package array.simple;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Phi
 */
public class SimpleArray_Phi_T150990 {

	/**
	 * @param args
	 */

			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);		
				int n=0;
				try {
					System.out.println("nhap so phan tu ");
					n = scan.nextInt();
				}catch (Exception e) {
					System.out.print("nhap so phan tu nguyen duong");
				}
				int arr[] = new int[n];
				for (int i =0 ; i<n;i++) {
					System.out.print("Nhap phan tu ");
					arr[i] = scan.nextInt(); 
				}				
				for (int i =0; i<arr.length;i++) {
					if (arr[i]%7==0 || arr[i]%2==0) {
						System.out.println("cac so chia het cho 7 hoac 2 la "+arr[i]);
					}
				}
				for (int i =0; i<arr.length;i++) {
					if (arr[i]% 5==0 && arr[i]%3!=0) {
						System.out.print("cac so chia het cho 5 nhung khong chia het cho 3 la "+arr[i]);
					}
					
				}
							
}
}