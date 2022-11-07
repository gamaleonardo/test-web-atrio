package web.atrio.people.rest.api.exception;

public class ForbiddenAgeException extends RuntimeException {
    public ForbiddenAgeException(String firstName, String lastName) {
        super("The user " + firstName + " " + lastName + " cannot be added. The age must be less than 150 years old.");
    }
}
