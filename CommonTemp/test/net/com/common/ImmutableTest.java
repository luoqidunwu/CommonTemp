package net.com.common;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;



public class ImmutableTest {
    @Test
    public void testJDKImmutable(){                                                                                                                                                                                                                                    
        int num=3456,i=0,count=0;
        Random ran=new Random();
        for(i=0;i<1000000;i++){
        	if(ran.nextInt(num)<num/3){
        		count++;
        	}
        }
        System.out.println("count:"+count);
    }
}
