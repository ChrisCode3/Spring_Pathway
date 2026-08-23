package Accessing_Relational_Data;





public record Customer(long id, String firstName, String lastName, int age) {




    @Override
    public String toString() {



        // this format of '%s' is similar to to + . the  %d , %s represents int, and String respectively .
        return String.format(
                "Customer[id=%d, firstName'%s',   lastName'%s', age'%d']", id, firstName, lastName , age);



    }

}
