
package negocio;

import java.util.LinkedList;

/**
 *
 * @author Mosqueteros
 */
public class Comision {
    private String descripcion;
    private LinkedList <Alumno> alumnos;
    
    public Comision(){
        descripcion="Sin descripcion";
        alumnos=new LinkedList();
    }
    
    //Constructor de clon de comision
    public Comision(Comision com){
        this.descripcion=com.descripcion;
        this.alumnos=new LinkedList(com.alumnos);
    }
    
    public Comision(String desc){
        descripcion=desc;
        alumnos=new LinkedList();
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion(String desc){
        descripcion=desc;
    }
    
    public String toString(){
        String aux="Comision: "+descripcion+"\nDatos de los alumnos:";
        if(alumnos.size()>0)
            for(Alumno iter:alumnos)
                aux+="\n"+iter.todosLosDatos();
        else
            aux+="\nLa comision aun no tiene alumnos inscriptos";
        return aux;   
    }
    
    public boolean addAlumno(Alumno al){
        boolean res=false;
        if(alumnos.size()<50)
            res=alumnos.add(al);
        return res;
    }
    
    private Alumno buscarAlumno(int leg){
        Alumno alu=null;
        if(alumnos.size()>0)
            for(Alumno iter:alumnos)
                if(iter.getLegajo()==leg){
                    alu=iter;
                    break;
                }
        return alu;
    }
    
    public boolean removeAlumno(int leg){
        boolean res=false;
        Alumno alu=buscarAlumno(leg);
        if(alu!=null)
            res=alumnos.remove(alu);
        return res;
    }
    
    public boolean addExamenAAlumno(int leg, Examen ex){
        boolean res=false;
        Alumno alu=buscarAlumno(leg);
        if(alu!=null)
            res=alu.addExamen(ex);
        return res;
    }
    
    public boolean removeExamenAAlumno(int leg, int NroExamen){
        boolean res=false;
        Alumno alu=buscarAlumno(leg);
        if(alu!=null)
            res=alu.removeExamen(NroExamen);
        return res;
    }
    
    public boolean modExamenAAlumno(int leg, int nroExamen, int nuevaNota){
        boolean res=false;
        Alumno alu=buscarAlumno(leg);
        if(alu!=null)
            res=alu.modExamen(nroExamen, nuevaNota);
        return res;
    }
    
    public double notaPromedioGeneral(){
        double prom=0.0;
        int cantAlu=0;
        double sumaNotas=0;
        if(alumnos.size()>0){
            for(Alumno iter:alumnos)
                if(iter.rindioAlgunExamrn()){
                sumaNotas+=iter.notaPromedio();
                cantAlu++;
                }
            prom=(double)sumaNotas/cantAlu;
        }
        return prom;
    }
    
    public int mayorNotaGeneral(){
        int may=0;//Deberiamos agregar esto por si no hubiera alumnos??
        if(alumnos.size()>0){//deberiamos agregar esto para evitar null pointer exc de la linea sig si no hubiera alu?
            may=alumnos.getFirst().mayorNota();
            for(Alumno iter:alumnos){
                int nota=iter.mayorNota();
                if(nota>may)
                    may=nota;
            }
        }
        return may;          
    }
    
    public int menorNotaGeneral(){
        int men=0;//idem
        if(alumnos.size()>0){//idem
            men=alumnos.getFirst().menorNota();
            for(Alumno iter:alumnos){
                int nota=iter.menorNota();
                if(nota<men)
                    men=nota;
            }
        }
        return men;
    }
    
    public double porcAprobExamen(int nroExamen){
        double porc=0.0;
        int cantAluAp=0;
        int cantAlu=alumnos.size();
        if(cantAlu>0){
            for(Alumno iter:alumnos)
                if(iter.aproboExamen(nroExamen))
                    cantAluAp++;
            porc=(double)cantAluAp*100/cantAlu;
        }
        return porc;            
    }
    
    
    
}
