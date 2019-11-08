
package com.mycompany.aptec;

/**
 *
 * @author J.I
 */
public class Resource {
    private long ID;
    private String resourceName;
    private int capacity;
    private int availableAmmount;
    private int supervisor;

    /**
     * @return the ID
     */
    public long getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(long ID) {
        this.ID = ID;
    }

    /**
     * @return the resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * @param resourceName the resourceName to set
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the availableAmmount
     */
    public int getAvailableAmmount() {
        return availableAmmount;
    }

    /**
     * @param availableAmmount the availableAmmount to set
     */
    public void setAvailableAmmount(int availableAmmount) {
        this.availableAmmount = availableAmmount;
    }

    /**
     * @return the supervisor
     */
    public int getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(int supervisor) {
        this.supervisor = supervisor;
    }
    
    
}
