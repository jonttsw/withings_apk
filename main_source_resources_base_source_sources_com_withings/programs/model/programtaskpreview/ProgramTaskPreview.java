package com.withings.programs.model.programtaskpreview;

import am.p;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: ProgramTaskPreview.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b&\u0018\u00002\u00020\u0001Bå\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#\u0012\u0006\u0010)\u001a\u00020\u0007\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\b\u00101\u001a\u0004\u0018\u00010\u0007\u0012\b\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\u00105\u001a\u0004\u0018\u00010\u0007\u0012\b\u00107\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010A\u001a\u00020\u001c\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010F\u001a\u00020\u001c¢\u0006\u0004\bH\u0010IR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u001f\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010)\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010\t\u001a\u0004\b*\u0010\u000bR\u0019\u0010+\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u0004\u001a\u0004\b,\u0010\u0006R\u0019\u0010-\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b-\u0010\t\u001a\u0004\b.\u0010\u000bR\u0019\u0010/\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b/\u0010\t\u001a\u0004\b0\u0010\u000bR\u0019\u00101\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b1\u0010\t\u001a\u0004\b2\u0010\u000bR\u0019\u00103\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006R\u0019\u00105\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b5\u0010\t\u001a\u0004\b6\u0010\u000bR$\u00107\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0004\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u0010:R\u0019\u0010;\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R\u0019\u0010=\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010A\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bA\u0010CR\u0019\u0010D\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bD\u0010>\u001a\u0004\bE\u0010@R\u0017\u0010F\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010C¨\u0006J"}, d2 = {"Lcom/withings/programs/model/programtaskpreview/ProgramTaskPreview;", "", "", "dayIndex", "Ljava/lang/Integer;", "getDayIndex", "()Ljava/lang/Integer;", "", "dayLabel", "Ljava/lang/String;", "getDayLabel", "()Ljava/lang/String;", "", "goal", "Ljava/lang/Double;", "getGoal", "()Ljava/lang/Double;", "identifier", "getIdentifier", NavigationArguments.INSTANCE_ID, "I", "getInstanceId", "()I", "", NavigationArguments.PROGRAM_ID, "J", "getProgramId", "()J", "", "required", "Ljava/lang/Boolean;", "getRequired", "()Ljava/lang/Boolean;", "status", "getStatus", "", "Lam/p;", "tags", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "taskIdentifier", "getTaskIdentifier", "taskIndex", "getTaskIndex", "thumbnail", "getThumbnail", "title", "getTitle", "type", "getType", "weekIndex", "getWeekIndex", "weekLabel", "getWeekLabel", "measureType", "getMeasureType", "setMeasureType", "(Ljava/lang/Integer;)V", "measurementType", "getMeasurementType", "completionDateInMillis", "Ljava/lang/Long;", "getCompletionDateInMillis", "()Ljava/lang/Long;", "isSynced", "Z", "()Z", "programLastUpdate", "getProgramLastUpdate", "currentlySwapped", "getCurrentlySwapped", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;IJLjava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;ZLjava/lang/Long;Z)V", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ProgramTaskPreview {
    private final Long completionDateInMillis;
    private final boolean currentlySwapped;
    private final Integer dayIndex;
    private final String dayLabel;
    private final Double goal;
    private final String identifier;
    private final int instanceId;
    private final boolean isSynced;
    private Integer measureType;
    private final Integer measurementType;
    private final long programId;
    private final Long programLastUpdate;
    private final Boolean required;
    private final Integer status;
    private final List<p> tags;
    private final String taskIdentifier;
    private final Integer taskIndex;
    private final String thumbnail;
    private final String title;
    private final String type;
    private final Integer weekIndex;
    private final String weekLabel;

    public ProgramTaskPreview(Integer num, String str, Double d11, String identifier, int i11, long j5, Boolean bool, Integer num2, List<p> list, String taskIdentifier, Integer num3, String str2, String str3, String str4, Integer num4, String str5, Integer num5, Integer num6, Long l5, boolean z5, Long l6, boolean z11) {
        u.j(identifier, "identifier");
        u.j(taskIdentifier, "taskIdentifier");
        this.dayIndex = num;
        this.dayLabel = str;
        this.goal = d11;
        this.identifier = identifier;
        this.instanceId = i11;
        this.programId = j5;
        this.required = bool;
        this.status = num2;
        this.tags = list;
        this.taskIdentifier = taskIdentifier;
        this.taskIndex = num3;
        this.thumbnail = str2;
        this.title = str3;
        this.type = str4;
        this.weekIndex = num4;
        this.weekLabel = str5;
        this.measureType = num5;
        this.measurementType = num6;
        this.completionDateInMillis = l5;
        this.isSynced = z5;
        this.programLastUpdate = l6;
        this.currentlySwapped = z11;
    }

    public final Long getCompletionDateInMillis() {
        return this.completionDateInMillis;
    }

    public final boolean getCurrentlySwapped() {
        return this.currentlySwapped;
    }

    public final Integer getDayIndex() {
        return this.dayIndex;
    }

    public final String getDayLabel() {
        return this.dayLabel;
    }

    public final Double getGoal() {
        return this.goal;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final int getInstanceId() {
        return this.instanceId;
    }

    public final Integer getMeasureType() {
        return this.measureType;
    }

    public final Integer getMeasurementType() {
        return this.measurementType;
    }

    public final long getProgramId() {
        return this.programId;
    }

    public final Long getProgramLastUpdate() {
        return this.programLastUpdate;
    }

    public final Boolean getRequired() {
        return this.required;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final List<p> getTags() {
        return this.tags;
    }

    public final String getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public final Integer getTaskIndex() {
        return this.taskIndex;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final Integer getWeekIndex() {
        return this.weekIndex;
    }

    public final String getWeekLabel() {
        return this.weekLabel;
    }

    public final boolean isSynced() {
        return this.isSynced;
    }

    public final void setMeasureType(Integer num) {
        this.measureType = num;
    }

    public /* synthetic */ ProgramTaskPreview(Integer num, String str, Double d11, String str2, int i11, long j5, Boolean bool, Integer num2, List list, String str3, Integer num3, String str4, String str5, String str6, Integer num4, String str7, Integer num5, Integer num6, Long l5, boolean z5, Long l6, boolean z11, int i12, m mVar) {
        this(num, str, d11, str2, i11, j5, bool, (i12 & 128) != 0 ? null : num2, list, str3, num3, str4, str5, str6, num4, str7, num5, num6, (262144 & i12) != 0 ? null : l5, (524288 & i12) != 0 ? false : z5, (i12 & 1048576) != 0 ? null : l6, z11);
    }
}
