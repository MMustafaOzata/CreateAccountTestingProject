import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class AccountValidatorTest {

        private AccountValidator validator;

        @BeforeEach
        void setUp() {
            validator = new AccountValidator();
        }

        // First Name Tests
        @Test
        void testValidFirstName() {
            assertTrue(validator.isFirstNameValid("John"));
        }

        @Test
        void testEmptyFirstName() {
            assertFalse(validator.isFirstNameValid(""));
        }

        @Test
        void testInvalidFirstNameWithNumbers() {
            assertFalse(validator.isFirstNameValid("John123"));
        }

        // Email Tests
        @Test
        void testValidEmail() {
            assertTrue(validator.isEmailValid("test@mail.com"));
        }

        @Test
        void testInvalidEmailMissingAt() {
            assertFalse(validator.isEmailValid("testmail.com"));
        }

        @Test
        void testEmptyEmail() {
            assertFalse(validator.isEmailValid(""));
        }

        // Password Tests
        @Test
        void testValidPassword() {
            assertTrue(validator.isPasswordValid("Abc123!!"));
        }

        @Test
        void testShortPassword() {
            assertFalse(validator.isPasswordValid("Abc123"));
        }

        // Confirm Password Tests
        @Test
        void testMatchingPasswords() {
            assertTrue(validator.isConfirmPasswordValid("Abc123!!", "Abc123!!"));
        }

        @Test
        void testNonMatchingPasswords() {
            assertFalse(validator.isConfirmPasswordValid("Abc123!!", "Abc123??"));
        }

        // Date of Birth Tests
        @Test
        void testValidDOB() {
            assertTrue(validator.isDateOfBirthValid("12/05/2000"));
        }

        @Test
        void testFutureDOB() {
            assertFalse(validator.isDateOfBirthValid("12/05/2050"));
        }

        @Test
        void testInvalidFormatDOB() {
            assertFalse(validator.isDateOfBirthValid("2000-05-12"));
        }

        @Test
        void testInvalidFirstNameWithSpecialCharacter() {
            assertFalse(validator.isFirstNameValid("John@"));
        }

        @Test
        void testValidLastName() {
            assertTrue(validator.isLastNameValid("Doe"));
        }

        @Test
        void testEmptyLastName() {
            assertFalse(validator.isLastNameValid(""));
        }

        @Test
        void testInvalidLastNameWithNumbers() {
            assertFalse(validator.isLastNameValid("Doe123"));
        }
    }

