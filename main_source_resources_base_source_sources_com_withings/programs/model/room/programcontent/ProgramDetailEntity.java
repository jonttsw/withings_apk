package com.withings.programs.model.room.programcontent;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.core.y1;
import androidx.compose.material.v;
import androidx.compose.material3.d;
import androidx.work.impl.g;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import okhttp3.internal.http2.Http2;
/* compiled from: ProgramDetailEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b9\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00105\u001a\u00020\fHÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\t\u0010<\u001a\u00020\fHÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÆ\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\f2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\u0003HÖ\u0001J\t\u0010D\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u001a\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0016\u0010\u0015\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010%R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0016\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%¨\u0006E"}, d2 = {"Lcom/withings/programs/model/room/programcontent/ProgramDetailEntity;", "", NavigationArguments.PROGRAM_ID, "", "deployment", "", "targetType", "targetValue", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "", "modified", "visible", "", "familyid", "specifics", "durationJson", "eligibility", "countryCodes", "data", NavigationArguments.USER_ID, "programOverview", "isSuggested", "accessLevel", "(ILjava/lang/String;ILjava/lang/String;JJZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZI)V", "getAccessLevel", "()I", "getCountryCodes", "()Ljava/lang/String;", "getCreated", "()J", "getData", "getDeployment", "getDurationJson", "getEligibility", "getFamilyid", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Z", "getModified", "getProgramId", "getProgramOverview", "getSpecifics", "getTargetType", "getTargetValue", "getUserId", "getVisible", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;ILjava/lang/String;JJZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZI)Lcom/withings/programs/model/room/programcontent/ProgramDetailEntity;", "equals", "other", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgramDetailEntity {
    private final int accessLevel;
    private final String countryCodes;
    private final long created;
    private final String data;
    private final String deployment;
    private final String durationJson;
    private final String eligibility;
    private final Long familyid;
    private final boolean isSuggested;
    private final long modified;
    private final int programId;
    private final String programOverview;
    private final String specifics;
    private final int targetType;
    private final String targetValue;
    private final long userId;
    private final boolean visible;

    public ProgramDetailEntity(int i11, String deployment, int i12, String targetValue, long j5, long j11, boolean z5, Long l5, String str, String str2, String str3, String str4, String str5, long j12, String str6, boolean z11, int i13) {
        u.j(deployment, "deployment");
        u.j(targetValue, "targetValue");
        this.programId = i11;
        this.deployment = deployment;
        this.targetType = i12;
        this.targetValue = targetValue;
        this.created = j5;
        this.modified = j11;
        this.visible = z5;
        this.familyid = l5;
        this.specifics = str;
        this.durationJson = str2;
        this.eligibility = str3;
        this.countryCodes = str4;
        this.data = str5;
        this.userId = j12;
        this.programOverview = str6;
        this.isSuggested = z11;
        this.accessLevel = i13;
    }

    public static /* synthetic */ ProgramDetailEntity copy$default(ProgramDetailEntity programDetailEntity, int i11, String str, int i12, String str2, long j5, long j11, boolean z5, Long l5, String str3, String str4, String str5, String str6, String str7, long j12, String str8, boolean z11, int i13, int i14, Object obj) {
        int i15;
        String str9;
        int i16;
        String str10;
        long j13;
        long j14;
        boolean z12;
        Long l6;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        long j15;
        String str16;
        boolean z13;
        int i17;
        if ((i14 & 1) != 0) {
            i15 = programDetailEntity.programId;
        } else {
            i15 = i11;
        }
        if ((i14 & 2) != 0) {
            str9 = programDetailEntity.deployment;
        } else {
            str9 = str;
        }
        if ((i14 & 4) != 0) {
            i16 = programDetailEntity.targetType;
        } else {
            i16 = i12;
        }
        if ((i14 & 8) != 0) {
            str10 = programDetailEntity.targetValue;
        } else {
            str10 = str2;
        }
        if ((i14 & 16) != 0) {
            j13 = programDetailEntity.created;
        } else {
            j13 = j5;
        }
        if ((i14 & 32) != 0) {
            j14 = programDetailEntity.modified;
        } else {
            j14 = j11;
        }
        if ((i14 & 64) != 0) {
            z12 = programDetailEntity.visible;
        } else {
            z12 = z5;
        }
        if ((i14 & 128) != 0) {
            l6 = programDetailEntity.familyid;
        } else {
            l6 = l5;
        }
        if ((i14 & 256) != 0) {
            str11 = programDetailEntity.specifics;
        } else {
            str11 = str3;
        }
        if ((i14 & 512) != 0) {
            str12 = programDetailEntity.durationJson;
        } else {
            str12 = str4;
        }
        if ((i14 & 1024) != 0) {
            str13 = programDetailEntity.eligibility;
        } else {
            str13 = str5;
        }
        if ((i14 & ModuleCopy.f28574b) != 0) {
            str14 = programDetailEntity.countryCodes;
        } else {
            str14 = str6;
        }
        String str17 = str14;
        if ((i14 & 4096) != 0) {
            str15 = programDetailEntity.data;
        } else {
            str15 = str7;
        }
        String str18 = str15;
        String str19 = str13;
        if ((i14 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            j15 = programDetailEntity.userId;
        } else {
            j15 = j12;
        }
        long j16 = j15;
        if ((i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            str16 = programDetailEntity.programOverview;
        } else {
            str16 = str8;
        }
        if ((32768 & i14) != 0) {
            z13 = programDetailEntity.isSuggested;
        } else {
            z13 = z11;
        }
        if ((i14 & 65536) != 0) {
            i17 = programDetailEntity.accessLevel;
        } else {
            i17 = i13;
        }
        return programDetailEntity.copy(i15, str9, i16, str10, j13, j14, z12, l6, str11, str12, str19, str17, str18, j16, str16, z13, i17);
    }

    public final int component1() {
        return this.programId;
    }

    public final String component10() {
        return this.durationJson;
    }

    public final String component11() {
        return this.eligibility;
    }

    public final String component12() {
        return this.countryCodes;
    }

    public final String component13() {
        return this.data;
    }

    public final long component14() {
        return this.userId;
    }

    public final String component15() {
        return this.programOverview;
    }

    public final boolean component16() {
        return this.isSuggested;
    }

    public final int component17() {
        return this.accessLevel;
    }

    public final String component2() {
        return this.deployment;
    }

    public final int component3() {
        return this.targetType;
    }

    public final String component4() {
        return this.targetValue;
    }

    public final long component5() {
        return this.created;
    }

    public final long component6() {
        return this.modified;
    }

    public final boolean component7() {
        return this.visible;
    }

    public final Long component8() {
        return this.familyid;
    }

    public final String component9() {
        return this.specifics;
    }

    public final ProgramDetailEntity copy(int i11, String deployment, int i12, String targetValue, long j5, long j11, boolean z5, Long l5, String str, String str2, String str3, String str4, String str5, long j12, String str6, boolean z11, int i13) {
        u.j(deployment, "deployment");
        u.j(targetValue, "targetValue");
        return new ProgramDetailEntity(i11, deployment, i12, targetValue, j5, j11, z5, l5, str, str2, str3, str4, str5, j12, str6, z11, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramDetailEntity)) {
            return false;
        }
        ProgramDetailEntity programDetailEntity = (ProgramDetailEntity) obj;
        if (this.programId == programDetailEntity.programId && u.e(this.deployment, programDetailEntity.deployment) && this.targetType == programDetailEntity.targetType && u.e(this.targetValue, programDetailEntity.targetValue) && this.created == programDetailEntity.created && this.modified == programDetailEntity.modified && this.visible == programDetailEntity.visible && u.e(this.familyid, programDetailEntity.familyid) && u.e(this.specifics, programDetailEntity.specifics) && u.e(this.durationJson, programDetailEntity.durationJson) && u.e(this.eligibility, programDetailEntity.eligibility) && u.e(this.countryCodes, programDetailEntity.countryCodes) && u.e(this.data, programDetailEntity.data) && this.userId == programDetailEntity.userId && u.e(this.programOverview, programDetailEntity.programOverview) && this.isSuggested == programDetailEntity.isSuggested && this.accessLevel == programDetailEntity.accessLevel) {
            return true;
        }
        return false;
    }

    public final int getAccessLevel() {
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

    public final Long getFamilyid() {
        return this.familyid;
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
        int a11 = y1.a(this.visible, c.a(this.modified, c.a(this.created, d.c(this.targetValue, h.a(this.targetType, d.c(this.deployment, Integer.hashCode(this.programId) * 31, 31), 31), 31), 31), 31), 31);
        Long l5 = this.familyid;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        String str = this.specifics;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str2 = this.durationJson;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str3 = this.eligibility;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        String str4 = this.countryCodes;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        String str5 = this.data;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int a12 = c.a(this.userId, (i16 + hashCode6) * 31, 31);
        String str6 = this.programOverview;
        if (str6 != null) {
            i11 = str6.hashCode();
        }
        return Integer.hashCode(this.accessLevel) + y1.a(this.isSuggested, (a12 + i11) * 31, 31);
    }

    public final boolean isSuggested() {
        return this.isSuggested;
    }

    public String toString() {
        int i11 = this.programId;
        String str = this.deployment;
        int i12 = this.targetType;
        String str2 = this.targetValue;
        long j5 = this.created;
        long j11 = this.modified;
        boolean z5 = this.visible;
        Long l5 = this.familyid;
        String str3 = this.specifics;
        String str4 = this.durationJson;
        String str5 = this.eligibility;
        String str6 = this.countryCodes;
        String str7 = this.data;
        long j12 = this.userId;
        String str8 = this.programOverview;
        boolean z11 = this.isSuggested;
        int i13 = this.accessLevel;
        StringBuilder a11 = d.a("ProgramDetailEntity(programId=", i11, ", deployment=", str, ", targetType=");
        v.c(a11, i12, ", targetValue=", str2, ", created=");
        a11.append(j5);
        g.d(a11, ", modified=", j11, ", visible=");
        a11.append(z5);
        a11.append(", familyid=");
        a11.append(l5);
        a11.append(", specifics=");
        b.d(a11, str3, ", durationJson=", str4, ", eligibility=");
        b.d(a11, str5, ", countryCodes=", str6, ", data=");
        a11.append(str7);
        a11.append(", userId=");
        a11.append(j12);
        a11.append(", programOverview=");
        a11.append(str8);
        a11.append(", isSuggested=");
        a11.append(z11);
        a11.append(", accessLevel=");
        a11.append(i13);
        a11.append(")");
        return a11.toString();
    }

    public /* synthetic */ ProgramDetailEntity(int i11, String str, int i12, String str2, long j5, long j11, boolean z5, Long l5, String str3, String str4, String str5, String str6, String str7, long j12, String str8, boolean z11, int i13, int i14, m mVar) {
        this(i11, str, i12, str2, j5, j11, z5, l5, (i14 & 256) != 0 ? null : str3, (i14 & 512) != 0 ? null : str4, (i14 & 1024) != 0 ? null : str5, (i14 & ModuleCopy.f28574b) != 0 ? null : str6, (i14 & 4096) != 0 ? null : str7, j12, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str8, (i14 & Utils.MAX_EVENT_SIZE) != 0 ? false : z11, i13);
    }
}
