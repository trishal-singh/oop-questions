public class Book {
    String name;
    Author authors[];
    double price;
    int qty = 0;
    Book(String name, Author authors[], double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    Book(String name, Author authors[], double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return name;
    }

    public Author[] getAuthors(){
        return authors;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String getAuthorNames() {
        StringBuilder names = new StringBuilder();

        for (int i = 0; i < authors.length; i++) {
            names.append(authors[i].getName());

            if(i < authors.length - 1){
                names.append(",");
            }
        }
        return names.toString();
    }

    @Override
    public String toString(){
        String  authNames[] = new String[authors.length];
        String authEmail[] =  new String[authors.length];
        char authGender[] = new char[authors.length];

        for (int i = 0; i < authors.length; i++) {
            authNames[i] = authors[i].getName();
            authEmail[i] = authors[i].getEmail();
            authGender[i] = authors[i].getGender();
        }

        String authorsInfo = "";
        for (int i = 0; i < authors.length; i++) {
            authorsInfo = authorsInfo + "[name="+authNames[i]+", email="+authEmail[i]+", gender="+authGender[i]+"]";

            if(i < authors.length - 1){
                authorsInfo+=",";
            }
        }
        return "Book[name="+ name+ ", authors="+ "{Author"+ authorsInfo + "}"+", price="+price+", qty="+qty+"]";
    }

}
