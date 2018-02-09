package sistema_gestao;

public class recursos {
	
	int id;
	private String datainicio;
	private String horainicio;
	private String datafim;
	private String horafim;
	private String responsavel;
	private int codresponsavel;
	
	public int getcodresponsavel() {
		return codresponsavel;
	}
	public void setcodresponsavel (int codresp) {
		this.codresponsavel = codresp;
	}
	public String getresponsavel() {
		return responsavel;
	}
	public void setresponsavel (String resp) {
		this.responsavel = resp;
	}
	public String getdatainicio() {
		return datainicio;
	}
	public void setdatainicio (String data1) {
		this.datainicio = data1;
	}
	public String horainicio(){
		return horainicio;
	}
	public void sethorainicio (String hora1) {
		this.horainicio = hora1;
	}
	public String getdatafim() {
		return datafim;
	}
	public void setdatafim (String date2) {
		this.datafim = date2;
	}
	public String gethorafim(){
		return horafim;
	}
	public void sethorafim (String hora2) {
		this.horafim = hora2;
	}
	
	
	
	
}
