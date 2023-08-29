

		System.out.println("enter m elements");
		for(int i=0;i<m;i++) {
			a[i]=input.nextInt();
		}
		System.out.println("enter n values");
		int n=input.nextInt();
		int[] b=new int[n];
		System.out.println("enter n elements");
		for(int i=0;i<n;i++) {
			b[i]=input.nextInt();
		}
		int[] c=new int[m+n];
		for(int i=0;i<m+n;i++) {
			c[i]=input.nextInt();
		}
		for(int i=0;i<m+n;i++) {
			c[i]=a[i];
			c[i]=b[i];
		}
		int i,j;
		for(j=0;j<m;j++) {
			for(i=0;i<m-1;i++) {
				if(a[i]>a[i+1]) {
					
					a[i]=a[i]+a[i+1];
					a[i+1]=a[i]+a[i+1];
					a[i]=a[i]-a[i+1];
					
				}
			}
			
		}
		for(j=0;j<n;j++) {
			for(i=0;i<n-1;i++) {
				if(b[i]<b[i+1]) {
					b[i]=b[i]+b[i+1];
					b[i+1]=b[i]+b[i+1];
					b[i]=b[i]-b[i+1];
						
				}
			}
		}
		System.out.println("Sorting Elements in Ascending......");
		for(i=0;i<m;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("\nSorting Elements in Descending......");
		for(i=0;i<n;i++) {
			System.out.print(b[i]+ " ");
		}
	}
}
		

