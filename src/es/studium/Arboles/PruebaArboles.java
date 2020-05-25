package es.studium.Arboles;

public class PruebaArboles
{
	public static void main(String[] args) 
	{
        ArbolBinarioOrdenado arbol1 = new ArbolBinarioOrdenado(10);
        ArbolBinarioOrdenado arbol2 = new ArbolBinarioOrdenado();
        arbol1.add(5);
        arbol1.add(15);
        arbol1.add(8);
 
        boolean resultado = arbol1.buscar(11);
        if (resultado)
        {
            System.out.println("Valor encontrado");
        } 
        else 
        {
            System.out.println("Valor no encontrado");
        }
 
        resultado = arbol1.buscar(8);
        if (resultado) 
        {
            System.out.println("Valor encontrado");
        } 
        else 
        {
            System.out.println("Valor no encontrado");
        }
        System.out.println("Mostrar en in order");
        arbol1.mostrarIn();
        System.out.println("Mostrar en pos order");
        arbol1.mostrarPos();
        System.out.println("Mostrar en pre order");
        arbol1.mostrarPre();
        
        if(arbol1.arbolVacio())
        {
        	System.out.println("El �rbol est� vac�o");
        }
        else
        {
        	System.out.println("El �rbol no est� vac�o");
        }
        if(arbol2.arbolVacio())
        {
        	System.out.println("El �rbol est� vac�o");
        }
        else
        {
        	System.out.println("El �rbol no est� vac�o");
        }
        if(arbol1.arbolVacio()) {
        	System.out.println("El arbol  esta vacio David");
        }else {
        	System.out.println("El �rbol no est� vac�o David");
        }
        
        System.out.println("El �rbol seleccionado tiene:"+ arbol1.hojas());
        
        
    }
}
