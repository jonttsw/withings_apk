package com.withings.programs.model.webservice.programdetail;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: WsProgramTaskDetailResponse.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eB%\b\u0011\u0012\u0006\u0010\u001f\u001a\u00020\u0014\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006%"}, d2 = {"Lcom/withings/programs/model/webservice/programdetail/WsProgramTaskDetailResponse;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/webservice/programdetail/WsProgramTaskDetailResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/withings/programs/model/webservice/programdetail/WsProgramTask;", "component1", "()Lcom/withings/programs/model/webservice/programdetail/WsProgramTask;", "task", "copy", "(Lcom/withings/programs/model/webservice/programdetail/WsProgramTask;)Lcom/withings/programs/model/webservice/programdetail/WsProgramTaskDetailResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withings/programs/model/webservice/programdetail/WsProgramTask;", "getTask", "<init>", "(Lcom/withings/programs/model/webservice/programdetail/WsProgramTask;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/withings/programs/model/webservice/programdetail/WsProgramTask;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class WsProgramTaskDetailResponse {
    public static final Companion Companion = new Companion(null);
    private final WsProgramTask task;

    /* compiled from: WsProgramTaskDetailResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/webservice/programdetail/WsProgramTaskDetailResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/webservice/programdetail/WsProgramTaskDetailResponse;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsProgramTaskDetailResponse> serializer() {
            return WsProgramTaskDetailResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsProgramTaskDetailResponse(int i11, WsProgramTask wsProgramTask, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i11 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 1, WsProgramTaskDetailResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.task = wsProgramTask;
    }

    public static /* synthetic */ WsProgramTaskDetailResponse copy$default(WsProgramTaskDetailResponse wsProgramTaskDetailResponse, WsProgramTask wsProgramTask, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            wsProgramTask = wsProgramTaskDetailResponse.task;
        }
        return wsProgramTaskDetailResponse.copy(wsProgramTask);
    }

    public final WsProgramTask component1() {
        return this.task;
    }

    public final WsProgramTaskDetailResponse copy(WsProgramTask task) {
        u.j(task, "task");
        return new WsProgramTaskDetailResponse(task);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof WsProgramTaskDetailResponse) && u.e(this.task, ((WsProgramTaskDetailResponse) obj).task)) {
            return true;
        }
        return false;
    }

    public final WsProgramTask getTask() {
        return this.task;
    }

    public int hashCode() {
        return this.task.hashCode();
    }

    public String toString() {
        WsProgramTask wsProgramTask = this.task;
        return "WsProgramTaskDetailResponse(task=" + wsProgramTask + ")";
    }

    public WsProgramTaskDetailResponse(WsProgramTask task) {
        u.j(task, "task");
        this.task = task;
    }
}
