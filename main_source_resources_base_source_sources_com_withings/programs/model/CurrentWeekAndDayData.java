package com.withings.programs.model;

import androidx.appcompat.app.h;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: CurrentWeekAndDayData.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fB+\b\u0011\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001d\u0010\r¨\u0006&"}, d2 = {"Lcom/withings/programs/model/CurrentWeekAndDayData;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/CurrentWeekAndDayData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()I", "component2", "weekIndex", "dayIndex", "copy", "(II)Lcom/withings/programs/model/CurrentWeekAndDayData;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getWeekIndex", "getDayIndex", "<init>", "(II)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class CurrentWeekAndDayData {
    public static final Companion Companion = new Companion(null);
    private final int dayIndex;
    private final int weekIndex;

    /* compiled from: CurrentWeekAndDayData.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/CurrentWeekAndDayData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/CurrentWeekAndDayData;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<CurrentWeekAndDayData> serializer() {
            return CurrentWeekAndDayData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CurrentWeekAndDayData(int i11, int i12) {
        this.weekIndex = i11;
        this.dayIndex = i12;
    }

    public static /* synthetic */ CurrentWeekAndDayData copy$default(CurrentWeekAndDayData currentWeekAndDayData, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = currentWeekAndDayData.weekIndex;
        }
        if ((i13 & 2) != 0) {
            i12 = currentWeekAndDayData.dayIndex;
        }
        return currentWeekAndDayData.copy(i11, i12);
    }

    public static final /* synthetic */ void write$Self$android_release(CurrentWeekAndDayData currentWeekAndDayData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, currentWeekAndDayData.weekIndex);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, currentWeekAndDayData.dayIndex);
    }

    public final int component1() {
        return this.weekIndex;
    }

    public final int component2() {
        return this.dayIndex;
    }

    public final CurrentWeekAndDayData copy(int i11, int i12) {
        return new CurrentWeekAndDayData(i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentWeekAndDayData)) {
            return false;
        }
        CurrentWeekAndDayData currentWeekAndDayData = (CurrentWeekAndDayData) obj;
        if (this.weekIndex == currentWeekAndDayData.weekIndex && this.dayIndex == currentWeekAndDayData.dayIndex) {
            return true;
        }
        return false;
    }

    public final int getDayIndex() {
        return this.dayIndex;
    }

    public final int getWeekIndex() {
        return this.weekIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.dayIndex) + (Integer.hashCode(this.weekIndex) * 31);
    }

    public String toString() {
        return h.c("CurrentWeekAndDayData(weekIndex=", this.weekIndex, ", dayIndex=", this.dayIndex, ")");
    }

    public /* synthetic */ CurrentWeekAndDayData(int i11, int i12, int i13, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i11 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 3, CurrentWeekAndDayData$$serializer.INSTANCE.getDescriptor());
        }
        this.weekIndex = i12;
        this.dayIndex = i13;
    }
}
