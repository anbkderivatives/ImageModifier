
import javax.swing.JFrame;

public class Frame {
    
    public JFrame frame;
    public PanelA panelA;
    public PanelB panelB;
    
    public Frame()
    {
        frame = new JFrame();
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("ImageModifier v3.1");
        
        
        frame.setLocation(200, 70);
    }
    
    public void WindowVisibility()
    {
        frame.setSize(920,530);
        frame.setVisible(true);
    }
    
    public void CreatePanelA(Frame fr)
    {
        panelA = new PanelA(fr);
    }
    
    public void CreatePanelB(Frame frIn, int ps, int arf, String code)
    {
        panelB = new PanelB(frIn,ps,arf,code);
    }
    
    public void AddPanelA()
    {
        frame.add(panelA);
    }
    
    public void AddPanelB()
    {
        frame.add(panelB);
    }
    
    public void ChangeJPanelfromAtoB()
    {
        //removing panels
        this.frame.remove(this.panelA);
        this.frame.repaint();
        this.frame.revalidate();
        
        //adding panels
        this.frame.add(this.panelB);
        this.frame.repaint();
        this.frame.revalidate();
        
        this.frame.pack();
    }
    
    public void ChangeJPanelfromBtoA()
    {
        //removing panels
        this.frame.remove(this.panelB);
        this.frame.repaint();
        this.frame.revalidate();
        
        //adding panels
        this.frame.add(this.panelA);
        this.frame.repaint();
        this.frame.revalidate();
        
        this.frame.pack();
    }
    
    public void ChangeJPanelfromBtoA_2()
    {
        //removing panels
        this.frame.remove(this.panelB);
        this.frame.repaint();
        this.frame.revalidate();
        
        panelA.SetjTextField3();
        panelA.jtableforpanelB = 1;
        
        //adding panels
        this.frame.add(this.panelA);
        this.frame.repaint();
        this.frame.revalidate();
        
        this.frame.pack();
    }
}
