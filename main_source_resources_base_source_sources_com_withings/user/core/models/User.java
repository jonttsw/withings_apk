package com.withings.user.core.models;

import androidx.appcompat.widget.v0;
import androidx.camera.camera2.internal.l0;
import androidx.camera.core.y1;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import sm0.a;
import sm0.b;
/* compiled from: User.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\n@ABCDEFGHIBa\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0015HÆ\u0003J\t\u00100\u001a\u00020\u0017HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\t\u00106\u001a\u00020\u000fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u00108\u001a\u00020\u0013HÆ\u0003J{\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001J\u0013\u0010:\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010%R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006J"}, d2 = {"Lcom/withings/user/core/models/User;", "Ljava/io/Serializable;", "id", "", "type", "Lcom/withings/user/core/models/User$Type;", "birthDate", "Lorg/joda/time/LocalDate;", "email", "", "names", "Lcom/withings/user/core/models/User$Names;", "bodyComp", "Lcom/withings/user/core/models/User$BodyComp;", "isShared", "", "images", "Lcom/withings/user/core/models/User$Images;", "modificationHistory", "Lcom/withings/user/core/models/User$ModificationHistory;", "genderPreferences", "Lcom/withings/user/core/models/User$GenderPreferences;", "settings", "Lcom/withings/user/core/models/User$Settings;", "(JLcom/withings/user/core/models/User$Type;Lorg/joda/time/LocalDate;Ljava/lang/String;Lcom/withings/user/core/models/User$Names;Lcom/withings/user/core/models/User$BodyComp;ZLcom/withings/user/core/models/User$Images;Lcom/withings/user/core/models/User$ModificationHistory;Lcom/withings/user/core/models/User$GenderPreferences;Lcom/withings/user/core/models/User$Settings;)V", "getBirthDate", "()Lorg/joda/time/LocalDate;", "getBodyComp", "()Lcom/withings/user/core/models/User$BodyComp;", "getEmail", "()Ljava/lang/String;", "getGenderPreferences", "()Lcom/withings/user/core/models/User$GenderPreferences;", "getId", "()J", "getImages", "()Lcom/withings/user/core/models/User$Images;", "()Z", "getModificationHistory", "()Lcom/withings/user/core/models/User$ModificationHistory;", "getNames", "()Lcom/withings/user/core/models/User$Names;", "getSettings", "()Lcom/withings/user/core/models/User$Settings;", "getType", "()Lcom/withings/user/core/models/User$Type;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "BodyComp", "BodyCompMode", "BodyModel", "Gender", "GenderPreferences", "Images", "ModificationHistory", "Names", "Settings", "Type", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class User implements Serializable {
    private final LocalDate birthDate;
    private final BodyComp bodyComp;
    private final String email;
    private final GenderPreferences genderPreferences;

    /* renamed from: id  reason: collision with root package name */
    private final long f46339id;
    private final Images images;
    private final boolean isShared;
    private final ModificationHistory modificationHistory;
    private final Names names;
    private final Settings settings;
    private final Type type;

    /* compiled from: User.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/withings/user/core/models/User$BodyComp;", "Ljava/io/Serializable;", "inPercent", "", "mode", "Lcom/withings/user/core/models/User$BodyCompMode;", "(ZLcom/withings/user/core/models/User$BodyCompMode;)V", "getInPercent", "()Z", "getMode", "()Lcom/withings/user/core/models/User$BodyCompMode;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class BodyComp implements Serializable {
        private final boolean inPercent;
        private final BodyCompMode mode;

        public BodyComp(boolean z5, BodyCompMode mode) {
            u.j(mode, "mode");
            this.inPercent = z5;
            this.mode = mode;
        }

        public static /* synthetic */ BodyComp copy$default(BodyComp bodyComp, boolean z5, BodyCompMode bodyCompMode, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z5 = bodyComp.inPercent;
            }
            if ((i11 & 2) != 0) {
                bodyCompMode = bodyComp.mode;
            }
            return bodyComp.copy(z5, bodyCompMode);
        }

        public final boolean component1() {
            return this.inPercent;
        }

        public final BodyCompMode component2() {
            return this.mode;
        }

        public final BodyComp copy(boolean z5, BodyCompMode mode) {
            u.j(mode, "mode");
            return new BodyComp(z5, mode);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BodyComp)) {
                return false;
            }
            BodyComp bodyComp = (BodyComp) obj;
            if (this.inPercent == bodyComp.inPercent && this.mode == bodyComp.mode) {
                return true;
            }
            return false;
        }

        public final boolean getInPercent() {
            return this.inPercent;
        }

        public final BodyCompMode getMode() {
            return this.mode;
        }

        public int hashCode() {
            return this.mode.hashCode() + (Boolean.hashCode(this.inPercent) * 31);
        }

        public String toString() {
            boolean z5 = this.inPercent;
            BodyCompMode bodyCompMode = this.mode;
            return "BodyComp(inPercent=" + z5 + ", mode=" + bodyCompMode + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: User.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/withings/user/core/models/User$BodyCompMode;", "", "(Ljava/lang/String;I)V", "NORMAL", "ATHLETE", "JAPAN", "LEGACY_2009", "LEGACY_2010", "LEGACY_ATHLETE_2010", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class BodyCompMode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BodyCompMode[] $VALUES;
        public static final BodyCompMode NORMAL = new BodyCompMode("NORMAL", 0);
        public static final BodyCompMode ATHLETE = new BodyCompMode("ATHLETE", 1);
        public static final BodyCompMode JAPAN = new BodyCompMode("JAPAN", 2);
        public static final BodyCompMode LEGACY_2009 = new BodyCompMode("LEGACY_2009", 3);
        public static final BodyCompMode LEGACY_2010 = new BodyCompMode("LEGACY_2010", 4);
        public static final BodyCompMode LEGACY_ATHLETE_2010 = new BodyCompMode("LEGACY_ATHLETE_2010", 5);

        private static final /* synthetic */ BodyCompMode[] $values() {
            return new BodyCompMode[]{NORMAL, ATHLETE, JAPAN, LEGACY_2009, LEGACY_2010, LEGACY_ATHLETE_2010};
        }

        static {
            BodyCompMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private BodyCompMode(String str, int i11) {
        }

        public static a<BodyCompMode> getEntries() {
            return $ENTRIES;
        }

        public static BodyCompMode valueOf(String str) {
            return (BodyCompMode) Enum.valueOf(BodyCompMode.class, str);
        }

        public static BodyCompMode[] values() {
            return (BodyCompMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: User.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/user/core/models/User$BodyModel;", "", "(Ljava/lang/String;I)V", "FEMALE", "NEUTRAL", "MALE", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class BodyModel {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BodyModel[] $VALUES;
        public static final BodyModel FEMALE = new BodyModel("FEMALE", 0);
        public static final BodyModel NEUTRAL = new BodyModel("NEUTRAL", 1);
        public static final BodyModel MALE = new BodyModel("MALE", 2);

        private static final /* synthetic */ BodyModel[] $values() {
            return new BodyModel[]{FEMALE, NEUTRAL, MALE};
        }

        static {
            BodyModel[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private BodyModel(String str, int i11) {
        }

        public static a<BodyModel> getEntries() {
            return $ENTRIES;
        }

        public static BodyModel valueOf(String str) {
            return (BodyModel) Enum.valueOf(BodyModel.class, str);
        }

        public static BodyModel[] values() {
            return (BodyModel[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: User.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/user/core/models/User$Gender;", "", "(Ljava/lang/String;I)V", "FEMALE", "MALE", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Gender {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Gender[] $VALUES;
        public static final Gender FEMALE = new Gender("FEMALE", 0);
        public static final Gender MALE = new Gender("MALE", 1);

        private static final /* synthetic */ Gender[] $values() {
            return new Gender[]{FEMALE, MALE};
        }

        static {
            Gender[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Gender(String str, int i11) {
        }

        public static a<Gender> getEntries() {
            return $ENTRIES;
        }

        public static Gender valueOf(String str) {
            return (Gender) Enum.valueOf(Gender.class, str);
        }

        public static Gender[] values() {
            return (Gender[]) $VALUES.clone();
        }
    }

    /* compiled from: User.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/withings/user/core/models/User$GenderPreferences;", "Ljava/io/Serializable;", "gender", "Lcom/withings/user/core/models/User$Gender;", "bodyModel", "Lcom/withings/user/core/models/User$BodyModel;", "advancedGender", "", "pronoun", "(Lcom/withings/user/core/models/User$Gender;Lcom/withings/user/core/models/User$BodyModel;Ljava/lang/String;Ljava/lang/String;)V", "getAdvancedGender", "()Ljava/lang/String;", "getBodyModel", "()Lcom/withings/user/core/models/User$BodyModel;", "getGender", "()Lcom/withings/user/core/models/User$Gender;", "getPronoun", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class GenderPreferences implements Serializable {
        private final String advancedGender;
        private final BodyModel bodyModel;
        private final Gender gender;
        private final String pronoun;

        public GenderPreferences(Gender gender, BodyModel bodyModel, String str, String str2) {
            u.j(gender, "gender");
            this.gender = gender;
            this.bodyModel = bodyModel;
            this.advancedGender = str;
            this.pronoun = str2;
        }

        public static /* synthetic */ GenderPreferences copy$default(GenderPreferences genderPreferences, Gender gender, BodyModel bodyModel, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                gender = genderPreferences.gender;
            }
            if ((i11 & 2) != 0) {
                bodyModel = genderPreferences.bodyModel;
            }
            if ((i11 & 4) != 0) {
                str = genderPreferences.advancedGender;
            }
            if ((i11 & 8) != 0) {
                str2 = genderPreferences.pronoun;
            }
            return genderPreferences.copy(gender, bodyModel, str, str2);
        }

        public final Gender component1() {
            return this.gender;
        }

        public final BodyModel component2() {
            return this.bodyModel;
        }

        public final String component3() {
            return this.advancedGender;
        }

        public final String component4() {
            return this.pronoun;
        }

        public final GenderPreferences copy(Gender gender, BodyModel bodyModel, String str, String str2) {
            u.j(gender, "gender");
            return new GenderPreferences(gender, bodyModel, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenderPreferences)) {
                return false;
            }
            GenderPreferences genderPreferences = (GenderPreferences) obj;
            if (this.gender == genderPreferences.gender && this.bodyModel == genderPreferences.bodyModel && u.e(this.advancedGender, genderPreferences.advancedGender) && u.e(this.pronoun, genderPreferences.pronoun)) {
                return true;
            }
            return false;
        }

        public final String getAdvancedGender() {
            return this.advancedGender;
        }

        public final BodyModel getBodyModel() {
            return this.bodyModel;
        }

        public final Gender getGender() {
            return this.gender;
        }

        public final String getPronoun() {
            return this.pronoun;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.gender.hashCode() * 31;
            BodyModel bodyModel = this.bodyModel;
            int i11 = 0;
            if (bodyModel == null) {
                hashCode = 0;
            } else {
                hashCode = bodyModel.hashCode();
            }
            int i12 = (hashCode3 + hashCode) * 31;
            String str = this.advancedGender;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            String str2 = this.pronoun;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            return i13 + i11;
        }

        public String toString() {
            Gender gender = this.gender;
            BodyModel bodyModel = this.bodyModel;
            String str = this.advancedGender;
            String str2 = this.pronoun;
            StringBuilder sb2 = new StringBuilder("GenderPreferences(gender=");
            sb2.append(gender);
            sb2.append(", bodyModel=");
            sb2.append(bodyModel);
            sb2.append(", advancedGender=");
            return v0.d(sb2, str, ", pronoun=", str2, ")");
        }
    }

    /* compiled from: User.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/withings/user/core/models/User$Images;", "Ljava/io/Serializable;", "size32", "", "size64", "size128", "size256", "size512", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSize128", "()Ljava/lang/String;", "getSize256", "getSize32", "getSize512", "getSize64", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Images implements Serializable {
        private final String size128;
        private final String size256;
        private final String size32;
        private final String size512;
        private final String size64;

        public Images(String str, String str2, String str3, String str4, String str5) {
            this.size32 = str;
            this.size64 = str2;
            this.size128 = str3;
            this.size256 = str4;
            this.size512 = str5;
        }

        public static /* synthetic */ Images copy$default(Images images, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = images.size32;
            }
            if ((i11 & 2) != 0) {
                str2 = images.size64;
            }
            String str6 = str2;
            if ((i11 & 4) != 0) {
                str3 = images.size128;
            }
            String str7 = str3;
            if ((i11 & 8) != 0) {
                str4 = images.size256;
            }
            String str8 = str4;
            if ((i11 & 16) != 0) {
                str5 = images.size512;
            }
            return images.copy(str, str6, str7, str8, str5);
        }

        public final String component1() {
            return this.size32;
        }

        public final String component2() {
            return this.size64;
        }

        public final String component3() {
            return this.size128;
        }

        public final String component4() {
            return this.size256;
        }

        public final String component5() {
            return this.size512;
        }

        public final Images copy(String str, String str2, String str3, String str4, String str5) {
            return new Images(str, str2, str3, str4, str5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Images)) {
                return false;
            }
            Images images = (Images) obj;
            if (u.e(this.size32, images.size32) && u.e(this.size64, images.size64) && u.e(this.size128, images.size128) && u.e(this.size256, images.size256) && u.e(this.size512, images.size512)) {
                return true;
            }
            return false;
        }

        public final String getSize128() {
            return this.size128;
        }

        public final String getSize256() {
            return this.size256;
        }

        public final String getSize32() {
            return this.size32;
        }

        public final String getSize512() {
            return this.size512;
        }

        public final String getSize64() {
            return this.size64;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            String str = this.size32;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = hashCode * 31;
            String str2 = this.size64;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            String str3 = this.size128;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            String str4 = this.size256;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i15 = (i14 + hashCode4) * 31;
            String str5 = this.size512;
            if (str5 != null) {
                i11 = str5.hashCode();
            }
            return i15 + i11;
        }

        public String toString() {
            String str = this.size32;
            String str2 = this.size64;
            String str3 = this.size128;
            String str4 = this.size256;
            String str5 = this.size512;
            StringBuilder b10 = l0.b("Images(size32=", str, ", size64=", str2, ", size128=");
            b.d(b10, str3, ", size256=", str4, ", size512=");
            return y1.e(b10, str5, ")");
        }
    }

    /* compiled from: User.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/withings/user/core/models/User$ModificationHistory;", "Ljava/io/Serializable;", "creation", "Lorg/joda/time/Instant;", "modified", "lastUpdate", "(Lorg/joda/time/Instant;Lorg/joda/time/Instant;Lorg/joda/time/Instant;)V", "getCreation", "()Lorg/joda/time/Instant;", "getLastUpdate", "getModified", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ModificationHistory implements Serializable {
        private final Instant creation;
        private final Instant lastUpdate;
        private final Instant modified;

        public ModificationHistory(Instant creation, Instant instant, Instant instant2) {
            u.j(creation, "creation");
            this.creation = creation;
            this.modified = instant;
            this.lastUpdate = instant2;
        }

        public static /* synthetic */ ModificationHistory copy$default(ModificationHistory modificationHistory, Instant instant, Instant instant2, Instant instant3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                instant = modificationHistory.creation;
            }
            if ((i11 & 2) != 0) {
                instant2 = modificationHistory.modified;
            }
            if ((i11 & 4) != 0) {
                instant3 = modificationHistory.lastUpdate;
            }
            return modificationHistory.copy(instant, instant2, instant3);
        }

        public final Instant component1() {
            return this.creation;
        }

        public final Instant component2() {
            return this.modified;
        }

        public final Instant component3() {
            return this.lastUpdate;
        }

        public final ModificationHistory copy(Instant creation, Instant instant, Instant instant2) {
            u.j(creation, "creation");
            return new ModificationHistory(creation, instant, instant2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModificationHistory)) {
                return false;
            }
            ModificationHistory modificationHistory = (ModificationHistory) obj;
            if (u.e(this.creation, modificationHistory.creation) && u.e(this.modified, modificationHistory.modified) && u.e(this.lastUpdate, modificationHistory.lastUpdate)) {
                return true;
            }
            return false;
        }

        public final Instant getCreation() {
            return this.creation;
        }

        public final Instant getLastUpdate() {
            return this.lastUpdate;
        }

        public final Instant getModified() {
            return this.modified;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.creation.hashCode() * 31;
            Instant instant = this.modified;
            int i11 = 0;
            if (instant == null) {
                hashCode = 0;
            } else {
                hashCode = instant.hashCode();
            }
            int i12 = (hashCode2 + hashCode) * 31;
            Instant instant2 = this.lastUpdate;
            if (instant2 != null) {
                i11 = instant2.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            Instant instant = this.creation;
            Instant instant2 = this.modified;
            Instant instant3 = this.lastUpdate;
            return "ModificationHistory(creation=" + instant + ", modified=" + instant2 + ", lastUpdate=" + instant3 + ")";
        }
    }

    /* compiled from: User.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/withings/user/core/models/User$Names;", "Ljava/io/Serializable;", "first", "", "last", "short", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirst", "()Ljava/lang/String;", "getLast", "getShort", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Names implements Serializable {
        private final String first;
        private final String last;

        /* renamed from: short  reason: not valid java name */
        private final String f4short;

        public Names(String first, String last, String str) {
            u.j(first, "first");
            u.j(last, "last");
            this.first = first;
            this.last = last;
            this.f4short = str;
        }

        public static /* synthetic */ Names copy$default(Names names, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = names.first;
            }
            if ((i11 & 2) != 0) {
                str2 = names.last;
            }
            if ((i11 & 4) != 0) {
                str3 = names.f4short;
            }
            return names.copy(str, str2, str3);
        }

        public final String component1() {
            return this.first;
        }

        public final String component2() {
            return this.last;
        }

        public final String component3() {
            return this.f4short;
        }

        public final Names copy(String first, String last, String str) {
            u.j(first, "first");
            u.j(last, "last");
            return new Names(first, last, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Names)) {
                return false;
            }
            Names names = (Names) obj;
            if (u.e(this.first, names.first) && u.e(this.last, names.last) && u.e(this.f4short, names.f4short)) {
                return true;
            }
            return false;
        }

        public final String getFirst() {
            return this.first;
        }

        public final String getLast() {
            return this.last;
        }

        public final String getShort() {
            return this.f4short;
        }

        public int hashCode() {
            int hashCode;
            int c11 = d.c(this.last, this.first.hashCode() * 31, 31);
            String str = this.f4short;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return c11 + hashCode;
        }

        public String toString() {
            String str = this.first;
            String str2 = this.last;
            return y1.e(l0.b("Names(first=", str, ", last=", str2, ", short="), this.f4short, ")");
        }
    }

    /* compiled from: User.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/user/core/models/User$Settings;", "Ljava/io/Serializable;", "wam01AutoWakeUpEnabled", "", "(Z)V", "getWam01AutoWakeUpEnabled", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Settings implements Serializable {
        private final boolean wam01AutoWakeUpEnabled;

        public Settings(boolean z5) {
            this.wam01AutoWakeUpEnabled = z5;
        }

        public static /* synthetic */ Settings copy$default(Settings settings, boolean z5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z5 = settings.wam01AutoWakeUpEnabled;
            }
            return settings.copy(z5);
        }

        public final boolean component1() {
            return this.wam01AutoWakeUpEnabled;
        }

        public final Settings copy(boolean z5) {
            return new Settings(z5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Settings) && this.wam01AutoWakeUpEnabled == ((Settings) obj).wam01AutoWakeUpEnabled) {
                return true;
            }
            return false;
        }

        public final boolean getWam01AutoWakeUpEnabled() {
            return this.wam01AutoWakeUpEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.wam01AutoWakeUpEnabled);
        }

        public String toString() {
            boolean z5 = this.wam01AutoWakeUpEnabled;
            return "Settings(wam01AutoWakeUpEnabled=" + z5 + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: User.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/user/core/models/User$Type;", "", "(Ljava/lang/String;I)V", "NORMAL", "REPOSITORY", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type NORMAL = new Type("NORMAL", 0);
        public static final Type REPOSITORY = new Type("REPOSITORY", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{NORMAL, REPOSITORY};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11) {
        }

        public static a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public User(long j5, Type type, LocalDate birthDate, String str, Names names, BodyComp bodyComp, boolean z5, Images images, ModificationHistory modificationHistory, GenderPreferences genderPreferences, Settings settings) {
        u.j(type, "type");
        u.j(birthDate, "birthDate");
        u.j(names, "names");
        u.j(bodyComp, "bodyComp");
        u.j(modificationHistory, "modificationHistory");
        u.j(genderPreferences, "genderPreferences");
        u.j(settings, "settings");
        this.f46339id = j5;
        this.type = type;
        this.birthDate = birthDate;
        this.email = str;
        this.names = names;
        this.bodyComp = bodyComp;
        this.isShared = z5;
        this.images = images;
        this.modificationHistory = modificationHistory;
        this.genderPreferences = genderPreferences;
        this.settings = settings;
    }

    public static /* synthetic */ User copy$default(User user, long j5, Type type, LocalDate localDate, String str, Names names, BodyComp bodyComp, boolean z5, Images images, ModificationHistory modificationHistory, GenderPreferences genderPreferences, Settings settings, int i11, Object obj) {
        long j11;
        Type type2;
        LocalDate localDate2;
        String str2;
        Names names2;
        BodyComp bodyComp2;
        boolean z11;
        Images images2;
        ModificationHistory modificationHistory2;
        GenderPreferences genderPreferences2;
        Settings settings2;
        if ((i11 & 1) != 0) {
            j11 = user.f46339id;
        } else {
            j11 = j5;
        }
        if ((i11 & 2) != 0) {
            type2 = user.type;
        } else {
            type2 = type;
        }
        if ((i11 & 4) != 0) {
            localDate2 = user.birthDate;
        } else {
            localDate2 = localDate;
        }
        if ((i11 & 8) != 0) {
            str2 = user.email;
        } else {
            str2 = str;
        }
        if ((i11 & 16) != 0) {
            names2 = user.names;
        } else {
            names2 = names;
        }
        if ((i11 & 32) != 0) {
            bodyComp2 = user.bodyComp;
        } else {
            bodyComp2 = bodyComp;
        }
        if ((i11 & 64) != 0) {
            z11 = user.isShared;
        } else {
            z11 = z5;
        }
        if ((i11 & 128) != 0) {
            images2 = user.images;
        } else {
            images2 = images;
        }
        if ((i11 & 256) != 0) {
            modificationHistory2 = user.modificationHistory;
        } else {
            modificationHistory2 = modificationHistory;
        }
        if ((i11 & 512) != 0) {
            genderPreferences2 = user.genderPreferences;
        } else {
            genderPreferences2 = genderPreferences;
        }
        if ((i11 & 1024) != 0) {
            settings2 = user.settings;
        } else {
            settings2 = settings;
        }
        return user.copy(j11, type2, localDate2, str2, names2, bodyComp2, z11, images2, modificationHistory2, genderPreferences2, settings2);
    }

    public final long component1() {
        return this.f46339id;
    }

    public final GenderPreferences component10() {
        return this.genderPreferences;
    }

    public final Settings component11() {
        return this.settings;
    }

    public final Type component2() {
        return this.type;
    }

    public final LocalDate component3() {
        return this.birthDate;
    }

    public final String component4() {
        return this.email;
    }

    public final Names component5() {
        return this.names;
    }

    public final BodyComp component6() {
        return this.bodyComp;
    }

    public final boolean component7() {
        return this.isShared;
    }

    public final Images component8() {
        return this.images;
    }

    public final ModificationHistory component9() {
        return this.modificationHistory;
    }

    public final User copy(long j5, Type type, LocalDate birthDate, String str, Names names, BodyComp bodyComp, boolean z5, Images images, ModificationHistory modificationHistory, GenderPreferences genderPreferences, Settings settings) {
        u.j(type, "type");
        u.j(birthDate, "birthDate");
        u.j(names, "names");
        u.j(bodyComp, "bodyComp");
        u.j(modificationHistory, "modificationHistory");
        u.j(genderPreferences, "genderPreferences");
        u.j(settings, "settings");
        return new User(j5, type, birthDate, str, names, bodyComp, z5, images, modificationHistory, genderPreferences, settings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        if (this.f46339id == user.f46339id && this.type == user.type && u.e(this.birthDate, user.birthDate) && u.e(this.email, user.email) && u.e(this.names, user.names) && u.e(this.bodyComp, user.bodyComp) && this.isShared == user.isShared && u.e(this.images, user.images) && u.e(this.modificationHistory, user.modificationHistory) && u.e(this.genderPreferences, user.genderPreferences) && u.e(this.settings, user.settings)) {
            return true;
        }
        return false;
    }

    public final LocalDate getBirthDate() {
        return this.birthDate;
    }

    public final BodyComp getBodyComp() {
        return this.bodyComp;
    }

    public final String getEmail() {
        return this.email;
    }

    public final GenderPreferences getGenderPreferences() {
        return this.genderPreferences;
    }

    public final long getId() {
        return this.f46339id;
    }

    public final Images getImages() {
        return this.images;
    }

    public final ModificationHistory getModificationHistory() {
        return this.modificationHistory;
    }

    public final Names getNames() {
        return this.names;
    }

    public final Settings getSettings() {
        return this.settings;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.birthDate.hashCode() + ((this.type.hashCode() + (Long.hashCode(this.f46339id) * 31)) * 31)) * 31;
        String str = this.email;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = this.names.hashCode();
        int a11 = y1.a(this.isShared, (this.bodyComp.hashCode() + ((hashCode3 + ((hashCode2 + hashCode) * 31)) * 31)) * 31, 31);
        Images images = this.images;
        if (images != null) {
            i11 = images.hashCode();
        }
        int hashCode4 = this.modificationHistory.hashCode();
        return this.settings.hashCode() + ((this.genderPreferences.hashCode() + ((hashCode4 + ((a11 + i11) * 31)) * 31)) * 31);
    }

    public final boolean isShared() {
        return this.isShared;
    }

    public String toString() {
        long j5 = this.f46339id;
        Type type = this.type;
        LocalDate localDate = this.birthDate;
        String str = this.email;
        Names names = this.names;
        BodyComp bodyComp = this.bodyComp;
        boolean z5 = this.isShared;
        Images images = this.images;
        ModificationHistory modificationHistory = this.modificationHistory;
        GenderPreferences genderPreferences = this.genderPreferences;
        Settings settings = this.settings;
        return "User(id=" + j5 + ", type=" + type + ", birthDate=" + localDate + ", email=" + str + ", names=" + names + ", bodyComp=" + bodyComp + ", isShared=" + z5 + ", images=" + images + ", modificationHistory=" + modificationHistory + ", genderPreferences=" + genderPreferences + ", settings=" + settings + ")";
    }
}
