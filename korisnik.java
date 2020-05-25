import java.io.Serializable;

public class korisnik implements Serializable{
private String Korisničko_ime;
private String Šifra;
private String Ime;
private String Prezime;

public korisnik(String Korisničko_ime, String Šifra, String Ime, String Prezime) {
	
	this.Korisničko_ime = Korisničko_ime;
	this.Šifra = Šifra;
	this.Ime = Ime;
	this.Prezime = Prezime;
	
}

public String getKorisničko_ime() {
	return Korisničko_ime;
}
public String getŠifra() {
	return Šifra;
}
public String getIme() {
	return Ime;
}
public String getPrezime() {
	return Prezime;
}

public void setKorisničko_ime(String Korisničko_ime) {
	this.Korisničko_ime = Korisničko_ime;
}

public void setŠifra(String Šifra) {
	this.Šifra = Šifra;
}
public void setIme(String Ime) {
	this.Ime = Ime;
}
public void setPrezime(String Prezime) {
	this.Prezime = Prezime;
}

}
