package ExceptionsHW;

public class Tester1 {

	public static void main(String[] args) {
		try{
			//format for Employee (name,id,date) for identifying purposes
			// format for Worker (employee,shift,payrate)
			Employee correct = new Employee("kevin",1,"12/20/2016");
			ProductionWorker worker = new ProductionWorker(correct, 1,25);
			System.out.println("No Errors Were Found for first Production Worker ");
			
			//This demonstrates Invalid ID Number which is negative
			Employee incorrect1 = new Employee("kevin",-10101,"12/20/2016");
			ProductionWorker worker1 = new ProductionWorker(incorrect1, 1,25);
			
			//This One has incorrect shift.  0 for day 1 for night comment employee incorrect1 and worker 1 line to demonstrate Invalid shift
			Employee in = new Employee("kevin",35,"12/20/2016");
			ProductionWorker worker2 = new ProductionWorker(in, 3,25);
			
			//This one has incorrect PayRate =Negative  Just comment worker 2 line to demonstrate invalid payrate
			Employee incorrect3 = new Employee("kevin",40,"12/20/2016");
			ProductionWorker worker3 = new ProductionWorker(incorrect3, 1,-25);
		}
		catch(InvalidEmployeeNumber e){
			System.out.println(e.getMessage());
		}
		catch(InvalidShift e){
			System.out.println(e.getMessage());
		}
		catch(InvalidePayRate e){
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
