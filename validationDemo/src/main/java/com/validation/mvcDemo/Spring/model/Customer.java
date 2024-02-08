package com.validation.mvcDemo.Spring.model;

import com.validation.mvcDemo.Spring.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {
    public Customer() {
    }

    private String firstName;
    @NotNull(message="is required")
    @Size(min=1,message="is required")
    private String lastName;

    @NotNull(message="is required")
    @Min(value=0,message="must be greater than or equal to 0")
    @Max(value=10,message="must be less than or equal to 10")
    private Integer freePasses;

    @Pattern(regexp="^[a-zA-Z0-9]{5}" ,message="only 5 chars/digits")
    private String postalCode;

    // Added our own annotation for custom validation
    @CourseCode(value="TOPS" ,message="must be start with TOPS")
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
