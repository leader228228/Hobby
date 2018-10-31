package ua.sumdu.j2se.Birintsev;

import org.apache.log4j.Logger;

public class Test {

    final static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {

        Hobby someHobby = new Hobby();

        logger.info("Some hobby has been created");

        Hobby emptyHobby = null;

        try{

            System.out.println(emptyHobby.getName());

        }catch (NullPointerException e){

            logger.error("Try to refer to null pointer");

        }

        Hobby weightlifting = new Hobby("Weightlifting", true, 125.5f, 150.5);

        logger.debug(weightlifting + " record value is " + weightlifting.getRecordValue() );

        Hobby fishing = new Hobby("Fishing", false, 15f);

        Hobby running = new Hobby("Running", 1);

        Hobby photography = new Hobby("Photography");

        someHobby.tellAboutHobby();

        weightlifting.tellAboutHobby();

        fishing.tellAboutHobby();

        running.tellAboutHobby();

        photography.tellAboutHobby();

    }

}