// - CSC 251 Project 2
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner; 

public class PolicyTwo { // - Use the following guidelines to create the Policy class:
    private int policyNumber; // - Policy Number
    private String providerName; // - Provider Name
    private String policyholderFirstName; // - Policyholder’s First Name
    private String policyholderLastName; // - Policyholder’s Last Name
    private int policyholderAge; // - Policyholder’s Age
    private String policyholderSmokingStatus; // - Policyholder’s Smoking Status (will be “smoker” or “non-smoker”)
    private double policyholderHeight; // - Policyholder’s Height (in inches)
    private double policyholderWeight; // - Policyholder’s Weight (in pounds)
    
    public PolicyTwo() { // - Include a no-arg constructor (set default values for all fields)
        this.policyNumber = 0;
        this.providerName = "";
        this.policyholderFirstName = "";
        this.policyholderLastName = "";
        this.policyholderAge = 0;
        this.policyholderSmokingStatus = "";
        this.policyholderHeight = 0.0;
        this.policyholderWeight = 0.0;
    }
    
    // - Include a constructor that accepts arguments (it must accept all necessary arguments to fully initialize the Policy object)
    public PolicyTwo(int policyNumber, String providerName, String policyholderFirstName, String policyholderLastName, int policyholderAge, String policyholderSmokingStatus, double policyholderHeight, double policyholderWeight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyholderFirstName = policyholderFirstName;
        this.policyholderLastName = policyholderLastName;
        this.policyholderAge = policyholderAge;
        this.policyholderSmokingStatus = policyholderSmokingStatus;
        this.policyholderHeight = policyholderHeight;
        this.policyholderWeight = policyholderWeight;
    }
        
     // - Include appropriate setters and getters (i.e., mutator and accessor methods) for each field
    public int getPolicyNumber() { // -  getPolicyNumber
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) { // - setPolicyNumer
        this.policyNumber = policyNumber;
    }

    public String getProviderName() { // - getProviderName
        return providerName;
    }

    public void setProviderName(String providerName) { // - setProviderName
        this.providerName = providerName;
    }

    public String getPolicyholderFirstName() { // - getPolicyholderFirstName
        return policyholderFirstName;
    }

    public void setPolicyholderFirstName(String policyholderFirstName) { // - setPolicyholderFirstName
        this.policyholderFirstName = policyholderFirstName;
    }

    public String getPolicyholderLastName() { // - getPolicyholderLastName
        return policyholderLastName;
    }

    public void setPolicyholderLastName(String policyholderLastName) { // - setPolicyholderLastName
        this.policyholderLastName = policyholderLastName;
    }

    public int getPolicyholderAge() { // - getPolicyholderAge
        return policyholderAge;
    }

    public void setPolicyholderAge(int policyholderAge) { // - setPolicyholderAge
        this.policyholderAge = policyholderAge;
    }

    public String getPolicyholderSmokingStatus() { // - getPolicyholderSmokingStatus
        return policyholderSmokingStatus;
    }

    public void setPolicyholderSmokingStatus(String policyholderSmokingStatus) { // - setPolicyholderSmokingStatus
        this.policyholderSmokingStatus = policyholderSmokingStatus;
    }

    public double getPolicyholderHeight() { // - getPolicyholderHeight
        return policyholderHeight;
    }

    public void setPolicyholderHeight(double policyholderHeight) { // - setPolicyholderHeight
        this.policyholderHeight = policyholderHeight;
    }

    public double getPolicyholderWeight() { // - getPolicyholderWeight
        return policyholderWeight;
    }

    public void setPolicyholderWeight(double policyholderWeight) { // - setPolicyholderWeight
        this.policyholderWeight = policyholderWeight;
    }
    
    
    public double calcBMI() { // - BMI = (Policyholder’s Weight * 703 ) / (Policyholder’s Height2 )
        return (policyholderWeight * 703) / Math.pow(policyholderHeight, 2);
    }
    
    public double calcPolicyCost() { // - Include a method that calculates and returns the price of the insurance policy*
        double baseFee = 600.0; // - The Insurance Policy has a base fee of $600
        double additionalFee = calcAdditionalFee(); // - 
        if (policyholderAge > 50) { // - If the Policyholder is over 50 years old, there is an additional fee of $75
            additionalFee += 75.0;
        }
        if (policyholderSmokingStatus.equals("smoker")) { // - If the Policyholder is a smoker, there is an additional fee of $100
            additionalFee += 100.0;
        }
        return baseFee + additionalFee;
    }
    
    public double calcAdditionalFee() {
        double bmi = calcBMI();
        double additionalFee = 0.0;
        if (bmi > 35) { // - If the Policyholder has a BMI of over 35, there is an additional fee calculated as follows:
            additionalFee = (bmi - 35) * 20; // - Additional Fee = ( BMI – 35 ) * 20
        }
        return additionalFee;
    }
   
 public void printPolicyDetails() { // - Print all details provided by user input
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Provider Name: " + providerName);
        System.out.println("Policyholder's First Name: " + policyholderFirstName);
        System.out.println("Policyholder's Last Name: " + policyholderLastName);
        System.out.println("Policyholder's Age: " + policyholderAge);
        System.out.println("Policyholder's Smoking Status: " + policyholderSmokingStatus);
        System.out.println("Policyholder's Height: " + policyholderHeight + " inches");
        System.out.println("Policyholder's Weight: " + policyholderWeight + " pounds");
        }

public static void main(String[] args) { 
	ArrayList<PolicyTwo> policyList=new ArrayList<PolicyTwo>();
    Scanner input = new Scanner(System.in); // - Ask user for input details
    
    int policyNumber; // - Policy Number
    String providerName; // - Provider Name
    String policyholderFirstName; // - Policyholder’s First Name
    String policyholderLastName; // - Policyholder’s Last Name
    int policyholderAge; // - Policyholder’s Age
    String policyholderSmokingStatus; // - Policyholder’s Smoking Status (will be “smoker” or “non-smoker”)
    double policyholderHeight; // - Policyholder’s Height (in inches)
    double policyholderWeight; // - Policyholder’s Weight (in pounds)
    int smokers = 0;
    int nonSmokers =0;
    Scanner file;
		try {
			file = new Scanner(new File("PolicyInformation.txt"));
			while(file.hasNext())
			{
				policyNumber=Integer.parseInt(file.nextLine());
				providerName=file.nextLine();
				policyholderFirstName=file.nextLine();
				policyholderLastName=file.nextLine();
				policyholderAge=Integer.parseInt(file.nextLine());
            policyholderSmokingStatus=file.nextLine();
				policyholderHeight=Double.parseDouble(file.nextLine());
				policyholderWeight=Double.parseDouble(file.nextLine());
				if(file.hasNext())
				{
				file.nextLine();
				}
				//create a Policy object
				PolicyTwo policyTwo = new PolicyTwo(policyNumber, providerName, policyholderFirstName, policyholderLastName, policyholderAge, policyholderSmokingStatus, policyholderHeight, policyholderWeight);
				policyList.add(policyTwo);
			}


			System.out.println("Policy Information:\n");
			for(PolicyTwo policyTwo:policyList)
			{

				//display information about the Policy
				System.out.println("Policy Number: " + policyTwo.getPolicyNumber());
				System.out.println("Provider Name: " + policyTwo.getProviderName());
				System.out.println("Policyholder's First Name: " + policyTwo.getPolicyholderFirstName());
				System.out.println("Policyholder's Last Name: " + policyTwo.getPolicyholderLastName());
				System.out.println("Policyholder's Age: " + policyTwo.getPolicyholderAge());
				System.out.println("Policyholder's Smoking Status: " + policyTwo.getPolicyholderSmokingStatus());
				System.out.println("Policyholder's Height: " + policyTwo.getPolicyholderHeight() + " inches");
				System.out.println("Policyholder's Weight: " + policyTwo.getPolicyholderWeight() + " pounds");
				System.out.println();
            if (policyTwo.getPolicyholderSmokingStatus().equals("smoker")) {
                smokers++;
            } 
            else {
                nonSmokers++;
            }
        
        System.out.printf("Number of Policyholders that are smokers: %d\n", smokers);
        System.out.printf("Number of Policyholders that are non-smokers: %d\n", nonSmokers);
      }
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
         
       
         
		}

		}
		
	}