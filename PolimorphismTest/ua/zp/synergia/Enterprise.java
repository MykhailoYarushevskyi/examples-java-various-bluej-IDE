package ua.zp.synergia;
/**
 * Write a description of class Enterprise here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enterprise
{
    protected String nameEnterprise = new String();
    protected int bankAccount;
    protected int numberOfStaff;
    int numberWorker;
    
    /**
     * Constructor for objects of class Enterprise
     */
    public Enterprise()
    {
    }
    public Enterprise(String name)
    {
        this.nameEnterprise = name;
    }
    /**
     * a method setName(String name)
     * set the name of the Enterprise instance
     * @param      String name
     * @return     void
     */

    public void setName(String name)
    {
        this.nameEnterprise = name;
    }
	 /**
     * a method getName()
     * get the name of the Enterprise instance
     * @param      no parameters
     * @return     String name or string "No yet name" if enterprise yet no name.
     */
    public String getName()
    {
        if (this.nameEnterprise != null) {
            return this.nameEnterprise;
        }
        return "No yet name";
    }
}
