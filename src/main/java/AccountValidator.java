public class AccountValidator {
    public boolean isFirstNameValid(String firstName) {
        return firstName != null && firstName.matches("[a-zA-Z]+");
    }

    public boolean isLastNameValid(String lastName) {
        return lastName != null && lastName.matches("[a-zA-Z]+");
    }

    public boolean isEmailValid(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    public boolean isDateOfBirthValid(String dob) {
        if (dob == null || dob.isEmpty()) return false;

        try {
            String[] parts = dob.split("/");
            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);

            return year < 2025; // basit kontrol (future olmasın)
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isPasswordValid(String password) {
        return password != null && password.length() >= 8;
    }

    public boolean isConfirmPasswordValid(String password, String confirmPassword) {
        return confirmPassword != null && confirmPassword.equals(password);
    }
}
