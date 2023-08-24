import org.testng.Assert;
import org.testng.annotations.Test;

import com.checkpoint.Calculator;

public class Calculator_Test {
    
    @Test
    public void AdditionTest1(){                                                       //2 + 6
        Assert.assertEquals(Calculator.addition(2.0f, 6.0f),8.0f);
    }

    @Test
    public void AdditionTest2(){                                                       //7.5 + 5.2
        Assert.assertEquals(Calculator.addition(7.5f, 5.2f),12.7f);
    }

    @Test
    public void SubstractionTest1(){                                                       //5 - 1
        Assert.assertEquals(Calculator.substraction(5.0f, 1.0f),4.0f);
    }

    @Test
    public void SubstractionTest2(){                                                       //7.1 - 17.4
        Assert.assertEquals(Calculator.substraction(7.0f, 17.0f),-10.0f);
    }

    @Test
    public void MultiplicationTest1(){                                                       //5 * -4
        Assert.assertEquals(Calculator.multiplication(5.0f, -4.0f),-20.0f);
    }

    @Test
    public void MultiplicationTest2(){                                                       //2.5 * 3.2
        Assert.assertEquals(Calculator.multiplication(2.5f, 3.2f),8.0f);
    }

    @Test
    public void DivisionTest1(){                                                       //15.5 / 3.1
        Assert.assertEquals(Calculator.division(15.5f, 3.1f),5.0f);
    }

    @Test
    public void DivisionTest2(){                                                       //12.7 / 0
        Assert.assertEquals(Calculator.division(12.7f, 0f),-1.0f);
    }

}
