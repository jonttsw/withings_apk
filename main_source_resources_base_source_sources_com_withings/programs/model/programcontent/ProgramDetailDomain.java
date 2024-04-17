package com.withings.programs.model.programcontent;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.core.y1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.contentproviders.model.content.ContentAccessLevel;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import okhttp3.internal.http2.Http2;
/* compiled from: ProgramDetailDomain.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00107\u001a\u00020\u000fHÆ\u0003J\t\u00108\u001a\u00020\u0017HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010$J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003JÆ\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\u000f2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\tHÖ\u0001J\t\u0010F\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0011\u0010\u0015\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010&R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&¨\u0006G"}, d2 = {"Lcom/withings/programs/model/programcontent/ProgramDetailDomain;", "", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "", "deployment", "", "familyId", "modified", NavigationArguments.PROGRAM_ID, "", "specifics", "targetType", "targetValue", NavigationArguments.USER_ID, "visible", "", "countryCodes", "data", "durationJson", "eligibility", "programOverview", "isSuggested", "accessLevel", "Lcom/withings/contentproviders/model/content/ContentAccessLevel;", "(JLjava/lang/String;Ljava/lang/Long;JILjava/lang/String;ILjava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withings/contentproviders/model/content/ContentAccessLevel;)V", "getAccessLevel", "()Lcom/withings/contentproviders/model/content/ContentAccessLevel;", "getCountryCodes", "()Ljava/lang/String;", "getCreated", "()J", "getData", "getDeployment", "getDurationJson", "getEligibility", "getFamilyId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Z", "getModified", "getProgramId", "()I", "getProgramOverview", "getSpecifics", "getTargetType", "getTargetValue", "getUserId", "getVisible", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/lang/Long;JILjava/lang/String;ILjava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withings/contentproviders/model/content/ContentAccessLevel;)Lcom/withings/programs/model/programcontent/ProgramDetailDomain;", "equals", "other", "hashCode", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgramDetailDomain {
    private final ContentAccessLevel accessLevel;
    private final String countryCodes;
    private final long created;
    private final String data;
    private final String deployment;
    private final String durationJson;
    private final String eligibility;
    private final Long familyId;
    private final boolean isSuggested;
    private final long modified;
    private final int programId;
    private final String programOverview;
    private final String specifics;
    private final int targetType;
    private final String targetValue;
    private final long userId;
    private final boolean visible;

    public ProgramDetailDomain(long j5, String deployment, Long l5, long j11, int i11, String str, int i12, String targetValue, long j12, boolean z5, String str2, String str3, String str4, String str5, String str6, boolean z11, ContentAccessLevel accessLevel) {
        u.j(deployment, "deployment");
        u.j(targetValue, "targetValue");
        u.j(accessLevel, "accessLevel");
        this.created = j5;
        this.deployment = deployment;
        this.familyId = l5;
        this.modified = j11;
        this.programId = i11;
        this.specifics = str;
        this.targetType = i12;
        this.targetValue = targetValue;
        this.userId = j12;
        this.visible = z5;
        this.countryCodes = str2;
        this.data = str3;
        this.durationJson = str4;
        this.eligibility = str5;
        this.programOverview = str6;
        this.isSuggested = z11;
        this.accessLevel = accessLevel;
    }

    public static /* synthetic */ ProgramDetailDomain copy$default(ProgramDetailDomain programDetailDomain, long j5, String str, Long l5, long j11, int i11, String str2, int i12, String str3, long j12, boolean z5, String str4, String str5, String str6, String str7, String str8, boolean z11, ContentAccessLevel contentAccessLevel, int i13, Object obj) {
        long j13;
        String str9;
        Long l6;
        long j14;
        int i14;
        String str10;
        int i15;
        String str11;
        long j15;
        boolean z12;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        boolean z13;
        ContentAccessLevel contentAccessLevel2;
        if ((i13 & 1) != 0) {
            j13 = programDetailDomain.created;
        } else {
            j13 = j5;
        }
        if ((i13 & 2) != 0) {
            str9 = programDetailDomain.deployment;
        } else {
            str9 = str;
        }
        if ((i13 & 4) != 0) {
            l6 = programDetailDomain.familyId;
        } else {
            l6 = l5;
        }
        if ((i13 & 8) != 0) {
            j14 = programDetailDomain.modified;
        } else {
            j14 = j11;
        }
        if ((i13 & 16) != 0) {
            i14 = programDetailDomain.programId;
        } else {
            i14 = i11;
        }
        if ((i13 & 32) != 0) {
            str10 = programDetailDomain.specifics;
        } else {
            str10 = str2;
        }
        if ((i13 & 64) != 0) {
            i15 = programDetailDomain.targetType;
        } else {
            i15 = i12;
        }
        if ((i13 & 128) != 0) {
            str11 = programDetailDomain.targetValue;
        } else {
            str11 = str3;
        }
        if ((i13 & 256) != 0) {
            j15 = programDetailDomain.userId;
        } else {
            j15 = j12;
        }
        if ((i13 & 512) != 0) {
            z12 = programDetailDomain.visible;
        } else {
            z12 = z5;
        }
        if ((i13 & 1024) != 0) {
            str12 = programDetailDomain.countryCodes;
        } else {
            str12 = str4;
        }
        String str17 = str12;
        if ((i13 & ModuleCopy.f28574b) != 0) {
            str13 = programDetailDomain.data;
        } else {
            str13 = str5;
        }
        String str18 = str13;
        if ((i13 & 4096) != 0) {
            str14 = programDetailDomain.durationJson;
        } else {
            str14 = str6;
        }
        String str19 = str14;
        if ((i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            str15 = programDetailDomain.eligibility;
        } else {
            str15 = str7;
        }
        String str20 = str15;
        if ((i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            str16 = programDetailDomain.programOverview;
        } else {
            str16 = str8;
        }
        String str21 = str16;
        if ((i13 & Utils.MAX_EVENT_SIZE) != 0) {
            z13 = programDetailDomain.isSuggested;
        } else {
            z13 = z11;
        }
        if ((i13 & 65536) != 0) {
            contentAccessLevel2 = programDetailDomain.accessLevel;
        } else {
            contentAccessLevel2 = contentAccessLevel;
        }
        return programDetailDomain.copy(j13, str9, l6, j14, i14, str10, i15, str11, j15, z12, str17, str18, str19, str20, str21, z13, contentAccessLevel2);
    }

    public final long component1() {
        return this.created;
    }

    public final boolean component10() {
        return this.visible;
    }

    public final String component11() {
        return this.countryCodes;
    }

    public final String component12() {
        return this.data;
    }

    public final String component13() {
        return this.durationJson;
    }

    public final String component14() {
        return this.eligibility;
    }

    public final String component15() {
        return this.programOverview;
    }

    public final boolean component16() {
        return this.isSuggested;
    }

    public final ContentAccessLevel component17() {
        return this.accessLevel;
    }

    public final String component2() {
        return this.deployment;
    }

    public final Long component3() {
        return this.familyId;
    }

    public final long component4() {
        return this.modified;
    }

    public final int component5() {
        return this.programId;
    }

    public final String component6() {
        return this.specifics;
    }

    public final int component7() {
        return this.targetType;
    }

    public final String component8() {
        return this.targetValue;
    }

    public final long component9() {
        return this.userId;
    }

    public final ProgramDetailDomain copy(long j5, String deployment, Long l5, long j11, int i11, String str, int i12, String targetValue, long j12, boolean z5, String str2, String str3, String str4, String str5, String str6, boolean z11, ContentAccessLevel accessLevel) {
        u.j(deployment, "deployment");
        u.j(targetValue, "targetValue");
        u.j(accessLevel, "accessLevel");
        return new ProgramDetailDomain(j5, deployment, l5, j11, i11, str, i12, targetValue, j12, z5, str2, str3, str4, str5, str6, z11, accessLevel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramDetailDomain)) {
            return false;
        }
        ProgramDetailDomain programDetailDomain = (ProgramDetailDomain) obj;
        if (this.created == programDetailDomain.created && u.e(this.deployment, programDetailDomain.deployment) && u.e(this.familyId, programDetailDomain.familyId) && this.modified == programDetailDomain.modified && this.programId == programDetailDomain.programId && u.e(this.specifics, programDetailDomain.specifics) && this.targetType == programDetailDomain.targetType && u.e(this.targetValue, programDetailDomain.targetValue) && this.userId == programDetailDomain.userId && this.visible == programDetailDomain.visible && u.e(this.countryCodes, programDetailDomain.countryCodes) && u.e(this.data, programDetailDomain.data) && u.e(this.durationJson, programDetailDomain.durationJson) && u.e(this.eligibility, programDetailDomain.eligibility) && u.e(this.programOverview, programDetailDomain.programOverview) && this.isSuggested == programDetailDomain.isSuggested && this.accessLevel == programDetailDomain.accessLevel) {
            return true;
        }
        return false;
    }

    public final ContentAccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    public final String getCountryCodes() {
        return this.countryCodes;
    }

    public final long getCreated() {
        return this.created;
    }

    public final String getData() {
        return this.data;
    }

    public final String getDeployment() {
        return this.deployment;
    }

    public final String getDurationJson() {
        return this.durationJson;
    }

    public final String getEligibility() {
        return this.eligibility;
    }

    public final Long getFamilyId() {
        return this.familyId;
    }

    public final long getModified() {
        return this.modified;
    }

    public final int getProgramId() {
        return this.programId;
    }

    public final String getProgramOverview() {
        return this.programOverview;
    }

    public final String getSpecifics() {
        return this.specifics;
    }

    public final int getTargetType() {
        return this.targetType;
    }

    public final String getTargetValue() {
        return this.targetValue;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int c11 = d.c(this.deployment, Long.hashCode(this.created) * 31, 31);
        Long l5 = this.familyId;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int a11 = h.a(this.programId, c.a(this.modified, (c11 + hashCode) * 31, 31), 31);
        String str = this.specifics;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int a12 = y1.a(this.visible, c.a(this.userId, d.c(this.targetValue, h.a(this.targetType, (a11 + hashCode2) * 31, 31), 31), 31), 31);
        String str2 = this.countryCodes;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i12 = (a12 + hashCode3) * 31;
        String str3 = this.data;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str4 = this.durationJson;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str5 = this.eligibility;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        String str6 = this.programOverview;
        if (str6 != null) {
            i11 = str6.hashCode();
        }
        return this.accessLevel.hashCode() + y1.a(this.isSuggested, (i15 + i11) * 31, 31);
    }

    public final boolean isSuggested() {
        return this.isSuggested;
    }

    public String toString() {
        long j5 = this.created;
        String str = this.deployment;
        Long l5 = this.familyId;
        long j11 = this.modified;
        int i11 = this.programId;
        String str2 = this.specifics;
        int i12 = this.targetType;
        String str3 = this.targetValue;
        long j12 = this.userId;
        boolean z5 = this.visible;
        String str4 = this.countryCodes;
        String str5 = this.data;
        String str6 = this.durationJson;
        String str7 = this.eligibility;
        String str8 = this.programOverview;
        boolean z11 = this.isSuggested;
        ContentAccessLevel contentAccessLevel = this.accessLevel;
        StringBuilder sb2 = new StringBuilder("ProgramDetailDomain(created=");
        sb2.append(j5);
        sb2.append(", deployment=");
        sb2.append(str);
        sb2.append(", familyId=");
        sb2.append(l5);
        sb2.append(", modified=");
        sb2.append(j11);
        sb2.append(", programId=");
        sb2.append(i11);
        sb2.append(", specifics=");
        sb2.append(str2);
        sb2.append(", targetType=");
        sb2.append(i12);
        sb2.append(", targetValue=");
        sb2.append(str3);
        sb2.append(", userId=");
        sb2.append(j12);
        sb2.append(", visible=");
        sb2.append(z5);
        b.d(sb2, ", countryCodes=", str4, ", data=", str5);
        b.d(sb2, ", durationJson=", str6, ", eligibility=", str7);
        sb2.append(", programOverview=");
        sb2.append(str8);
        sb2.append(", isSuggested=");
        sb2.append(z11);
        sb2.append(", accessLevel=");
        sb2.append(contentAccessLevel);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ ProgramDetailDomain(long j5, String str, Long l5, long j11, int i11, String str2, int i12, String str3, long j12, boolean z5, String str4, String str5, String str6, String str7, String str8, boolean z11, ContentAccessLevel contentAccessLevel, int i13, m mVar) {
        this(j5, str, l5, j11, i11, str2, i12, str3, j12, z5, (i13 & 1024) != 0 ? null : str4, (i13 & ModuleCopy.f28574b) != 0 ? null : str5, (i13 & 4096) != 0 ? null : str6, (i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : str7, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str8, z11, contentAccessLevel);
    }
}
