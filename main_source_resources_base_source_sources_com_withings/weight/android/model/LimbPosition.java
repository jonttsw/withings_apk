package com.withings.weight.android.model;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import sm0.a;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LimbPosition.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/withings/weight/android/model/LimbPosition;", "", "wsIdentifier", "", "(Ljava/lang/String;II)V", "getWsIdentifier", "()I", "Torso", "LeftArm", "RightArm", "LeftLeg", "RightLeg", "Companion", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LimbPosition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LimbPosition[] $VALUES;
    public static final Companion Companion;
    private final int wsIdentifier;
    public static final LimbPosition Torso = new LimbPosition("Torso", 0, 12);
    public static final LimbPosition LeftArm = new LimbPosition("LeftArm", 1, 3);
    public static final LimbPosition RightArm = new LimbPosition("RightArm", 2, 2);
    public static final LimbPosition LeftLeg = new LimbPosition("LeftLeg", 3, 10);
    public static final LimbPosition RightLeg = new LimbPosition("RightLeg", 4, 11);

    /* compiled from: LimbPosition.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/weight/android/model/LimbPosition$Companion;", "", "()V", "from", "Lcom/withings/weight/android/model/LimbPosition;", "wsIdentifier", "", "(Ljava/lang/Integer;)Lcom/withings/weight/android/model/LimbPosition;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final LimbPosition from(Integer num) {
            Object obj;
            Iterator<E> it = LimbPosition.getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    int wsIdentifier = ((LimbPosition) obj).getWsIdentifier();
                    if (num != null && wsIdentifier == num.intValue()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            LimbPosition limbPosition = (LimbPosition) obj;
            if (limbPosition != null) {
                return limbPosition;
            }
            throw new IllegalArgumentException("ConstantWs " + num + " represents no limb position.");
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ LimbPosition[] $values() {
        return new LimbPosition[]{Torso, LeftArm, RightArm, LeftLeg, RightLeg};
    }

    static {
        LimbPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        Companion = new Companion(null);
    }

    private LimbPosition(String str, int i11, int i12) {
        this.wsIdentifier = i12;
    }

    public static a<LimbPosition> getEntries() {
        return $ENTRIES;
    }

    public static LimbPosition valueOf(String str) {
        return (LimbPosition) Enum.valueOf(LimbPosition.class, str);
    }

    public static LimbPosition[] values() {
        return (LimbPosition[]) $VALUES.clone();
    }

    public final int getWsIdentifier() {
        return this.wsIdentifier;
    }
}
