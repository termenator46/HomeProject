package com.drmoqa.test;

import com.demoqa.Pages.Hovers;
import com.drmoqa.core.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HoversTestmunu extends TestBase {
    Hovers hovers;
    @BeforeEach
    public void precondition(){
        hovers = new Hovers(driver);
    }
    @Test
    @DisplayName("Verifi the user heve name")
    public void Testmovingimage1(){
        hovers.Movingimage1();
        hovers.verifyname();
    }
    @Test
    @DisplayName("Verifi the user heve name")
    public void Testmovingimage2(){
        hovers.Movingimage2();
        hovers.verifyname();
    }
    @Test
    @DisplayName("Verifi the user heve name")
    public void Testmovingimage3(){
        hovers.Movingimage3();
        hovers.verifyname();
    }





}
