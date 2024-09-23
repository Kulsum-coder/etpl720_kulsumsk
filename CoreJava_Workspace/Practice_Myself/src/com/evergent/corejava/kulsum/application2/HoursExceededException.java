package com.evergent.corejava.kulsum.application2;

//HoursExceededException.java
public class HoursExceededException extends Exception {
 // Constructor with no arguments
 public HoursExceededException() {
     super("Work hours exceeded the allowed limit.");
 }

 // Constructor with a custom message
 public HoursExceededException(String message) {
     super(message);
 }

 // Constructor with a custom message and cause
 public HoursExceededException(String message, Throwable cause) {
     super(message, cause);
 }

 // Constructor with a cause
 public HoursExceededException(Throwable cause) {
     super(cause);
 }
}
