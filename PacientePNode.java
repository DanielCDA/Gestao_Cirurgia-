
  import java.io.IOException;
  import java.io.RandomAccessFile;
  
  public class PacientePNode extends PacienteDadosTable implements SaveWriteReadInteface
  {
    private PacientePNode next, prev;
    private PacienteModelo model;
    //protected int numeroAluno;
    
	public PacientePNode(PacienteModelo model)
    {
		super("CADAVERES.DAT", 100);
		this.model = model;
		next = prev = null;
    } 
    public PacientePNode()
    { 
		model = new PacienteModelo();	
    }
    
    public String getKey()
    {
		return model.getNome();
    }
    
    public boolean isEmptyNode()
    {
		return ( getKey().equalsIgnoreCase("") == true );
    }

    public void write(RandomAccessFile stream) throws IOException
    {
		//stream.writeInt(codigoAluno);
		//stream.writeBoolean(eliminado);		
		model.write(stream);
    }
    
    public void read(RandomAccessFile stream) throws IOException
    {
		//codigoAluno = stream.readInt();	
		//eliminado = stream.readBoolean();		
		model.read(stream);
    }	

    public PacienteModelo getModel()
    {
		return model;
    }
    public void setPrev(PacientePNode prev)
    {
		this.prev = prev;
    }

    public void setNext(PacientePNode next)
    {
		this.next = next;
    }

    public PacientePNode getNext()
    {
		return next;
    }
    public PacientePNode getPrev()
    {
		return prev;
    }
	
    public void save()
    {
		adicionarNovoPaciente(this);
    }
   
    public static long sizeof()
    {		
		PacientePNode node = new PacientePNode();
		try
        { 
            return  node.model.sizeof();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return 0;
     }	
     public String toString()
     {
		return model.toString();
     }
  }
