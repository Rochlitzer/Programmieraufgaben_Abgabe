package innereklassen;

public class Auto3 {
		private IMotor motor;
		public Auto3 (IMotor m){
			this.motor = m;
		}
		
		public void gibGas (int gewichtaufpedal){
			System.out.println("Beschleunige");
			motor.spritzufuhr(2);
		}

		public IMotor getMotor() {
			return motor;
		}

		public void setMotor(IMotor motor) {
			this.motor = motor;
		}
		
		
		
		

}
