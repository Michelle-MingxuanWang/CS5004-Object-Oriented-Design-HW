package lab01;


/**
 * This class represents a person The person has a first name, last name and an year of birth.
 */
class Person {
  private String firstName; //fields
  private String lastName;
  private int yearOfBirth;
  private int phoneNumber;
  private EmailAddress emailAddress;

  /**
   * Constructs a Person object and initializes it to the given first name, last name and year of
   * birth.
   *
   * @param firstName   the first name of this person
   * @param lastName    the last name of this person
   * @param yearOfBirth the year of birth of this person
   * @param phoneNumber   the phone number of this person
   * @param emailAddress    the email address of this person
   */

  public Person(String firstName, String lastName, int yearOfBirth, 
                int phoneNumber, EmailAddress emailAddress) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.yearOfBirth = yearOfBirth;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
  }

  /**
   * Get the first name of this person.
   *
   * @return the first name of this person
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Return the last name of this person.
   *
   * @return the last name of this person
   */

  public String getLastName() {
    return this.lastName;
  }

  /**
   * Return the year of birth of this person.
   *
   * @return the year of birth of this person
   */
  public int getYearOfBirth() {
    return this.yearOfBirth;
  }

  /**
   * Return the phone number of this person.
   *
   * @return the phone number of this person
   */

  public int getPhoneNumber() {
    return this.phoneNumber;
  }

  /**
   * Return the email address of this person.
   *
   * @return the email address of this person
   */
  public EmailAddress getEmailAddress() {
    return this.emailAddress;
  }
}
