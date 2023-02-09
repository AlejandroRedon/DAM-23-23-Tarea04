package cuentas;

/**
 * 
 * @author Alejandro Redondo Rodriguez
 *
 */

public class CCuenta {

	/**
	 * Para poder encapsular los atributos cambio a tipo protected y después
	 * pinchamos en refactorizar/encapsular campos
	 */
	
	private String nombre;
    private String cuenta;
    private double tipoInterés;
    private double saldo;
    

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    public double estado()
    {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * @return el nombre
	 */
	protected String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el cuenta
	 */
	protected String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta el cuenta a establecer
	 */
	protected void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return el tipoInterés
	 */
	protected double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * @param tipoInterés el tipoInterés a establecer
	 */
	protected void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * @return el saldo
	 */
	protected double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo el saldo a establecer
	 */
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}