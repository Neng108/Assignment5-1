package zombiewar;

import java.lang.Math;
public class ZombieWar {
    
    // Contains all survivor and zombie objects
    public static Child[] childArray;
    public static Tank[] tankArray;
    public static CommonInfected[] commonInfectedArray;
    public static Teacher[] teacherArray;
    public static Soldier[] soldierArray; 
    
    
    public static void main(String[] args) {
        populateArray();
        characterAttack();
        for(int i = 0; i < commonInfectedArray.length; i++){
            System.out.println(commonInfectedArray[i]);
        }
        
        for(int i = 0; i < childArray.length; i++){
            System.out.println(childArray[i]);
        }
        
        for(int i = 0; i < tankArray.length; i++){
            System.out.println(tankArray[i]);
        }    
        
        for(int i = 0; i < teacherArray.length; i++){
            System.out.println(teacherArray[i]);
        }
        
        for(int i = 0; i < soldierArray.length; i++){
            System.out.println(soldierArray[i]);
        }
        
    }//end of main
    
    public static void characterAttack(){
        int fightOrder = (int)(Math.random()); // picks either zombie or survivor to go first
        while(true){ //while runs until all zombies or humans are dead
            if (fightOrder == 0){
                for(int i = 0; i < teacherArray.length; i++){
                    for(int j = 0; j < commonInfectedArray.length; j++){
                        commonInfectedArray[j].setHealth(teacherArray[i].getAttack());// Removing attack amount from health of commonInfected
                        System.out.println("TEACHER ATTACK: " + teacherArray[i].getAttack()); // TESTING IF ATTACK WORKS 
                        System.out.println("COMMON INFECTED HEALTH: " + commonInfectedArray[j].getHealth());// TESTING IF ATTACK WORKS
                    }
                    for(int j = 0; j < tankArray.length; j++){
                        tankArray[j].setHealth(teacherArray[i].getAttack());// Removing attack amount from health of tank
                    }
                }
                for(int i = 0; i < soldierArray.length; i++){
                    // CODE FOR SOLDIER FIGHTING EACH ZOMBIE GOES HERE
                }
                for(int i = 0; i < childArray.length; i++){
                    // CODE FOR CHILD FIGHTING EACH ZOMBIE GOES HERE
                }
                
                // CODE FOR CHECKING IF ALL ZOMBIES ARE DEAD GOES HERE
                
                fightOrder = 1; // changing fightOrder so zombies attack next
            }
            else{
                for(int i = 0; i < tankArray.length; i++){
                    // CODE FOR TANK ATTACKING ALL HUMANS GOES HERE
                }
                for(int i = 0; i < commonInfectedArray.length; i++){
                    // CODE FOR COMMON INFECTED ATTACKING ALL HUMANS GOES HERE
                }
                
                // CODE FOR CHECKING IF ALL HUMANS ARE DEAD GOES HERE
                
                fightOrder = 0; // changing fightOrder so humans attack next
            }//end of else 
        }//end of while loop 
    }//end of characterAttack() method 
    
    public static void populateArray(){
        // generates the size of the array that will hold zombie and survivor objects 
        int[] randNums = new int[5];
        for(int i = 0; i < 5; i++){
            int randomSize = (int)(Math.random()*15);
            randNums[i] = randomSize;
        }//end of for loop
        // assigning sizes
        childArray = new Child[randNums[0]];
        tankArray = new Tank[randNums[1]];
        commonInfectedArray = new CommonInfected[randNums[2]];
        teacherArray = new Teacher[randNums[3]];
        soldierArray = new Soldier[randNums[4]];
        
        for(int i = 0; i < 15; i++){
            if(i < childArray.length){
                Child child = new Child();
                childArray[i] = child; //add in a child into array 
            }
            if(i < teacherArray.length){
                Teacher teacher = new Teacher();
                teacherArray[i] = teacher;//add in a teacher into array 
            }
            if(i < soldierArray.length){
                Soldier soldier = new Soldier();
                soldierArray[i] = soldier;//add in a soldier into array 
            }
            if(i < commonInfectedArray.length){
                CommonInfected infected = new CommonInfected();
                commonInfectedArray[i] = infected; //add in a CommonInfected object array 
            }
            if(i < tankArray.length){
                Tank tank = new Tank();
                tankArray[i] = tank; //add in a tank object into array 
            }
        }//end of for loop 
        
        
        /*
        for (int i = 0; i < sumSize; i++){
            // number results in either a survivor or zombie being generated
            int characterPick = (int)(Math.random()*2);
            //System.out.println("character pick is: "+ characterPick);
            
            if(characterPick == 0){
                // if a zombie is generated, this number picks what kind of zombie
                int zombiePick = (int)(Math.random()*2);
               // System.out.println("zombie pick is: "+ zombiePick);
                if(zombiePick == 0){
                    CommonInfected infected = new CommonInfected();
                    commonInfectedArray[i] = infected; //add in a CommonInfected object array 
                }
                else{
                    Tank tank = new Tank();
                    tankArray[i] = tank; //add in a tank object into array 
                }
            }//end of if(characterPick == 0) 
            else{
                // if a survivor is genderated, this number picks what type of survivor
                int survivorPick = (int)(Math.random()*3);
               // System.out.println("survivor pick is: "+ survivorPick);
                if(survivorPick == 0){
                    Child child = new Child();
                    childArray[i] = child; //add in a child into array 
                }
                else if(survivorPick == 1){
                    Soldier soldier = new Soldier();
                    soldierArray[i] = soldier;//add in a soldier into array 
                }
                else{
                    Teacher teacher = new Teacher();
                    teacherArray[i] = teacher;//add in a teacher into array 
                }
            }//end of else for when characterPick is 1 
        }//end of for loop
        */
    }//end of populateArray() method
    
    
}//end of ZombieWar class
