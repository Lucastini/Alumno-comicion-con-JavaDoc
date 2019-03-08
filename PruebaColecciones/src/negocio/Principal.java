
/*package negocio;

public class Principal {

    public static void main(String[] args) {
        Examen e1,e2,e3,e4,e5;
        e1=new Examen(123,"Matematica",7);
        e2=new Examen(124,"Musica",11);
        e3=new Examen(125,"Lengua",2);
        e4=new Examen(126,"Fisica",8);
        e5=new Examen(127,"Musica",10);
        
        System.out.println("Datos originales Examen");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());
        System.out.println(e5.toString());
      
        Alumno a1,a2,a3,a4,a5;
        a1=new Alumno("Lucas", "Pagliettini");
        System.out.println("\nDatos originales de a1:\n"+a1.toString());
        System.out.println("\nAgregando a a1 examen 1 "+a1.addExamen(e1));
        System.out.println("Agregando a a1 examen 2 "+a1.addExamen(e2));
        System.out.println("Agregando a a1 examen 3 "+a1.addExamen(e3));
        System.out.println("Agregando a a1 examen 4 "+a1.addExamen(e4));
        System.out.println("Agregando a a1 examen 5 "+a1.addExamen(e5));
        System.out.println("\nLuego de carga de examenes: \n"+a1.toString());
        System.out.println("Otros datos examenes a1: "+a1.otrosDatosExamenes());
        
        System.out.println("\nModificando nota examen 2 "+a1.modExamen(124,10));
        System.out.println("Luego de examen 2 modificado: "+a1.toString());
        System.out.println("Otros datos examenes a1: "+a1.otrosDatosExamenes());
        
        System.out.println("\nModificando nota examen 3 "+a1.modExamen(125,3));
        System.out.println("Luego de examen 3 modificado: "+a1.toString());
        System.out.println("Otros datos examenes a1: "+a1.otrosDatosExamenes());
        
        System.out.println("\nEliminando examen 5: "+a1.removeExamen(127));
        System.out.println("Datos Finales de alumno a1: "+a1.toString());
        System.out.println("Otros datos examenes a1: "+a1.otrosDatosExamenes());
      
        
        a2=new Alumno();
        System.out.println("\n\nDatos originales de a2: "+a2.toString());
        System.out.println("Otros datos examenes a2: "+a2.otrosDatosExamenes());
        
        System.out.println("\nAgregando a a2 examen 1 "+a2.addExamen(e1));
        System.out.println("Agregando a a2 examen 2 "+a2.addExamen(e2));
        System.out.println("Agregando a a2 examen 3 "+a2.addExamen(e3));
        System.out.println("Agregando a a2 examen 4 "+a2.addExamen(e4));
        System.out.println("Agregando a a2 examen 5 "+a2.addExamen(e5));
        System.out.println("Luego de carga de examenes: "+a2.toString());
        System.out.println("Otros datos examenes a2: "+a2.otrosDatosExamenes());
        
        System.out.println("\nModificando nota examen 3 "+a2.modExamen(125,6));
        System.out.println("Luego de examen 3 modificado: "+a2.toString());
        System.out.println("Otros datos examenes a2: "+a2.otrosDatosExamenes());
        
        
        a3=new Alumno();
        System.out.println("\n\nDatos originales de a3: "+a3.toString());
        System.out.println("Otros datos examenes a3: "+a3.otrosDatosExamenes());
        
        System.out.println("\nAgregando a a3 examen 1 "+a3.addExamen(e1));
        System.out.println("Agregando a a3 examen 2 "+a3.addExamen(e2));
        System.out.println("Agregando a a3 examen 3 "+a3.addExamen(e3));
        System.out.println("Agregando a a3 examen 4 "+a3.addExamen(e4));
        System.out.println("Luego de carga de examenes: "+a3.toString());
        System.out.println("Otros datos examenes a3: "+a3.otrosDatosExamenes());
        
        System.out.println("\nModificando nota examen 3 "+a3.modExamen(125,5));
        System.out.println("Luego de examen 2 modificado: "+a3.toString());
        System.out.println("Otros datos examenes a2: "+a3.otrosDatosExamenes());
        
        System.out.println("\nModificando nota examen 4 "+a3.modExamen(126,4));
        System.out.println("Luego de examen 4 modificado: "+a3.toString());
        System.out.println("Otros datos examenes a2: "+a3.otrosDatosExamenes());
        
        System.out.println("\nEliminando examen 2: "+a3.removeExamen(124));
        System.out.println("Datos Finales de alumno a3: "+a3.toString());
        System.out.println("Otros datos examenes a1: "+a3.otrosDatosExamenes());
        
        a1.getExamenes();
                
    }
    
}*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author AlumnoLocal
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno gladys=new Alumno("Gladys","Ferrer");
        Alumno edgar=new Alumno("Edgardo","Lutre");
        Alumno maru=new Alumno("Mariel","Cufré");
        
        Examen ex1,ex2,ex3,ex4,ex5,ex6,ex7,ex8,ex9,ex10,ex11,ex12;
        
        ex1=new Examen(1,"Inglés",8);
        ex2=new Examen(2,"Gramática española",5);
        ex3=new Examen(3,"Física",10);
        ex4=new Examen(4,"Literatura inglesa",4);
        ex5=new Examen(5,"Java",10);
        
        ex6=new Examen(2,"Gramática española",8);
        ex7=new Examen(6,"Historia",4);
        ex8=new Examen(5,"Java",8);
        
        ex9=new Examen(7,"Biología",2);
        ex10=new Examen(5,"Java",7);
        ex11=new Examen(1,"Inglés",10);
        ex12=new Examen(3,"Física",6);
     
        
        /*gladys.addExamen(ex1);
        gladys.addExamen(ex2);
        gladys.addExamen(ex3);
        gladys.addExamen(ex4);
        gladys.addExamen(ex5);
        */
        //Crear la comisión
        Comision corta4=new Comision("Corta4");
        System.out.println(corta4);
        
        //Agregar alumnos a la comisión
        corta4.addAlumno(gladys);
        corta4.addAlumno(edgar);
        corta4.addAlumno(maru);
        System.out.println(corta4);
        
        //agregar a cada alumno, sus exámenes
        //agregar los 5 exámenes a Gladys cuyo legajo es 1
        corta4.addExamenAAlumno(1,ex1);
        corta4.addExamenAAlumno(1,ex2);
        corta4.addExamenAAlumno(1,ex3);
        corta4.addExamenAAlumno(1,ex4);
        corta4.addExamenAAlumno(1,ex5);
        //agregar los 3 exámenes a Edgardo cuyo legajo es 2
        corta4.addExamenAAlumno(2,ex6);
        corta4.addExamenAAlumno(2,ex7);
        corta4.addExamenAAlumno(2,ex8);
        //agregar los 4 exámenes a Mariel cuyo legajo es 3
        corta4.addExamenAAlumno(3,ex9);
        corta4.addExamenAAlumno(3,ex10);
        corta4.addExamenAAlumno(3,ex11);
        corta4.addExamenAAlumno(3,ex12);
        System.out.println(corta4+"\n\n");
        System.out.println("\n\nNota promedio general: "+corta4.notaPromedioGeneral());
        System.out.println("\n\nNota mayor general: "+corta4.mayorNotaGeneral());
        System.out.println("\n\nNota menor general: "+corta4.menorNotaGeneral());
        System.out.println("\n\nPorcentaje de aprobación de examen con código 5 (JAVA): "+corta4.porcAprobExamen(5)+"%");
        
        
        if(corta4.modExamenAAlumno(1,5,2))
        {
            System.out.println("\n\nNota modificada");
        }
        else
        {
            System.out.println("No se encontró el alumno y/o el examen a modificar");
        }
        System.out.println("\n\nPorcentaje de aprobación de examen con código 5 (JAVA): "+corta4.porcAprobExamen(5)+"%");
        
    
    }
    
}

