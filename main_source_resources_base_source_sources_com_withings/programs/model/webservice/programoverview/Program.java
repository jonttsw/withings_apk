package com.withings.programs.model.webservice.programoverview;

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
/* compiled from: Program.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b%\u0010&B-\b\u0011\u0012\u0006\u0010'\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R\"\u0010\u0012\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010!\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010$¨\u0006-"}, d2 = {"Lcom/withings/programs/model/webservice/programoverview/Program;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/webservice/programoverview/Program;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/withings/programs/model/webservice/programoverview/Data;", "component1", "()Lcom/withings/programs/model/webservice/programoverview/Data;", "", "component2", "()I", "data", "accessLevel", "copy", "(Lcom/withings/programs/model/webservice/programoverview/Data;I)Lcom/withings/programs/model/webservice/programoverview/Program;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withings/programs/model/webservice/programoverview/Data;", "getData", "setData", "(Lcom/withings/programs/model/webservice/programoverview/Data;)V", "I", "getAccessLevel", "setAccessLevel", "(I)V", "<init>", "(Lcom/withings/programs/model/webservice/programoverview/Data;I)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/withings/programs/model/webservice/programoverview/Data;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class Program {
    public static final Companion Companion = new Companion(null);
    @SerializedName("access_level")
    private int accessLevel;
    @SerializedName("data")
    private Data data;

    /* compiled from: Program.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/webservice/programoverview/Program$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/webservice/programoverview/Program;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<Program> serializer() {
            return Program$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Program(int i11, Data data, int i12, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i11 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 3, Program$$serializer.INSTANCE.getDescriptor());
        }
        this.data = data;
        this.accessLevel = i12;
    }

    public static /* synthetic */ Program copy$default(Program program, Data data, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            data = program.data;
        }
        if ((i12 & 2) != 0) {
            i11 = program.accessLevel;
        }
        return program.copy(data, i11);
    }

    public static final /* synthetic */ void write$Self$android_release(Program program, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, Data$$serializer.INSTANCE, program.data);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, program.accessLevel);
    }

    public final Data component1() {
        return this.data;
    }

    public final int component2() {
        return this.accessLevel;
    }

    public final Program copy(Data data, int i11) {
        u.j(data, "data");
        return new Program(data, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Program)) {
            return false;
        }
        Program program = (Program) obj;
        if (u.e(this.data, program.data) && this.accessLevel == program.accessLevel) {
            return true;
        }
        return false;
    }

    public final int getAccessLevel() {
        return this.accessLevel;
    }

    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        return Integer.hashCode(this.accessLevel) + (this.data.hashCode() * 31);
    }

    public final void setAccessLevel(int i11) {
        this.accessLevel = i11;
    }

    public final void setData(Data data) {
        u.j(data, "<set-?>");
        this.data = data;
    }

    public String toString() {
        Data data = this.data;
        int i11 = this.accessLevel;
        return "Program(data=" + data + ", accessLevel=" + i11 + ")";
    }

    public Program(Data data, int i11) {
        u.j(data, "data");
        this.data = data;
        this.accessLevel = i11;
    }
}
