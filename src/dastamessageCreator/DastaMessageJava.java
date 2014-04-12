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

        String asTyp = message2.getValue().getPm().getAs().getTyp();
        System.out.println("as1Typ-> " + asTyp);
        as1.setTyp(asTyp);

        String asVnitrni = message2.getValue().getPm().getAs().getVnitrni();
        System.out.println("as1Vnitrni-> " + asVnitrni);
        as1.setVnitrni(asVnitrni);

        pm.setAs(as1);

        /**
         * Informace o garantovi dat
         */
        GarantDatType garantDat = factoryDsType.createGarantDatType();

        String gID = message2.getValue().getGarantDat().getIdGarant();
        System.out.println("Garanta Id-> " + gID);
        garantDat.setIdGarant(gID);

        String gOdbor = message2.getValue().getGarantDat().getOdbornost();
        System.out.println("Garant Odbornost-> " + gOdbor);
        garantDat.setOdbornost(gOdbor);

        String gValue = message2.getValue().getGarantDat().getValue();
        System.out.println("Garant Value-> " + gValue);
        garantDat.setValue(gValue);

        /**
         * Informace o zdravotnickem zarizeni
         */
        IsType is = factoryDasta.createIsType();
        int vemPrvni = 0;//message2.getValue().getIs().size();

        IsType isGET = message2.getValue().getIs().get(vemPrvni);

        String IsTypIco = isGET.getIco();
        System.out.println("IsTypIco-> " + IsTypIco);
        is.setIco(IsTypIco);

        String IsTypIcz = isGET.getIcz();
        System.out.println("IsTypIcz-> " + IsTypIcz);
        is.setIcz(IsTypIcz);

        String IsTypIcp = isGET.getIcp();
        System.out.println("IsTypIcp-> " + IsTypIcp);
        is.setIcp(IsTypIcp);

        AsType as2 = factoryDasta.createAsType();

        String IsTypAsVnitrni = isGET.getAs().getVnitrni();
        System.out.println("IsTypAsVnitrni-> " + IsTypAsVnitrni);
        as2.setVnitrni(IsTypAsVnitrni);
        is.setAs(as2);

        /**
         * Pacientska cast
         */
        Ip ip = factoryDsIp.createIp();

        Ip ipIsGET = isGET.getIp();

        String IpIDPac = ipIsGET.getIdPac();
        System.out.println("IsIpIdPac-> " + IpIDPac);
        ip.setIdPac(IpIDPac);

        String IpRodCis = ipIsGET.getRodcis();
        System.out.println("IsIpRodneCislo-> " + IpRodCis);
        ip.setRodcis(IpRodCis);

        String IpJmeno = ipIsGET.getIdPac();
        System.out.println("IsIpJmeno-> " + IpJmeno);
        ip.setJmeno(IpJmeno);

        String IpPrijmeni = ipIsGET.getPrijmeni();
        System.out.println("IsIpPrijmeni-> " + IpPrijmeni);
        ip.setPrijmeni(IpPrijmeni);

        DatXxType datDn = new DatXxType();

        String IpDnFormat = ipIsGET.getDatDn().getFormat();
        System.out.println("IpIsDnFormat-> " + IpDnFormat);
        datDn.setFormat(IpDnFormat);

        String IpDnValue = ipIsGET.getDatDn().getValue();
        System.out.println("IpIsDnValue-> " + IpDnValue);
        datDn.setValue(IpDnValue);
        ip.setDatDn(datDn);

        String IpSex = ipIsGET.getSex().value();
        System.out.println("IpSex-> " + IpSex);
        ip.setSex(SexType.M);

        KuZType kuZType = factoryDsIp.createKuZType();

        KuZType kuZIpIsGET = ipIsGET.getKu().getKuZ().get(vemPrvni);

        String kuZTypku = kuZIpIsGET.getTypku();
        System.out.println("kuZTypku-> " + kuZTypku);
        kuZType.setTypku(kuZTypku);

        String kuZFazespec = kuZIpIsGET.getFazespec();
        System.out.println("kuZFazespec-> " + kuZFazespec);
        kuZType.setFazespec(kuZFazespec);

        String kuZIdku = kuZIpIsGET.getIdku();
        System.out.println("kuZIdku-> " + kuZIdku);
        kuZType.setIdku(kuZIdku);

        DatXxType datProv = new DatXxType();
        DatXxType datVydani = new DatXxType();

        String kuZDatProv = kuZIpIsGET.getDatProv().getValue();
        System.out.println("kuZDatProv-> " + kuZDatProv);
        datProv.setValue(kuZDatProv);

        String kuZDatVydani = kuZIpIsGET.getDatVydani().getValue();
        System.out.println("kuDatVydani-> " + kuZDatVydani);
        datVydani.setValue(kuZDatVydani);

        kuZType.setDatProv(datProv);
        kuZType.setDatVydani(datVydani);
        /*
         * Definice pracoviste, kde probehlo osetreni
         */
        PracovisteType pPracoviste = factoryDsIp.createPracovisteType();

        PracovisteType pPracKuZIpIsGET = kuZIpIsGET.getPPracoviste();

        String pPracIcz = pPracKuZIpIsGET.getIcz();
        System.out.println("pPracIcz-> " + pPracIcz);
        pPracoviste.setIcz(pPracIcz);

        String pPracIcp = pPracKuZIpIsGET.getIcp();
        System.out.println("pPracIcp-> " + pPracIcp);
        pPracoviste.setIcp(pPracIcp);

        String pPracOdb = pPracKuZIpIsGET.getOdb();
        System.out.println("pPracOdb-> " + pPracOdb);
        pPracoviste.setOdb(pPracOdb);

        String pPracNazev = pPracKuZIpIsGET.getNazev();
        System.out.println("pPracNazev-> " + pPracNazev);
        pPracoviste.setNazev(pPracNazev);

        kuZType.setPPracoviste(pPracoviste);

        TextType textType = factoryDsIp.createTextType();
        Ptext pText = factoryDsIp.createPtext();
        Ptext pTextKuZIpIsGET = kuZIpIsGET.getText().getPtext();

        String pTextSpace = pTextKuZIpIsGET.getSpace();
        System.out.println("pTextSpace-> " + pTextSpace);
        pText.setSpace(pTextSpace);

        String pTextValue = pTextKuZIpIsGET.getValue();
        System.out.println("pTextValue-> " + pTextValue);
        pText.setValue(pTextValue);

        textType.setPtext(pText);

        kuZType.setText(textType);

        //Definice diagnozy 
        DgzType dgzType = factoryDsIp.createDgzType();
        DgzType dgzTypeKuZIpIsGET = ipIsGET.getDg().getDgz().get(vemPrvni);

        Diag diag = new Diag();
        Diag diagDgzTypeKuZIpIsGET = dgzTypeKuZIpIsGET.getDiag();

        String diagValue = diagDgzTypeKuZIpIsGET.getValue();
        System.out.println("diagValue-> " + diagValue);
        diag.setValue(diagValue);

        int diagPoradi = diagDgzTypeKuZIpIsGET.getPoradi();
        System.out.println("diagPoradi-> " + diagPoradi);
        diag.setPoradi(diagPoradi);
        dgzType.setDiag(diag);

        String typDg = dgzTypeKuZIpIsGET.getTypDg();
        System.out.println("typDg-> " + typDg);
        dgzType.setTypDg(typDg);

        String indOpravSd = dgzTypeKuZIpIsGET.getIndOpravSd();
        System.out.println("IndOpravSd-> " + indOpravSd);
        dgzType.setIndOpravSd(indOpravSd);

        List<DgzType> dgzTypes = kuZType.getDgVys();

        dgzTypes.add(dgzType);

        AuzkuType auzkuType = factoryDsIp.createAuzkuType();
        AuzkuType auzkuTypeKuZIpIsGET = kuZIpIsGET.getAuzku().get(vemPrvni);

        String indikace = auzkuTypeKuZIpIsGET.getIndikace();
        System.out.println("Indikace-> " + indikace);
        auzkuType.setIndikace(indikace);

        String typpolVz = auzkuTypeKuZIpIsGET.getTyppolVz();
        System.out.println("TyppolVz-> " + typpolVz);
        auzkuType.setTyppolVz(typpolVz);

        String diagAuzku = auzkuTypeKuZIpIsGET.getDiag();
        System.out.println("diagAuzku-> " + diagAuzku);
        auzkuType.setDiag(diagAuzku);

        DatDuType datDu = factoryDsType.createDatDuType();

        String valueDatDuAuzku = auzkuTypeKuZIpIsGET.getDatDu().getValue();
        System.out.println("Value datDuAuzku-> " + valueDatDuAuzku);
        datDu.setValue(valueDatDuAuzku);
        
        LVTZDCUN typDatDuAuzku = auzkuTypeKuZIpIsGET.getDatDu().getTyp();
        System.out.println("Typ datDuAuzku-> " + typDatDuAuzku.toString());
        datDu.setTyp(typDatDuAuzku);

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
