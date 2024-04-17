package com.withings.library.authentication.updateaccount.units;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
/* compiled from: SharedUnit.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/withings/library/authentication/updateaccount/units/DistanceUnit;", "", "value", "", "(I)V", "getValue$Authentication_release", "()I", "Custom", "Inch", "Meter", "Yard", "Lcom/withings/library/authentication/updateaccount/units/DistanceUnit$Custom;", "Lcom/withings/library/authentication/updateaccount/units/DistanceUnit$Inch;", "Lcom/withings/library/authentication/updateaccount/units/DistanceUnit$Meter;", "Lcom/withings/library/authentication/updateaccount/units/DistanceUnit$Yard;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DistanceUnit {
    private final int value;

    /* compiled from: SharedUnit.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/library/authentication/updateaccount/units/DistanceUnit$Custom;", "Lcom/withings/library/authentication/updateaccount/units/DistanceUnit;", "customUnit", "", "(I)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Custom extends DistanceUnit {
        public Custom(int i11) {
            super(i11, null);
        }
    }

    /* compiled from: SharedUnit.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/updateaccount/units/DistanceUnit$Inch;", "Lcom/withings/library/authentication/updateaccount/units/DistanceUnit;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Inch extends DistanceUnit {
        public static final Inch INSTANCE = new Inch();

        private Inch() {
            super(7, null);
        }
    }

    /* compiled from: SharedUnit.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/updateaccount/units/DistanceUnit$Meter;", "Lcom/withings/library/authentication/updateaccount/units/DistanceUnit;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Meter extends DistanceUnit {
        public static final Meter INSTANCE = new Meter();

        private Meter() {
            super(6, null);
        }
    }

    /* compiled from: SharedUnit.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/updateaccount/units/DistanceUnit$Yard;", "Lcom/withings/library/authentication/updateaccount/units/DistanceUnit;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Yard extends DistanceUnit {
        public static final Yard INSTANCE = new Yard();

        private Yard() {
            super(8, null);
        }
    }

    public /* synthetic */ DistanceUnit(int i11, m mVar) {
        this(i11);
    }

    public final int getValue$Authentication_release() {
        return this.value;
    }

    private DistanceUnit(int i11) {
        this.value = i11;
    }
}
