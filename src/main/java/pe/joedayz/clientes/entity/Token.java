package pe.joedayz.clientes.entity;
// declaracion de variables para el token

public class Token {
	 public String access_token;
	public String token_type;
	 public String refresh_token;
	 public float expires_in;
	 public String scope;
	 public Token() {
			
		}
	
	 //Contructor token con parametros 
	 public Token(String access_token, String token_type, String refresh_token, float expires_in, String scope) {
		this.access_token = access_token;
		this.token_type = token_type;
		this.refresh_token = refresh_token;
		this.expires_in = expires_in;
		this.scope = scope;
	}

	// metodo get para obtener el acceso al token
	 public String getAccess_token() {
	  return access_token;
	 }
// metodo par aobtener el tipo del token
	 public String getToken_type() {
	  return token_type;
	 }
 // metodo get para actualizar el token
	 public String getRefresh_token() {
	  return refresh_token;
	 }
 // metodo get en el que se establece la duración de validez del token en segundos.
	 public float getExpires_in() {
	  return expires_in;
	 }

	 public String getScope() {
	  return scope;
	 }

	 // metodos getter y seter

	 public void setAccess_token(String access_token) {
	  this.access_token = access_token;
	 }

	 public void setToken_type(String token_type) {
	  this.token_type = token_type;
	 }

	 public void setRefresh_token(String refresh_token) {
	  this.refresh_token = refresh_token;
	 }

	 public void setExpires_in(float expires_in) {
	  this.expires_in = expires_in;
	 }

	 public void setScope(String scope) {
	  this.scope = scope;
	 }
	}
