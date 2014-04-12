/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dastamessageCreator;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import mzcr.cz.ns.dasta.ds4.ds_cistype.*;
import mzcr.cz.ns.dasta.ds4.ds_dasta.*;
import mzcr.cz.ns.dasta.ds4.ds_ip.*;
import mzcr.cz.ns.dasta.ds4.ds_ip.DgzType.Diag;
import mzcr.cz.ns.dasta.ds4.ds_type.*;

/*import pro Xdom*/
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.IOException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import org.xml.sax.SAXException;

/**
 *
 * @author User
 */
public class DastaMessageJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException {

        /*
         * Vytvoreni fantory pro jednotlive balicky
         */
        mzcr.cz.ns.dasta.ds4.ds_dasta.ObjectFactory factoryDasta = new mzcr.cz.ns.dasta.ds4.ds_dasta.ObjectFactory();
        mzcr.cz.ns.dasta.ds4.ds_type.ObjectFactory factoryDsType = new mzcr.cz.ns.dasta.ds4.ds_type.ObjectFactory();
        mzcr.cz.ns.dasta.ds4.ds_ip.ObjectFactory factoryDsIp = new mzcr.cz.ns.dasta.ds4.ds_ip.ObjectFactory();

        /*Nacteni xml*/
        /*C:\\Documents and Settings\\Milan\\Dokumenty\\škola\\FBMI\\3rocnik\\17bieth\\Programs\\DastaMessageCreator\\message2.xml*/
        File fXmlFile;
        JAXBContext context = JAXBContext.newInstance(Dasta.class);
        Unmarshaller un = context.createUnmarshaller();
        Dasta dastaInput = factoryDasta.createDasta();
        JAXBElement<Dasta> message2 = null;
        try {
            fXmlFile = new File(".\\zprava2.xml");
            message2 = un.unmarshal(new StreamSource(fXmlFile), Dasta.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /**
         * Zakladni hlavicka
         */
        Dasta dasta = factoryDasta.createDasta();
        String verzeDs = message2.getValue().getVerzeDs();
        System.out.println("verzeDs-> " + verzeDs);
        dasta.setVerzeDs(verzeDs);

        String idSoubor = message2.getValue().getIdSoubor();
        System.out.println("idSouboru-> " + idSoubor);
        dasta.setIdSoubor(idSoubor);

        String binPriloha = message2.getValue().getBinPriloha();
        System.out.println("binPriloha-> " + binPriloha);
        dasta.setBinPriloha(binPriloha);

        String ur = message2.getValue().getUr();
        System.out.println("ur-> " + ur);
        dasta.setUr(ur);

        String typOdesm = message2.getValue().getTypOdesm();
        System.out.println("TypOdesm-> " + typOdesm);
        dasta.setTypOdesm(typOdesm);

        /**
         * Informace o programu, ktery generoval zpravu
         */
        ZdrojIsType zdrojIsType = factoryDasta.createZdrojIsType();

        String kodFirmy = message2.getValue().getZdrojIs().getKodFirmy();
        System.out.println("kodFirmy-> " + kodFirmy);
        zdrojIsType.setKodFirmy(kodFirmy);

        String kodProg = message2.getValue().getZdrojIs().getKodProg();
        System.out.println("kodProg-> " + kodProg);
        zdrojIsType.setKodProg(kodProg);

        String verzeProg = message2.getValue().getZdrojIs().getVerzeProg();
        System.out.println("verzeProg-> " + verzeProg);
        zdrojIsType.setVerzeProg(verzeProg);

        /**
         * Poskytovatel dat
         */
        PmType pm = factoryDasta.createPmType();
        AsType as1 = factoryDasta.createAsType();

        as1.setTyp(
                "I");
        as1.setVnitrni(
                "999");
        pm.setAs(as1);

        /**
         * Informace o garantovi dat
         */
        GarantDatType garantDat = factoryDsType.createGarantDatType();

        garantDat.setIdGarant(
                "450124145");
        garantDat.setOdbornost(
                "801");
        garantDat.setValue(
                "MUDr. Jmeno Prijmeni");

        /**
         * Informace o zdravotnickem zarizeni
         */
        IsType is = factoryDasta.createIsType();

        is.setIco(
                "12345678");
        is.setIcz(
                "44101000");
        is.setIcp(
                "44101882");
        AsType as2 = factoryDasta.createAsType();

        as2.setVnitrni(
                "801");
        is.setAs(as2);

        /**
         * Pacientska cast
         */
        Ip ip = factoryDsIp.createIp();

        ip.setIdPac(
                "7601019998");
        ip.setRodcis(
                "7601019998");
        ip.setJmeno(
                "Jmeno");
        ip.setPrijmeni(
                "Prijmeni");
        DatXxType datDn = new DatXxType();

        datDn.setFormat(
                "D");
        datDn.setValue(
                "1976-01-01");
        ip.setDatDn(datDn);

        ip.setSex(SexType.M);

        KuZType kuZType = factoryDsIp.createKuZType();

        kuZType.setTypku(
                "AMBUL");
        kuZType.setFazespec(
                "ZF");
        kuZType.setIdku(
                "MEDICALC.FNPL.1234567890");
        DatXxType datProv = new DatXxType();
        DatXxType datVydani = new DatXxType();

        datProv.setValue(
                "2006-12-03T11:00:00");
        datVydani.setValue(
                "2006-11-03T11:00:00");
        kuZType.setDatProv(datProv);

        kuZType.setDatVydani(datVydani);
        /*
         * Definice pracoviste, kde probehlo osetreni
         */
        PracovisteType pPracoviste = factoryDsIp.createPracovisteType();

        pPracoviste.setIcz(
                "44101000");
        pPracoviste.setIcp(
                "44101882");
        pPracoviste.setOdb(
                "501");
        pPracoviste.setNazev(
                "Chirurgická ambulance");
        kuZType.setPPracoviste(pPracoviste);
        TextType textType = factoryDsIp.createTextType();
        Ptext pText = factoryDsIp.createPtext();

        pText.setSpace(
                "preserve");
        pText.setValue(
                "Při fotbale si podvrkl pravé koleno. O koleno s náplní, "
                + "čéška nebolestivá, bolestivá flexe kolena koleno špatně "
                + "vyšetřitelné, zásuvka negativní RTG bez traumatu Dg.Distorsio geni l.dx"
                + "Th provedena punkce kolenního kloubu.vypunktováno 60 ml krve "
                + "bez tukových kapének, naložena ortesa Dop klidový režim kontrola zde za 2 dny dop");
        textType.setPtext(pText);

        kuZType.setText(textType);

        //Definice diagnozy 
        DgzType dgzType = factoryDsIp.createDgzType();
        Diag diag = new Diag();

        diag.setValue(
                "I158");
        diag.setPoradi(
                1);
        dgzType.setDiag(diag);

        dgzType.setTypDg(
                "P");
        dgzType.setIndOpravSd(
                "N");
        List<DgzType> dgzTypes = kuZType.getDgVys();

        dgzTypes.add(dgzType);

        AuzkuType auzkuType = factoryDsIp.createAuzkuType();

        auzkuType.setIndikace(
                "I");
        auzkuType.setTyppolVz(
                "V");
        auzkuType.setDiag(
                "I158");
        DatDuType datDu = factoryDsType.createDatDuType();

        datDu.setValue(
                "2006-12-03T11:00:00");
        datDu.setTyp(LVTZDCUN.A);

        auzkuType.setDatDu(datDu);
        List<AuzkuType> auzkuTypes = kuZType.getAuzku();

        auzkuTypes.add(auzkuType);

        /**
         * Nyni je potreba navazat jednotlive bloky na hlavni tag dasta
         */
        dasta.setZdrojIs(zdrojIsType); // pridani zdroje

        dasta.setPm(pm); // pridani prijmoveho mista

        dasta.setGarantDat(garantDat);  // pridani garanta

        /**
         * Blok ku muze obsahovat vetsi pocet klinickych udalosti
         * (reprezentovnych kuZType), proto je potreba tento blok definovat v
         * poli (rep. ArrayListu)
         */
        ArrayList<IsType> isTypes = new ArrayList<IsType>();
        Ip.Ku ipKu = factoryDsIp.createIpKu(); // trida Ku je soucasti tridy Ip
        List<KuZType> kuZTypes = ipKu.getKuZ(); // Je vyvoren seznam klinickych udalosti, ktery je soucasti Ip.Ku

        kuZTypes.add(kuZType); // prida se vytvorena klinicka udalost

        ip.setKu(ipKu); // klinicke udalosti se pridaji jako blok k bloku pacienta        

        is.setIp(ip);  //  krok pridani bloku pacienta do bloku odesilatele             

        isTypes.add(is);  // Pro pripad, ze by zprava obsahovale vice udalosti je halvni blok is zarazen do seznamu

        dasta.setIs(isTypes); // prirazeni cele zpravy do obalu bloku datsa              

        /**
         * Vytvori xml z hlavniho objektu dasta
         *
         * JAXBContext context = JAXBContext.newInstance(Dasta.class);
         * JAXBElement<Dasta> element = factoryDasta.createExpenseReport(dasta);
         * Marshaller marshaller = context.createMarshaller();
         * marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); /**
         * Namapuje elementy jednotlivych namespace na nami pozadovane nazvy
         *
         * marshaller.setProperty("com.sun.xml.internal.bind.namespacePrefixMapper",
         * new NamespacePrefixMapper() {
         *
         * @Override public String[] getPreDeclaredNamespaceUris() { return
         * null; //new String[]{WellKnownNamespace.XML_SCHEMA_INSTANCE}; }
         *
         * @Override public String getPreferredPrefix(String namespaceUri,
         * String suggestion, boolean requirePrefix) { if
         * (namespaceUri.equals("urn:cz-mzcr:ns:dasta:ds4:ds_dasta")) { return
         * "ds"; } if (namespaceUri.equals("urn:cz-mzcr:ns:dasta:ds4:ds_ip")) {
         * return "dsip"; } return suggestion;
         *
         * }
         * });
         *
         * /**
         * Vypis xml zpavy
         *
         * marshaller.marshal(element, System.out);
         */
    }

}
