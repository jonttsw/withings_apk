package com.withings.programs.model.webservice.enrolledProgram;

import androidx.appcompat.app.h;
import com.google.gson.annotations.SerializedName;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: WsIteration.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b'\u0010(B5\b\u0011\u0012\u0006\u0010)\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b'\u0010,J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0015\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b&\u0010\u0013¨\u0006/"}, d2 = {"Lcom/withings/programs/model/webservice/enrolledProgram/WsIteration;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/webservice/enrolledProgram/WsIteration;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()J", "", "component2", "()I", "Lcom/withings/programs/model/webservice/enrolledProgram/WsProgression;", "component3", "()Lcom/withings/programs/model/webservice/enrolledProgram/WsProgression;", "iteration", NavigationArguments.INSTANCE_ID, "progression", "copy", "(JILcom/withings/programs/model/webservice/enrolledProgram/WsProgression;)Lcom/withings/programs/model/webservice/enrolledProgram/WsIteration;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getIteration", "I", "getInstanceId", "Lcom/withings/programs/model/webservice/enrolledProgram/WsProgression;", "getProgression", "<init>", "(JILcom/withings/programs/model/webservice/enrolledProgram/WsProgression;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJILcom/withings/programs/model/webservice/enrolledProgram/WsProgression;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class WsIteration {
    public static final Companion Companion = new Companion(null);
    @SerializedName("instanceid")
    private final int instanceId;
    @SerializedName("iteration")
    private final long iteration;
    @SerializedName("progression")
    private final WsProgression progression;

    /* compiled from: WsIteration.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/webservice/enrolledProgram/WsIteration$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/webservice/enrolledProgram/WsIteration;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsIteration> serializer() {
            return WsIteration$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsIteration(int i11, long j5, int i12, WsProgression wsProgression, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i11 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 7, WsIteration$$serializer.INSTANCE.getDescriptor());
        }
        this.iteration = j5;
        this.instanceId = i12;
        this.progression = wsProgression;
    }

    public static /* synthetic */ WsIteration copy$default(WsIteration wsIteration, long j5, int i11, WsProgression wsProgression, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j5 = wsIteration.iteration;
        }
        if ((i12 & 2) != 0) {
            i11 = wsIteration.instanceId;
        }
        if ((i12 & 4) != 0) {
            wsProgression = wsIteration.progression;
        }
        return wsIteration.copy(j5, i11, wsProgression);
    }

    public static final /* synthetic */ void write$Self$android_release(WsIteration wsIteration, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, wsIteration.iteration);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, wsIteration.instanceId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, WsProgression$$serializer.INSTANCE, wsIteration.progression);
    }

    public final long component1() {
        return this.iteration;
    }

    public final int component2() {
        return this.instanceId;
    }

    public final WsProgression component3() {
        return this.progression;
    }

    public final WsIteration copy(long j5, int i11, WsProgression progression) {
        u.j(progression, "progression");
        return new WsIteration(j5, i11, progression);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsIteration)) {
            return false;
        }
        WsIteration wsIteration = (WsIteration) obj;
        if (this.iteration == wsIteration.iteration && this.instanceId == wsIteration.instanceId && u.e(this.progression, wsIteration.progression)) {
            return true;
        }
        return false;
    }

    public final int getInstanceId() {
        return this.instanceId;
    }

    public final long getIteration() {
        return this.iteration;
    }

    public final WsProgression getProgression() {
        return this.progression;
    }

    public int hashCode() {
        return this.progression.hashCode() + h.a(this.instanceId, Long.hashCode(this.iteration) * 31, 31);
    }

    public String toString() {
        long j5 = this.iteration;
        int i11 = this.instanceId;
        WsProgression wsProgression = this.progression;
        return "WsIteration(iteration=" + j5 + ", instanceId=" + i11 + ", progression=" + wsProgression + ")";
    }

    public WsIteration(long j5, int i11, WsProgression progression) {
        u.j(progression, "progression");
        this.iteration = j5;
        this.instanceId = i11;
        this.progression = progression;
    }
}
