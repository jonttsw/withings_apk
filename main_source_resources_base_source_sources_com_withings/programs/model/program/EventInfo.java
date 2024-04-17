package com.withings.programs.model.program;

import androidx.activity.result.c;
import androidx.camera.camera2.internal.l0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: EventInfo.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B'\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b'\u0010(B?\b\u0011\u0012\u0006\u0010)\u001a\u00020\u001a\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b'\u0010,J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\rJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b#\u0010\rR\u001a\u0010\u0015\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b&\u0010\u0011¨\u0006/"}, d2 = {"Lcom/withings/programs/model/program/EventInfo;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/program/EventInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "component2", "", "component3", "()J", "component4", "identifier", "title", "startDate", "endDate", "copy", "(Ljava/lang/String;Ljava/lang/String;JJ)Lcom/withings/programs/model/program/EventInfo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "getTitle", "J", "getStartDate", "getEndDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class EventInfo {
    public static final Companion Companion = new Companion(null);
    @SerializedName(FirebaseAnalytics.Param.END_DATE)
    private final long endDate;
    @SerializedName("identifier")
    private final String identifier;
    @SerializedName(FirebaseAnalytics.Param.START_DATE)
    private final long startDate;
    @SerializedName("title")
    private final String title;

    /* compiled from: EventInfo.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/program/EventInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/program/EventInfo;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<EventInfo> serializer() {
            return EventInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ EventInfo(int i11, String str, String str2, long j5, long j11, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i11 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 15, EventInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.title = str2;
        this.startDate = j5;
        this.endDate = j11;
    }

    public static /* synthetic */ EventInfo copy$default(EventInfo eventInfo, String str, String str2, long j5, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = eventInfo.identifier;
        }
        if ((i11 & 2) != 0) {
            str2 = eventInfo.title;
        }
        String str3 = str2;
        if ((i11 & 4) != 0) {
            j5 = eventInfo.startDate;
        }
        long j12 = j5;
        if ((i11 & 8) != 0) {
            j11 = eventInfo.endDate;
        }
        return eventInfo.copy(str, str3, j12, j11);
    }

    public static final /* synthetic */ void write$Self$android_release(EventInfo eventInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eventInfo.identifier);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, eventInfo.title);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, eventInfo.startDate);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, eventInfo.endDate);
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.title;
    }

    public final long component3() {
        return this.startDate;
    }

    public final long component4() {
        return this.endDate;
    }

    public final EventInfo copy(String identifier, String title, long j5, long j11) {
        u.j(identifier, "identifier");
        u.j(title, "title");
        return new EventInfo(identifier, title, j5, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventInfo)) {
            return false;
        }
        EventInfo eventInfo = (EventInfo) obj;
        if (u.e(this.identifier, eventInfo.identifier) && u.e(this.title, eventInfo.title) && this.startDate == eventInfo.startDate && this.endDate == eventInfo.endDate) {
            return true;
        }
        return false;
    }

    public final long getEndDate() {
        return this.endDate;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Long.hashCode(this.endDate) + c.a(this.startDate, d.c(this.title, this.identifier.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.identifier;
        String str2 = this.title;
        long j5 = this.startDate;
        long j11 = this.endDate;
        StringBuilder b10 = l0.b("EventInfo(identifier=", str, ", title=", str2, ", startDate=");
        b10.append(j5);
        b10.append(", endDate=");
        b10.append(j11);
        b10.append(")");
        return b10.toString();
    }

    public EventInfo(String identifier, String title, long j5, long j11) {
        u.j(identifier, "identifier");
        u.j(title, "title");
        this.identifier = identifier;
        this.title = title;
        this.startDate = j5;
        this.endDate = j11;
    }
}
