package Caseta_Feria.Reader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import Caseta_Feria.Model.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class XMLReader {

	private List<Caseta> listaCasetas;

	public XMLReader(String ruta) {
		this.listaCasetas = cargarCasetas(ruta);
	}

	public List<Caseta> cargarCasetas(String ruta) {
		List<Caseta> casetas = new ArrayList<>();

		File fichero = new File(ruta);
		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document documento = builder.parse(fichero);
			documento.getDocumentElement().normalize();

			NodeList listaNodoCaseta = documento.getElementsByTagName("DatosLeidos");

			for (int i = 0; i < listaNodoCaseta.getLength(); i++) {

				Element nodo = (Element) listaNodoCaseta.item(i);

				String titulo = nodo.getElementsByTagName("TITULO").item(0).getTextContent();
				String calle = nodo.getElementsByTagName("CALLE").item(0).getTextContent();
				String numero = nodo.getElementsByTagName("NUMERO").item(0).getTextContent();
				String modulo = nodo.getElementsByTagName("MODULOS").item(0).getTextContent();
				String clase = nodo.getElementsByTagName("CLASE").item(0).getTextContent();
				String id = nodo.getElementsByTagName("ID").item(0).getTextContent();
				String id_calle = nodo.getElementsByTagName("ID_CALLE").item(0).getTextContent();

				casetas.add(new Caseta(titulo, calle, numero, modulo, clase, id, id_calle));
			}

		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}

		return casetas;
	}

	public String obtenerCasetasEnCalle(String calle) {
		return listaCasetas.stream().filter(c -> c.getCalle().equalsIgnoreCase(calle)).map(Caseta::toString)
				.collect(Collectors.joining(System.lineSeparator()));
	}

	public String obtenerCasetasDistrito() {
		return listaCasetas.stream().filter(c -> c.getClase().equalsIgnoreCase("distrito")).map(Caseta::toString)
				.collect(Collectors.joining(System.lineSeparator()));
	}

	public String obtenerCasetasFamiliares() {
		return listaCasetas.stream().filter(c -> c.getClase().equalsIgnoreCase("familiar")).map(Caseta::toString)
				.collect(Collectors.joining(System.lineSeparator()));
	}

	public String obtenerCasetasNoFamiliaresNoDistrito() {
		return listaCasetas.stream()
				.filter(c -> !c.getClase().equalsIgnoreCase("distrito") && !c.getClase().equalsIgnoreCase("familiar"))
				.map(Caseta::toString).collect(Collectors.joining(System.lineSeparator()));
	}

	public String callesConCasetasFamiliares() {
		Map<String, Integer> callesFamiliares = new HashMap<>();

		for (Caseta c : listaCasetas) {
			if (c.getClase().equalsIgnoreCase("familiar")) {

				String calle = c.getCalle();
				callesFamiliares.put(calle, callesFamiliares.getOrDefault(calle, 0) + 1);
			}
		}

		return callesFamiliares.toString();
	}

	public String callesConCasetasDistrito() {
		Map<String, Integer> callesDistrito = new HashMap<>();

		for (Caseta c : listaCasetas) {
			if (c.getClase().equalsIgnoreCase("distrito")) {
				String calle = c.getCalle();
				callesDistrito.put(calle, callesDistrito.getOrDefault(calle, 0) + 1);
			}
		}

		return callesDistrito.toString();
	}

	public void eliminarCaseta(String calle, String numeroCaseta) throws Exception {
		int moduloBorrado = 0;
		boolean borrado = false;

		listaCasetas
				.removeIf(c -> c.getCalle().equalsIgnoreCase(calle) && c.getNumero().equalsIgnoreCase(numeroCaseta));

		for (Caseta c : listaCasetas) {
			if (c.getCalle().equalsIgnoreCase(calle)
					&& Integer.parseInt(c.getNumero()) > Integer.parseInt(numeroCaseta)) {
				c.restarNumero(moduloBorrado);
			}
		}

		if (!borrado) {
			throw new Exception("La calle o el número no existe");
		}
	}

	public void exportarJson() throws IOException {
		File exportadoJsonCaseta = new File("./Fichero/casetas.json");
		exportadoJsonCaseta.createNewFile();
		Gson gson = new Gson();
		String datos = gson.toJson(listaCasetas);
		FileWriter fw = new FileWriter(exportadoJsonCaseta);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(datos);
		bw.close();
		fw.close();
	}
}
