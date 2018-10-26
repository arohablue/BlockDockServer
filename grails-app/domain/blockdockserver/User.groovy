package blockdockserver

class User {

    //Basic Information
    int id
    long phoneNumber
    String firstName
    String lastName
    String emailId
    String password

    static constraints = {
        id              unique:true
        emailId         unique:true
        phoneNumber     unique: true
        password        size: 8..15
        emailId         email: true
    }

    static mapping = {
        table 'blockdock_user'     // table name in database 'blockdock_user'
    }
}
