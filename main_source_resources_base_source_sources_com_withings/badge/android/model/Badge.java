package com.withings.badge.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.c;
import androidx.appcompat.app.h;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.rudderstack.android.sdk.core.util.Utils;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import okhttp3.internal.http2.Http2;
import org.joda.time.DateTime;
/* compiled from: Badge.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001e\u001a\u00020\n\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010!\u001a\u00020\u0007\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\be\u0010fJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\tJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0013\u0010\fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0014\u0010\fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\fJ\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJÈ\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\n2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010!\u001a\u00020\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b-\u0010\fJ\u0010\u0010.\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b.\u0010\tJ\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b4\u0010\tJ \u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b9\u0010:R$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010;\u001a\u0004\b<\u0010\u0004\"\u0004\b=\u0010>R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010?\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010BR\"\u0010\u001d\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010C\u001a\u0004\bD\u0010\t\"\u0004\bE\u0010FR\"\u0010\u001e\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010G\u001a\u0004\bH\u0010\f\"\u0004\bI\u0010JR$\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010G\u001a\u0004\bK\u0010\f\"\u0004\bL\u0010JR$\u0010 \u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010G\u001a\u0004\bM\u0010\f\"\u0004\bN\u0010JR\"\u0010!\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010C\u001a\u0004\bO\u0010\t\"\u0004\bP\u0010FR$\u0010\"\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010G\u001a\u0004\bQ\u0010\f\"\u0004\bR\u0010JR$\u0010#\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010G\u001a\u0004\bS\u0010\f\"\u0004\bT\u0010JR$\u0010$\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010G\u001a\u0004\bU\u0010\f\"\u0004\bV\u0010JR$\u0010%\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010G\u001a\u0004\bW\u0010\f\"\u0004\bX\u0010JR$\u0010&\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010G\u001a\u0004\bY\u0010\f\"\u0004\bZ\u0010JR$\u0010'\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010G\u001a\u0004\b[\u0010\f\"\u0004\b\\\u0010JR$\u0010(\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010G\u001a\u0004\b]\u0010\f\"\u0004\b^\u0010JR$\u0010)\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010G\u001a\u0004\b_\u0010\f\"\u0004\b`\u0010JR$\u0010*\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010a\u001a\u0004\bb\u0010\u001a\"\u0004\bc\u0010d¨\u0006g"}, d2 = {"Lcom/withings/badge/android/model/Badge;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/Long;", "component2", "()J", "", "component3", "()I", "", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "Lorg/joda/time/DateTime;", "component16", "()Lorg/joda/time/DateTime;", "localId", NavigationArguments.USER_ID, "badgeType", "id", "title", "subTitle", "value", HealthConstants.FoodIntake.UNIT, "shortDesc", "longDesc", "learnMoreText", "learnMorePhoto", "message", "shareText", "date", "modified", "copy", "(Ljava/lang/Long;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)Lcom/withings/badge/android/model/Badge;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getLocalId", "setLocalId", "(Ljava/lang/Long;)V", "J", "getUserId", "setUserId", "(J)V", "I", "getBadgeType", "setBadgeType", "(I)V", "Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getSubTitle", "setSubTitle", "getValue", "setValue", "getUnit", "setUnit", "getShortDesc", "setShortDesc", "getLongDesc", "setLongDesc", "getLearnMoreText", "setLearnMoreText", "getLearnMorePhoto", "setLearnMorePhoto", "getMessage", "setMessage", "getShareText", "setShareText", "getDate", "setDate", "Lorg/joda/time/DateTime;", "getModified", "setModified", "(Lorg/joda/time/DateTime;)V", "<init>", "(Ljava/lang/Long;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class Badge implements Parcelable {
    public static final Parcelable.Creator<Badge> CREATOR = new Creator();
    private int badgeType;
    private String date;

    /* renamed from: id  reason: collision with root package name */
    private String f32714id;
    @SerializedName("url_lmphoto")
    private String learnMorePhoto;
    @SerializedName("url_lm")
    private String learnMoreText;
    private Long localId;
    @SerializedName("long_desc")
    private String longDesc;
    @SerializedName(RemoteMessageConst.MessageBody.MSG)
    private String message;
    private DateTime modified;
    @SerializedName("sharetext")
    private String shareText;
    @SerializedName("short_desc")
    private String shortDesc;
    @SerializedName("subtitle")
    private String subTitle;
    private String title;
    private String unit;
    private long userId;
    private int value;

    /* compiled from: Badge.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Badge> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Badge createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new Badge(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Badge[] newArray(int i11) {
            return new Badge[i11];
        }
    }

    public Badge() {
        this(null, 0L, 0, null, null, null, 0, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public static /* synthetic */ Badge copy$default(Badge badge, Long l5, long j5, int i11, String str, String str2, String str3, int i12, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, DateTime dateTime, int i13, Object obj) {
        Long l6;
        long j11;
        int i14;
        String str12;
        String str13;
        String str14;
        int i15;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        DateTime dateTime2;
        if ((i13 & 1) != 0) {
            l6 = badge.localId;
        } else {
            l6 = l5;
        }
        if ((i13 & 2) != 0) {
            j11 = badge.userId;
        } else {
            j11 = j5;
        }
        if ((i13 & 4) != 0) {
            i14 = badge.badgeType;
        } else {
            i14 = i11;
        }
        if ((i13 & 8) != 0) {
            str12 = badge.f32714id;
        } else {
            str12 = str;
        }
        if ((i13 & 16) != 0) {
            str13 = badge.title;
        } else {
            str13 = str2;
        }
        if ((i13 & 32) != 0) {
            str14 = badge.subTitle;
        } else {
            str14 = str3;
        }
        if ((i13 & 64) != 0) {
            i15 = badge.value;
        } else {
            i15 = i12;
        }
        if ((i13 & 128) != 0) {
            str15 = badge.unit;
        } else {
            str15 = str4;
        }
        if ((i13 & 256) != 0) {
            str16 = badge.shortDesc;
        } else {
            str16 = str5;
        }
        if ((i13 & 512) != 0) {
            str17 = badge.longDesc;
        } else {
            str17 = str6;
        }
        if ((i13 & 1024) != 0) {
            str18 = badge.learnMoreText;
        } else {
            str18 = str7;
        }
        if ((i13 & ModuleCopy.f28574b) != 0) {
            str19 = badge.learnMorePhoto;
        } else {
            str19 = str8;
        }
        if ((i13 & 4096) != 0) {
            str20 = badge.message;
        } else {
            str20 = str9;
        }
        String str23 = str20;
        if ((i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            str21 = badge.shareText;
        } else {
            str21 = str10;
        }
        String str24 = str21;
        if ((i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            str22 = badge.date;
        } else {
            str22 = str11;
        }
        if ((i13 & Utils.MAX_EVENT_SIZE) != 0) {
            dateTime2 = badge.modified;
        } else {
            dateTime2 = dateTime;
        }
        return badge.copy(l6, j11, i14, str12, str13, str14, i15, str15, str16, str17, str18, str19, str23, str24, str22, dateTime2);
    }

    public final Long component1() {
        return this.localId;
    }

    public final String component10() {
        return this.longDesc;
    }

    public final String component11() {
        return this.learnMoreText;
    }

    public final String component12() {
        return this.learnMorePhoto;
    }

    public final String component13() {
        return this.message;
    }

    public final String component14() {
        return this.shareText;
    }

    public final String component15() {
        return this.date;
    }

    public final DateTime component16() {
        return this.modified;
    }

    public final long component2() {
        return this.userId;
    }

    public final int component3() {
        return this.badgeType;
    }

    public final String component4() {
        return this.f32714id;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.subTitle;
    }

    public final int component7() {
        return this.value;
    }

    public final String component8() {
        return this.unit;
    }

    public final String component9() {
        return this.shortDesc;
    }

    public final Badge copy(Long l5, long j5, int i11, String id2, String str, String str2, int i12, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, DateTime dateTime) {
        u.j(id2, "id");
        return new Badge(l5, j5, i11, id2, str, str2, i12, str3, str4, str5, str6, str7, str8, str9, str10, dateTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        if (u.e(this.localId, badge.localId) && this.userId == badge.userId && this.badgeType == badge.badgeType && u.e(this.f32714id, badge.f32714id) && u.e(this.title, badge.title) && u.e(this.subTitle, badge.subTitle) && this.value == badge.value && u.e(this.unit, badge.unit) && u.e(this.shortDesc, badge.shortDesc) && u.e(this.longDesc, badge.longDesc) && u.e(this.learnMoreText, badge.learnMoreText) && u.e(this.learnMorePhoto, badge.learnMorePhoto) && u.e(this.message, badge.message) && u.e(this.shareText, badge.shareText) && u.e(this.date, badge.date) && u.e(this.modified, badge.modified)) {
            return true;
        }
        return false;
    }

    public final int getBadgeType() {
        return this.badgeType;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getId() {
        return this.f32714id;
    }

    public final String getLearnMorePhoto() {
        return this.learnMorePhoto;
    }

    public final String getLearnMoreText() {
        return this.learnMoreText;
    }

    public final Long getLocalId() {
        return this.localId;
    }

    public final String getLongDesc() {
        return this.longDesc;
    }

    public final String getMessage() {
        return this.message;
    }

    public final DateTime getModified() {
        return this.modified;
    }

    public final String getShareText() {
        return this.shareText;
    }

    public final String getShortDesc() {
        return this.shortDesc;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final int getValue() {
        return this.value;
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
        Long l5 = this.localId;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int c11 = d.c(this.f32714id, h.a(this.badgeType, c.a(this.userId, hashCode * 31, 31), 31), 31);
        String str = this.title;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (c11 + hashCode2) * 31;
        String str2 = this.subTitle;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int a11 = h.a(this.value, (i12 + hashCode3) * 31, 31);
        String str3 = this.unit;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i13 = (a11 + hashCode4) * 31;
        String str4 = this.shortDesc;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str5 = this.longDesc;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        String str6 = this.learnMoreText;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        String str7 = this.learnMorePhoto;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        String str8 = this.message;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i18 = (i17 + hashCode9) * 31;
        String str9 = this.shareText;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i19 = (i18 + hashCode10) * 31;
        String str10 = this.date;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i21 = (i19 + hashCode11) * 31;
        DateTime dateTime = this.modified;
        if (dateTime != null) {
            i11 = dateTime.hashCode();
        }
        return i21 + i11;
    }

    public final void setBadgeType(int i11) {
        this.badgeType = i11;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setId(String str) {
        u.j(str, "<set-?>");
        this.f32714id = str;
    }

    public final void setLearnMorePhoto(String str) {
        this.learnMorePhoto = str;
    }

    public final void setLearnMoreText(String str) {
        this.learnMoreText = str;
    }

    public final void setLocalId(Long l5) {
        this.localId = l5;
    }

    public final void setLongDesc(String str) {
        this.longDesc = str;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setModified(DateTime dateTime) {
        this.modified = dateTime;
    }

    public final void setShareText(String str) {
        this.shareText = str;
    }

    public final void setShortDesc(String str) {
        this.shortDesc = str;
    }

    public final void setSubTitle(String str) {
        this.subTitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUnit(String str) {
        this.unit = str;
    }

    public final void setUserId(long j5) {
        this.userId = j5;
    }

    public final void setValue(int i11) {
        this.value = i11;
    }

    public String toString() {
        Long l5 = this.localId;
        long j5 = this.userId;
        int i11 = this.badgeType;
        String str = this.f32714id;
        String str2 = this.title;
        String str3 = this.subTitle;
        int i12 = this.value;
        String str4 = this.unit;
        String str5 = this.shortDesc;
        String str6 = this.longDesc;
        String str7 = this.learnMoreText;
        String str8 = this.learnMorePhoto;
        String str9 = this.message;
        String str10 = this.shareText;
        String str11 = this.date;
        DateTime dateTime = this.modified;
        StringBuilder sb2 = new StringBuilder("Badge(localId=");
        sb2.append(l5);
        sb2.append(", userId=");
        sb2.append(j5);
        sb2.append(", badgeType=");
        sb2.append(i11);
        sb2.append(", id=");
        sb2.append(str);
        b.d(sb2, ", title=", str2, ", subTitle=", str3);
        sb2.append(", value=");
        sb2.append(i12);
        sb2.append(", unit=");
        sb2.append(str4);
        b.d(sb2, ", shortDesc=", str5, ", longDesc=", str6);
        b.d(sb2, ", learnMoreText=", str7, ", learnMorePhoto=", str8);
        b.d(sb2, ", message=", str9, ", shareText=", str10);
        sb2.append(", date=");
        sb2.append(str11);
        sb2.append(", modified=");
        sb2.append(dateTime);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        Long l5 = this.localId;
        if (l5 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l5.longValue());
        }
        out.writeLong(this.userId);
        out.writeInt(this.badgeType);
        out.writeString(this.f32714id);
        out.writeString(this.title);
        out.writeString(this.subTitle);
        out.writeInt(this.value);
        out.writeString(this.unit);
        out.writeString(this.shortDesc);
        out.writeString(this.longDesc);
        out.writeString(this.learnMoreText);
        out.writeString(this.learnMorePhoto);
        out.writeString(this.message);
        out.writeString(this.shareText);
        out.writeString(this.date);
        out.writeSerializable(this.modified);
    }

    public Badge(Long l5, long j5, int i11, String id2, String str, String str2, int i12, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, DateTime dateTime) {
        u.j(id2, "id");
        this.localId = l5;
        this.userId = j5;
        this.badgeType = i11;
        this.f32714id = id2;
        this.title = str;
        this.subTitle = str2;
        this.value = i12;
        this.unit = str3;
        this.shortDesc = str4;
        this.longDesc = str5;
        this.learnMoreText = str6;
        this.learnMorePhoto = str7;
        this.message = str8;
        this.shareText = str9;
        this.date = str10;
        this.modified = dateTime;
    }

    public /* synthetic */ Badge(Long l5, long j5, int i11, String str, String str2, String str3, int i12, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, DateTime dateTime, int i13, m mVar) {
        this((i13 & 1) != 0 ? null : l5, (i13 & 2) != 0 ? 0L : j5, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? "" : str, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? null : str3, (i13 & 64) == 0 ? i12 : 0, (i13 & 128) != 0 ? null : str4, (i13 & 256) != 0 ? null : str5, (i13 & 512) != 0 ? null : str6, (i13 & 1024) != 0 ? null : str7, (i13 & ModuleCopy.f28574b) != 0 ? null : str8, (i13 & 4096) != 0 ? null : str9, (i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : str10, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str11, (i13 & Utils.MAX_EVENT_SIZE) != 0 ? null : dateTime);
    }
}
