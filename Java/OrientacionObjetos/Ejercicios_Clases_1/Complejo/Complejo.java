package Complejo;

import java.util.*;
public class Complejo
{
	protected double a, b;

	public Complejo(double parteReal, double parteImaginaria)
	{
		a = parteReal;
		b = parteImaginaria;
	}

	public final double GetReal()
	{
		return a;
	}

	public final void SetReal(double a)
	{
		this.a = a;
	}

	public final double GetImaginaria()
	{
		return b;
	}

	public final void SetImaginaria(double b)
	{
		this.b = b;
	}

	public final String toString()
	{
		return "(" + a + "," + b + ")";
	}

	public final double GetMagnitud()
	{
		return Math.sqrt((a * a) + (b * b));
	}

	public final void Add(Complejo c2)
	{
		a += c2.GetReal();
		b += c2.GetImaginaria();
	}
}