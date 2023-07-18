package entities;

import java.time.Instant;
import java.util.Objects;

public class LogEntry implements Comparable<LogEntry> {

	private String clientName;
	private Instant accessTime;
	
	public LogEntry(String clientName, Instant accessTime) {
		this.clientName = clientName;
		this.accessTime = accessTime;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Instant getAccessTime() {
		return accessTime;
	}
	
	@Override
	public int compareTo(LogEntry o) {
		return clientName.compareTo(o.getClientName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(clientName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(clientName, other.clientName);
	}
}
