package com.withings.medicalreport.model;

import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import sm0.a;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Contact.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\bR\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/withings/medicalreport/model/ProfessionalContact;", "", "Lcom/withings/medicalreport/model/Contact;", "identifier", "", "key", "", "descriptionResId", "(Ljava/lang/String;IILjava/lang/String;I)V", "getDescriptionResId", "()I", "getIdentifier", "getKey", "()Ljava/lang/String;", "FAMILY_PHYSICIAN", "OBSTETRICIAN_GYNECOLOGIST", "SURGEON", "CARDIOLOGIST", "MY_NUTRITIONIST", "medicalreport_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProfessionalContact implements Contact {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ProfessionalContact[] $VALUES;
    private final int descriptionResId;
    private final int identifier;
    private final String key;
    public static final ProfessionalContact FAMILY_PHYSICIAN = new ProfessionalContact("FAMILY_PHYSICIAN", 0, 4, "family_physician", C1987R.string.profile_medicalReport_options_familyPhysician);
    public static final ProfessionalContact OBSTETRICIAN_GYNECOLOGIST = new ProfessionalContact("OBSTETRICIAN_GYNECOLOGIST", 1, 5, "gynecologist", C1987R.string.profile_medicalReport_options_gynecologist);
    public static final ProfessionalContact SURGEON = new ProfessionalContact("SURGEON", 2, 6, "surgeon", C1987R.string.profile_medicalReport_options_surgeon);
    public static final ProfessionalContact CARDIOLOGIST = new ProfessionalContact("CARDIOLOGIST", 3, 7, "cardiologist", C1987R.string.profile_medicalReport_options_cardiologist);
    public static final ProfessionalContact MY_NUTRITIONIST = new ProfessionalContact("MY_NUTRITIONIST", 4, 8, "nutritionist", C1987R.string.profile_medicalReport_options_nutritionist);

    private static final /* synthetic */ ProfessionalContact[] $values() {
        return new ProfessionalContact[]{FAMILY_PHYSICIAN, OBSTETRICIAN_GYNECOLOGIST, SURGEON, CARDIOLOGIST, MY_NUTRITIONIST};
    }

    static {
        ProfessionalContact[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ProfessionalContact(String str, int i11, int i12, String str2, int i13) {
        this.identifier = i12;
        this.key = str2;
        this.descriptionResId = i13;
    }

    public static a<ProfessionalContact> getEntries() {
        return $ENTRIES;
    }

    public static ProfessionalContact valueOf(String str) {
        return (ProfessionalContact) Enum.valueOf(ProfessionalContact.class, str);
    }

    public static ProfessionalContact[] values() {
        return (ProfessionalContact[]) $VALUES.clone();
    }

    @Override // com.withings.medicalreport.model.Contact
    public int getDescriptionResId() {
        return this.descriptionResId;
    }

    @Override // com.withings.medicalreport.model.Contact
    public int getIdentifier() {
        return this.identifier;
    }

    @Override // com.withings.medicalreport.model.Contact
    public String getKey() {
        return this.key;
    }
}
