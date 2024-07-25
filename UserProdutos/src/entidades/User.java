package entidades;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class User {
    @Override
	public String toString() {
    	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return  name + ", email: " + email + ", dataNasc:" + fmt.format(dataNasc);
	}

	private String name;
    private String email;
    private LocalDate dataNasc;
    
    
    public User(){
        
    }
    public User(String name, String email, LocalDate dataNasc){
        this.name = name;
        this.email = email;
        this.dataNasc = dataNasc;
    }
    

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    
}