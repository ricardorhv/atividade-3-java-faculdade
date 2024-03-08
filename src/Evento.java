import java.util.ArrayList;

public class Evento {
  private String eventName;
  private ArrayList<Pessoa> participantList;

  public Evento(String eventName) {
    this.eventName = eventName;
    this.participantList = new ArrayList<Pessoa>();
  }

  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public ArrayList<Pessoa> getParticipantList() {
    return participantList;
  }

  public void setParticipantList(ArrayList<Pessoa> participantList) {
    this.participantList = participantList;
  }

  public void addParticipant(Pessoa participant) {
    this.participantList.add(participant);
    participant.setEvent(this);
    System.out.println(participant.getName() + " foi adicionado na lista de participantes do evento " + this.eventName);
  }

  public void removeParticipant(Pessoa participant) {
    this.participantList.remove(participant);
    participant.setEvent(null);
    System.out.println(participant.getName() + " foi removido da lista de participantes do evento " + this.eventName);
  }

  public void showParticipants() {
    System.out.println("Os participantes do evento " + this.eventName + " são:");

    for (Pessoa participant : participantList) {
      System.out.println(participant.getName());
    }
  }

}
