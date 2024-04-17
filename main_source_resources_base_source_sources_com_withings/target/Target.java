package com.withings.target;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.q2;
import androidx.camera.core.y1;
import com.google.android.gms.internal.mlkit_common.a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import og.y;
import okhttp3.internal.http2.Http2;
import org.apache.http.HttpHeaders;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: Target.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0002^_B\u009f\u0001\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\b\b\u0003\u0010 \u001a\u00020\b\u0012\b\b\u0002\u0010!\u001a\u00020\b\u0012\b\b\u0002\u0010\"\u001a\u00020\b\u0012\b\b\u0002\u0010#\u001a\u00020\u000f\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010%\u001a\u00020\u0012\u0012\u0006\u0010&\u001a\u00020\u0012\u0012\u0006\u0010'\u001a\u00020\u0012\u0012\b\b\u0002\u0010(\u001a\u00020\u000f\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\\\u0010]J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ®\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0003\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\u000f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u000f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b/\u0010\nJ\u001a\u00102\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b4\u0010\nJ \u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b9\u0010:R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010;\u001a\u0004\b<\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010;\u001a\u0004\b=\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010>\u001a\u0004\b?\u0010\u0007R\u001a\u0010\u001e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010@\u001a\u0004\bA\u0010\nR\u001a\u0010\u001f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010@\u001a\u0004\bB\u0010\nR\u0017\u0010 \u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b \u0010@\u001a\u0004\bC\u0010\nR\u0017\u0010!\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010@\u001a\u0004\bD\u0010\nR\u0017\u0010\"\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010@\u001a\u0004\bE\u0010\nR\u001a\u0010#\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010F\u001a\u0004\b#\u0010\u0011R\u0019\u0010$\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b$\u0010G\u001a\u0004\bH\u0010\u0014R\u0017\u0010%\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b%\u0010G\u001a\u0004\bI\u0010\u0014R\u0017\u0010&\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b&\u0010G\u001a\u0004\bJ\u0010\u0014R\u0017\u0010'\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b'\u0010G\u001a\u0004\bK\u0010\u0014R\u0017\u0010(\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b(\u0010F\u001a\u0004\b(\u0010\u0011R\u0019\u0010)\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b)\u0010L\u001a\u0004\bM\u0010\u001aR\u0011\u0010O\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bN\u0010\nR\u0011\u0010S\u001a\u00020P8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0011\u0010U\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bT\u0010\u0007R\u0011\u0010Y\u001a\u00020V8F¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0011\u0010[\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bZ\u0010\u0011¨\u0006`"}, d2 = {"Lcom/withings/target/Target;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/Long;", "component2", "component3", "()J", "", "component4", "()I", "component5", "component6", "component7", "component8", "", "component9", "()Z", "Lorg/joda/time/DateTime;", "component10", "()Lorg/joda/time/DateTime;", "component11", "component12", "component13", "component14", "component15", "()Ljava/lang/Integer;", "id", "wsId", NavigationArguments.USER_ID, "type", "measureType", ValidateElement.RangeValidateElement.METHOD, "mantissa", "exponent", "isActive", "deactivated", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "modified", "date", "isSyncedWithApi", "attrib", "copy", "(Ljava/lang/Long;Ljava/lang/Long;JIIIIIZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/Integer;)Lcom/withings/target/Target;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getId", "getWsId", "J", "getUserId", "I", "getType", "getMeasureType", "getRange", "getMantissa", "getExponent", "Z", "Lorg/joda/time/DateTime;", "getDeactivated", "getCreated", "getModified", "getDate", "Ljava/lang/Integer;", "getAttrib", "getAsInt", "asInt", "Lorg/joda/time/Duration;", "getAsDuration", "()Lorg/joda/time/Duration;", "asDuration", "getAsDurationMillis", "asDurationMillis", "", "getAsDouble", "()D", "asDouble", "getHasBeenManuallyDeactivated", "hasBeenManuallyDeactivated", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;JIIIIIZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/Integer;)V", HttpHeaders.RANGE, "TargetType", "target_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Target implements Parcelable {
    public static final Parcelable.Creator<Target> CREATOR = new Creator();
    private final Integer attrib;
    private final DateTime created;
    private final DateTime date;
    private final DateTime deactivated;
    private final int exponent;

    /* renamed from: id  reason: collision with root package name */
    private final Long f44537id;
    @SerializedName("active")
    private final boolean isActive;
    private final boolean isSyncedWithApi;
    private final int mantissa;
    @SerializedName("target_id")
    private final int measureType;
    private final DateTime modified;
    private final int range;
    @SerializedName("target_type")
    private final int type;
    @SerializedName("userid")
    private final long userId;
    @SerializedName("targetid")
    private final Long wsId;

    /* compiled from: Target.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Target> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Target createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new Target(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Target[] newArray(int i11) {
            return new Target[i11];
        }
    }

    /* compiled from: Target.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/withings/target/Target$Range;", "", "Companion", "target_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes4.dex */
    public @interface Range {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int DAYS = 1;
        public static final int NOT_APPLICABLE = Integer.MIN_VALUE;
        public static final int WEEKS = 2;

        /* compiled from: Target.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/withings/target/Target$Range$Companion;", "", "()V", "DAYS", "", "NOT_APPLICABLE", "WEEKS", "target_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int DAYS = 1;
            public static final int NOT_APPLICABLE = Integer.MIN_VALUE;
            public static final int WEEKS = 2;

            private Companion() {
            }
        }
    }

    /* compiled from: Target.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/withings/target/Target$TargetType;", "", "Companion", "target_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface TargetType {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int TYPE_AGGREGATE = 2;
        public static final int TYPE_DURATION = 3;
        public static final int TYPE_HEALTH_GOAL = 5;
        public static final int TYPE_MEASURE = 1;
        public static final int TYPE_OBSERVANCE = 4;

        /* compiled from: Target.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/withings/target/Target$TargetType$Companion;", "", "()V", "TYPE_AGGREGATE", "", "TYPE_DURATION", "TYPE_HEALTH_GOAL", "TYPE_MEASURE", "TYPE_OBSERVANCE", "target_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int TYPE_AGGREGATE = 2;
            public static final int TYPE_DURATION = 3;
            public static final int TYPE_HEALTH_GOAL = 5;
            public static final int TYPE_MEASURE = 1;
            public static final int TYPE_OBSERVANCE = 4;

            private Companion() {
            }
        }
    }

    public Target(Long l5, Long l6, long j5, int i11, int i12, @Range int i13, int i14, int i15, boolean z5, DateTime dateTime, DateTime created, DateTime modified, DateTime date, boolean z11, Integer num) {
        u.j(created, "created");
        u.j(modified, "modified");
        u.j(date, "date");
        this.f44537id = l5;
        this.wsId = l6;
        this.userId = j5;
        this.type = i11;
        this.measureType = i12;
        this.range = i13;
        this.mantissa = i14;
        this.exponent = i15;
        this.isActive = z5;
        this.deactivated = dateTime;
        this.created = created;
        this.modified = modified;
        this.date = date;
        this.isSyncedWithApi = z11;
        this.attrib = num;
    }

    public static /* synthetic */ Target copy$default(Target target, Long l5, Long l6, long j5, int i11, int i12, int i13, int i14, int i15, boolean z5, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, boolean z11, Integer num, int i16, Object obj) {
        Long l11;
        Long l12;
        long j11;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        boolean z12;
        DateTime dateTime5;
        DateTime dateTime6;
        DateTime dateTime7;
        DateTime dateTime8;
        boolean z13;
        Integer num2;
        if ((i16 & 1) != 0) {
            l11 = target.f44537id;
        } else {
            l11 = l5;
        }
        if ((i16 & 2) != 0) {
            l12 = target.wsId;
        } else {
            l12 = l6;
        }
        if ((i16 & 4) != 0) {
            j11 = target.userId;
        } else {
            j11 = j5;
        }
        if ((i16 & 8) != 0) {
            i17 = target.type;
        } else {
            i17 = i11;
        }
        if ((i16 & 16) != 0) {
            i18 = target.measureType;
        } else {
            i18 = i12;
        }
        if ((i16 & 32) != 0) {
            i19 = target.range;
        } else {
            i19 = i13;
        }
        if ((i16 & 64) != 0) {
            i21 = target.mantissa;
        } else {
            i21 = i14;
        }
        if ((i16 & 128) != 0) {
            i22 = target.exponent;
        } else {
            i22 = i15;
        }
        if ((i16 & 256) != 0) {
            z12 = target.isActive;
        } else {
            z12 = z5;
        }
        if ((i16 & 512) != 0) {
            dateTime5 = target.deactivated;
        } else {
            dateTime5 = dateTime;
        }
        if ((i16 & 1024) != 0) {
            dateTime6 = target.created;
        } else {
            dateTime6 = dateTime2;
        }
        if ((i16 & ModuleCopy.f28574b) != 0) {
            dateTime7 = target.modified;
        } else {
            dateTime7 = dateTime3;
        }
        if ((i16 & 4096) != 0) {
            dateTime8 = target.date;
        } else {
            dateTime8 = dateTime4;
        }
        DateTime dateTime9 = dateTime8;
        if ((i16 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            z13 = target.isSyncedWithApi;
        } else {
            z13 = z11;
        }
        if ((i16 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            num2 = target.attrib;
        } else {
            num2 = num;
        }
        return target.copy(l11, l12, j11, i17, i18, i19, i21, i22, z12, dateTime5, dateTime6, dateTime7, dateTime9, z13, num2);
    }

    public final Long component1() {
        return this.f44537id;
    }

    public final DateTime component10() {
        return this.deactivated;
    }

    public final DateTime component11() {
        return this.created;
    }

    public final DateTime component12() {
        return this.modified;
    }

    public final DateTime component13() {
        return this.date;
    }

    public final boolean component14() {
        return this.isSyncedWithApi;
    }

    public final Integer component15() {
        return this.attrib;
    }

    public final Long component2() {
        return this.wsId;
    }

    public final long component3() {
        return this.userId;
    }

    public final int component4() {
        return this.type;
    }

    public final int component5() {
        return this.measureType;
    }

    public final int component6() {
        return this.range;
    }

    public final int component7() {
        return this.mantissa;
    }

    public final int component8() {
        return this.exponent;
    }

    public final boolean component9() {
        return this.isActive;
    }

    public final Target copy(Long l5, Long l6, long j5, int i11, int i12, @Range int i13, int i14, int i15, boolean z5, DateTime dateTime, DateTime created, DateTime modified, DateTime date, boolean z11, Integer num) {
        u.j(created, "created");
        u.j(modified, "modified");
        u.j(date, "date");
        return new Target(l5, l6, j5, i11, i12, i13, i14, i15, z5, dateTime, created, modified, date, z11, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Target)) {
            return false;
        }
        Target target = (Target) obj;
        if (u.e(this.f44537id, target.f44537id) && u.e(this.wsId, target.wsId) && this.userId == target.userId && this.type == target.type && this.measureType == target.measureType && this.range == target.range && this.mantissa == target.mantissa && this.exponent == target.exponent && this.isActive == target.isActive && u.e(this.deactivated, target.deactivated) && u.e(this.created, target.created) && u.e(this.modified, target.modified) && u.e(this.date, target.date) && this.isSyncedWithApi == target.isSyncedWithApi && u.e(this.attrib, target.attrib)) {
            return true;
        }
        return false;
    }

    public final double getAsDouble() {
        return Math.pow(10.0d, this.exponent) * this.mantissa;
    }

    public final Duration getAsDuration() {
        return new Duration(Integer.valueOf(getAsInt() * 1000));
    }

    public final long getAsDurationMillis() {
        return getAsDuration().getMillis();
    }

    public final int getAsInt() {
        return (int) (Math.pow(10.0d, this.exponent) * this.mantissa);
    }

    public final Integer getAttrib() {
        return this.attrib;
    }

    public final DateTime getCreated() {
        return this.created;
    }

    public final DateTime getDate() {
        return this.date;
    }

    public final DateTime getDeactivated() {
        return this.deactivated;
    }

    public final int getExponent() {
        return this.exponent;
    }

    public final boolean getHasBeenManuallyDeactivated() {
        if (this.deactivated != null) {
            return true;
        }
        return false;
    }

    public final Long getId() {
        return this.f44537id;
    }

    public final int getMantissa() {
        return this.mantissa;
    }

    public final int getMeasureType() {
        return this.measureType;
    }

    public final DateTime getModified() {
        return this.modified;
    }

    @Range
    public final int getRange() {
        return this.range;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final Long getWsId() {
        return this.wsId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Long l5 = this.f44537id;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = hashCode * 31;
        Long l6 = this.wsId;
        if (l6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l6.hashCode();
        }
        int a11 = y1.a(this.isActive, h.a(this.exponent, h.a(this.mantissa, h.a(this.range, h.a(this.measureType, h.a(this.type, c.a(this.userId, (i12 + hashCode2) * 31, 31), 31), 31), 31), 31), 31), 31);
        DateTime dateTime = this.deactivated;
        if (dateTime == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = dateTime.hashCode();
        }
        int a12 = y1.a(this.isSyncedWithApi, a.b(this.date, a.b(this.modified, a.b(this.created, (a11 + hashCode3) * 31, 31), 31), 31), 31);
        Integer num = this.attrib;
        if (num != null) {
            i11 = num.hashCode();
        }
        return a12 + i11;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isSyncedWithApi() {
        return this.isSyncedWithApi;
    }

    public String toString() {
        Long l5 = this.f44537id;
        Long l6 = this.wsId;
        long j5 = this.userId;
        int i11 = this.type;
        int i12 = this.measureType;
        int i13 = this.range;
        int i14 = this.mantissa;
        int i15 = this.exponent;
        boolean z5 = this.isActive;
        DateTime dateTime = this.deactivated;
        DateTime dateTime2 = this.created;
        DateTime dateTime3 = this.modified;
        DateTime dateTime4 = this.date;
        boolean z11 = this.isSyncedWithApi;
        Integer num = this.attrib;
        StringBuilder sb2 = new StringBuilder("Target(id=");
        sb2.append(l5);
        sb2.append(", wsId=");
        sb2.append(l6);
        sb2.append(", userId=");
        sb2.append(j5);
        sb2.append(", type=");
        sb2.append(i11);
        q2.c(sb2, ", measureType=", i12, ", range=", i13);
        q2.c(sb2, ", mantissa=", i14, ", exponent=", i15);
        sb2.append(", isActive=");
        sb2.append(z5);
        sb2.append(", deactivated=");
        sb2.append(dateTime);
        sb2.append(", created=");
        sb2.append(dateTime2);
        sb2.append(", modified=");
        sb2.append(dateTime3);
        sb2.append(", date=");
        sb2.append(dateTime4);
        sb2.append(", isSyncedWithApi=");
        sb2.append(z11);
        sb2.append(", attrib=");
        sb2.append(num);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        Long l5 = this.f44537id;
        if (l5 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l5.longValue());
        }
        Long l6 = this.wsId;
        if (l6 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l6.longValue());
        }
        out.writeLong(this.userId);
        out.writeInt(this.type);
        out.writeInt(this.measureType);
        out.writeInt(this.range);
        out.writeInt(this.mantissa);
        out.writeInt(this.exponent);
        out.writeInt(this.isActive ? 1 : 0);
        out.writeSerializable(this.deactivated);
        out.writeSerializable(this.created);
        out.writeSerializable(this.modified);
        out.writeSerializable(this.date);
        out.writeInt(this.isSyncedWithApi ? 1 : 0);
        Integer num = this.attrib;
        if (num == null) {
            out.writeInt(0);
        } else {
            y.b(out, 1, num);
        }
    }

    public /* synthetic */ Target(Long l5, Long l6, long j5, int i11, int i12, int i13, int i14, int i15, boolean z5, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, boolean z11, Integer num, int i16, m mVar) {
        this((i16 & 1) != 0 ? null : l5, (i16 & 2) != 0 ? null : l6, (i16 & 4) != 0 ? 0L : j5, (i16 & 8) != 0 ? 0 : i11, (i16 & 16) != 0 ? 0 : i12, (i16 & 32) != 0 ? Integer.MIN_VALUE : i13, (i16 & 64) != 0 ? 0 : i14, (i16 & 128) != 0 ? 0 : i15, (i16 & 256) != 0 ? false : z5, (i16 & 512) != 0 ? null : dateTime, dateTime2, dateTime3, dateTime4, (i16 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? true : z11, (i16 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : num);
    }
}
