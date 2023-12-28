package com.springcore.ci;

public class Certificate {
	private String certificate;

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Certificate [certificate=" + certificate + "]";
	}

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(String certificate) {
		super();
		this.certificate = certificate;
	}
	
}
