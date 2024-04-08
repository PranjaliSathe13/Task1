class UserNameValidator{
public static void main(String[] arg)
{
UserNameValidator validateName=new UserNameValidator();

System.out.println(validateName.validate("Oranj0"));
}
 public Boolean validate (String username){
if(username.length()!=6)
{
return false;
}
for(char ch:username.toCharArray())
{
System.out.println("_0_____"+Character.isDigit(ch));
if(!Character.isLowerCase(ch) && !Character.isDigit(ch))
{

System.out.println("______");
return false;
}
}

return true;

}


}