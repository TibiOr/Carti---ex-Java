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

public class CartiController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private ComboBox<String> carti;

	@FXML
	private TextField anAparitiei;

	@FXML
	private TextField autor;

	@FXML
	private TextArea infoCarte;

	@FXML
	void afisareCarti(ActionEvent event) {

		int nr = carti.getSelectionModel().getSelectedIndex();
		Carti carte = cartile.get(nr);
		anAparitiei.setText(carte.getAnAparitie());
		autor.setText(carte.getAutor());
		infoCarte.setText(carte.getInformatii());
	}

	@FXML
	void ies(ActionEvent event) {
		Stage stage = (Stage) anAparitiei.getScene().getWindow();
		stage.hide();

	}

	private ArrayList<Carti> cartile;

	@FXML
	void initialize() {
		cartile = new ArrayList<Carti>();
		Carti carte = new Carti("Contele de Monte-Cristo", "1844-1846", "Alexandre Dumas", "Pe drum spre Marsilia, la dorința căpitanului ce tocmai își dădea sfârșitul, Edmond Dantes preia din Elba o scrisoare a lui Napoleon către un bonapartist din Paris, Noirtier de Villefort. Odată ajuns în port, domnul Morrel, armatorul ce deținea nava \"Faraonul\", pe care lucra Edmond ca secund, îi oferă tânărului marinar slujba de căpitan. Acest act produce o mare neliniște din partea unui contabil aflat pe vas, Danglars, care îl invidia și ura pe Edmond. Dantes mulțumește domnului Morrel pentru slujbă, după care se duce să-și viziteze tatăl și pe minunata sa logodnică Mercedes, ce locuia în satul de pescari al catalanilor. Ca urmare a denunțului lui Danglars si a lui Fernand Mondego, un catalan ce o iubea pe Mercedes, Edmond e arestat ca informator, judecat de către procurorul de Villefort, fiul lui Noirtier, si închis la Chateau d'If pentru 14 ani. Acolo se împrietenește cu abatele Faria, care-i lasă ca moștenire secretul comorii familiei Spada, ascunsă pe insula Monte-Cristo. După ce evadează, cu o înfățișare nouă, conferită de bogăție și de marea cultură pe care o căpătase sub îndrumarea lui Faria, Edmond se întoarce pentru a se răzbuna.");
		cartile.add(carte);

		carte = new Carti("Străinul - L’Étranger", "1942", "Albert Camus", "Fără îndoială, Camus, prin acest roman aparținând „Ciclului absurdului”, a transpus în plan romanesc teoria din Mitul lui Sisif. La prima lectură a acestui roman, se ajunge la concluzia pe care Sartre a tratat-o amănunțit în „Situations I”, precum că existența la acest nivel nu are sens. Înlănțuirea evenimentelor este dictată de hazard, luând forma unei fatalități în fața omului. De aceea, Meursault este rece și distant atunci când inventariază evenimentele, ca și cum acestea ar surveni independent și fără voia lui.\r\n" + 
				"\r\n" + 
				"Cu toate acestea, Meursault rămâne un personaj pozitiv, care se pliază perfect acestei existențe/acestui mod de a trăi, de altfel, nici nu minte în fața Mariei sau a tribunalului, nici nu are un aer orgolios: pur și simplu, acceptă lucrurile așa cum sunt ele și nu vede niciun interes în a-i minți pe alții și nici chiar pe el însuși.\r\n" + 
				"\r\n" + 
				"Ucigându-l pe arab, Meursault o face ca urmare a unui instinct criminal, comportându-se ca și cum ar fi fost ghidat de soare și lumină. Astfel, crima primește o alură cvasimitică, mai ales că soarele și lumina sunt omniprezente în roman, având un impact concret asupra faptelor naratorului-personaj.\r\n" + 
				"\r\n" + 
				"A doua parte a romanului prezintă un Meursault arestat, obligat de a reflecta la viață și la sensul acesteia, contemplând sporadic moartea. Se conturează revolta față de injustiție, revolta față de o moarte ce survine mult prea devreme, cât și împăcarea cu lumea și cu sinele. Urmărindu-i dezgustul față de injustiție și condamnarea la moarte, Meursault, personajul pe care-l va construi mai târziu, va fi înzestrat cu acestea.\r\n" + 
				"\r\n" + 
				"„Opusul celui care se sinucide, scrie Camus în Mitul lui Sisif, este condamnatul la moarte”[7], pentru că cel ce dorește să se sinucidă, renunță, în timp ce condamnatul se revoltă. Iar revolta este singura atitudine pe care o poate avea omul absurdului: „Extrag din absurd trei elemente: revolta, libertatea și pasiunea mea. Printr-un joc de conștiință, din invitația la moarte fac regula de căpătâi a vieții – refuz suicidul” scrie Camus în eseul său.[8]. „Capodoperele se recunosc prin faptul că au mult mai mult de spus decât comentariile pe care le provoacă. Doar așa ne pot marca: lăsând de fiecare dată, în spatele fiecărei porți, o altă poartă deschisă.”[9]\r\n" + 
				"\r\n" + 
				"Totuși, opera rămâne ficțiune, nu eseu; de altfel, Camus mărturisește că a scris Străinul pentru a se destinde: romanul are un scop ludic și nicidecum filozofic, cu o aparentă legătură între ficțiune și existențialism.\r\n" + 
				"\r\n" + 
				"Într-un ultim interviu, Albert Camus se justifica astfel în ianuarie 1955: „Am sintetizat «Străinul», acum ceva vreme, printr-o frază de care-mi aduc aminte, deoarece e paradoxală: «În societate, fiecare om ce nu plânge la înmormântarea mamei sale riscă să fie condamnat la moarte.» Voiam să spun că eroul romanului este condamnat pentru că nu participă la joc. În acest sens, el apare ca un străin societății în care trăiește, zăbovește, rămâne pe dinafară, în suburbiile vieții private, solitare, plină de voluptate. De aceea, cititorii au fost tentați să-l asemene unei epave. Meursault nu se supune regulilor jocului. Răspunsul este simplu: refuză să mintă. ![…] …Cititorul nu s-ar înșela dacă ar vedea în «Străinul» povestea unui om care, lipsit de orice atitudine eroică, acceptă să moară pentru adevăr. Meursault, pentru mine, nu este o epavă, ci un om sărac și dezgolit, îndrăgostit de soare, fără să lase umbre. Departe de a fi privat de orice sentiment, îl cuprinde o pasiune profundă pentru absolut și adevăr. Mi-a venit, de asemenea, să spun, paradoxal, că am încercat să descriu prin personaj singura cruce/povară pe care o merităm. Se va înțelege, din ceea ce am explicat, că, fără nicio tentă de blasfemie, doar cu o afecțiune ironică, un artist își rezervă dreptul să-și analizeze personajele din creația sa.");
		cartile.add(carte);

		carte = new Carti("Apocalipsa - The Stand", "1978", "Stephen King", "Romanul este împărțit în trei părți sau cărți. Prima parte se numește \"Excursiile căpitanului/Captain Trips\" și are loc la nouăsprezece zile după ce un virus mortal a scăpat dintr-un laborator guvernamental. Supergripa este cunoscută sub numele oficial de \"Project Blue\", dar cel mai frecvent ca \"Excursiile căpitanului/Captain Trips\". Virusul a fost produs de armata SUA într-o baza secretă din care a fost eliberat în mod accidental. În timp ce se încearcă închiderea și securizarea bazei înainte ca orice persoană infectată să poată scăpa, o disfuncționalitate în cadrul programului de securitate permite ca un paznic și familia sa să se strecoare afară. Din păcate, ei sunt deja infectați și din cauza lor se declanșează o pandemie care ucide cca 99,4% din omenire, dar și animalele domestice, cum ar fi caii și câinii.\r\n" + 
				"\r\n" + 
				"King evidențiază defalcarea totală și distrugerea societății, prin violență, eșecul legii marțiale de a opri virusul și în cele din urmă moartea aproape a întregii populații. Drama umană apare și din faptul că puținii supraviețuitori trebuie să aibă grijă de familiile și prietenii lor care cad pradă gripei.\r\n" + 
				"\r\n" + 
				"Ediția extinsă a romanului se deschide cu un prolog intitulat \"Cercul se deschide\"/\"The Circle Opens\", care oferă mai multe detalii despre circumstanțele privind dezvoltarea virusului și despre încălcarea securității, lucru care a făcut ca virusul să scape din laboratorul secret în care a fost creat.");
		cartile.add(carte);
		carte = new Carti("Sapiens - Scurtă istorie a omenirii", "2017", "Yuval Noah Harari", "Pornind de la propria experiență intelectuală, puteam afirma până astăzi că printre autorii contemporani cu mine doi dintre ei au fost cei mai provocatori și, în același timp, mai expliciți în netezirea asperităților drumului intelectual spre înțelegerea istoriei umane și a viitorului acesteia, a raporturilor omului cu lumea și cu universul: Alvin Toffler[11], prin interpretarea trecutului și prezentului societății umane focalizată pe succesiunea celor două „valuri” de civilizație: agrară și industrială, și continuată cu „studiul viitorului” celui de-al treilea val de civilizație, era post-industrială, ale cărei traiectorii și semne autorul le evidențiază în lumea prezentului; Carl Sagan[12], prin ispititoarele conexiuni dintre nașterea, evoluția și moartea Universului și cea a omului, expuse într-o limpede și coerentă interogație a destinului cunoașterii Universului împletit cu soarta universului uman.\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"Coperta cărții apărută în 2017 la Editura Polirom\r\n" + 
				"Acum, după ce am savurat cartea lui Yuval Noah Harari[13], pot spune că imaginea mea despre umanitate este mai împlinită, mai puțin mărginită și mai clară.\r\n" + 
				"\r\n" + 
				"Apărută în limba ebraică în 2011, a stârnit o furtună de comentarii ambivalente din partea multor specialiști din științele naturii, filosofie și științele sociale, din lumea academică dar și din media mondială[14].\r\n" + 
				"\r\n" + 
				"Într-o sinteză a istoriei omenirii pe cât de creativă și fascinantă, pe atât de provocatoare, construită în patru părți, cuprinzând 20 de capitole și un scurt epilog, autorul pune practic în discuție tot ce știm despre noi înșine, pornind de la două întrebări esențiale: Cum de am ajuns stăpânii planetei și încotro ne îndreptăm? Pe parcursul lucrării oferă răspunsuri la alte întrebări incitante: Care este relația dintre istorie și biologie? Care este diferența esențială dintre Homo Sapiens și celelalte animale? Există justiție în istorie? Istoria are un sens? Oamenii au devenit mai fericiți pe măsura evoluției istorice? Și ne lasă cu o întrebare de o gravitate înspăimântătoare, dar în spiritul evoluției speciei noastre: „Ce vrem să vrem?” (349[15]).\r\n" + 
				"\r\n" + 
				"Harari este probabil primul istoric profesionist care urmărește evoluția speciei Homo Sapiens prin integrarea disciplinei istoriei umane în istoria fizicii, chimiei și, mai ales, biologiei și ecologiei planetare[16]. El construiește cu obiectivitatea omului de știință și abilitatea istoricului specializat în macro-istorie, printr-o metodică combinare a analizei și sintezei, în termeni memorabili sintetici, șocanți și, uneori, ostentativi și senzaționali, cu talentul exprimării clare, o narațiune în care evoluția biologică a umanității se întrepătrunde cu evoluția viețuitoarelor asemănătoare cu omul.\r\n" + 
				"\r\n" + 
				"Este povestea reconsiderată a genului Homo, specia Sapiens care traversând biologicul a parcurs drumul de la animalitate la umanitate și, în zorii mileniului III, ajunge „capabil să se elibereze de limitele determinate biologic”(335). În mai puțin de 100.000 de ani, Homo Sapiens, răspândindu-se pe toate continentele s-a comportat ca „un fel de ucigaș în serie ecologic” (66) și a distrus lanțul trofic planetar în timpul Revoluției Cognitive. Ca „un dictator dintr-o republică bananieră” (20) a ajuns în vârful ecosistemului atât de repede, încât ecosistemul n-a mai avut timp să se adapteze. În urmă cu 12.000 de ani a declanșat Revoluția Agricolă, „cea mai mare păcăleală din istorie” (75), căci „goana după o viață mai ușoară a dus la o viață plină de greutăți”(83). Iar în ultimii 500 de ani Revoluția Științifică a condus la „creșterea fenomenală și fără precedent a puterii oamenilor”(211). Și „astăzi (umanitatea) e pe punctul de a deveni zeu, gata să dobândească ... capacitățile divine de a crea și a distruge” (351). Deci, umanitatea devine zeu. Dar, ca și zeii, este nemulțumită, iresponsabilă și nu știe ce vrea. Ce poate fi mai periculos decât aceasta? - se întreabă cu gravitate autorul în finalul cărții.");
		cartile.add(carte);
		carte = new Carti("Colind de Crăciun", "1843", "Charles Dickens", "Colind de Crăciun (în engleză A Christmas Carol, titlul original fiind A Christmas Carol in Prose, Being a Ghost Story of Christmas, Colindă de Crăciun în proză, poveste de Crăciun cu fantome) este o nuvelă scrisă de autorul englez Charles Dickens despre un om morocănos și mizantrop și despre transformarea suferită de el după ce primește vizita a patru fantome în ajunul Crăciunului. Cartea a fost publicată pentru prima oară la 19 decembrie 1843 cu ilustrații de John Leech, având un mare succes comercial și primind laudele criticilor. Povestea a fost văzută ca o acuză la adresa capitalismului industrial al secolului al XIX-lea și a jucat un important rol în reinventarea acestei sărbători ca una de veselie în Marea Britanie și în America după o perioadă în care fusese sărbătorită într-o manieră solemnă și sobră. Colindă de Crăciun rămâne o nuvelă de succes, fiind mereu retipărită și constituind baza mai multor creații artistice cinematografice sau muzicale.");
		cartile.add(carte);

//		carte = new Carti("titlu", "anApariti", "autor", "informatii");
//		cartile.add(carte);

		for (Carti c : cartile) {
			carti.getItems().add(c.getTitlu());
		}
	}
}
