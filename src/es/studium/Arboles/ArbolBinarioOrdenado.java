package es.studium.Arboles;

public class ArbolBinarioOrdenado
{
	private ArbolBinarioOrdenado izquierda;
	private Integer valor;
	private ArbolBinarioOrdenado derecha;

	// Constructores
	public ArbolBinarioOrdenado()
	{
		this.izquierda = null;
		this.setValor(null);
		this.derecha = null;
	}

	public ArbolBinarioOrdenado(Integer v)
	{
		this.izquierda = null;
		this.setValor(v);
		this.derecha = null;
	}
	public ArbolBinarioOrdenado( ArbolBinarioOrdenado a) {
		
		//DavidSánchezCabello
		//Constructor que devuelve un árbol con las especificaciones del árbol raíz
		this.izquierda = a.izquierda;
		this.setValor(a.getValor());
		this.derecha = a.derecha;
		
	}
	public ArbolBinarioOrdenado(ArbolBinarioOrdenado i, Integer v, ArbolBinarioOrdenado d)
	{
//		ArbolBinarioOrdenado resultado = new ArbolBinarioOrdenado();
//		
//		resultado.izquierda = this.izquierda ;
//		resultado.setValor(v);
//		resultado.derecha = this.derecha ;
		
		
		// Completar æææ
	}

	// Setters y Getters
	public ArbolBinarioOrdenado getIzquierda()
	{
		return izquierda;
	}

	public void setIzquierda(ArbolBinarioOrdenado izquierda)
	{
		this.izquierda = izquierda;
	}

	public Integer getValor()
	{
		return valor;
	}

	public void setValor(Integer valor)
	{
		this.valor = valor;
	}

	public ArbolBinarioOrdenado getDerecha()
	{
		return derecha;
	}

	public void setDerecha(ArbolBinarioOrdenado derecha)
	{
		this.derecha = derecha;
	}

	// Otros inspectores
	public void add(Integer v)
	{
		if (v < this.valor)
		{
			if (izquierda != null)
			{
				izquierda.add(v);
			} else
			{
				izquierda = new ArbolBinarioOrdenado(v);
			}
		} else
		{
			if (derecha != null)
			{
				derecha.add(v);
			} else
			{
				derecha = new ArbolBinarioOrdenado(v);
			}
		}
	}

	public String mostrar()
	{
		String cadena = "[Valor=" + getValor() + ", Izquierda=" + getIzquierda() + ", Derecha=" + getDerecha() + "]";
		return cadena;
		// Completar æææ
	}

	public boolean buscar(Integer v)
	{
		boolean resultado = false;
		if (v == this.valor)
		{
			resultado = true;
		} else if (v < this.valor)
		{
			if (this.izquierda != null)
			{
				resultado = this.izquierda.buscar(v);
			} else
			{
				resultado = false;
			}
		} else
		{
			if (this.derecha != null)
			{
				resultado = this.derecha.buscar(v);
			} else
			{
				resultado = false;
			}
		}
		return resultado;
	}

	public void mostrarIn()
	{
		if (izquierda != null)
		{
			izquierda.mostrarIn();
		}
		if (valor == null)
		{
			System.out.println("Árbol vacío");
		} else
		{
			System.out.println(valor);
		}
		if (derecha != null)
		{
			derecha.mostrarIn();
		}
	}

	public void mostrarPre()
	{
		if (valor == null)
		{
			System.out.println("Árbol vacío");
		} else
		{
			System.out.println(valor);
		}
		if (izquierda != null)
		{
			izquierda.mostrarPre();
		}
		if (derecha != null)
		{
			derecha.mostrarPre();
		}
		
	}

	public void mostrarPos()
	{
		if (izquierda != null)
		{
			izquierda.mostrarPos();
		}
		if (derecha != null)
		{
			derecha.mostrarPos();
		}
		if (valor == null)
		{
			System.out.println("Árbol vacío");
		} else
		{
			System.out.println(valor);
		}
	}

	/*
	 * A partir de aquí
	 */
	public void anular()
	{
		izquierda = null;
		derecha = null;
		setValor(null);

	}

	public boolean arbolVacio()
	{
		boolean vacio = false;

		if ((this.izquierda == null) && (this.derecha == null) && (valor == null))
		{

			vacio = true;

		} else
		{
			vacio = false;
		}
		return vacio;
		// Completar
	}

	public ArbolBinarioOrdenado construirArbol(ArbolBinarioOrdenado izquierdo, int valor, ArbolBinarioOrdenado derecho)
	{
		ArbolBinarioOrdenado union = new ArbolBinarioOrdenado();
		return union;
	}

	public ArbolBinarioOrdenado hijoIzquierdo()
	{
		ArbolBinarioOrdenado hijoI = new ArbolBinarioOrdenado();
		hijoI = this.izquierda;
		return hijoI;
	}

	public ArbolBinarioOrdenado hijoDerecho()
	{
		ArbolBinarioOrdenado hijoD = new ArbolBinarioOrdenado();
		hijoD = this.derecha;
		return hijoD;
	}

	public int raiz()
	{
		return valor;
	}

	public boolean esHoja(int v)
	{
		boolean resultado = true;
		// Si el parametro que le pasamos al método no tiene un nodo ni a derecha ni
		// izquierda
		if ((this.izquierda == null) && (this.derecha == null))
		{
			resultado = true;
		} else
		{

			resultado = false;
		}

		return resultado;
	}

	public void eliminarArbol()
	{
		this.izquierda = null;
		this.valor = null;
		this.derecha = null;
		
		//!!El recolector eliminará el objeto !!
	}

	public int altura()
	{
		int altura = 0;
		//Base
		//Recursivo
		return altura;
	}

	public int hojas()
	{
		int hojas = 0;
		//Recorrer todo el árbol
		//Cuando llegue a un nodo, contar si es hoja o no
		return hojas;
		//Completar
	}

	public int contarDato(int x)
	{
		int cuenta = 0;
		return cuenta;
	}

	public int contarNodos()
	{
		int cuenta = 0;
		return cuenta;
	}

	public boolean existe(int x)
	{
		boolean existe = false;
		return existe;
	}

	public boolean comparar(ArbolBinarioOrdenado a, ArbolBinarioOrdenado b)
	{
		boolean iguales = true;
		return iguales;
	}

	public ArbolBinarioOrdenado espejo(ArbolBinarioOrdenado x)
	{
		ArbolBinarioOrdenado espejo = new ArbolBinarioOrdenado();
		return espejo;
	}

	public ArbolBinarioOrdenado buscarOrd(int valor)
	{
		ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
		return arbol;
	}

	public ArbolBinarioOrdenado insertarOrd(int valor)
	{
		ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
		return arbol;
	}

	public ArbolBinarioOrdenado extremoDerecho()
	{
		ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
		return arbol;
	}

	public ArbolBinarioOrdenado extremoIzquierdo()
	{
		ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
		return arbol;
	}

	public ArbolBinarioOrdenado eliminarOrd(int x)
	{
		ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
		return arbol;
	}

	public ArbolBinarioOrdenado hacerOrd(ArbolBinarioOrdenado a)
	{
		ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
		return arbol;
	}

	public int contarNodosEnNivel(int nivel)
	{
		int nodos = 0;
		return nodos;
	}
}
