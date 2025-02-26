package phonebook

class User {
    var phoneNumber: Int = 0
    var fullName: String = ""

    fun compareTo(user: User):Int {
        if (this.fullName > user.fullName) {
            return 1
        } else if (this.fullName < user.fullName){
            return -1
        } else if (this.fullName == user.fullName) {
            return 0
        } else {
            // invalid
            return -9
        }
    }
}