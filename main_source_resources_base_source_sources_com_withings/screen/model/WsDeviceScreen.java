package com.withings.screen.model;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.core.y1;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsDeviceScreen.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bB\b\u0086\b\u0018\u00002\u00020\u0001Bë\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0018j\b\u0012\u0004\u0012\u00020\t`\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r\u0018\u00010\r¢\u0006\u0002\u0010\u001fJ\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0019\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0018j\b\u0012\u0004\u0012\u00020\t`\u0019HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010I\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\u0017\u0010M\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r\u0018\u00010\rHÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010P\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010Q\u001a\u00020\u000bHÆ\u0003J\u0011\u0010R\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0013\u0010T\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\rHÆ\u0003J\u009c\u0002\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0018j\b\u0012\u0004\u0012\u00020\t`\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010VJ\u0013\u0010W\u001a\u00020\u000b2\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Y\u001a\u00020\u0005HÖ\u0001J\t\u0010Z\u001a\u00020\tHÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R&\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0018j\b\u0012\u0004\u0012\u00020\t`\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b,\u0010'R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b-\u0010'R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b1\u0010'R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b2\u0010/R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001b\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b:\u0010/R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R$\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u0010<R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b?\u0010/R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00107¨\u0006["}, d2 = {"Lcom/withings/screen/model/WsDeviceScreen;", "", "wsId", "", "source", "", "rank", "embeddedId", "name", "", "active", "", "contents", "", "Lcom/withings/screen/model/WsDeviceScreenContent;", HealthUserProfile.USER_PROFILE_KEY_IMAGE, "Lcom/withings/screen/model/WsDeviceScreenImage;", "images", "modified", "startDate", "endDate", "deactivableStatus", "parentId", "appDependencies", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "fixedPosition", "defaultActive", "defaultRank", "group", "requiredActivatedFeatureIds", "(JIILjava/lang/Integer;Ljava/lang/String;ZLjava/util/List;Lcom/withings/screen/model/WsDeviceScreenImage;Ljava/util/List;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;)V", "getActive", "()Z", "getAppDependencies", "()Ljava/util/ArrayList;", "getContents", "()Ljava/util/List;", "getDeactivableStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDefaultActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDefaultRank", "getEmbeddedId", "getEndDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFixedPosition", "getGroup", "getImage", "()Lcom/withings/screen/model/WsDeviceScreenImage;", "getImages", "getModified", "()J", "getName", "()Ljava/lang/String;", "getParentId", "getRank", "()I", "getRequiredActivatedFeatureIds", "getSource", "getStartDate", "getWsId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JIILjava/lang/Integer;Ljava/lang/String;ZLjava/util/List;Lcom/withings/screen/model/WsDeviceScreenImage;Ljava/util/List;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;)Lcom/withings/screen/model/WsDeviceScreen;", "equals", "other", "hashCode", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsDeviceScreen {
    private final boolean active;
    @SerializedName("app_dependencies")
    private final ArrayList<String> appDependencies;
    private final List<WsDeviceScreenContent> contents;
    @SerializedName("deactivable_status")
    private final Integer deactivableStatus;
    @SerializedName("default_active")
    private final Boolean defaultActive;
    @SerializedName("default_rank")
    private final Integer defaultRank;
    @SerializedName("embeddedid")
    private final Integer embeddedId;
    @SerializedName("enddate")
    private final Long endDate;
    @SerializedName("fixed_position")
    private final Integer fixedPosition;
    @SerializedName("group")
    private final Long group;
    private final WsDeviceScreenImage image;
    private final List<WsDeviceScreenImage> images;
    private final long modified;
    private final String name;
    @SerializedName("parent_screen_id")
    private final Long parentId;
    private final int rank;
    @SerializedName("required_activated_featureids")
    private final List<List<Integer>> requiredActivatedFeatureIds;
    private final int source;
    @SerializedName("startdate")
    private final Long startDate;
    @SerializedName("id")
    private final long wsId;

    /* JADX WARN: Multi-variable type inference failed */
    public WsDeviceScreen(long j5, int i11, int i12, Integer num, String str, boolean z5, List<WsDeviceScreenContent> list, WsDeviceScreenImage wsDeviceScreenImage, List<WsDeviceScreenImage> list2, long j11, Long l5, Long l6, Integer num2, Long l11, ArrayList<String> appDependencies, Integer num3, Boolean bool, Integer num4, Long l12, List<? extends List<Integer>> list3) {
        u.j(appDependencies, "appDependencies");
        this.wsId = j5;
        this.source = i11;
        this.rank = i12;
        this.embeddedId = num;
        this.name = str;
        this.active = z5;
        this.contents = list;
        this.image = wsDeviceScreenImage;
        this.images = list2;
        this.modified = j11;
        this.startDate = l5;
        this.endDate = l6;
        this.deactivableStatus = num2;
        this.parentId = l11;
        this.appDependencies = appDependencies;
        this.fixedPosition = num3;
        this.defaultActive = bool;
        this.defaultRank = num4;
        this.group = l12;
        this.requiredActivatedFeatureIds = list3;
    }

    public final long component1() {
        return this.wsId;
    }

    public final long component10() {
        return this.modified;
    }

    public final Long component11() {
        return this.startDate;
    }

    public final Long component12() {
        return this.endDate;
    }

    public final Integer component13() {
        return this.deactivableStatus;
    }

    public final Long component14() {
        return this.parentId;
    }

    public final ArrayList<String> component15() {
        return this.appDependencies;
    }

    public final Integer component16() {
        return this.fixedPosition;
    }

    public final Boolean component17() {
        return this.defaultActive;
    }

    public final Integer component18() {
        return this.defaultRank;
    }

    public final Long component19() {
        return this.group;
    }

    public final int component2() {
        return this.source;
    }

    public final List<List<Integer>> component20() {
        return this.requiredActivatedFeatureIds;
    }

    public final int component3() {
        return this.rank;
    }

    public final Integer component4() {
        return this.embeddedId;
    }

    public final String component5() {
        return this.name;
    }

    public final boolean component6() {
        return this.active;
    }

    public final List<WsDeviceScreenContent> component7() {
        return this.contents;
    }

    public final WsDeviceScreenImage component8() {
        return this.image;
    }

    public final List<WsDeviceScreenImage> component9() {
        return this.images;
    }

    public final WsDeviceScreen copy(long j5, int i11, int i12, Integer num, String str, boolean z5, List<WsDeviceScreenContent> list, WsDeviceScreenImage wsDeviceScreenImage, List<WsDeviceScreenImage> list2, long j11, Long l5, Long l6, Integer num2, Long l11, ArrayList<String> appDependencies, Integer num3, Boolean bool, Integer num4, Long l12, List<? extends List<Integer>> list3) {
        u.j(appDependencies, "appDependencies");
        return new WsDeviceScreen(j5, i11, i12, num, str, z5, list, wsDeviceScreenImage, list2, j11, l5, l6, num2, l11, appDependencies, num3, bool, num4, l12, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsDeviceScreen)) {
            return false;
        }
        WsDeviceScreen wsDeviceScreen = (WsDeviceScreen) obj;
        if (this.wsId == wsDeviceScreen.wsId && this.source == wsDeviceScreen.source && this.rank == wsDeviceScreen.rank && u.e(this.embeddedId, wsDeviceScreen.embeddedId) && u.e(this.name, wsDeviceScreen.name) && this.active == wsDeviceScreen.active && u.e(this.contents, wsDeviceScreen.contents) && u.e(this.image, wsDeviceScreen.image) && u.e(this.images, wsDeviceScreen.images) && this.modified == wsDeviceScreen.modified && u.e(this.startDate, wsDeviceScreen.startDate) && u.e(this.endDate, wsDeviceScreen.endDate) && u.e(this.deactivableStatus, wsDeviceScreen.deactivableStatus) && u.e(this.parentId, wsDeviceScreen.parentId) && u.e(this.appDependencies, wsDeviceScreen.appDependencies) && u.e(this.fixedPosition, wsDeviceScreen.fixedPosition) && u.e(this.defaultActive, wsDeviceScreen.defaultActive) && u.e(this.defaultRank, wsDeviceScreen.defaultRank) && u.e(this.group, wsDeviceScreen.group) && u.e(this.requiredActivatedFeatureIds, wsDeviceScreen.requiredActivatedFeatureIds)) {
            return true;
        }
        return false;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final ArrayList<String> getAppDependencies() {
        return this.appDependencies;
    }

    public final List<WsDeviceScreenContent> getContents() {
        return this.contents;
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

    public final WsDeviceScreenImage getImage() {
        return this.image;
    }

    public final List<WsDeviceScreenImage> getImages() {
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

    public final int getRank() {
        return this.rank;
    }

    public final List<List<Integer>> getRequiredActivatedFeatureIds() {
        return this.requiredActivatedFeatureIds;
    }

    public final int getSource() {
        return this.source;
    }

    public final Long getStartDate() {
        return this.startDate;
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
        int hashCode12;
        int hashCode13;
        int a11 = h.a(this.rank, h.a(this.source, Long.hashCode(this.wsId) * 31, 31), 31);
        Integer num = this.embeddedId;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        String str = this.name;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int a12 = y1.a(this.active, (i12 + hashCode2) * 31, 31);
        List<WsDeviceScreenContent> list = this.contents;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i13 = (a12 + hashCode3) * 31;
        WsDeviceScreenImage wsDeviceScreenImage = this.image;
        if (wsDeviceScreenImage == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = wsDeviceScreenImage.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        List<WsDeviceScreenImage> list2 = this.images;
        if (list2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list2.hashCode();
        }
        int a13 = c.a(this.modified, (i14 + hashCode5) * 31, 31);
        Long l5 = this.startDate;
        if (l5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l5.hashCode();
        }
        int i15 = (a13 + hashCode6) * 31;
        Long l6 = this.endDate;
        if (l6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l6.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        Integer num2 = this.deactivableStatus;
        if (num2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num2.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        Long l11 = this.parentId;
        if (l11 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = l11.hashCode();
        }
        int hashCode14 = (this.appDependencies.hashCode() + ((i17 + hashCode9) * 31)) * 31;
        Integer num3 = this.fixedPosition;
        if (num3 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num3.hashCode();
        }
        int i18 = (hashCode14 + hashCode10) * 31;
        Boolean bool = this.defaultActive;
        if (bool == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = bool.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        Integer num4 = this.defaultRank;
        if (num4 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = num4.hashCode();
        }
        int i21 = (i19 + hashCode12) * 31;
        Long l12 = this.group;
        if (l12 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = l12.hashCode();
        }
        int i22 = (i21 + hashCode13) * 31;
        List<List<Integer>> list3 = this.requiredActivatedFeatureIds;
        if (list3 != null) {
            i11 = list3.hashCode();
        }
        return i22 + i11;
    }

    public String toString() {
        long j5 = this.wsId;
        int i11 = this.source;
        int i12 = this.rank;
        Integer num = this.embeddedId;
        String str = this.name;
        boolean z5 = this.active;
        List<WsDeviceScreenContent> list = this.contents;
        WsDeviceScreenImage wsDeviceScreenImage = this.image;
        List<WsDeviceScreenImage> list2 = this.images;
        long j11 = this.modified;
        Long l5 = this.startDate;
        Long l6 = this.endDate;
        Integer num2 = this.deactivableStatus;
        Long l11 = this.parentId;
        ArrayList<String> arrayList = this.appDependencies;
        Integer num3 = this.fixedPosition;
        Boolean bool = this.defaultActive;
        Integer num4 = this.defaultRank;
        Long l12 = this.group;
        List<List<Integer>> list3 = this.requiredActivatedFeatureIds;
        return "WsDeviceScreen(wsId=" + j5 + ", source=" + i11 + ", rank=" + i12 + ", embeddedId=" + num + ", name=" + str + ", active=" + z5 + ", contents=" + list + ", image=" + wsDeviceScreenImage + ", images=" + list2 + ", modified=" + j11 + ", startDate=" + l5 + ", endDate=" + l6 + ", deactivableStatus=" + num2 + ", parentId=" + l11 + ", appDependencies=" + arrayList + ", fixedPosition=" + num3 + ", defaultActive=" + bool + ", defaultRank=" + num4 + ", group=" + l12 + ", requiredActivatedFeatureIds=" + list3 + ")";
    }
}
