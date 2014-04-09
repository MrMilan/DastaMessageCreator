/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dastamessagejava;

import javax.xml.bind.JAXBException;
import mzcr.cz.ns.dasta.ds4.ds_cistype.*;
import mzcr.cz.ns.dasta.ds4.ds_dasta.*;
import mzcr.cz.ns.dasta.ds4.ds_ip.*;
import mzcr.cz.ns.dasta.ds4.ds_ip.DgzType.Diag;
import mzcr.cz.ns.dasta.ds4.ds_type.*;

/**
 *
 * @author User
 */
public class DastaMessageJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws JAXBException{
        mzcr.cz.ns.dasta.ds4.ds_dasta.ObjectFactory factoryDasta = new mzcr.cz.ns.dasta.ds4.ds_dasta.ObjectFactory();
        mzcr.cz.ns.dasta.ds4.ds_type.ObjectFactory factoryDsType = new mzcr.cz.ns.dasta.ds4.ds_type.ObjectFactory();
        mzcr.cz.ns.dasta.ds4.ds_ip.ObjectFactory factoryDsIp = new mzcr.cz.ns.dasta.ds4.ds_ip.ObjectFactory();

        /**
         * Zakladni hlavicka
         */
        Dasta dasta = factoryDasta.createDasta();
        dasta.setVerzeDs("04.08.06");
        dasta.setIdSoubor("MEDICALC_KK11115_2005-12-12T14:46:25");
        dasta.setVerzeNclp("02.44.01");
        
        

        /**
         * Informace o programu, ktery generoval zpravu
         */
        ZdrojIsType zdrojIsType = factoryDasta.createZdrojIsType();
        zdrojIsType.setKodFirmy("MEDICALC");
        zdrojIsType.setKodProg("WMEXP");
        zdrojIsType.setVerzeProg("2.2.3.8");
        
        /**
         *
         */
        PmType pm = factoryDasta.createPmType();
        AsType as1 = factoryDasta.createAsType();
        as1.setTyp("I");
        as1.setPoradi("1");
        
        /**
         * Informace o garantovi dat
         */
        GarantDatType garantDat = factoryDsType.createGarantDatType();

        Ip ip = factoryDsIp.createIp();
        ip.setIdPac("7601019998");
        ip.setRodcis("7601019998");
        ip.setJmeno("Jmeno");
        ip.setPrijmeni("Prijmeno");
        DatXxType datXxType = new DatXxType();
        datXxType.setFormat("D");
        datXxType.setValue("1976-01-01");
        ip.setDatDn(datXxType);
        ip.setSex(SexType.M);
        
        
        KuZType kuZType = factoryDsIp.createKuZType();
        kuZType.setTypku("AMB.VYS");
        
        PracovisteType pracovisteType = new PracovisteType();
        
        DgzType dgzType = new DgzType();
        Diag diag = new Diag();
        diag.setValue("L031");
        diag.setPoradi(1);
        
        
    }

}
