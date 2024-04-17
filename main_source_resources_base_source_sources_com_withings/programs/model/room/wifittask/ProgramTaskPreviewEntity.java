package com.withings.programs.model.room.wifittask;

import com.withings.contentproviders.eightfit.model.content.EightFitContent;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.programs.model.room.metadata.MetadataEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import okhttp3.internal.http2.Http2;
/* compiled from: ProgramTaskPreviewEntity.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b&\b\u0007\u0018\u00002\u00020\u0001Bç\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t¢\u0006\u0002\u0010 R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0016\u0010\u001f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0016\u0010\u0015\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u0016\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010%R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b1\u0010'R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b6\u0010\"R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b:\u0010'R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010*R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b>\u0010'R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010*R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010*R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010*R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\bB\u0010'R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010*¨\u0006D"}, d2 = {"Lcom/withings/programs/model/room/wifittask/ProgramTaskPreviewEntity;", "", "taskIdentifier", "", "identifier", "type", "title", "thumbnail", "required", "", "tags", "", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitTag;", "weekIndex", "", "weekLabel", "dayIndex", "dayLabel", "taskIndex", NavigationArguments.PROGRAM_ID, "", NavigationArguments.INSTANCE_ID, "isSynced", "programLastUpdate", "goal", "", "measureType", "status", "completionDateInMillis", "metadata", "Lcom/withings/programs/model/room/metadata/MetadataEntity;", "currentlySwapped", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;JIZLjava/lang/Long;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Lcom/withings/programs/model/room/metadata/MetadataEntity;Z)V", "getCompletionDateInMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrentlySwapped", "()Z", "getDayIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDayLabel", "()Ljava/lang/String;", "getGoal", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getIdentifier", "getInstanceId", "()I", "getMeasureType", "getMetadata", "()Lcom/withings/programs/model/room/metadata/MetadataEntity;", "getProgramId", "()J", "getProgramLastUpdate", "getRequired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStatus", "getTags", "()Ljava/util/List;", "getTaskIdentifier", "getTaskIndex", "getThumbnail", "getTitle", "getType", "getWeekIndex", "getWeekLabel", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgramTaskPreviewEntity {
    private final Long completionDateInMillis;
    private final boolean currentlySwapped;
    private final Integer dayIndex;
    private final String dayLabel;
    private final Double goal;
    private final String identifier;
    private final int instanceId;
    private final boolean isSynced;
    private final Integer measureType;
    private final MetadataEntity metadata;
    private final long programId;
    private final Long programLastUpdate;
    private final Boolean required;
    private final Integer status;
    private final List<EightFitContent.EightFitTag> tags;
    private final String taskIdentifier;
    private final Integer taskIndex;
    private final String thumbnail;
    private final String title;
    private final String type;
    private final Integer weekIndex;
    private final String weekLabel;

    public ProgramTaskPreviewEntity(String taskIdentifier, String identifier, String str, String str2, String str3, Boolean bool, List<EightFitContent.EightFitTag> list, Integer num, String str4, Integer num2, String str5, Integer num3, long j5, int i11, boolean z5, Long l5, Double d11, Integer num4, Integer num5, Long l6, MetadataEntity metadataEntity, boolean z11) {
        u.j(taskIdentifier, "taskIdentifier");
        u.j(identifier, "identifier");
        this.taskIdentifier = taskIdentifier;
        this.identifier = identifier;
        this.type = str;
        this.title = str2;
        this.thumbnail = str3;
        this.required = bool;
        this.tags = list;
        this.weekIndex = num;
        this.weekLabel = str4;
        this.dayIndex = num2;
        this.dayLabel = str5;
        this.taskIndex = num3;
        this.programId = j5;
        this.instanceId = i11;
        this.isSynced = z5;
        this.programLastUpdate = l5;
        this.goal = d11;
        this.measureType = num4;
        this.status = num5;
        this.completionDateInMillis = l6;
        this.metadata = metadataEntity;
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

    public final MetadataEntity getMetadata() {
        return this.metadata;
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

    public final List<EightFitContent.EightFitTag> getTags() {
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

    public /* synthetic */ ProgramTaskPreviewEntity(String str, String str2, String str3, String str4, String str5, Boolean bool, List list, Integer num, String str6, Integer num2, String str7, Integer num3, long j5, int i11, boolean z5, Long l5, Double d11, Integer num4, Integer num5, Long l6, MetadataEntity metadataEntity, boolean z11, int i12, m mVar) {
        this(str, str2, str3, str4, str5, bool, list, num, str6, num2, str7, num3, j5, i11, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z5, (32768 & i12) != 0 ? null : l5, d11, num4, (262144 & i12) != 0 ? null : num5, (524288 & i12) != 0 ? null : l6, (1048576 & i12) != 0 ? null : metadataEntity, (i12 & 2097152) != 0 ? false : z11);
    }
}
