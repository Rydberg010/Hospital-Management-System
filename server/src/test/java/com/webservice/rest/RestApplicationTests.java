package com.webservice.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import javax.transaction.Transactional;

import com.webservice.rest.controller.DoctorController;
import com.webservice.rest.controller.PatientController;
import com.webservice.rest.entity.Doctor;
import com.webservice.rest.entity.Patient;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class RestApplicationTests 
{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PatientController patientController;

    @Autowired
     DoctorController doctorController;


    @Test
    public void test(){
        assertTrue(true);
    }
    @Test
    public void  showPatientInformationTest(){
        Patient patient =patientController.showPatientInformation(1);
        assertEquals(patient.getName(),"Kanhaiya Verma");
    }

    @Test
    public void showDoctorInformationTest(){
        Doctor doc = doctorController.getDoctorInfo("Arun Sharma"); 
        assertEquals(doc.getField(),"Surgeon");
        // logger.info(doc.toString());
    }

    @Test
    @DirtiesContext
    @Transactional
    public void saveDoctorInformation(){
        Doctor doc = new Doctor("Dr. Sundar Sharma", 42, "male", "ENT");
        boolean res=doctorController.addUser(doc);
        assertTrue(res);
    }

    // @Test
    // @DirtiesContext
    // @Transactional
    // public void savePatientInformation(){
    //     Patient patient = new Patient(2, "Pranjal samanta", 30, "Arun Sharma",LocalDate.now(), "female", "xyz");
    //     boolean res = patientController.createPatient(patient);
    //     assertTrue(res);
    // }
}
