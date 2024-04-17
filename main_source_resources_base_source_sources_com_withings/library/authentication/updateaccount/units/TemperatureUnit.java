package com.withings.library.authentication.updateaccount.units;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
/* compiled from: SharedUnit.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/withings/library/authentication/updateaccount/units/TemperatureUnit;", "", "value", "", "(I)V", "getValue$Authentication_release", "()I", "Celsius", "Custom", "Farenheit", "Lcom/withings/library/authentication/updateaccount/units/TemperatureUnit$Celsius;", "Lcom/withings/library/authentication/updateaccount/units/TemperatureUnit$Custom;", "Lcom/withings/library/authentication/updateaccount/units/TemperatureUnit$Farenheit;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class TemperatureUnit {
    private final int value;

    /* compiled from: SharedUnit.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/updateaccount/units/TemperatureUnit$Celsius;", "Lcom/withings/library/authentication/updateaccount/units/TemperatureUnit;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Celsius extends TemperatureUnit {
        public static final Celsius INSTANCE = new Celsius();

        private Celsius() {
            super(11, null);
        }
    }

    /* compiled from: SharedUnit.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/library/authentication/updateaccount/units/TemperatureUnit$Custom;", "Lcom/withings/library/authentication/updateaccount/units/TemperatureUnit;", "customUnit", "", "(I)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Custom extends TemperatureUnit {
        public Custom(int i11) {
            super(i11, null);
        }
    }

    /* compiled from: SharedUnit.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/updateaccount/units/TemperatureUnit$Farenheit;", "Lcom/withings/library/authentication/updateaccount/units/TemperatureUnit;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Farenheit extends TemperatureUnit {
        public static final Farenheit INSTANCE = new Farenheit();

        private Farenheit() {
            super(13, null);
        }
    }

    public /* synthetic */ TemperatureUnit(int i11, m mVar) {
        this(i11);
    }

    public final int getValue$Authentication_release() {
        return this.value;
    }

    private TemperatureUnit(int i11) {
        this.value = i11;
    }
}
