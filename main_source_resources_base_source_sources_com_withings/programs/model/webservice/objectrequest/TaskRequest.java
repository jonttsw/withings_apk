package com.withings.programs.model.webservice.objectrequest;

import androidx.activity.result.c;
import com.google.gson.annotations.SerializedName;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: TaskRequest.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B!\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b*\u0010+B=\b\u0011\u0012\u0006\u0010,\u001a\u00020\u0011\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b*\u0010/J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\rJ\u0010\u0010\u001a\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\rR \u0010\u0015\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010$\u0012\u0004\b&\u0010#\u001a\u0004\b%\u0010\u0010R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010'\u0012\u0004\b)\u0010#\u001a\u0004\b(\u0010\u0013¨\u00062"}, d2 = {"Lcom/withings/programs/model/webservice/objectrequest/TaskRequest;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/webservice/objectrequest/TaskRequest;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "", "component2", "()J", "", "component3", "()Ljava/lang/Integer;", "taskIdentifier", "completionDateInSeconds", NavigationArguments.INSTANCE_ID, "copy", "(Ljava/lang/String;JLjava/lang/Integer;)Lcom/withings/programs/model/webservice/objectrequest/TaskRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTaskIdentifier", "getTaskIdentifier$annotations", "()V", "J", "getCompletionDateInSeconds", "getCompletionDateInSeconds$annotations", "Ljava/lang/Integer;", "getInstanceId", "getInstanceId$annotations", "<init>", "(Ljava/lang/String;JLjava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class TaskRequest {
    public static final Companion Companion = new Companion(null);
    @SerializedName("timestamp")
    private final long completionDateInSeconds;
    @SerializedName("instanceid")
    private final Integer instanceId;
    @SerializedName("task_identifier")
    private final String taskIdentifier;

    /* compiled from: TaskRequest.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/webservice/objectrequest/TaskRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/webservice/objectrequest/TaskRequest;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<TaskRequest> serializer() {
            return TaskRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TaskRequest(int i11, String str, long j5, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i11 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 7, TaskRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.taskIdentifier = str;
        this.completionDateInSeconds = j5;
        this.instanceId = num;
    }

    public static /* synthetic */ TaskRequest copy$default(TaskRequest taskRequest, String str, long j5, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = taskRequest.taskIdentifier;
        }
        if ((i11 & 2) != 0) {
            j5 = taskRequest.completionDateInSeconds;
        }
        if ((i11 & 4) != 0) {
            num = taskRequest.instanceId;
        }
        return taskRequest.copy(str, j5, num);
    }

    public static final /* synthetic */ void write$Self$android_release(TaskRequest taskRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, taskRequest.taskIdentifier);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, taskRequest.completionDateInSeconds);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, taskRequest.instanceId);
    }

    public final String component1() {
        return this.taskIdentifier;
    }

    public final long component2() {
        return this.completionDateInSeconds;
    }

    public final Integer component3() {
        return this.instanceId;
    }

    public final TaskRequest copy(String taskIdentifier, long j5, Integer num) {
        u.j(taskIdentifier, "taskIdentifier");
        return new TaskRequest(taskIdentifier, j5, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskRequest)) {
            return false;
        }
        TaskRequest taskRequest = (TaskRequest) obj;
        if (u.e(this.taskIdentifier, taskRequest.taskIdentifier) && this.completionDateInSeconds == taskRequest.completionDateInSeconds && u.e(this.instanceId, taskRequest.instanceId)) {
            return true;
        }
        return false;
    }

    public final long getCompletionDateInSeconds() {
        return this.completionDateInSeconds;
    }

    public final Integer getInstanceId() {
        return this.instanceId;
    }

    public final String getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public int hashCode() {
        int hashCode;
        int a11 = c.a(this.completionDateInSeconds, this.taskIdentifier.hashCode() * 31, 31);
        Integer num = this.instanceId;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return a11 + hashCode;
    }

    public String toString() {
        String str = this.taskIdentifier;
        long j5 = this.completionDateInSeconds;
        Integer num = this.instanceId;
        return "TaskRequest(taskIdentifier=" + str + ", completionDateInSeconds=" + j5 + ", instanceId=" + num + ")";
    }

    public TaskRequest(String taskIdentifier, long j5, Integer num) {
        u.j(taskIdentifier, "taskIdentifier");
        this.taskIdentifier = taskIdentifier;
        this.completionDateInSeconds = j5;
        this.instanceId = num;
    }

    public static /* synthetic */ void getCompletionDateInSeconds$annotations() {
    }

    public static /* synthetic */ void getInstanceId$annotations() {
    }

    public static /* synthetic */ void getTaskIdentifier$annotations() {
    }
}
