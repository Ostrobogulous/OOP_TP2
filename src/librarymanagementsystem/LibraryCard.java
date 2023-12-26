package librarymanagementsystem;

import java.util.UUID;


public class LibraryCard {
    private String cardId;
    private LibraryCardStatus status;
    private Library library;

    String generateId() {
        UUID id = UUID.randomUUID();
        String idString = id.toString();
        return idString;
    }

    public LibraryCard(Library library) {
        this.cardId = generateId();
        this.status = LibraryCardStatus.ACTIVE;
        this.library = library;
    }

    public String getCardId() {
        return cardId;
    }

    public LibraryCardStatus getStatus() {
        return status;
    }

    public Library getLibrary() {
        return library;
    }

    public void setStatus(LibraryCardStatus newStatus) {
        this.status = newStatus;
    }
}
