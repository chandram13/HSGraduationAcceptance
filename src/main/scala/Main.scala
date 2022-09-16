class hsgraduationrequirements{
  private def studentDemographic(name,gender,studentID):
    println("The intended graduate name is:" + name + ",and is a " + gender + ", and has the student ID of" + studentID + ".")
  def requirementA(historyCourse1,historyCourse2):
    if historyCourse1 == true:
      println("The student has passed the first required year of history. Student must take another second year of history.")
    if historyCourse1 == false:
      println("Student must retake their first year of history to move on to the second required year.")
    if historyCourse2 == true:
      println("The student has passed the second required year of history. Student has completed all required years of history.")
    if historyCourse2 == false:
      println("The student has failed their second year of history. Student must retake their second year to complete their A graduation requirement.")
    else: println("Inform the student about what history courses they intend to take during high school to complete their A graduation requirement.")
  def requirementB(year1Eng,year2eng,year3eng,year4eng):
    if year1Eng == true:
      println("The student has passed their first year of English. Assign the student the second required course they plan to take.")
    if year1Eng == false:
      println("The student has failed their first year of English. The student must retake the course the following semester to be eligible for completing their B requirement.")
    if year2Eng == true:
      println("The student has passed their second year of English. Assign the student the third required course they plan to take.")
    if year2Eng == false:
      println("The student has failed their second year of English. The student must retake the course the following semester to be eligible for completing their B requirement.")
    if year3Eng == true:
      println("The student has passed their third year of English. Assign the student the fourt required course they plan to take.")
    if year3Eng == false:
      println("The student has failed their third year of English. The student must retake the course the following semester to be eligible for completing their B requirement.")
    if year4Eng == true:
      println("The student has passed their fourth year of English. They have completed their B requirement!")
    if year4Eng == false:
      println("The student has failed their fourth year of English. The student must retake the course the following semester to be eligible for completing their B requirement.")
    else: println("Inform the student about what English courses they intend to take during high school to complete their B graduation requirement.")
  def requirementC(year1math,year2math,year3math):
    if year1math == true:
      println("The student has passed their first year of Math. Assign the student the second required course they plan to take.")
    if year1math == false:
      println("The student has failed their first year of Math. The student must retake the course the following semester to be eligible for completing their C requirement.")
    if year2math == true:
      println("The student has passed their second year of Math. Assign the student the third required course they plan to take.")
    if year2math == false:
      println("The student has failed their second year of Math. The student must retake the course the following semester to be eligible for completing their C requirement.")
    if year3math == true:
      println("The student has passed their third year of Math. They have completed their C requirement!")
    if year3math == false:
      println("The student has failed their third year of Math. The student must retake the course the following semester to be eligible for completing their C requirement.")
    else: println("Inform the student about what Math courses they intend to take during high school to complete their C graduation requirement.")
  def requirementD(year1science,year2science):
    if year1science == true:
      println("The student has passed their first year of Science. Assign the student the second required course they plan to take.")
    if year1science == false:
      println("The student has failed their first year of Science. The student must retake the course the following semester to be eligible for completing their D requirement.")
    if year2science == true:
      println("The student has passed their second year of Science. They have completed their D requirement!")
    if year2science == false:
      println("The student has failed their second year of Math. The student must retake the course the following semester to be eligible for completing their D requirement.")
    else: println("Inform the student about what Science courses they intend to take during high school to complete their D graduation requirement.")
  def requirementE(year1lang,year2lang,year3lang):
    if year1lang == true:
      println("The student has passed their first year of foreign language. Assign the student the second required course they plan to take.")
    if year1lang == false:
      println("The student has failed their first year of foreign language. The student must retake the course the following semester to be eligible for completing their E requirement.")
    if year2lang == true:
      println("The student has passed their first year of foreign language. The student has completed their E requirement!")
    if year2lang == false:
      println("The student has failed their second year of foreign language. The student must retake the course the following semester to be eligible for completing their E requirement.")
    if year1lang ? year2lang == true:
      println("Reccomend the student to take the course:" + year3lang + ".")
    else: println("Inform the student about what foreign language courses they intend to take during high school to complete their E graduation requirement.")
  def requirementF(year1art):
    if year1art == true:
      println("The student has completed their minimum required art course. They have completed their F requirement!")
    if year1art == false:
      println("The student has not passed their required art course. Inform the student to take the course again the next semester.")
    else: println("Inform the student about what Art course they intend to take during high school to complete their F graduation requirement.")
  def requirementG(year1elective):
    if year1elective == true:
      println("The student has completed their minimum required elective course. They have completed their G requirement!")
    if year1elective == false:
      println("The student has failed their required elective course. Inform the student to take the course again the next semester.")
    else: println("Inform the student about what Elective course they intend to take during high school to complete their G graduation requirement.")
    
}