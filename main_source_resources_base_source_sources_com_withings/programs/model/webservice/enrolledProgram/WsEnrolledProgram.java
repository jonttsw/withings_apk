package com.withings.programs.model.webservice.enrolledProgram;

import androidx.activity.result.c;
import com.google.gson.annotations.SerializedName;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: WsEnrolledProgram.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B9\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u0011\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b2\u00103BO\b\u0011\u0012\u0006\u00104\u001a\u00020\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018\u0012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b2\u00107J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJJ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010\rJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u001b\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\b)\u0010\rR\u001a\u0010\u001c\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\b+\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010,\u001a\u0004\b-\u0010\u0013R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\b/\u0010\u0017R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00100\u001a\u0004\b1\u0010\u001a¨\u0006:"}, d2 = {"Lcom/withings/programs/model/webservice/enrolledProgram/WsEnrolledProgram;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/webservice/enrolledProgram/WsEnrolledProgram;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()I", "", "component2", "()J", "", "component3", "()Ljava/lang/String;", "", "Lcom/withings/programs/model/webservice/enrolledProgram/WsIteration;", "component4", "()Ljava/util/List;", "Lcom/withings/programs/model/webservice/enrolledProgram/WsSpecifics;", "component5", "()Lcom/withings/programs/model/webservice/enrolledProgram/WsSpecifics;", NavigationArguments.PROGRAM_ID, "modified", "deployment", "iterations", "specifics", "copy", "(IJLjava/lang/String;Ljava/util/List;Lcom/withings/programs/model/webservice/enrolledProgram/WsSpecifics;)Lcom/withings/programs/model/webservice/enrolledProgram/WsEnrolledProgram;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getProgramId", "J", "getModified", "Ljava/lang/String;", "getDeployment", "Ljava/util/List;", "getIterations", "Lcom/withings/programs/model/webservice/enrolledProgram/WsSpecifics;", "getSpecifics", "<init>", "(IJLjava/lang/String;Ljava/util/List;Lcom/withings/programs/model/webservice/enrolledProgram/WsSpecifics;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIJLjava/lang/String;Ljava/util/List;Lcom/withings/programs/model/webservice/enrolledProgram/WsSpecifics;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class WsEnrolledProgram {
    @SerializedName("deployment")
    private final String deployment;
    @SerializedName("iterations")
    private final List<WsIteration> iterations;
    @SerializedName("modified")
    private final long modified;
    @SerializedName("programid")
    private final int programId;
    @SerializedName("specifics")
    private final WsSpecifics specifics;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(WsIteration$$serializer.INSTANCE), null};

    /* compiled from: WsEnrolledProgram.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/webservice/enrolledProgram/WsEnrolledProgram$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/webservice/enrolledProgram/WsEnrolledProgram;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsEnrolledProgram> serializer() {
            return WsEnrolledProgram$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsEnrolledProgram(int i11, int i12, long j5, String str, List list, WsSpecifics wsSpecifics, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i11 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 15, WsEnrolledProgram$$serializer.INSTANCE.getDescriptor());
        }
        this.programId = i12;
        this.modified = j5;
        this.deployment = str;
        this.iterations = list;
        if ((i11 & 16) == 0) {
            this.specifics = null;
        } else {
            this.specifics = wsSpecifics;
        }
    }

    public static /* synthetic */ WsEnrolledProgram copy$default(WsEnrolledProgram wsEnrolledProgram, int i11, long j5, String str, List list, WsSpecifics wsSpecifics, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = wsEnrolledProgram.programId;
        }
        if ((i12 & 2) != 0) {
            j5 = wsEnrolledProgram.modified;
        }
        long j11 = j5;
        if ((i12 & 4) != 0) {
            str = wsEnrolledProgram.deployment;
        }
        String str2 = str;
        List<WsIteration> list2 = list;
        if ((i12 & 8) != 0) {
            list2 = wsEnrolledProgram.iterations;
        }
        List list3 = list2;
        if ((i12 & 16) != 0) {
            wsSpecifics = wsEnrolledProgram.specifics;
        }
        return wsEnrolledProgram.copy(i11, j11, str2, list3, wsSpecifics);
    }

    public static final /* synthetic */ void write$Self$android_release(WsEnrolledProgram wsEnrolledProgram, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, wsEnrolledProgram.programId);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, wsEnrolledProgram.modified);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, wsEnrolledProgram.deployment);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], wsEnrolledProgram.iterations);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || wsEnrolledProgram.specifics != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, WsSpecifics$$serializer.INSTANCE, wsEnrolledProgram.specifics);
        }
    }

    public final int component1() {
        return this.programId;
    }

    public final long component2() {
        return this.modified;
    }

    public final String component3() {
        return this.deployment;
    }

    public final List<WsIteration> component4() {
        return this.iterations;
    }

    public final WsSpecifics component5() {
        return this.specifics;
    }

    public final WsEnrolledProgram copy(int i11, long j5, String deployment, List<WsIteration> iterations, WsSpecifics wsSpecifics) {
        u.j(deployment, "deployment");
        u.j(iterations, "iterations");
        return new WsEnrolledProgram(i11, j5, deployment, iterations, wsSpecifics);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsEnrolledProgram)) {
            return false;
        }
        WsEnrolledProgram wsEnrolledProgram = (WsEnrolledProgram) obj;
        if (this.programId == wsEnrolledProgram.programId && this.modified == wsEnrolledProgram.modified && u.e(this.deployment, wsEnrolledProgram.deployment) && u.e(this.iterations, wsEnrolledProgram.iterations) && u.e(this.specifics, wsEnrolledProgram.specifics)) {
            return true;
        }
        return false;
    }

    public final String getDeployment() {
        return this.deployment;
    }

    public final List<WsIteration> getIterations() {
        return this.iterations;
    }

    public final long getModified() {
        return this.modified;
    }

    public final int getProgramId() {
        return this.programId;
    }

    public final WsSpecifics getSpecifics() {
        return this.specifics;
    }

    public int hashCode() {
        int hashCode;
        int b10 = e.b(this.iterations, d.c(this.deployment, c.a(this.modified, Integer.hashCode(this.programId) * 31, 31), 31), 31);
        WsSpecifics wsSpecifics = this.specifics;
        if (wsSpecifics == null) {
            hashCode = 0;
        } else {
            hashCode = wsSpecifics.hashCode();
        }
        return b10 + hashCode;
    }

    public String toString() {
        int i11 = this.programId;
        long j5 = this.modified;
        String str = this.deployment;
        List<WsIteration> list = this.iterations;
        WsSpecifics wsSpecifics = this.specifics;
        return "WsEnrolledProgram(programId=" + i11 + ", modified=" + j5 + ", deployment=" + str + ", iterations=" + list + ", specifics=" + wsSpecifics + ")";
    }

    public WsEnrolledProgram(int i11, long j5, String deployment, List<WsIteration> iterations, WsSpecifics wsSpecifics) {
        u.j(deployment, "deployment");
        u.j(iterations, "iterations");
        this.programId = i11;
        this.modified = j5;
        this.deployment = deployment;
        this.iterations = iterations;
        this.specifics = wsSpecifics;
    }

    public /* synthetic */ WsEnrolledProgram(int i11, long j5, String str, List list, WsSpecifics wsSpecifics, int i12, m mVar) {
        this(i11, j5, str, list, (i12 & 16) != 0 ? null : wsSpecifics);
    }
}
