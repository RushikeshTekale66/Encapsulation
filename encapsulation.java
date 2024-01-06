//Encapsulation in Java refers to integrating data (variables) and code (methods) into a single unit.
class myclass{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name2){
        name = name2;
    }
}
class encapsulation{
    public static void main(String args []){
        System.out.println("Java");
        myclass M = new myclass();
        M.setName("Rushikesh");
        System.out.println(M.getName());
    }
}