package finHw;
//used for agrregration
public class Address
{
	String city;
	String state;
	String zipCode;
	String country;
	
	Address()
	{
		city="No City";
		state="No State";
		zipCode="No City";
		country= "No Country";
				
	}
	Address(String cty, String st, String zip, String ctry)
	{
		city = cty;
		state = st;
		zipCode = zip;
		country = ctry;
	}
	public void setCity(String cty)
	{	city = cty;}
	public void setState(String st)
	{	state = st;}
	public void setZipCode(String zip)
	{	zipCode = zip;}
	public void setCountry(String ctry)
	{	country = ctry;}
	public String getCity()
	{	return city;}
	public String getState()
	{	return state;}
	public String getZipCode()
	{	return zipCode;}
	public String getCountry()
	{	return country;}
	public String toString()
	{
		String str = "The address is " + city + ", "
						+ state + ", " + zipCode + ", "
						+ country;
		return str;
	}
}