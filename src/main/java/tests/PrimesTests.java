package tests;

import appmanager.Primes;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimesTests {

    @Test
    public void testPrimes(){
        Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
    }

    @Test
    public void testNonPrimes(){
        Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
    }

    @Test
    public void testLongPrimes(){
        long n = Integer.MAX_VALUE;
        Assert.assertTrue(Primes.isPrimeLong(n));
    }
}
