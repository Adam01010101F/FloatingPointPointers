package src.Assn10;

class Assn10 {
	public static void main(String[] args) {
		System.out.println("i. Floating point number converter.\n");
		float pi = (float) 3.14159265358979;
		System.out.println(pi + " -> " + convertFloat(pi) + "\n");

		 System.out.println( "\nii. Floating point number enumeration.\n");
		 float fp = (float) 0.0;
		 int i = 0;
		 while (fp < 1.4E-44) {
		 	System.out.println((++i) + ("th number: ") + (fp = nextFloat(fp)) + "\n");
		 }

		// System.out.println(); "\niii. Floating point number counting\n";
		// unsigned int posFPs = countBetween(0.0, FLT_MAX);
		// unsigned int zeroOneFPs = countBetween(0.0, 1.0);
		// System.out.println("Number of positive floating point numbers: " + posFPs + "\n");
		// System.out.println("Number of floating point numbers between 0 and 1: " + zeroOneFPs + "\n");
		// System.out.println("Proportion (# of 0~1) / (# of positive): " + ((double) zeroOneFPs / (double) posFPs * 100.0) + "%\n");

		// if (argc != 2) {
		// 	cerr << "\niv. Pass the data file name\n";
		// 	return 0;
		// }
		// System.out.println("\niv. Floating point number distribution\n");
		// ofstream datafile;
		// datafile.open(argv[1]);
		// float lower = 0.0, upper, interval = 100.0;
		// for (int i = 0; i < 100; i++) {
		// 	upper = lower + interval;
		// 	datafile << countBetween(lower, upper) << "\n"
		// 	lower = upper;
		// }
		// datafile.close();
		// System.out.println("The output file is ready. Execute \"Python3 Assn9.py" << argv[1] << "\"\n");
	}


	static String convertFloat(float number) {
		String floatVars = null;
		int fBits = Float.floatToIntBits(number);   //Converts float to hex-int equiv
        int sign = (fBits & 0x80000000) >> 31;
        int exp = (fBits & 0x7f800000) >> 23;
        int mantissa = (fBits & 0x007fffff);
        floatVars = '(' + Integer.toString(sign) + "," + Integer.toString(exp) + "," + Integer.toString(mantissa) + ')';
		return floatVars;
	}

     static float nextFloat(float number) {
        int fBits = Float.floatToIntBits(number);   //Converts float to hex-int equiv
//		 int num = Float.valueOf(fBits).floatValue() + (float) 1.4E-45;
        System.out.println("\tnumber: " + number
                        +"\tfBits: " + fBits
                        +"\tnum: " );
        return num;
     }

//     static int incrInt(int number){
//
//     }

// unsigned int countBetween(float lower, float upper) {
// 	unsigned int lower_i = *((unsigned int*) &lower);
// 	unsigned int upper_i = *((unsigned int*) &upper);

// 	return upper_i - lower_i;
// }
}
