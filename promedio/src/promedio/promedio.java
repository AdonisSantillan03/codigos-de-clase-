package promedio;

public class promedio {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			float nota1 = 80.9f, nota2=90.5f, nota3=60.0f;
			float promedio=(nota1+nota2+nota3)/3;
			if(promedio>= 70) {
				System.out.println("El estudiante Aprobo la materia con el promedio" + promedio);
			} else {
				System.out.println("El estudiante Reprobo la materia con el promedio");
			}
			

		}

	}

