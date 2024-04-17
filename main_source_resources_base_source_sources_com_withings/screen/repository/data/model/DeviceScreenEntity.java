package com.withings.screen.repository.data.model;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.core.v;
import androidx.camera.core.y1;
import androidx.work.impl.g;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: DeviceScreenEntity.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bw\b\u0087\b\u0018\u0000 \u0088\u00012\u00020\u0001:\u0002\u0088\u0001B¯\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0003\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e\u0018\u00010\u000e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010!J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\nHÆ\u0003J\t\u0010k\u001a\u00020\u0012HÆ\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010EJ\t\u0010n\u001a\u00020\u0006HÆ\u0003J\t\u0010o\u001a\u00020\u0012HÆ\u0003J\t\u0010p\u001a\u00020\u0012HÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010EJ\u0010\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010EJ\t\u0010t\u001a\u00020\u0003HÆ\u0003J\u000f\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eHÆ\u0003J\u0010\u0010v\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010w\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010EJ\u0017\u0010y\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e\u0018\u00010\u000eHÆ\u0003J\u0010\u0010z\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010+J\t\u0010{\u001a\u00020\u0006HÆ\u0003J\t\u0010|\u001a\u00020\u0003HÆ\u0003J\t\u0010}\u001a\u00020\u0003HÆ\u0003J\t\u0010~\u001a\u00020\nHÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0012\u0010\u0080\u0001\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eHÆ\u0003J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010+Jº\u0002\u0010\u0082\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e\u0018\u00010\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0003\u0010\u0083\u0001J\u0015\u0010\u0084\u0001\u001a\u00020\u00122\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0086\u0001\u001a\u00020\nHÖ\u0001J\n\u0010\u0087\u0001\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b4\u0010+\"\u0004\b5\u0010-R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010\u0015\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010\u0010\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\bB\u0010+\"\u0004\bC\u0010-R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010H\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010 \u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\bI\u0010+\"\u0004\bJ\u0010-R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010H\u001a\u0004\bK\u0010E\"\u0004\bL\u0010GR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u00107\"\u0004\bN\u00109R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010'\"\u0004\bT\u0010)R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u00107\"\u0004\bV\u00109R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010;\"\u0004\bX\u0010=R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010H\u001a\u0004\bY\u0010E\"\u0004\bZ\u0010GR(\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010'\"\u0004\b\\\u0010)R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010?\"\u0004\b^\u0010AR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010H\u001a\u0004\b_\u0010E\"\u0004\b`\u0010GR\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010#\"\u0004\bb\u0010%R\u001a\u0010\u0016\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010#\"\u0004\bd\u0010%R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u00107\"\u0004\bf\u00109R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u00107\"\u0004\bh\u00109¨\u0006\u0089\u0001"}, d2 = {"Lcom/withings/screen/repository/data/model/DeviceScreenEntity;", "", "id", "", "wsId", "name", "", "deviceId", NavigationArguments.USER_ID, "screenSource", "", HealthUserProfile.USER_PROFILE_KEY_IMAGE, "Lcom/withings/screen/repository/data/model/DeviceScreenEntityImage;", "images", "", "embeddedId", "displayOrder", "active", "", "deactivableStatus", "parentId", "displayContext", "syncedWithWS", "syncedWithDevice", "modified", "startDate", "endDate", "appDependencies", "defaultActive", "defaultRank", "group", "requiredFeatureIds", "fixedPosition", "(JJLjava/lang/String;JJILcom/withings/screen/repository/data/model/DeviceScreenEntityImage;Ljava/util/List;Ljava/lang/Integer;IZLjava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;ZZJLjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;)V", "getActive", "()Z", "setActive", "(Z)V", "getAppDependencies", "()Ljava/util/List;", "setAppDependencies", "(Ljava/util/List;)V", "getDeactivableStatus", "()Ljava/lang/Integer;", "setDeactivableStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDefaultActive", "()Ljava/lang/Boolean;", "setDefaultActive", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getDefaultRank", "setDefaultRank", "getDeviceId", "()J", "setDeviceId", "(J)V", "getDisplayContext", "()Ljava/lang/String;", "setDisplayContext", "(Ljava/lang/String;)V", "getDisplayOrder", "()I", "setDisplayOrder", "(I)V", "getEmbeddedId", "setEmbeddedId", "getEndDate", "()Ljava/lang/Long;", "setEndDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getFixedPosition", "setFixedPosition", "getGroup", "setGroup", "getId", "setId", "getImage", "()Lcom/withings/screen/repository/data/model/DeviceScreenEntityImage;", "setImage", "(Lcom/withings/screen/repository/data/model/DeviceScreenEntityImage;)V", "getImages", "setImages", "getModified", "setModified", "getName", "setName", "getParentId", "setParentId", "getRequiredFeatureIds", "setRequiredFeatureIds", "getScreenSource", "setScreenSource", "getStartDate", "setStartDate", "getSyncedWithDevice", "setSyncedWithDevice", "getSyncedWithWS", "setSyncedWithWS", "getUserId", "setUserId", "getWsId", "setWsId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJLjava/lang/String;JJILcom/withings/screen/repository/data/model/DeviceScreenEntityImage;Ljava/util/List;Ljava/lang/Integer;IZLjava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;ZZJLjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;)Lcom/withings/screen/repository/data/model/DeviceScreenEntity;", "equals", "other", "hashCode", "toString", "Companion", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceScreenEntity {
    public static final long ALL_TIME_SCREEN_USER_ID = 0;
    public static final Companion Companion = new Companion(null);
    private boolean active;
    private List<String> appDependencies;
    private Integer deactivableStatus;
    private Boolean defaultActive;
    private Integer defaultRank;
    private long deviceId;
    private String displayContext;
    private int displayOrder;
    private Integer embeddedId;
    private Long endDate;
    private Integer fixedPosition;
    private Long group;

    /* renamed from: id  reason: collision with root package name */
    private long f43965id;
    private DeviceScreenEntityImage image;
    private List<DeviceScreenEntityImage> images;
    private long modified;
    private String name;
    private Long parentId;
    private List<? extends List<Integer>> requiredFeatureIds;
    private int screenSource;
    private Long startDate;
    private boolean syncedWithDevice;
    private boolean syncedWithWS;
    private long userId;
    private long wsId;

    /* compiled from: DeviceScreenEntity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/screen/repository/data/model/DeviceScreenEntity$Companion;", "", "()V", "ALL_TIME_SCREEN_USER_ID", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public DeviceScreenEntity() {
        this(0L, 0L, null, 0L, 0L, 0, null, null, null, 0, false, null, null, null, false, false, 0L, null, null, null, null, null, null, null, null, 33554431, null);
    }

    public final long component1() {
        return this.f43965id;
    }

    public final int component10() {
        return this.displayOrder;
    }

    public final boolean component11() {
        return this.active;
    }

    public final Integer component12() {
        return this.deactivableStatus;
    }

    public final Long component13() {
        return this.parentId;
    }

    public final String component14() {
        return this.displayContext;
    }

    public final boolean component15() {
        return this.syncedWithWS;
    }

    public final boolean component16() {
        return this.syncedWithDevice;
    }

    public final long component17() {
        return this.modified;
    }

    public final Long component18() {
        return this.startDate;
    }

    public final Long component19() {
        return this.endDate;
    }

    public final long component2() {
        return this.wsId;
    }

    public final List<String> component20() {
        return this.appDependencies;
    }

    public final Boolean component21() {
        return this.defaultActive;
    }

    public final Integer component22() {
        return this.defaultRank;
    }

    public final Long component23() {
        return this.group;
    }

    public final List<List<Integer>> component24() {
        return this.requiredFeatureIds;
    }

    public final Integer component25() {
        return this.fixedPosition;
    }

    public final String component3() {
        return this.name;
    }

    public final long component4() {
        return this.deviceId;
    }

    public final long component5() {
        return this.userId;
    }

    public final int component6() {
        return this.screenSource;
    }

    public final DeviceScreenEntityImage component7() {
        return this.image;
    }

    public final List<DeviceScreenEntityImage> component8() {
        return this.images;
    }

    public final Integer component9() {
        return this.embeddedId;
    }

    public final DeviceScreenEntity copy(long j5, long j11, String name, long j12, long j13, int i11, DeviceScreenEntityImage deviceScreenEntityImage, List<DeviceScreenEntityImage> list, Integer num, int i12, boolean z5, Integer num2, Long l5, String displayContext, boolean z11, boolean z12, long j14, Long l6, Long l11, List<String> appDependencies, Boolean bool, Integer num3, Long l12, List<? extends List<Integer>> list2, Integer num4) {
        u.j(name, "name");
        u.j(displayContext, "displayContext");
        u.j(appDependencies, "appDependencies");
        return new DeviceScreenEntity(j5, j11, name, j12, j13, i11, deviceScreenEntityImage, list, num, i12, z5, num2, l5, displayContext, z11, z12, j14, l6, l11, appDependencies, bool, num3, l12, list2, num4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceScreenEntity)) {
            return false;
        }
        DeviceScreenEntity deviceScreenEntity = (DeviceScreenEntity) obj;
        if (this.f43965id == deviceScreenEntity.f43965id && this.wsId == deviceScreenEntity.wsId && u.e(this.name, deviceScreenEntity.name) && this.deviceId == deviceScreenEntity.deviceId && this.userId == deviceScreenEntity.userId && this.screenSource == deviceScreenEntity.screenSource && u.e(this.image, deviceScreenEntity.image) && u.e(this.images, deviceScreenEntity.images) && u.e(this.embeddedId, deviceScreenEntity.embeddedId) && this.displayOrder == deviceScreenEntity.displayOrder && this.active == deviceScreenEntity.active && u.e(this.deactivableStatus, deviceScreenEntity.deactivableStatus) && u.e(this.parentId, deviceScreenEntity.parentId) && u.e(this.displayContext, deviceScreenEntity.displayContext) && this.syncedWithWS == deviceScreenEntity.syncedWithWS && this.syncedWithDevice == deviceScreenEntity.syncedWithDevice && this.modified == deviceScreenEntity.modified && u.e(this.startDate, deviceScreenEntity.startDate) && u.e(this.endDate, deviceScreenEntity.endDate) && u.e(this.appDependencies, deviceScreenEntity.appDependencies) && u.e(this.defaultActive, deviceScreenEntity.defaultActive) && u.e(this.defaultRank, deviceScreenEntity.defaultRank) && u.e(this.group, deviceScreenEntity.group) && u.e(this.requiredFeatureIds, deviceScreenEntity.requiredFeatureIds) && u.e(this.fixedPosition, deviceScreenEntity.fixedPosition)) {
            return true;
        }
        return false;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final List<String> getAppDependencies() {
        return this.appDependencies;
    }

    public final Integer getDeactivableStatus() {
        return this.deactivableStatus;
    }

    public final Boolean getDefaultActive() {
        return this.defaultActive;
    }

    public final Integer getDefaultRank() {
        return this.defaultRank;
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    public final String getDisplayContext() {
        return this.displayContext;
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    public final Integer getEmbeddedId() {
        return this.embeddedId;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final Integer getFixedPosition() {
        return this.fixedPosition;
    }

    public final Long getGroup() {
        return this.group;
    }

    public final long getId() {
        return this.f43965id;
    }

    public final DeviceScreenEntityImage getImage() {
        return this.image;
    }

    public final List<DeviceScreenEntityImage> getImages() {
        return this.images;
    }

    public final long getModified() {
        return this.modified;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getParentId() {
        return this.parentId;
    }

    public final List<List<Integer>> getRequiredFeatureIds() {
        return this.requiredFeatureIds;
    }

    public final int getScreenSource() {
        return this.screenSource;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public final boolean getSyncedWithDevice() {
        return this.syncedWithDevice;
    }

    public final boolean getSyncedWithWS() {
        return this.syncedWithWS;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final long getWsId() {
        return this.wsId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int a11 = h.a(this.screenSource, c.a(this.userId, c.a(this.deviceId, d.c(this.name, c.a(this.wsId, Long.hashCode(this.f43965id) * 31, 31), 31), 31), 31), 31);
        DeviceScreenEntityImage deviceScreenEntityImage = this.image;
        int i11 = 0;
        if (deviceScreenEntityImage == null) {
            hashCode = 0;
        } else {
            hashCode = deviceScreenEntityImage.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        List<DeviceScreenEntityImage> list = this.images;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Integer num = this.embeddedId;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int a12 = y1.a(this.active, h.a(this.displayOrder, (i13 + hashCode3) * 31, 31), 31);
        Integer num2 = this.deactivableStatus;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i14 = (a12 + hashCode4) * 31;
        Long l5 = this.parentId;
        if (l5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l5.hashCode();
        }
        int a13 = c.a(this.modified, y1.a(this.syncedWithDevice, y1.a(this.syncedWithWS, d.c(this.displayContext, (i14 + hashCode5) * 31, 31), 31), 31), 31);
        Long l6 = this.startDate;
        if (l6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l6.hashCode();
        }
        int i15 = (a13 + hashCode6) * 31;
        Long l11 = this.endDate;
        if (l11 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l11.hashCode();
        }
        int b10 = e.b(this.appDependencies, (i15 + hashCode7) * 31, 31);
        Boolean bool = this.defaultActive;
        if (bool == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool.hashCode();
        }
        int i16 = (b10 + hashCode8) * 31;
        Integer num3 = this.defaultRank;
        if (num3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num3.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        Long l12 = this.group;
        if (l12 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = l12.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        List<? extends List<Integer>> list2 = this.requiredFeatureIds;
        if (list2 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = list2.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        Integer num4 = this.fixedPosition;
        if (num4 != null) {
            i11 = num4.hashCode();
        }
        return i19 + i11;
    }

    public final void setActive(boolean z5) {
        this.active = z5;
    }

    public final void setAppDependencies(List<String> list) {
        u.j(list, "<set-?>");
        this.appDependencies = list;
    }

    public final void setDeactivableStatus(Integer num) {
        this.deactivableStatus = num;
    }

    public final void setDefaultActive(Boolean bool) {
        this.defaultActive = bool;
    }

    public final void setDefaultRank(Integer num) {
        this.defaultRank = num;
    }

    public final void setDeviceId(long j5) {
        this.deviceId = j5;
    }

    public final void setDisplayContext(String str) {
        u.j(str, "<set-?>");
        this.displayContext = str;
    }

    public final void setDisplayOrder(int i11) {
        this.displayOrder = i11;
    }

    public final void setEmbeddedId(Integer num) {
        this.embeddedId = num;
    }

    public final void setEndDate(Long l5) {
        this.endDate = l5;
    }

    public final void setFixedPosition(Integer num) {
        this.fixedPosition = num;
    }

    public final void setGroup(Long l5) {
        this.group = l5;
    }

    public final void setId(long j5) {
        this.f43965id = j5;
    }

    public final void setImage(DeviceScreenEntityImage deviceScreenEntityImage) {
        this.image = deviceScreenEntityImage;
    }

    public final void setImages(List<DeviceScreenEntityImage> list) {
        this.images = list;
    }

    public final void setModified(long j5) {
        this.modified = j5;
    }

    public final void setName(String str) {
        u.j(str, "<set-?>");
        this.name = str;
    }

    public final void setParentId(Long l5) {
        this.parentId = l5;
    }

    public final void setRequiredFeatureIds(List<? extends List<Integer>> list) {
        this.requiredFeatureIds = list;
    }

    public final void setScreenSource(int i11) {
        this.screenSource = i11;
    }

    public final void setStartDate(Long l5) {
        this.startDate = l5;
    }

    public final void setSyncedWithDevice(boolean z5) {
        this.syncedWithDevice = z5;
    }

    public final void setSyncedWithWS(boolean z5) {
        this.syncedWithWS = z5;
    }

    public final void setUserId(long j5) {
        this.userId = j5;
    }

    public final void setWsId(long j5) {
        this.wsId = j5;
    }

    public String toString() {
        long j5 = this.f43965id;
        long j11 = this.wsId;
        String str = this.name;
        long j12 = this.deviceId;
        long j13 = this.userId;
        int i11 = this.screenSource;
        DeviceScreenEntityImage deviceScreenEntityImage = this.image;
        List<DeviceScreenEntityImage> list = this.images;
        Integer num = this.embeddedId;
        int i12 = this.displayOrder;
        boolean z5 = this.active;
        Integer num2 = this.deactivableStatus;
        Long l5 = this.parentId;
        String str2 = this.displayContext;
        boolean z11 = this.syncedWithWS;
        boolean z12 = this.syncedWithDevice;
        long j14 = this.modified;
        Long l6 = this.startDate;
        Long l11 = this.endDate;
        List<String> list2 = this.appDependencies;
        Boolean bool = this.defaultActive;
        Integer num3 = this.defaultRank;
        Long l12 = this.group;
        List<? extends List<Integer>> list3 = this.requiredFeatureIds;
        Integer num4 = this.fixedPosition;
        StringBuilder e11 = v.e("DeviceScreenEntity(id=", j5, ", wsId=");
        e11.append(j11);
        e11.append(", name=");
        e11.append(str);
        g.d(e11, ", deviceId=", j12, ", userId=");
        e11.append(j13);
        e11.append(", screenSource=");
        e11.append(i11);
        e11.append(", image=");
        e11.append(deviceScreenEntityImage);
        e11.append(", images=");
        e11.append(list);
        e11.append(", embeddedId=");
        e11.append(num);
        e11.append(", displayOrder=");
        e11.append(i12);
        e11.append(", active=");
        e11.append(z5);
        e11.append(", deactivableStatus=");
        e11.append(num2);
        e11.append(", parentId=");
        e11.append(l5);
        e11.append(", displayContext=");
        e11.append(str2);
        e11.append(", syncedWithWS=");
        e11.append(z11);
        e11.append(", syncedWithDevice=");
        e11.append(z12);
        g.d(e11, ", modified=", j14, ", startDate=");
        e11.append(l6);
        e11.append(", endDate=");
        e11.append(l11);
        e11.append(", appDependencies=");
        e11.append(list2);
        e11.append(", defaultActive=");
        e11.append(bool);
        e11.append(", defaultRank=");
        e11.append(num3);
        e11.append(", group=");
        e11.append(l12);
        e11.append(", requiredFeatureIds=");
        e11.append(list3);
        e11.append(", fixedPosition=");
        e11.append(num4);
        e11.append(")");
        return e11.toString();
    }

    public DeviceScreenEntity(long j5, long j11, String name, long j12, long j13, int i11, DeviceScreenEntityImage deviceScreenEntityImage, List<DeviceScreenEntityImage> list, Integer num, int i12, boolean z5, Integer num2, Long l5, String displayContext, boolean z11, boolean z12, long j14, Long l6, Long l11, List<String> appDependencies, Boolean bool, Integer num3, Long l12, List<? extends List<Integer>> list2, Integer num4) {
        u.j(name, "name");
        u.j(displayContext, "displayContext");
        u.j(appDependencies, "appDependencies");
        this.f43965id = j5;
        this.wsId = j11;
        this.name = name;
        this.deviceId = j12;
        this.userId = j13;
        this.screenSource = i11;
        this.image = deviceScreenEntityImage;
        this.images = list;
        this.embeddedId = num;
        this.displayOrder = i12;
        this.active = z5;
        this.deactivableStatus = num2;
        this.parentId = l5;
        this.displayContext = displayContext;
        this.syncedWithWS = z11;
        this.syncedWithDevice = z12;
        this.modified = j14;
        this.startDate = l6;
        this.endDate = l11;
        this.appDependencies = appDependencies;
        this.defaultActive = bool;
        this.defaultRank = num3;
        this.group = l12;
        this.requiredFeatureIds = list2;
        this.fixedPosition = num4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DeviceScreenEntity(long r31, long r33, java.lang.String r35, long r36, long r38, int r40, com.withings.screen.repository.data.model.DeviceScreenEntityImage r41, java.util.List r42, java.lang.Integer r43, int r44, boolean r45, java.lang.Integer r46, java.lang.Long r47, java.lang.String r48, boolean r49, boolean r50, long r51, java.lang.Long r53, java.lang.Long r54, java.util.List r55, java.lang.Boolean r56, java.lang.Integer r57, java.lang.Long r58, java.util.List r59, java.lang.Integer r60, int r61, kotlin.jvm.internal.m r62) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.repository.data.model.DeviceScreenEntity.<init>(long, long, java.lang.String, long, long, int, com.withings.screen.repository.data.model.DeviceScreenEntityImage, java.util.List, java.lang.Integer, int, boolean, java.lang.Integer, java.lang.Long, java.lang.String, boolean, boolean, long, java.lang.Long, java.lang.Long, java.util.List, java.lang.Boolean, java.lang.Integer, java.lang.Long, java.util.List, java.lang.Integer, int, kotlin.jvm.internal.m):void");
    }
}
