package sakila.entity;
// Generated 19-ene-2021 13:59:33 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Staff generated by hbm2java
 */
public class Staff  implements java.io.Serializable {


     private Byte staffId;
     private Address address;
     private Store store;
     private String firstName;
     private String lastName;
     private byte[] picture;
     private String email;
     private boolean active;
     private String username;
     private String password;
     private Date lastUpdate;
     private Set stores = new HashSet(0);

    public Staff() {
    }

	
    public Staff(Address address, Store store, String firstName, String lastName, boolean active, String username, Date lastUpdate) {
        this.address = address;
        this.store = store;
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
        this.username = username;
        this.lastUpdate = lastUpdate;
    }
    public Staff(Address address, Store store, String firstName, String lastName, byte[] picture, String email, boolean active, String username, String password, Date lastUpdate, Set stores) {
       this.address = address;
       this.store = store;
       this.firstName = firstName;
       this.lastName = lastName;
       this.picture = picture;
       this.email = email;
       this.active = active;
       this.username = username;
       this.password = password;
       this.lastUpdate = lastUpdate;
       this.stores = stores;
    }
   
    public Byte getStaffId() {
        return this.staffId;
    }
    
    public void setStaffId(Byte staffId) {
        this.staffId = staffId;
    }
    public Address getAddress() {
        return this.address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    public Store getStore() {
        return this.store;
    }
    
    public void setStore(Store store) {
        this.store = store;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public byte[] getPicture() {
        return this.picture;
    }
    
    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public Set getStores() {
        return this.stores;
    }
    
    public void setStores(Set stores) {
        this.stores = stores;
    }




}


