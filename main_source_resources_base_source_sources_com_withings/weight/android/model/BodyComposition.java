package com.withings.weight.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import sm0.a;
import sm0.b;
/* compiled from: BodyComposition.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002%&B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\r¨\u0006'"}, d2 = {"Lcom/withings/weight/android/model/BodyComposition;", "", "bodyCompositionType", "Lcom/withings/weight/android/model/BodyComposition$BodyCompositionType;", "torso", "Lcom/withings/weight/android/model/BodyComposition$BodyPart;", "leftArm", "rightArm", "leftLeg", "rightLeg", "(Lcom/withings/weight/android/model/BodyComposition$BodyCompositionType;Lcom/withings/weight/android/model/BodyComposition$BodyPart;Lcom/withings/weight/android/model/BodyComposition$BodyPart;Lcom/withings/weight/android/model/BodyComposition$BodyPart;Lcom/withings/weight/android/model/BodyComposition$BodyPart;Lcom/withings/weight/android/model/BodyComposition$BodyPart;)V", "arms", "getArms", "()Lcom/withings/weight/android/model/BodyComposition$BodyPart;", "getBodyCompositionType", "()Lcom/withings/weight/android/model/BodyComposition$BodyCompositionType;", "getLeftArm", "getLeftLeg", "legs", "getLegs", "getRightArm", "getRightLeg", "getTorso", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "BodyCompositionType", "BodyPart", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BodyComposition {
    private final BodyCompositionType bodyCompositionType;
    private final BodyPart leftArm;
    private final BodyPart leftLeg;
    private final BodyPart rightArm;
    private final BodyPart rightLeg;
    private final BodyPart torso;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BodyComposition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/weight/android/model/BodyComposition$BodyCompositionType;", "", "(Ljava/lang/String;I)V", "FAT", "MUSCLE", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class BodyCompositionType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BodyCompositionType[] $VALUES;
        public static final BodyCompositionType FAT = new BodyCompositionType("FAT", 0);
        public static final BodyCompositionType MUSCLE = new BodyCompositionType("MUSCLE", 1);

        private static final /* synthetic */ BodyCompositionType[] $values() {
            return new BodyCompositionType[]{FAT, MUSCLE};
        }

        static {
            BodyCompositionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private BodyCompositionType(String str, int i11) {
        }

        public static a<BodyCompositionType> getEntries() {
            return $ENTRIES;
        }

        public static BodyCompositionType valueOf(String str) {
            return (BodyCompositionType) Enum.valueOf(BodyCompositionType.class, str);
        }

        public static BodyCompositionType[] values() {
            return (BodyCompositionType[]) $VALUES.clone();
        }
    }

    /* compiled from: BodyComposition.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/withings/weight/android/model/BodyComposition$BodyPart;", "", "inKilogram", "", "inBodyCompPercentage", "(DD)V", "getInBodyCompPercentage", "()D", "getInKilogram", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "value", "inPercent", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class BodyPart {
        private final double inBodyCompPercentage;
        private final double inKilogram;

        public BodyPart(double d11, double d12) {
            this.inKilogram = d11;
            this.inBodyCompPercentage = d12;
        }

        public static /* synthetic */ BodyPart copy$default(BodyPart bodyPart, double d11, double d12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                d11 = bodyPart.inKilogram;
            }
            if ((i11 & 2) != 0) {
                d12 = bodyPart.inBodyCompPercentage;
            }
            return bodyPart.copy(d11, d12);
        }

        public final double component1() {
            return this.inKilogram;
        }

        public final double component2() {
            return this.inBodyCompPercentage;
        }

        public final BodyPart copy(double d11, double d12) {
            return new BodyPart(d11, d12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BodyPart)) {
                return false;
            }
            BodyPart bodyPart = (BodyPart) obj;
            if (Double.compare(this.inKilogram, bodyPart.inKilogram) == 0 && Double.compare(this.inBodyCompPercentage, bodyPart.inBodyCompPercentage) == 0) {
                return true;
            }
            return false;
        }

        public final double getInBodyCompPercentage() {
            return this.inBodyCompPercentage;
        }

        public final double getInKilogram() {
            return this.inKilogram;
        }

        public int hashCode() {
            return Double.hashCode(this.inBodyCompPercentage) + (Double.hashCode(this.inKilogram) * 31);
        }

        public String toString() {
            double d11 = this.inKilogram;
            double d12 = this.inBodyCompPercentage;
            return "BodyPart(inKilogram=" + d11 + ", inBodyCompPercentage=" + d12 + ")";
        }

        public final double value(boolean z5) {
            if (z5) {
                return this.inBodyCompPercentage;
            }
            return this.inKilogram;
        }
    }

    public BodyComposition(BodyCompositionType bodyCompositionType, BodyPart torso, BodyPart leftArm, BodyPart rightArm, BodyPart leftLeg, BodyPart rightLeg) {
        u.j(bodyCompositionType, "bodyCompositionType");
        u.j(torso, "torso");
        u.j(leftArm, "leftArm");
        u.j(rightArm, "rightArm");
        u.j(leftLeg, "leftLeg");
        u.j(rightLeg, "rightLeg");
        this.bodyCompositionType = bodyCompositionType;
        this.torso = torso;
        this.leftArm = leftArm;
        this.rightArm = rightArm;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }

    public static /* synthetic */ BodyComposition copy$default(BodyComposition bodyComposition, BodyCompositionType bodyCompositionType, BodyPart bodyPart, BodyPart bodyPart2, BodyPart bodyPart3, BodyPart bodyPart4, BodyPart bodyPart5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bodyCompositionType = bodyComposition.bodyCompositionType;
        }
        if ((i11 & 2) != 0) {
            bodyPart = bodyComposition.torso;
        }
        BodyPart bodyPart6 = bodyPart;
        if ((i11 & 4) != 0) {
            bodyPart2 = bodyComposition.leftArm;
        }
        BodyPart bodyPart7 = bodyPart2;
        if ((i11 & 8) != 0) {
            bodyPart3 = bodyComposition.rightArm;
        }
        BodyPart bodyPart8 = bodyPart3;
        if ((i11 & 16) != 0) {
            bodyPart4 = bodyComposition.leftLeg;
        }
        BodyPart bodyPart9 = bodyPart4;
        if ((i11 & 32) != 0) {
            bodyPart5 = bodyComposition.rightLeg;
        }
        return bodyComposition.copy(bodyCompositionType, bodyPart6, bodyPart7, bodyPart8, bodyPart9, bodyPart5);
    }

    public final BodyCompositionType component1() {
        return this.bodyCompositionType;
    }

    public final BodyPart component2() {
        return this.torso;
    }

    public final BodyPart component3() {
        return this.leftArm;
    }

    public final BodyPart component4() {
        return this.rightArm;
    }

    public final BodyPart component5() {
        return this.leftLeg;
    }

    public final BodyPart component6() {
        return this.rightLeg;
    }

    public final BodyComposition copy(BodyCompositionType bodyCompositionType, BodyPart torso, BodyPart leftArm, BodyPart rightArm, BodyPart leftLeg, BodyPart rightLeg) {
        u.j(bodyCompositionType, "bodyCompositionType");
        u.j(torso, "torso");
        u.j(leftArm, "leftArm");
        u.j(rightArm, "rightArm");
        u.j(leftLeg, "leftLeg");
        u.j(rightLeg, "rightLeg");
        return new BodyComposition(bodyCompositionType, torso, leftArm, rightArm, leftLeg, rightLeg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BodyComposition)) {
            return false;
        }
        BodyComposition bodyComposition = (BodyComposition) obj;
        if (this.bodyCompositionType == bodyComposition.bodyCompositionType && u.e(this.torso, bodyComposition.torso) && u.e(this.leftArm, bodyComposition.leftArm) && u.e(this.rightArm, bodyComposition.rightArm) && u.e(this.leftLeg, bodyComposition.leftLeg) && u.e(this.rightLeg, bodyComposition.rightLeg)) {
            return true;
        }
        return false;
    }

    public final BodyPart getArms() {
        return new BodyPart(this.rightArm.getInKilogram() + this.leftArm.getInKilogram(), (this.rightArm.getInBodyCompPercentage() + this.leftArm.getInBodyCompPercentage()) / 2);
    }

    public final BodyCompositionType getBodyCompositionType() {
        return this.bodyCompositionType;
    }

    public final BodyPart getLeftArm() {
        return this.leftArm;
    }

    public final BodyPart getLeftLeg() {
        return this.leftLeg;
    }

    public final BodyPart getLegs() {
        return new BodyPart(this.rightLeg.getInKilogram() + this.leftLeg.getInKilogram(), (this.rightLeg.getInBodyCompPercentage() + this.leftLeg.getInBodyCompPercentage()) / 2);
    }

    public final BodyPart getRightArm() {
        return this.rightArm;
    }

    public final BodyPart getRightLeg() {
        return this.rightLeg;
    }

    public final BodyPart getTorso() {
        return this.torso;
    }

    public int hashCode() {
        int hashCode = this.torso.hashCode();
        int hashCode2 = this.leftArm.hashCode();
        int hashCode3 = this.rightArm.hashCode();
        int hashCode4 = this.leftLeg.hashCode();
        return this.rightLeg.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.bodyCompositionType.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        BodyCompositionType bodyCompositionType = this.bodyCompositionType;
        BodyPart bodyPart = this.torso;
        BodyPart bodyPart2 = this.leftArm;
        BodyPart bodyPart3 = this.rightArm;
        BodyPart bodyPart4 = this.leftLeg;
        BodyPart bodyPart5 = this.rightLeg;
        return "BodyComposition(bodyCompositionType=" + bodyCompositionType + ", torso=" + bodyPart + ", leftArm=" + bodyPart2 + ", rightArm=" + bodyPart3 + ", leftLeg=" + bodyPart4 + ", rightLeg=" + bodyPart5 + ")";
    }
}
