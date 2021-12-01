public class University
{

  //University Information
  private String name;
  private String description;
  private String motto;
  private boolean ivyleague;
  //ivyleage set to true - university is in the ivlyleague, false - not in the ivyleague.
  private boolean publicity;
  //publicity set to true - university is public, false - private.

  //Previous Year Metrics
  private int applicants;
  private int admitted;
  private int enrolled;
  private double admissionrate;
  private double retentionrate;
  private double genderratio;
  //genderratio will contain a double value from 0-1, representing the percent of enrolled students that are male.
  private double graduationrate;
  private double prospects;
  //the average salary 1of students year after graduation(getting a bachelors degree)

  //Admission Timeline
  private boolean earlydecision;
  private boolean earlyaction;
  private boolean regulardecision;
  private boolean regularaction;

  private int edmonth;
  private int eddate;
  private int eamonth;
  private int eadate;
  private int rdmonth;
  private int rddate;
  private int ramonth;
  private int radate;

  //Admisssion Requirements

  private boolean commonapp;
  private boolean coalitionapp;
  private boolean requiredess;
  //if the personal essay is required.
  private boolean requiredwrt;
  //if additional writing questions are required.
  private int requiredshort;
  private int requiredlong;
  //metric of how many additional short and long writing prompts are required.
  private boolean additionalwrt;
  //if some additonal writing questions are optional.
  private int additionalshort;
  private int additionallong;
  //metric of how many additional short and long writing prompts are optional.

  private boolean optionalcon;
  private boolean requiredcon;
  private boolean optionallor;
  private boolean requiredlor;
  private boolean optionaloth;
  private boolean requiredoth;















}