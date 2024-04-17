package com.withings.ecg.webservices;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.core.v;
import androidx.camera.core.y1;
import androidx.work.impl.g;
import com.google.android.gms.internal.mlkit_common.a;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.ws.WsVasistasSerie;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: Models.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0002\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003J\u008f\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001J\u0013\u00104\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0007HÖ\u0001J\t\u00107\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0016\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018¨\u00068"}, d2 = {"Lcom/withings/ecg/webservices/GetEcgReviewResponseDetails;", "", "id", "", NavigationArguments.USER_ID, "deviceId", "modelId", "", "stateCode", "", "phoneNumber", "isVerified", "", "screeningStatus", "screeningModified", "Lorg/joda/time/DateTime;", "readingStatus", "readingModified", "modified", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "(JJJILjava/lang/String;Ljava/lang/String;ZILorg/joda/time/DateTime;ILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getCreated", "()Lorg/joda/time/DateTime;", "getDeviceId", "()J", "getId", "()Z", "getModelId", "()I", "getModified", "getPhoneNumber", "()Ljava/lang/String;", "getReadingModified", "getReadingStatus", "getScreeningModified", "getScreeningStatus", "getStateCode", "getUserId", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetEcgReviewResponseDetails {
    public static final int $stable = 8;
    private final DateTime created;
    @SerializedName("deviceid")
    private final long deviceId;

    /* renamed from: id  reason: collision with root package name */
    private final long f38864id;
    @SerializedName("is_verified")
    private final boolean isVerified;
    @SerializedName(WsVasistasSerie.KEY_MODEL)
    private final int modelId;
    private final DateTime modified;
    @SerializedName("phone_number")
    private final String phoneNumber;
    @SerializedName("reading_modified")
    private final DateTime readingModified;
    @SerializedName("reading_status")
    private final int readingStatus;
    @SerializedName("screening_modified")
    private final DateTime screeningModified;
    @SerializedName("screening_status")
    private final int screeningStatus;
    @SerializedName("state_code")
    private final String stateCode;
    @SerializedName("userid")
    private final long userId;

    public GetEcgReviewResponseDetails(long j5, long j11, long j12, int i11, String str, String str2, boolean z5, int i12, DateTime screeningModified, int i13, DateTime readingModified, DateTime modified, DateTime created) {
        u.j(screeningModified, "screeningModified");
        u.j(readingModified, "readingModified");
        u.j(modified, "modified");
        u.j(created, "created");
        this.f38864id = j5;
        this.userId = j11;
        this.deviceId = j12;
        this.modelId = i11;
        this.stateCode = str;
        this.phoneNumber = str2;
        this.isVerified = z5;
        this.screeningStatus = i12;
        this.screeningModified = screeningModified;
        this.readingStatus = i13;
        this.readingModified = readingModified;
        this.modified = modified;
        this.created = created;
    }

    public static /* synthetic */ GetEcgReviewResponseDetails copy$default(GetEcgReviewResponseDetails getEcgReviewResponseDetails, long j5, long j11, long j12, int i11, String str, String str2, boolean z5, int i12, DateTime dateTime, int i13, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, int i14, Object obj) {
        long j13;
        long j14;
        long j15;
        int i15;
        String str3;
        String str4;
        boolean z11;
        int i16;
        DateTime dateTime5;
        int i17;
        DateTime dateTime6;
        DateTime dateTime7;
        DateTime dateTime8;
        if ((i14 & 1) != 0) {
            j13 = getEcgReviewResponseDetails.f38864id;
        } else {
            j13 = j5;
        }
        if ((i14 & 2) != 0) {
            j14 = getEcgReviewResponseDetails.userId;
        } else {
            j14 = j11;
        }
        if ((i14 & 4) != 0) {
            j15 = getEcgReviewResponseDetails.deviceId;
        } else {
            j15 = j12;
        }
        if ((i14 & 8) != 0) {
            i15 = getEcgReviewResponseDetails.modelId;
        } else {
            i15 = i11;
        }
        if ((i14 & 16) != 0) {
            str3 = getEcgReviewResponseDetails.stateCode;
        } else {
            str3 = str;
        }
        if ((i14 & 32) != 0) {
            str4 = getEcgReviewResponseDetails.phoneNumber;
        } else {
            str4 = str2;
        }
        if ((i14 & 64) != 0) {
            z11 = getEcgReviewResponseDetails.isVerified;
        } else {
            z11 = z5;
        }
        if ((i14 & 128) != 0) {
            i16 = getEcgReviewResponseDetails.screeningStatus;
        } else {
            i16 = i12;
        }
        if ((i14 & 256) != 0) {
            dateTime5 = getEcgReviewResponseDetails.screeningModified;
        } else {
            dateTime5 = dateTime;
        }
        if ((i14 & 512) != 0) {
            i17 = getEcgReviewResponseDetails.readingStatus;
        } else {
            i17 = i13;
        }
        if ((i14 & 1024) != 0) {
            dateTime6 = getEcgReviewResponseDetails.readingModified;
        } else {
            dateTime6 = dateTime2;
        }
        DateTime dateTime9 = dateTime6;
        if ((i14 & ModuleCopy.f28574b) != 0) {
            dateTime7 = getEcgReviewResponseDetails.modified;
        } else {
            dateTime7 = dateTime3;
        }
        if ((i14 & 4096) != 0) {
            dateTime8 = getEcgReviewResponseDetails.created;
        } else {
            dateTime8 = dateTime4;
        }
        return getEcgReviewResponseDetails.copy(j13, j14, j15, i15, str3, str4, z11, i16, dateTime5, i17, dateTime9, dateTime7, dateTime8);
    }

    public final long component1() {
        return this.f38864id;
    }

    public final int component10() {
        return this.readingStatus;
    }

    public final DateTime component11() {
        return this.readingModified;
    }

    public final DateTime component12() {
        return this.modified;
    }

    public final DateTime component13() {
        return this.created;
    }

    public final long component2() {
        return this.userId;
    }

    public final long component3() {
        return this.deviceId;
    }

    public final int component4() {
        return this.modelId;
    }

    public final String component5() {
        return this.stateCode;
    }

    public final String component6() {
        return this.phoneNumber;
    }

    public final boolean component7() {
        return this.isVerified;
    }

    public final int component8() {
        return this.screeningStatus;
    }

    public final DateTime component9() {
        return this.screeningModified;
    }

    public final GetEcgReviewResponseDetails copy(long j5, long j11, long j12, int i11, String str, String str2, boolean z5, int i12, DateTime screeningModified, int i13, DateTime readingModified, DateTime modified, DateTime created) {
        u.j(screeningModified, "screeningModified");
        u.j(readingModified, "readingModified");
        u.j(modified, "modified");
        u.j(created, "created");
        return new GetEcgReviewResponseDetails(j5, j11, j12, i11, str, str2, z5, i12, screeningModified, i13, readingModified, modified, created);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetEcgReviewResponseDetails)) {
            return false;
        }
        GetEcgReviewResponseDetails getEcgReviewResponseDetails = (GetEcgReviewResponseDetails) obj;
        if (this.f38864id == getEcgReviewResponseDetails.f38864id && this.userId == getEcgReviewResponseDetails.userId && this.deviceId == getEcgReviewResponseDetails.deviceId && this.modelId == getEcgReviewResponseDetails.modelId && u.e(this.stateCode, getEcgReviewResponseDetails.stateCode) && u.e(this.phoneNumber, getEcgReviewResponseDetails.phoneNumber) && this.isVerified == getEcgReviewResponseDetails.isVerified && this.screeningStatus == getEcgReviewResponseDetails.screeningStatus && u.e(this.screeningModified, getEcgReviewResponseDetails.screeningModified) && this.readingStatus == getEcgReviewResponseDetails.readingStatus && u.e(this.readingModified, getEcgReviewResponseDetails.readingModified) && u.e(this.modified, getEcgReviewResponseDetails.modified) && u.e(this.created, getEcgReviewResponseDetails.created)) {
            return true;
        }
        return false;
    }

    public final DateTime getCreated() {
        return this.created;
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    public final long getId() {
        return this.f38864id;
    }

    public final int getModelId() {
        return this.modelId;
    }

    public final DateTime getModified() {
        return this.modified;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final DateTime getReadingModified() {
        return this.readingModified;
    }

    public final int getReadingStatus() {
        return this.readingStatus;
    }

    public final DateTime getScreeningModified() {
        return this.screeningModified;
    }

    public final int getScreeningStatus() {
        return this.screeningStatus;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode;
        int a11 = h.a(this.modelId, c.a(this.deviceId, c.a(this.userId, Long.hashCode(this.f38864id) * 31, 31), 31), 31);
        String str = this.stateCode;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        String str2 = this.phoneNumber;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.created.hashCode() + a.b(this.modified, a.b(this.readingModified, h.a(this.readingStatus, a.b(this.screeningModified, h.a(this.screeningStatus, y1.a(this.isVerified, (i12 + i11) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public String toString() {
        long j5 = this.f38864id;
        long j11 = this.userId;
        long j12 = this.deviceId;
        int i11 = this.modelId;
        String str = this.stateCode;
        String str2 = this.phoneNumber;
        boolean z5 = this.isVerified;
        int i12 = this.screeningStatus;
        DateTime dateTime = this.screeningModified;
        int i13 = this.readingStatus;
        DateTime dateTime2 = this.readingModified;
        DateTime dateTime3 = this.modified;
        DateTime dateTime4 = this.created;
        StringBuilder e11 = v.e("GetEcgReviewResponseDetails(id=", j5, ", userId=");
        e11.append(j11);
        g.d(e11, ", deviceId=", j12, ", modelId=");
        androidx.compose.material.v.c(e11, i11, ", stateCode=", str, ", phoneNumber=");
        e11.append(str2);
        e11.append(", isVerified=");
        e11.append(z5);
        e11.append(", screeningStatus=");
        e11.append(i12);
        e11.append(", screeningModified=");
        e11.append(dateTime);
        e11.append(", readingStatus=");
        e11.append(i13);
        e11.append(", readingModified=");
        e11.append(dateTime2);
        e11.append(", modified=");
        e11.append(dateTime3);
        e11.append(", created=");
        e11.append(dateTime4);
        e11.append(")");
        return e11.toString();
    }
}
