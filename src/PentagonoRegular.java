
public class PentagonoRegular {
	
	int lado;
	
	PentagonoRegular(int lado)
	{
		// manda a almacenar en la variable lado
		this.lado = lado;
	}
	
	int getLado()
	{
		// regresa lo almasenado en la variable lado
		return lado;
	}
	
	void setLado(int lado)
	{
		this.lado = lado;
	}
	
	int getPerimetro()
	{
		// regresa el total de la suma de todos los lados
		return lado*5;
	}

}
