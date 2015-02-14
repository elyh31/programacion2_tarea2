//cree una clase publica con el nombre de Rectagunlo
public class Rectangulo {
	
	// se inicializan las variables
	int base;
	int altura;
	
	Rectangulo(int base, int altura)
	{
		//para enviar al almasenado en la variable base y altura
		this.base = base;
		this.altura = altura;
	}
	
	int getBase()
	{
		// regresar lo almasenado en la variable base
		return base;
	}
	
	void setBase(int base)
	{
		this.base = base;
	}
	
	int getAltura()
	{
		// regresar lo almasenado en la variable altura
		return altura;
	}
	
	void setAltura(int altura)
	{
		this.altura = altura;
	}
	
	int getArea()
	{
		// regresa la multiplicacion de la altuta por la base
		return altura*base;
	}
	
	int getPerimetro()
	{
		// regresa el total de la suma de todos los lados
		return (altura*2)+(base*2);
	}

}
