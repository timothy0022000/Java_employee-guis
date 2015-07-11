/*
 * Name : Timothy Johnson
 * Eagle ID: 900725577
 * 
 * */
public class GP_Tester {

	public static void main(String agrs[]) {

		// create and and print Agent array objects
		Agent[] ag = new Agent[3];
		ag[0] = new Agent("1377031", "Timothy", "Johnson", "000000454",
				"tim@yahoo.com", .05);
		ag[1] = new Agent("251478", "Jane", "Cooper", "4782524678",
				"hotgirl00@hotmail.com", .04);
		ag[2] = new Agent("014597", "Ronricas", "Stevenson", "4782069874",
				"ron@yahoo.com", .07);

		for (int i = 0; i < ag.length; i++) {

			System.out.println(ag[i].toString());
		}

		System.out.println();

		// create and and print Cottage array objects
		Cottage[] cot = new Cottage[6];
		cot[0] = new Cottage("2891 Cooper rd", 8, 3, 1500, 150000, 900);
		cot[1] = new Cottage("710 georgia ave", 3, 2, 1200, 68000, 500);
		cot[2] = new Cottage("100 main st", 1, 1, 500, 25000, 450);
		cot[3] = new Cottage("145  Martin luther king", 3, 2, 1800, 45000, 600);
		cot[4] = new Cottage("4512 E. Simth rd", 2, 2, 20000, 78000, 500);
		cot[5] = new Cottage("1254 Eagle st.", 4, 2, 2647, 45000, 250);

		for (int i = 0; i < cot.length; i++) {

			System.out.println(cot[i].toString());
		}
		
		System.out.println(); 
		
		
		// create and and print Contract array objects
		Contract[] contract = new Contract[3];
		contract[0] = new SalesContract(2000000, 195000, 201000, "12/12/2012",
				cot[0], ag[0]);
		contract[1] = new RentalContract(5, 250, true, "12/04/2010", cot[4],
				ag[1]);
		contract[2] = new RentalContract(72, 325.00, true, "12/25/2010", cot[1],
				ag[2]);

		for (int i = 0; i < contract.length; i++) {

			System.out.println(contract[i].toString());
			System.out.println("Agent Commission Amount: $" + contract[i].agentCommissionPay());// print agent
																	// commission
																	// pay
			System.out.println("Amount Due: $" + contract[i].computeTotalDue());// print total
																// amount due
		}

	}

}
