package carti;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AutoriController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private ComboBox<String> aut;

	@FXML
	private TextField nast;

	@FXML
	private TextField nat;

	@FXML
	private TextArea infoAut;

	@FXML
	void afisareaut(ActionEvent event) {
		// Pozitia selectata
		int nr = aut.getSelectionModel().getSelectedIndex();
		// Extrag din lista obiectul de pe pozitia nr
		Autori autor = autori.get(nr);
		// Inserez datele in contoale din fereastra:
		nast.setText(autor.getAnNastere());
		nat.setText(autor.getNationalitate());
		infoAut.setText(autor.getInformatii());

	}

	@FXML
	void ies(ActionEvent event) {
		Stage stage = (Stage) nast.getScene().getWindow();
		stage.hide();
	}

	private ArrayList<Autori> autori;

	@FXML
	void initialize() {
		autori = new ArrayList<Autori>();
		Autori autor = new Autori("Charles Dickens", "1812", "Englez",
				"Charles Dickens a fost un scriitor englez reprezentativ pentru realismul secolului al XIX-lea, cunoscut prin opere precum Marile sperante, Aventurile lui Oliver Twist, David Copperfield, Martin Chuzzlewit, Dombey și fiul, Timpuri grele, Dugheana cu vechituri (Pravalia cu antichități), Documentele postume ale clubului Pickwich, Nicholas Nickeby, Barnaby Rudge, Poveste despre două orașe (ultimele două, romane istorice).");
		autori.add(autor);
		autor = new Autori("Albert Camus", "1913", "Algerian",
				"Exegeții operei camusiene au stabilit că autorul francez poate fi considerat un filozof al absurdului și al revoltei, iar acest fapt se datorează celor două mituri conturate în eseuri: al asumării suferinței (Mitul lui Sisif) și al salvării (Omul revoltat).\r\n" + 
				"Școala filozofică din care face parte, astfel, eseistul este cea a existențialismului, în sensul etimologic al cuvântului, sens pe care îl precizează și Ion Vitner în studiul Albert Camus sau tragicul exilului: \"Existență (ex-sistere) înseamnă, într-adevăr, «a fi situat în afară de», adică are sensul unei separări, al unei rupturi sau – cum traduce Camus – al unui exil, al unei înstrăinări\".\r\n" + 
				"Primul său eseu urmează, la interval de numai un an, romanului Străinul și oferă o fundamentare teoretică a poveștii unui exil printre oameni. Definind absurdul ca \"un rău al spiritului\", Camus consideră că rațiunea prezenței acestuia în existență este \"contrastul dintre strigătul ființei și tăcerea ilogică a lumii\".\r\n" + 
				"\"Nu poate fi dragoste de a trăi fără disperare de a fi\" – crede eseistul și acest paradox impune două noțiuni noi pentru gândirea veacului: \"omul absurd, cel care, fără s-o nege, nu face nimic pentru eternitate\" (cum ar fi exemplele unor Don Juan, Kirilov, Franz Kafka) și libertatea absurdă, care implică pasiunea, revolta, sinuciderea.\r\n" + 
				"Ca și în cazul unor filozofi precum Blaise Pascal, Lev Șestov sau Karl Jaspers, eseul nu postulează adevăruri ultime, ci mai curând, într-un lirism exagerat, tinde să definească absurdul ca principiu destructiv al unei lumi în care totuși \"trebuie să ni-l imaginăm pe Sisif fericit\".\r\n" + 
				"Precedat de articolul Remarcă asupra revoltei, cel de-al doilea eseu, Omul revoltat, ilustrează, prin conținutul său dens, o formulă reînnoită a dictonului cartezian: \"mă revolt, deci suntem\". În interpretarea lui Camus, revolta este deci singurul mijloc de a depăși absurdul. Ea este prima evidență care scoate omul din singurătate, care îl socializează pe Sisif: \"Dacă avem conștiința neantului și a non-sensului, dacă găsim că lumea este absurdă și condiția umană de nesuportat, nu este acesta sfârșitul și nu ne putem opri aici. În afară de sinucidere, o altă reacție a individului este revolta instinctivă. Astfel, din sentimentul absurdului, vedem născându-se ceva ce îl depășește.\"\r\n" + 
				"La limita dintre glossă și poezie, Camus îl descrie pe Sisif singur pe stânca lui, surprizându-i o psihologie de condamnat. Singura formă de revoltă care îi este permisă, în situația lui absurdă, este curajul de a-și spune că e fericit. Spre deosebire de el, omul revoltat nu este singur, de vreme ce se revoltă împotriva celorlalți, iar finalitatea acestei atitudini poate fi reperabilă atât în existență, cât și în artă: \" - arta este o manifestare care exaltă și neagă în același timp\".");
		autori.add(autor);
		
		autor = new Autori("Yuval Noah Harari ", "1976", "Israeliana",
				"Într-o sinteză a istoriei omenirii pe cât de creativă și fascinantă, pe atât de provocatoare, construită în patru părți, cuprinzând 20 de capitole și un scurt epilog, autorul pune practic în discuție tot ce știm despre noi înșine, pornind de la două întrebări esențiale: Cum de am ajuns stăpânii planetei și încotro ne îndreptăm? Pe parcursul lucrării oferă răspunsuri la alte întrebări incitante: Care este relația dintre istorie și biologie? Care este diferența esențială dintre Homo Sapiens și celelalte animale? Există justiție în istorie? Istoria are un sens? Oamenii au devenit mai fericiți pe măsura evoluției istorice? Și ne lasă cu o întrebare de o gravitate înspăimântătoare, dar în spiritul evoluției speciei noastre: „Ce vrem să vrem?” (349[15]).\r\n" + 
				"\r\n" + 
				"Harari este probabil primul istoric profesionist care urmărește evoluția speciei Homo Sapiens prin integrarea disciplinei istoriei umane în istoria fizicii, chimiei și, mai ales, biologiei și ecologiei planetare[16]. El construiește cu obiectivitatea omului de știință și abilitatea istoricului specializat în macro-istorie, printr-o metodică combinare a analizei și sintezei, în termeni memorabili sintetici, șocanți și, uneori, ostentativi și senzaționali, cu talentul exprimării clare, o narațiune în care evoluția biologică a umanității se întrepătrunde cu evoluția viețuitoarelor asemănătoare cu omul.\r\n" + 
				"\r\n" + 
				"Este povestea reconsiderată a genului Homo, specia Sapiens care traversând biologicul a parcurs drumul de la animalitate la umanitate și, în zorii mileniului III, ajunge „capabil să se elibereze de limitele determinate biologic”(335). În mai puțin de 100.000 de ani, Homo Sapiens, răspândindu-se pe toate continentele s-a comportat ca „un fel de ucigaș în serie ecologic” (66) și a distrus lanțul trofic planetar în timpul Revoluției Cognitive. Ca „un dictator dintr-o republică bananieră” (20) a ajuns în vârful ecosistemului atât de repede, încât ecosistemul n-a mai avut timp să se adapteze. În urmă cu 12.000 de ani a declanșat Revoluția Agricolă, „cea mai mare păcăleală din istorie” (75), căci „goana după o viață mai ușoară a dus la o viață plină de greutăți”(83). Iar în ultimii 500 de ani Revoluția Științifică a condus la „creșterea fenomenală și fără precedent a puterii oamenilor”(211). Și „astăzi (umanitatea) e pe punctul de a deveni zeu, gata să dobândească ... capacitățile divine de a crea și a distruge” (351). Deci, umanitatea devine zeu. Dar, ca și zeii, este nemulțumită, iresponsabilă și nu știe ce vrea. Ce poate fi mai periculos decât aceasta? - se întreabă cu gravitate autorul în finalul cărții.");
		autori.add(autor);
		autor = new Autori("Stephen King", "1947", "American",
				"King a început să scrie la o vârstă fragedă. În anii de școală a scris povestiri bazate pe filmele văzute recent la cinema și le-a vândut prietenilor și colegilor. După ce profesorii săi au aflat s-au împotrivit acestui obicei, iar King a fost nevoit să restituie banii câștigați. Aceste povestiri au fost multiplicate cu o matriță de tipărit folosită de fratele său David pentru a multiplica un ziar propriu, „Dave's Rag” (Fițuica lui David). „Dave's Rag” era despre evenimente locale, iar King a contribuit deseori. În jurul vârstei de treisprezece ani, King a găsit în casa mătușii sale o cutie cu cărți vechi aparținând tatălui său, majoritatea horror și science fiction. A fost instantaneu fascinat de aceste genuri.");
		autori.add(autor);
		autor = new Autori("Alexandre Dumas", "1802", "Francez",
				"Bunicul său, marchizul Antoine-Alexandre Davy de la Pailleterie, a servit guvernul Franței ca General commissaire de Artilerie în colonia Saint-Domingue (astăzi Haiti), unde s-a căsătorit cu Marie-Césette Dumas, o sclavă de culoare.\r\n" + 
				"\r\n" + 
				"În 1762, aceasta l-a născut pe tatăl său, Thomas-Alexandre, și a decedat la scurt timp după naștere.\r\n" + 
				"\r\n" + 
				"La întoarcerea marchizului și a fiului său în Normandia, sclavia încă exista, iar băiatul a avut de suferit datorită faptului că era pe jumătate negru.\r\n" + 
				"\r\n" + 
				"În 1786, Thomas-Alexandre s-a înrolat în armata franceză, folosind numele de familie al mamei sale ca să protejeze reputația aristocratică a familiei. În urma revoluției franceze, marchizul și-a pierdut proprietățile, dar Thomas-Alexandre Dumas a avut o carieră distinsă în armata revoluționară, ajungând la gradul de general înaintea împlinirii vârstei de 31 ani.\r\n" + 
				"\r\n" + 
				"Thomas-Alexandre s-a căsătorit cu Marie-Louise Elisabeth Labouret, iar în iulie 1802, în Villers-Cotterêts, Aisne, lângă Paris, s-a născut fiul lor, Alexandre Dumas.\r\n" + 
				"\r\n" + 
				"Tatăl său, Thomas Alexandre Davy de La Pailleterie, general al Revoluției franceze a murit în 1806, când fiul său avea trei ani și jumătate.\r\n" + 
				"\r\n" + 
				"Alexandre Dumas a fost crescut de mama sa și a primit o educație mai degrabă mediocră, însă acest fapt nu i-a afectat afinitatea pentru cărți, pe care le citea ori de câte ori avea ocazia.\r\n" + 
				"\r\n" + 
				"Povestirile mamei sale despre faptele de vitejie ale tatălui său din anii de glorie a lui Napoleon i-au stârnit imaginația pentru aventuri și eroi.\r\n" + 
				"\r\n" + 
				"Deși săracă, familia tânărului de douăzeci și doi de ani Alexandre Dumas, a păstrat atât reputația distinsă a tatălui său cât și legăturile aristocratice, aceasta fiindu-i de folos după restaurarea monarhiei.");
		autori.add(autor);
//		autor = new Autori("", "", "","");
//		autori.add(autor);

		// populez lista autorilor
		for (Autori a : autori) {
			aut.getItems().add(a.getNume());
		}
	}
}
