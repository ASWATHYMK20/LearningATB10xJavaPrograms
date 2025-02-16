package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    int val=200;
    // byte b=val; // Invalid - Implicit Casting narrowing is not allowed
    byte b=(byte)val;  // Valid -> Explicit Casting -  allowed
    // Data Loss:


}
