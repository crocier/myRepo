package traning;
import java.util.Arrays;
import java.util.Scanner;

public class Lab006 {
	public static void main(String[] args) {
		int r=inputRow();
		int c=inputColumn();
		int[][] mat1= new int[r][c];
		int[][] mat2= new int[r][c];
		if(r==c)
		{
		//accepting input for 1st matrix
			mat1=inputMat1(mat1,r,c);
		//accepting input for 2nd matrix
			mat2=inputMat2(mat1,r,c); 
			//QUESTION 1 : calling addition method
			addMatrix(mat1,mat2,r,c);
			//calling subtraction method
			subMatrix(mat1,mat2,r,c);
		}
		else {
			System.out.println(" row size is not equal to column size for addition and subtraction:");
		}
		//calling multiplication method
		mulMatrix();
		
		//QUESTION 2: TRANSPOSE OF A MATRIX
		transpose();
		
		//QUESTION 3 CHECK IDENTITY MATRIX OR NOT
		checkIdentity();
		
		//QUESTION 5: CHECK SYMMETRIC METARIX OR NOT
		checkSymmetric();
		
		
	}
	static int inputRow() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the matrix row size:");
		int r=sc.nextInt();
		return r;
	}
	static int inputColumn() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the matrix colunm size:");
		int c= sc.nextInt();
		return c;
	}
	static int[][] inputMat1(int[][] mat1,int r,int c){
		//accepting input for 1st matrix
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println("Enter the number for Matrix 1" + " " + (i+1)+ "row and " + " "+(j+1) +"column:");
				mat1[i][j]=sc.nextInt();
	          }
		}
		return mat1;
		
	}
	static int[][] inputMat2(int[][] mat2,int r,int c){
		//accepting input for 1st matrix
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println("Enter the number for Matrix 1" + " " + (i+1)+ "row and " + " "+(j+1) +"column:");
				mat2[i][j]=sc.nextInt();
	          }
		}
		return mat2;
		
	}
	static void addMatrix(int[][] mat1,int[][] mat2,int r,int c) {
		//adding 2 matrixes
		int[][] mat3= new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				mat3[i][j]=mat1[i][j]+mat2[i][j];
			}	
		}
		String addMat=Arrays.deepToString(mat3);
		System.out.println("Addition of 2 matrix:"+" "+addMat);
	}
	static void subMatrix(int[][] mat1,int[][] mat2,int r,int c) {
		//subtracting 2 matrixes
		int[][] mat4= new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				mat4[i][j]=mat1[i][j]-mat2[i][j];
			}	
		}
		String subMat=Arrays.deepToString(mat4);
		System.out.println("Subtraction of 2 matrix:"+" "+subMat);
	}
	static void mulMatrix() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the 1st Matrix row size:");
		int r1=sc.nextInt();
		System.out.println("Enter the 1st Matrix column size:");
		int c1=sc.nextInt();
		System.out.println("Enter the 2nd Matrix row size:");
		int r2=sc.nextInt();
		System.out.println("Enter the 2nd Matrix column size:");
		int c2=sc.nextInt();
		int[][] mat1= new int[r1][c1];
		int[][] mat2= new int[r2][c2];
		int[][] mat3= new int[r1][c2];
		if(c1==r2) {
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c1;j++) {
					System.out.println("Enter the number for Matrix 1" + " " + (i+1)+ "row and " + " "+(j+1) +"column:");
				    mat1[i][j]=sc.nextInt();
				    }
				}
			for(int i=0;i<r2;i++) {
				for(int j=0;j<c2;j++) {
					System.out.println("Enter the number for Matrix 2" + " " + (i+1)+ "row and " + " "+(j+1) +"column:");
				    mat2[i][j]=sc.nextInt();
				    }
				}
			String displaymat1=Arrays.deepToString(mat1);
			System.out.println("Matrix 1:"+" "+displaymat1);
			String displaymat2=Arrays.deepToString(mat2);
			System.out.println("Matrix 2:"+" "+displaymat2);
			
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++) {
				     mat3[i][j]=0;
				     for(int k=0;k<c1;k++) {
				    	 mat3[i][j]+=mat1[i][k]*mat2[k][j];
				       }
				    }
				}
			}
		else {
			System.out.println("Enter the 1st matrix column equal to 2nd matrix row to perform multiplication:");
			mulMatrix();
		}
		String displaymat3=Arrays.deepToString(mat3);
		System.out.println("Multiplication of 2 matrix:"+" "+displaymat3);
	}
	static void transpose() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Matrix row size:");
		int r=sc.nextInt();
		System.out.println("Enter the Matrix column size:");
		int c=sc.nextInt();
		int[][] mat= new int[r][c];
		int[][] transMat=new int[c][r];
		mat=inputMat1(mat,r,c);
		String displaymat=Arrays.deepToString(mat);
		System.out.println("Multiplication of 2 matrix:"+" "+displaymat);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				transMat[j][i]=mat[i][j];
			}
		}
		String displaytrans=Arrays.deepToString(transMat);
		System.out.println("Multiplication of 2 matrix:"+" "+displaytrans);
	}
	static void checkIdentity() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Matrix row or column size:");
		int N=sc.nextInt();
		int[][] mat= new int[N][N];
		mat=inputMat1(mat,N,N);
		String displaymat=Arrays.deepToString(mat);
		System.out.println("Multiplication of 2 matrix:"+" "+displaymat);
		int c=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(i==j) {
					if(mat[i][j]==1)
						c++;
				}		
			}
		}
		if(c==N) {
			String displayidmat=Arrays.deepToString(mat);
		    System.out.println("Multiplication of 2 matrix:"+" "+displayidmat);
			System.out.println("It is Identity Matrix");
		}
		else
			System.out.println("It is not an Identity Matrix");
	}
	static void checkSymmetric() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Matrix row size:");
		int r=sc.nextInt();
		System.out.println("Enter the Matrix column size:");
		int c=sc.nextInt();
		if(r==c) {
			int[][] mat= new int[r][c];
			mat=inputMat1(mat,r,c);
			String displaymat=Arrays.deepToString(mat);
			System.out.println("Entered matrix:"+" "+displaymat);
			int flag=0;
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(mat[j][i]!=mat[i][j])
						flag=1;
				}
			}
			if(flag==0)
				System.out.println("It is a symmetric matric");
			else 
				System.out.println("It is not a symmetric matric");
		}
		else
			System.out.println("It is not a symmetric matric (row not equal to column)");
	}
}
