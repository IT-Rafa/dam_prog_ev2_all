/**
 * Lista de clases para<p>
 * Ejercicios de interface list y queue en coderunner<p>
 * Pregunta 4<p>
 * <h3>Una, dola, tela, catola...</h3>
 * http://www.aceptaelreto.com/problem/statement.php?id=127<p>
 * Una tarde, diez peregrinos se detuvieron en una posada y 
 * solicitaron pasar allí la noche, pero el posadero sólo 
 * tenía alojamiento para cinco de ellos.<p>
 * Decidieron echar a suertes quién dormiría en cama y quién no, 
 * y para ello utilizaron la famosa cantinela:
 * <pre>
"Una, dola, tela, catola,
quila, quilete,
estaba la reina en su gabinete,
vino Gil apagó el candil,
candil, candilón,
cuenta las veinte que las veinte son
policia y ladrón
uno, dos, tres…"
 * </pre>
 * Los peregrinos se situaron colocados en círculo y uno de ellos 
 * comenzó a cantar; por cada palabra iba señalando a un peregrino
 * según el orden de colocación.<p>
 * Al terminal la canción, el peregrino al que señalaba el dedo 
 * quedaba descartado.<p>
 * Ese peregrino elegido por la cancioncilla salía del círculo y 
 * sabía que tendría la desdicha de dormir en el suelo de la taberna, 
 * aunque, al menos, al lado del fuego. Para elegir al siguiente 
 * peregrino, el conteo comenzaba otra vez por la persona que seguía 
 * en el círculo a la recién eliminada.<p>
 * Realiza un programa que, dado el nombre de varias personas, el 
 * número de camas disponibles y el número de palabras de la canción, 
 * proporcione el nombre de aquellas que dormirán en una cama.
 * <h4>Entrada</h4>
 * La entrada comenzará con un número que indicará cuántos casos de 
 * prueba hay que procesar. A continuación, para cada uno de ellos 
 * recibiremos la lista con los nombres de los peregrinos (que acabará 
 * con el nombre ficticio F), un entero que nos dirá el número de camas 
 * disponibles y un entero mayor que cero que nos dirá el número de 
 * palabras de la canción.<p>
 * Ten en cuenta que en una compañía de peregrinos nunca viajan más de 
 * 50 personas. Además, ninguno de los nombres de los peregrinos 
 * contiene espacios, ni supera las 25 letras.
 * <h4>Salida</h4>
 * Para cada caso de prueba escribiremos en una única línea el nombre o 
 * nombres de las personas que duermen en cama separados por espacios; 
 * el orden de los nombres será el mismo en el que están colocados en la 
 * entrada.<p>
 * Si ninguno queda fuera, en vez de escribir todos los nombres se 
 * escribirá TODOS TIENEN CAMA. Si, al contrario, no hay camas en la 
 * posada para los peregrinos, se mostrará el mensaje NADIE TIENE CAMA<p>.
 * Por ejemplo:
 * <h4>Ejemplo Entrada</h4>
 * <pre>
 Anastasio Ignacio Felipe Borja Daniel Cesar F 2 3
Javier Ramiro Luis Rosa Carmen Paola Josefa F 0 3
Petra Santiago Pepi F 2 20
Merche Juanjo Miriam Pilar Marina Ovidio Rafael Eustaquio F 4 7
 * </pre>
 * <h4>Ejemplo Salida</h4>
 * <pre>
Anastasio Daniel
NADIE TIENE CAMA
Petra Pepi
Merche Miriam Pilar Marina
 * </pre>
 */
package UnaDolaTela;
