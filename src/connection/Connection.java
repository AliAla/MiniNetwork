/**
 * 
 */
package connection;

import user.Person;

/**
 * @author alial
 *
 */

public class Connection {
	private ConnectionType conType;
	private Person person;

	public Connection(ConnectionType conType, Person person) {
		this.conType = conType;
		this.person = person;
	}

	public ConnectionType getConType() {
		return conType;
	}

	public Person getPerson() {
		return person;
	}

}
