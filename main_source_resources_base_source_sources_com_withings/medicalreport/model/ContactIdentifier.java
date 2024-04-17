package com.withings.medicalreport.model;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.x;
/* compiled from: Contact.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/withings/medicalreport/model/ContactIdentifier;", "", "()V", "CARDIOLOGIST", "", "COACH_TRAINER", "FAMILY_PHYSICIAN", "FRIENDS_FAMILY", "MY_NUTRITIONIST", "NUTRITIONIST", "OBSTETRICIAN_GYNECOLOGIST", "OTHER", "SURGEON", "getContactFromIdentifier", "Lcom/withings/medicalreport/model/Contact;", "identifier", "medicalreport_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContactIdentifier {
    public static final int $stable = 0;
    public static final int CARDIOLOGIST = 7;
    public static final int COACH_TRAINER = 1;
    public static final int FAMILY_PHYSICIAN = 4;
    public static final int FRIENDS_FAMILY = 0;
    public static final ContactIdentifier INSTANCE = new ContactIdentifier();
    public static final int MY_NUTRITIONIST = 8;
    public static final int NUTRITIONIST = 2;
    public static final int OBSTETRICIAN_GYNECOLOGIST = 5;
    public static final int OTHER = 3;
    public static final int SURGEON = 6;

    private ContactIdentifier() {
    }

    public final Contact getContactFromIdentifier(int i11) {
        for (Contact contact : x.l0(ProfessionalContact.getEntries(), PersonnalContact.getEntries())) {
            if (contact.getIdentifier() == i11) {
                return contact;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
