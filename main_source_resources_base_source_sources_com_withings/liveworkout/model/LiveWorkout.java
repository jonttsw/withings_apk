package com.withings.liveworkout.model;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.core.y1;
import com.withings.comm.wpp.generated.object.PauseState;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.y;
/* compiled from: LiveWorkout.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0086\b\u0018\u0000 I2\u00020\u0001:\u0001JBg\u0012\u0006\u0010&\u001a\u00020\u0012\u0012\u0006\u0010'\u001a\u00020\u0015\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\b\b\u0002\u0010*\u001a\u00020\u000b\u0012\b\b\u0002\u0010+\u001a\u00020\u0012\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010 \u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0#¢\u0006\u0004\bG\u0010HJ\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u0007J#\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0007J\u0010\u0010\u001b\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0#HÆ\u0003¢\u0006\u0004\b$\u0010%Jv\u0010/\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00152\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u00122\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010-\u001a\u0004\u0018\u00010 2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0#HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b1\u0010\u001cJ\u0010\u00102\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b2\u0010\u0014J\u001a\u00105\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010&\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b&\u00107\u001a\u0004\b8\u0010\u0014R\u0017\u0010'\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b'\u00109\u001a\u0004\b:\u0010\u0017R\u0019\u0010(\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b(\u0010;\u001a\u0004\b<\u0010\u0019R\u0017\u0010)\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b)\u0010=\u001a\u0004\b)\u0010\u0007R\u0017\u0010*\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010>\u001a\u0004\b?\u0010\u001cR\u0017\u0010+\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b+\u00107\u001a\u0004\b@\u0010\u0014R\u0019\u0010,\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b,\u0010A\u001a\u0004\bB\u0010\u001fR\u0019\u0010-\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b-\u0010C\u001a\u0004\bD\u0010\"R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0#8\u0006¢\u0006\f\n\u0004\b.\u0010E\u001a\u0004\bF\u0010%¨\u0006K"}, d2 = {"Lcom/withings/liveworkout/model/LiveWorkout;", "Ljava/io/Serializable;", "liveWorkout", "", "isSameWorkout", "(Lcom/withings/liveworkout/model/LiveWorkout;)Z", "isInAppWorkout", "()Z", "isInPause", "isResumed", "isWorkoutPauseEnabled", "", "uri", "Lkotlin/Function0;", "Lnm0/y;", "onComplete", "addPhoto", "(Ljava/lang/String;Lym0/a;)V", "", "component1", "()I", "", "component2", "()J", "component3", "()Ljava/lang/Long;", "component4", "component5", "()Ljava/lang/String;", "component6", "component7", "()Ljava/lang/Integer;", "Lcom/withings/comm/wpp/generated/object/PauseState;", "component8", "()Lcom/withings/comm/wpp/generated/object/PauseState;", "", "component9", "()Ljava/util/List;", "workoutCategoryId", "startDateMillis", "endDateMillis", "isActive", "deviceMacAddress", "deviceModelId", "deviceId", "pauseState", "cameraFileUris", "copy", "(IJLjava/lang/Long;ZLjava/lang/String;ILjava/lang/Integer;Lcom/withings/comm/wpp/generated/object/PauseState;Ljava/util/List;)Lcom/withings/liveworkout/model/LiveWorkout;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getWorkoutCategoryId", "J", "getStartDateMillis", "Ljava/lang/Long;", "getEndDateMillis", "Z", "Ljava/lang/String;", "getDeviceMacAddress", "getDeviceModelId", "Ljava/lang/Integer;", "getDeviceId", "Lcom/withings/comm/wpp/generated/object/PauseState;", "getPauseState", "Ljava/util/List;", "getCameraFileUris", "<init>", "(IJLjava/lang/Long;ZLjava/lang/String;ILjava/lang/Integer;Lcom/withings/comm/wpp/generated/object/PauseState;Ljava/util/List;)V", "Companion", "a", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LiveWorkout implements Serializable {
    public static final a Companion = new Object();
    public static final String PHONE_MAC_ADDRESS = "00:00:00:00:00:00";
    public static final int PHONE_MODEL_ID = 1053;
    private final List<String> cameraFileUris;
    private final Integer deviceId;
    private final String deviceMacAddress;
    private final int deviceModelId;
    private final Long endDateMillis;
    private final boolean isActive;
    private final PauseState pauseState;
    private final long startDateMillis;
    private final int workoutCategoryId;

    /* compiled from: LiveWorkout.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    public LiveWorkout(int i11, long j5, Long l5, boolean z5, String deviceMacAddress, int i12, Integer num, PauseState pauseState, List<String> cameraFileUris) {
        u.j(deviceMacAddress, "deviceMacAddress");
        u.j(cameraFileUris, "cameraFileUris");
        this.workoutCategoryId = i11;
        this.startDateMillis = j5;
        this.endDateMillis = l5;
        this.isActive = z5;
        this.deviceMacAddress = deviceMacAddress;
        this.deviceModelId = i12;
        this.deviceId = num;
        this.pauseState = pauseState;
        this.cameraFileUris = cameraFileUris;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveWorkout copy$default(LiveWorkout liveWorkout, int i11, long j5, Long l5, boolean z5, String str, int i12, Integer num, PauseState pauseState, List list, int i13, Object obj) {
        int i14;
        long j11;
        Long l6;
        boolean z11;
        String str2;
        int i15;
        Integer num2;
        PauseState pauseState2;
        List<String> list2;
        if ((i13 & 1) != 0) {
            i14 = liveWorkout.workoutCategoryId;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            j11 = liveWorkout.startDateMillis;
        } else {
            j11 = j5;
        }
        if ((i13 & 4) != 0) {
            l6 = liveWorkout.endDateMillis;
        } else {
            l6 = l5;
        }
        if ((i13 & 8) != 0) {
            z11 = liveWorkout.isActive;
        } else {
            z11 = z5;
        }
        if ((i13 & 16) != 0) {
            str2 = liveWorkout.deviceMacAddress;
        } else {
            str2 = str;
        }
        if ((i13 & 32) != 0) {
            i15 = liveWorkout.deviceModelId;
        } else {
            i15 = i12;
        }
        if ((i13 & 64) != 0) {
            num2 = liveWorkout.deviceId;
        } else {
            num2 = num;
        }
        if ((i13 & 128) != 0) {
            pauseState2 = liveWorkout.pauseState;
        } else {
            pauseState2 = pauseState;
        }
        if ((i13 & 256) != 0) {
            list2 = liveWorkout.cameraFileUris;
        } else {
            list2 = list;
        }
        return liveWorkout.copy(i14, j11, l6, z11, str2, i15, num2, pauseState2, list2);
    }

    public final void addPhoto(String uri, ym0.a<y> onComplete) {
        String str;
        u.j(uri, "uri");
        u.j(onComplete, "onComplete");
        if (!this.cameraFileUris.contains(uri)) {
            str = uri;
        } else {
            str = null;
        }
        if (str != null) {
            this.cameraFileUris.add(uri);
            onComplete.invoke();
        }
    }

    public final int component1() {
        return this.workoutCategoryId;
    }

    public final long component2() {
        return this.startDateMillis;
    }

    public final Long component3() {
        return this.endDateMillis;
    }

    public final boolean component4() {
        return this.isActive;
    }

    public final String component5() {
        return this.deviceMacAddress;
    }

    public final int component6() {
        return this.deviceModelId;
    }

    public final Integer component7() {
        return this.deviceId;
    }

    public final PauseState component8() {
        return this.pauseState;
    }

    public final List<String> component9() {
        return this.cameraFileUris;
    }

    public final LiveWorkout copy(int i11, long j5, Long l5, boolean z5, String deviceMacAddress, int i12, Integer num, PauseState pauseState, List<String> cameraFileUris) {
        u.j(deviceMacAddress, "deviceMacAddress");
        u.j(cameraFileUris, "cameraFileUris");
        return new LiveWorkout(i11, j5, l5, z5, deviceMacAddress, i12, num, pauseState, cameraFileUris);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveWorkout)) {
            return false;
        }
        LiveWorkout liveWorkout = (LiveWorkout) obj;
        if (this.workoutCategoryId == liveWorkout.workoutCategoryId && this.startDateMillis == liveWorkout.startDateMillis && u.e(this.endDateMillis, liveWorkout.endDateMillis) && this.isActive == liveWorkout.isActive && u.e(this.deviceMacAddress, liveWorkout.deviceMacAddress) && this.deviceModelId == liveWorkout.deviceModelId && u.e(this.deviceId, liveWorkout.deviceId) && u.e(this.pauseState, liveWorkout.pauseState) && u.e(this.cameraFileUris, liveWorkout.cameraFileUris)) {
            return true;
        }
        return false;
    }

    public final List<String> getCameraFileUris() {
        return this.cameraFileUris;
    }

    public final Integer getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceMacAddress() {
        return this.deviceMacAddress;
    }

    public final int getDeviceModelId() {
        return this.deviceModelId;
    }

    public final Long getEndDateMillis() {
        return this.endDateMillis;
    }

    public final PauseState getPauseState() {
        return this.pauseState;
    }

    public final long getStartDateMillis() {
        return this.startDateMillis;
    }

    public final int getWorkoutCategoryId() {
        return this.workoutCategoryId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int a11 = c.a(this.startDateMillis, Integer.hashCode(this.workoutCategoryId) * 31, 31);
        Long l5 = this.endDateMillis;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int a12 = h.a(this.deviceModelId, d.c(this.deviceMacAddress, y1.a(this.isActive, (a11 + hashCode) * 31, 31), 31), 31);
        Integer num = this.deviceId;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i12 = (a12 + hashCode2) * 31;
        PauseState pauseState = this.pauseState;
        if (pauseState != null) {
            i11 = pauseState.hashCode();
        }
        return this.cameraFileUris.hashCode() + ((i12 + i11) * 31);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isInAppWorkout() {
        if (u.e(this.deviceMacAddress, PHONE_MAC_ADDRESS) && this.deviceModelId == 1053) {
            return true;
        }
        return false;
    }

    public final boolean isInPause() {
        PauseState pauseState = this.pauseState;
        if (pauseState == null || pauseState.startTime == 0) {
            return false;
        }
        return true;
    }

    public final boolean isResumed() {
        PauseState pauseState = this.pauseState;
        if (pauseState == null || pauseState.startTime != 0) {
            return false;
        }
        return true;
    }

    public final boolean isSameWorkout(LiveWorkout liveWorkout) {
        u.j(liveWorkout, "liveWorkout");
        if (u.e(liveWorkout.deviceMacAddress, this.deviceMacAddress) && liveWorkout.workoutCategoryId == this.workoutCategoryId && liveWorkout.startDateMillis == this.startDateMillis) {
            return true;
        }
        return false;
    }

    public final boolean isWorkoutPauseEnabled() {
        if (this.pauseState != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i11 = this.workoutCategoryId;
        long j5 = this.startDateMillis;
        Long l5 = this.endDateMillis;
        boolean z5 = this.isActive;
        String str = this.deviceMacAddress;
        int i12 = this.deviceModelId;
        Integer num = this.deviceId;
        PauseState pauseState = this.pauseState;
        List<String> list = this.cameraFileUris;
        return "LiveWorkout(workoutCategoryId=" + i11 + ", startDateMillis=" + j5 + ", endDateMillis=" + l5 + ", isActive=" + z5 + ", deviceMacAddress=" + str + ", deviceModelId=" + i12 + ", deviceId=" + num + ", pauseState=" + pauseState + ", cameraFileUris=" + list + ")";
    }

    public /* synthetic */ LiveWorkout(int i11, long j5, Long l5, boolean z5, String str, int i12, Integer num, PauseState pauseState, List list, int i13, m mVar) {
        this(i11, j5, (i13 & 4) != 0 ? null : l5, z5, (i13 & 16) != 0 ? PHONE_MAC_ADDRESS : str, (i13 & 32) != 0 ? 1053 : i12, (i13 & 64) != 0 ? null : num, (i13 & 128) != 0 ? null : pauseState, (i13 & 256) != 0 ? new ArrayList() : list);
    }
}
