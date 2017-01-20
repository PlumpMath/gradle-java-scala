package me.breidenbach.main;

import me.breidenbach.submodule.SubModuleOne;
import me.breidenbach.submodule.SubModuleTwo;

/**
 * @author Kevin Breidenbach
 *         Date: 1/20/17
 */
public class MainJava
{
    private final SubModuleOne javaClass = new SubModuleOne();
    private final SubModuleTwo scalaClass = new SubModuleTwo();

    public static void main(String[] args)
    {
        final MainJava mainJava = new MainJava();
        System.out.println("In Java with...");
        mainJava.javaClass.print();
        mainJava.scalaClass.print();
    }
}
