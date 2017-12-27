/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.qqq
 */
package javaapplication14.ans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author sample
 */
public class LabTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Monster> monsters = new ArrayList<Monster>();

        Monster m = new Monster("Monster", 11, 11, 2016, "Monster Weapon");
        monsters.add(m);
        UglyMonster u = new UglyMonster("Ugly Monster", 12, 12, 2016, "Ugly Monster Weapon", 1);
        monsters.add(u);
        SweetMonster s = new SweetMonster("Sweet Monster", 1, 1, 2016, "Sweet Monster Weapon", 100.00);
        monsters.add(s);
        CookieMonster c = new CookieMonster("Cookie Monster", 2, 2, 2016, "Cookie Monster Weapon", 250.00, 10);
        monsters.add(c);
        JellyBeanMonster j = new JellyBeanMonster("Jelly Bean Monster", 3, 3, 2016, "Jelly Bean Monster Weapon", 300.00, 20);
        monsters.add(j);

        for (Monster monster : monsters) {
            String n = monster.toString();
            System.out.print(n);
            if (monster instanceof UglyMonster) {
                UglyMonster uglyMonster = (UglyMonster) monster;
                String status = uglyMonster.status();
                System.out.printf("Status: %s\n", status);
            }
            if (monster instanceof SweetMonster) {
                System.out.print("Diabetic Status:");
                System.out.print(((SweetMonster) monster).isDiabetic());
            }
            System.out.println();
            System.out.println();
        }
    }

}

class MyDate {

    private int year;
    private int month;
    private int day;

    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
}

class Weapon {

    private String name;

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Monster {

    String name = new String();
    MyDate dateofBirth;
    Weapon weapon;

    public Monster(String name, int day, int month, int year, String weaponName) {
        this.name = name;
        this.dateofBirth = new MyDate(year, month, day);
        this.weapon = new Weapon(weaponName);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nDate of birth: " + this.dateofBirth.getMonth() + "-"
                + this.dateofBirth.getDay() + "-" + this.dateofBirth.getYear() + "\n"
                + "Name of Weapon:" + this.weapon.getName() + "\n";
    }

}

class UglyMonster extends Monster {

    private int id;

    public UglyMonster(String name, int day, int month, int year, String weaponName, int id) {
        super(name, day, month, year, weaponName);
        this.id = id;
    }

    public String status() {
        return "Alive";
    }

    @Override
    public String toString() {
        return "Id: " + this.id
                + "\nName: " + this.name
                + "\nDate of birth: " + this.dateofBirth.getMonth() + "-"
                + this.dateofBirth.getDay() + "-" + this.dateofBirth.getYear() + "\n"
                + "Name of Weapon:" + this.weapon.getName() + "\n";
    }
}

class SweetMonster extends Monster {

    double bloodSugarLevel;

    public boolean isDiabetic() {
        if (this.bloodSugarLevel > 200) {
            return true;
        } else {
            return false;
        }
    }

    public SweetMonster(String name, int day, int month, int year, String weaponName, double bloodSugarLevel) {
        super(name, day, month, year, weaponName);
        this.bloodSugarLevel = bloodSugarLevel;
    }

    @Override
    public String toString() {
        return "Name: " + this.name
                + "\nDate of birth: " + this.dateofBirth.getMonth() + "-"
                + this.dateofBirth.getDay() + "-" + this.dateofBirth.getYear() + "\n"
                + "Name of Weapon:" + this.weapon.getName() + "\n"
                + "Blood sugar level: " + this.bloodSugarLevel + "\n";
    }

}

class CookieMonster extends SweetMonster {

    private int numberofCookieLeft;

    public CookieMonster(String name, int day, int month, int year, String weaponName, double bloodSugarLevel, int numberofCookieLeft) {
        super(name, day, month, year, weaponName, bloodSugarLevel);
        this.numberofCookieLeft = numberofCookieLeft;
    }

    @Override
    public String toString() {
        return "Name: " + this.name
                + "\nDate of birth: " + this.dateofBirth.getMonth() + "-"
                + this.dateofBirth.getDay() + "-" + this.dateofBirth.getYear() + "\n"
                + "Name of Weapon:" + this.weapon.getName() + "\n"
                + "Blood sugar level: " + this.bloodSugarLevel + "\n"
                + "Number of Cookie left: " + this.numberofCookieLeft + "\n";
    }

}

class JellyBeanMonster extends SweetMonster {

    private int numberofBeansLeft;

    public JellyBeanMonster(String name, int day, int month, int year, String weaponName, double bloodSugarLevel, int numberofBeansLeft) {
        super(name, day, month, year, weaponName, bloodSugarLevel);
        this.numberofBeansLeft = numberofBeansLeft;
    }

    @Override
    public String toString() {
        return "Name: " + this.name
                + "\nDate of birth: " + this.dateofBirth.getMonth() + "-"
                + this.dateofBirth.getDay() + "-" + this.dateofBirth.getYear() + "\n"
                + "Name of Weapon:" + this.weapon.getName() + "\n"
                + "Blood sugar level: " + this.bloodSugarLevel + "\n"
                + "Number of beans left: " + this.numberofBeansLeft + "\n";
    }
}