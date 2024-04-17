package com.withings.contentproviders.eightfit.model.webservice;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: WsWellnessTaskResponse.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eB%\b\u0011\u0012\u0006\u0010\u001f\u001a\u00020\u0014\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006%"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsWellnessTaskResponse;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/webservice/WsWellnessTaskResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/withings/contentproviders/eightfit/model/webservice/WsWellnessContent;", "component1", "()Lcom/withings/contentproviders/eightfit/model/webservice/WsWellnessContent;", "task", "copy", "(Lcom/withings/contentproviders/eightfit/model/webservice/WsWellnessContent;)Lcom/withings/contentproviders/eightfit/model/webservice/WsWellnessTaskResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withings/contentproviders/eightfit/model/webservice/WsWellnessContent;", "getTask", "<init>", "(Lcom/withings/contentproviders/eightfit/model/webservice/WsWellnessContent;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/withings/contentproviders/eightfit/model/webservice/WsWellnessContent;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class WsWellnessTaskResponse {
    public static final Companion Companion = new Companion(null);
    private final WsWellnessContent task;

    /* compiled from: WsWellnessTaskResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsWellnessTaskResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsWellnessTaskResponse;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsWellnessTaskResponse> serializer() {
            return WsWellnessTaskResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsWellnessTaskResponse(int i11, WsWellnessContent wsWellnessContent, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i11 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 1, WsWellnessTaskResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.task = wsWellnessContent;
    }

    public static /* synthetic */ WsWellnessTaskResponse copy$default(WsWellnessTaskResponse wsWellnessTaskResponse, WsWellnessContent wsWellnessContent, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            wsWellnessContent = wsWellnessTaskResponse.task;
        }
        return wsWellnessTaskResponse.copy(wsWellnessContent);
    }

    public final WsWellnessContent component1() {
        return this.task;
    }

    public final WsWellnessTaskResponse copy(WsWellnessContent task) {
        u.j(task, "task");
        return new WsWellnessTaskResponse(task);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof WsWellnessTaskResponse) && u.e(this.task, ((WsWellnessTaskResponse) obj).task)) {
            return true;
        }
        return false;
    }

    public final WsWellnessContent getTask() {
        return this.task;
    }

    public int hashCode() {
        return this.task.hashCode();
    }

    public String toString() {
        WsWellnessContent wsWellnessContent = this.task;
        return "WsWellnessTaskResponse(task=" + wsWellnessContent + ")";
    }

    public WsWellnessTaskResponse(WsWellnessContent task) {
        u.j(task, "task");
        this.task = task;
    }
}
