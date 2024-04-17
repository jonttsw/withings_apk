package com.withings.programs.model.taskpreview;

import am.p;
import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.core.y1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import okhttp3.internal.http2.Http2;
/* compiled from: TaskPreview.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b1\b\u0086\b\u0018\u00002\u00020\u0001:\u0001LB\u008d\u0001\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\b\u0012\u0006\u0010#\u001a\u00020\b\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010&\u001a\u00020\b\u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0006\u0010(\u001a\u00020\u0015\u0012\u0006\u0010)\u001a\u00020\b\u0012\u0006\u0010*\u001a\u00020\u0005\u0012\u0006\u0010+\u001a\u00020\b\u0012\u0006\u0010,\u001a\u00020\u0005\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\bJ\u0010KJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u0004J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\nJ\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0007J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\nJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0007J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ²\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010&\u001a\u00020\b2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010(\u001a\u00020\u00152\b\b\u0002\u0010)\u001a\u00020\b2\b\b\u0002\u0010*\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020\b2\b\b\u0002\u0010,\u001a\u00020\u00052\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b0\u0010\nJ\u0010\u00101\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b1\u0010\u0007J\u001a\u00103\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u00105\u001a\u0004\b6\u0010\u0004R\u0017\u0010 \u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u00107\u001a\u0004\b8\u0010\u0007R\u0017\u0010!\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u00109\u001a\u0004\b:\u0010\nR\u0017\u0010\"\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u00109\u001a\u0004\b;\u0010\nR\u0017\u0010#\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u00109\u001a\u0004\b<\u0010\nR\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b$\u0010\u0004R\u0019\u0010%\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b%\u0010=\u001a\u0004\b>\u0010\u000fR\u0017\u0010&\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u00109\u001a\u0004\b?\u0010\nR\u001f\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b'\u0010@\u001a\u0004\bA\u0010\u0014R\u0017\u0010(\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b(\u0010B\u001a\u0004\bC\u0010\u0017R\u0017\u0010)\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u00109\u001a\u0004\bD\u0010\nR\u0017\u0010*\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u00107\u001a\u0004\bE\u0010\u0007R\u0017\u0010+\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u00109\u001a\u0004\bF\u0010\nR\u0017\u0010,\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u00107\u001a\u0004\bG\u0010\u0007R\u0019\u0010-\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b-\u0010H\u001a\u0004\bI\u0010\u001e¨\u0006M"}, d2 = {"Lcom/withings/programs/model/taskpreview/TaskPreview;", "", "", "component1", "()Z", "", "component2", "()I", "", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "()Ljava/lang/Integer;", "component8", "", "Lam/p;", "component9", "()Ljava/util/List;", "", "component10", "()J", "component11", "component12", "component13", "component14", "Lcom/withings/programs/model/taskpreview/TaskPreview$GaugeData;", "component15", "()Lcom/withings/programs/model/taskpreview/TaskPreview$GaugeData;", "currentlySwapped", "dayIndex", "dayLabel", "identifier", "imageURL", NavigationArguments.IS_COMPLETED, "measurementType", "name", "tags", "taskDate", "taskIdentifier", "taskIndex", "type", "weekIndex", "gauge", "copy", "(ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;JLjava/lang/String;ILjava/lang/String;ILcom/withings/programs/model/taskpreview/TaskPreview$GaugeData;)Lcom/withings/programs/model/taskpreview/TaskPreview;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getCurrentlySwapped", "I", "getDayIndex", "Ljava/lang/String;", "getDayLabel", "getIdentifier", "getImageURL", "Ljava/lang/Integer;", "getMeasurementType", "getName", "Ljava/util/List;", "getTags", "J", "getTaskDate", "getTaskIdentifier", "getTaskIndex", "getType", "getWeekIndex", "Lcom/withings/programs/model/taskpreview/TaskPreview$GaugeData;", "getGauge", "<init>", "(ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;JLjava/lang/String;ILjava/lang/String;ILcom/withings/programs/model/taskpreview/TaskPreview$GaugeData;)V", "GaugeData", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TaskPreview {
    private final boolean currentlySwapped;
    private final int dayIndex;
    private final String dayLabel;
    private final GaugeData gauge;
    private final String identifier;
    private final String imageURL;
    private final boolean isCompleted;
    private final Integer measurementType;
    private final String name;
    private final List<p> tags;
    private final long taskDate;
    private final String taskIdentifier;
    private final int taskIndex;
    private final String type;
    private final int weekIndex;

    /* compiled from: TaskPreview.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/withings/programs/model/taskpreview/TaskPreview$GaugeData;", "", "goal", "", "measureType", "", "progress", "(DID)V", "getGoal", "()D", "getMeasureType", "()I", "getProgress", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class GaugeData {
        private final double goal;
        private final int measureType;
        private final double progress;

        public GaugeData(double d11, int i11, double d12) {
            this.goal = d11;
            this.measureType = i11;
            this.progress = d12;
        }

        public static /* synthetic */ GaugeData copy$default(GaugeData gaugeData, double d11, int i11, double d12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                d11 = gaugeData.goal;
            }
            double d13 = d11;
            if ((i12 & 2) != 0) {
                i11 = gaugeData.measureType;
            }
            int i13 = i11;
            if ((i12 & 4) != 0) {
                d12 = gaugeData.progress;
            }
            return gaugeData.copy(d13, i13, d12);
        }

        public final double component1() {
            return this.goal;
        }

        public final int component2() {
            return this.measureType;
        }

        public final double component3() {
            return this.progress;
        }

        public final GaugeData copy(double d11, int i11, double d12) {
            return new GaugeData(d11, i11, d12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GaugeData)) {
                return false;
            }
            GaugeData gaugeData = (GaugeData) obj;
            if (Double.compare(this.goal, gaugeData.goal) == 0 && this.measureType == gaugeData.measureType && Double.compare(this.progress, gaugeData.progress) == 0) {
                return true;
            }
            return false;
        }

        public final double getGoal() {
            return this.goal;
        }

        public final int getMeasureType() {
            return this.measureType;
        }

        public final double getProgress() {
            return this.progress;
        }

        public int hashCode() {
            return Double.hashCode(this.progress) + h.a(this.measureType, Double.hashCode(this.goal) * 31, 31);
        }

        public String toString() {
            double d11 = this.goal;
            int i11 = this.measureType;
            double d12 = this.progress;
            return "GaugeData(goal=" + d11 + ", measureType=" + i11 + ", progress=" + d12 + ")";
        }
    }

    public TaskPreview(boolean z5, int i11, String dayLabel, String identifier, String imageURL, boolean z11, Integer num, String name, List<p> list, long j5, String taskIdentifier, int i12, String type, int i13, GaugeData gaugeData) {
        u.j(dayLabel, "dayLabel");
        u.j(identifier, "identifier");
        u.j(imageURL, "imageURL");
        u.j(name, "name");
        u.j(taskIdentifier, "taskIdentifier");
        u.j(type, "type");
        this.currentlySwapped = z5;
        this.dayIndex = i11;
        this.dayLabel = dayLabel;
        this.identifier = identifier;
        this.imageURL = imageURL;
        this.isCompleted = z11;
        this.measurementType = num;
        this.name = name;
        this.tags = list;
        this.taskDate = j5;
        this.taskIdentifier = taskIdentifier;
        this.taskIndex = i12;
        this.type = type;
        this.weekIndex = i13;
        this.gauge = gaugeData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaskPreview copy$default(TaskPreview taskPreview, boolean z5, int i11, String str, String str2, String str3, boolean z11, Integer num, String str4, List list, long j5, String str5, int i12, String str6, int i13, GaugeData gaugeData, int i14, Object obj) {
        boolean z12;
        int i15;
        String str7;
        String str8;
        String str9;
        boolean z13;
        Integer num2;
        String str10;
        List<p> list2;
        long j11;
        String str11;
        int i16;
        String str12;
        int i17;
        GaugeData gaugeData2;
        if ((i14 & 1) != 0) {
            z12 = taskPreview.currentlySwapped;
        } else {
            z12 = z5;
        }
        if ((i14 & 2) != 0) {
            i15 = taskPreview.dayIndex;
        } else {
            i15 = i11;
        }
        if ((i14 & 4) != 0) {
            str7 = taskPreview.dayLabel;
        } else {
            str7 = str;
        }
        if ((i14 & 8) != 0) {
            str8 = taskPreview.identifier;
        } else {
            str8 = str2;
        }
        if ((i14 & 16) != 0) {
            str9 = taskPreview.imageURL;
        } else {
            str9 = str3;
        }
        if ((i14 & 32) != 0) {
            z13 = taskPreview.isCompleted;
        } else {
            z13 = z11;
        }
        if ((i14 & 64) != 0) {
            num2 = taskPreview.measurementType;
        } else {
            num2 = num;
        }
        if ((i14 & 128) != 0) {
            str10 = taskPreview.name;
        } else {
            str10 = str4;
        }
        if ((i14 & 256) != 0) {
            list2 = taskPreview.tags;
        } else {
            list2 = list;
        }
        if ((i14 & 512) != 0) {
            j11 = taskPreview.taskDate;
        } else {
            j11 = j5;
        }
        if ((i14 & 1024) != 0) {
            str11 = taskPreview.taskIdentifier;
        } else {
            str11 = str5;
        }
        if ((i14 & ModuleCopy.f28574b) != 0) {
            i16 = taskPreview.taskIndex;
        } else {
            i16 = i12;
        }
        if ((i14 & 4096) != 0) {
            str12 = taskPreview.type;
        } else {
            str12 = str6;
        }
        String str13 = str12;
        if ((i14 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            i17 = taskPreview.weekIndex;
        } else {
            i17 = i13;
        }
        if ((i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            gaugeData2 = taskPreview.gauge;
        } else {
            gaugeData2 = gaugeData;
        }
        return taskPreview.copy(z12, i15, str7, str8, str9, z13, num2, str10, list2, j11, str11, i16, str13, i17, gaugeData2);
    }

    public final boolean component1() {
        return this.currentlySwapped;
    }

    public final long component10() {
        return this.taskDate;
    }

    public final String component11() {
        return this.taskIdentifier;
    }

    public final int component12() {
        return this.taskIndex;
    }

    public final String component13() {
        return this.type;
    }

    public final int component14() {
        return this.weekIndex;
    }

    public final GaugeData component15() {
        return this.gauge;
    }

    public final int component2() {
        return this.dayIndex;
    }

    public final String component3() {
        return this.dayLabel;
    }

    public final String component4() {
        return this.identifier;
    }

    public final String component5() {
        return this.imageURL;
    }

    public final boolean component6() {
        return this.isCompleted;
    }

    public final Integer component7() {
        return this.measurementType;
    }

    public final String component8() {
        return this.name;
    }

    public final List<p> component9() {
        return this.tags;
    }

    public final TaskPreview copy(boolean z5, int i11, String dayLabel, String identifier, String imageURL, boolean z11, Integer num, String name, List<p> list, long j5, String taskIdentifier, int i12, String type, int i13, GaugeData gaugeData) {
        u.j(dayLabel, "dayLabel");
        u.j(identifier, "identifier");
        u.j(imageURL, "imageURL");
        u.j(name, "name");
        u.j(taskIdentifier, "taskIdentifier");
        u.j(type, "type");
        return new TaskPreview(z5, i11, dayLabel, identifier, imageURL, z11, num, name, list, j5, taskIdentifier, i12, type, i13, gaugeData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskPreview)) {
            return false;
        }
        TaskPreview taskPreview = (TaskPreview) obj;
        if (this.currentlySwapped == taskPreview.currentlySwapped && this.dayIndex == taskPreview.dayIndex && u.e(this.dayLabel, taskPreview.dayLabel) && u.e(this.identifier, taskPreview.identifier) && u.e(this.imageURL, taskPreview.imageURL) && this.isCompleted == taskPreview.isCompleted && u.e(this.measurementType, taskPreview.measurementType) && u.e(this.name, taskPreview.name) && u.e(this.tags, taskPreview.tags) && this.taskDate == taskPreview.taskDate && u.e(this.taskIdentifier, taskPreview.taskIdentifier) && this.taskIndex == taskPreview.taskIndex && u.e(this.type, taskPreview.type) && this.weekIndex == taskPreview.weekIndex && u.e(this.gauge, taskPreview.gauge)) {
            return true;
        }
        return false;
    }

    public final boolean getCurrentlySwapped() {
        return this.currentlySwapped;
    }

    public final int getDayIndex() {
        return this.dayIndex;
    }

    public final String getDayLabel() {
        return this.dayLabel;
    }

    public final GaugeData getGauge() {
        return this.gauge;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getImageURL() {
        return this.imageURL;
    }

    public final Integer getMeasurementType() {
        return this.measurementType;
    }

    public final String getName() {
        return this.name;
    }

    public final List<p> getTags() {
        return this.tags;
    }

    public final long getTaskDate() {
        return this.taskDate;
    }

    public final String getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public final int getTaskIndex() {
        return this.taskIndex;
    }

    public final String getType() {
        return this.type;
    }

    public final int getWeekIndex() {
        return this.weekIndex;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int a11 = y1.a(this.isCompleted, d.c(this.imageURL, d.c(this.identifier, d.c(this.dayLabel, h.a(this.dayIndex, Boolean.hashCode(this.currentlySwapped) * 31, 31), 31), 31), 31), 31);
        Integer num = this.measurementType;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int c11 = d.c(this.name, (a11 + hashCode) * 31, 31);
        List<p> list = this.tags;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int a12 = h.a(this.weekIndex, d.c(this.type, h.a(this.taskIndex, d.c(this.taskIdentifier, c.a(this.taskDate, (c11 + hashCode2) * 31, 31), 31), 31), 31), 31);
        GaugeData gaugeData = this.gauge;
        if (gaugeData != null) {
            i11 = gaugeData.hashCode();
        }
        return a12 + i11;
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public String toString() {
        boolean z5 = this.currentlySwapped;
        int i11 = this.dayIndex;
        String str = this.dayLabel;
        String str2 = this.identifier;
        String str3 = this.imageURL;
        boolean z11 = this.isCompleted;
        Integer num = this.measurementType;
        String str4 = this.name;
        List<p> list = this.tags;
        long j5 = this.taskDate;
        String str5 = this.taskIdentifier;
        int i12 = this.taskIndex;
        String str6 = this.type;
        int i13 = this.weekIndex;
        GaugeData gaugeData = this.gauge;
        StringBuilder sb2 = new StringBuilder("TaskPreview(currentlySwapped=");
        sb2.append(z5);
        sb2.append(", dayIndex=");
        sb2.append(i11);
        sb2.append(", dayLabel=");
        b.d(sb2, str, ", identifier=", str2, ", imageURL=");
        sb2.append(str3);
        sb2.append(", isCompleted=");
        sb2.append(z11);
        sb2.append(", measurementType=");
        sb2.append(num);
        sb2.append(", name=");
        sb2.append(str4);
        sb2.append(", tags=");
        sb2.append(list);
        sb2.append(", taskDate=");
        sb2.append(j5);
        sb2.append(", taskIdentifier=");
        sb2.append(str5);
        sb2.append(", taskIndex=");
        sb2.append(i12);
        sb2.append(", type=");
        sb2.append(str6);
        sb2.append(", weekIndex=");
        sb2.append(i13);
        sb2.append(", gauge=");
        sb2.append(gaugeData);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ TaskPreview(boolean z5, int i11, String str, String str2, String str3, boolean z11, Integer num, String str4, List list, long j5, String str5, int i12, String str6, int i13, GaugeData gaugeData, int i14, m mVar) {
        this(z5, i11, str, str2, str3, z11, num, str4, list, j5, str5, i12, str6, i13, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : gaugeData);
    }
}
