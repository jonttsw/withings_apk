package com.withings.manualLogging.data.webservice.note;

import androidx.activity.result.c;
import androidx.camera.core.y1;
import androidx.work.impl.g;
import com.google.android.gms.internal.mlkit_common.a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import okhttp3.internal.http2.Http2;
import org.joda.time.DateTime;
/* compiled from: WebServiceNoteGroup.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\f\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\f¢\u0006\u0002\u0010\u001aJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J\t\u00104\u001a\u00020\u000fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00160\fHÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00160\fHÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00190\fHÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010,J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010=\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010A\u001a\u00020\u000fHÆ\u0003JÔ\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\f2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\fHÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\u000f2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020\bHÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0018\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b0\u0010,R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(¨\u0006I"}, d2 = {"Lcom/withings/manualLogging/data/webservice/note/WebServiceNoteGroup;", "", "wsId", "", NavigationArguments.USER_ID, "remoteMeasureGroupId", "signalId", "cryptpart", "", "bucket", "source", "pathLists", "", "Lcom/withings/manualLogging/data/webservice/note/IdentifiedPathList;", "deleted", "", "date", "Lorg/joda/time/DateTime;", "noSymptom", "serverCreatedDate", "serverModifiedDate", "medicines", "Lcom/withings/manualLogging/data/webservice/note/WebServiceHealthAttributeNote;", "symptoms", "comments", "Lcom/withings/manualLogging/data/webservice/note/WebServiceCommentNote;", "(JLjava/lang/Long;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLorg/joda/time/DateTime;ZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getBucket", "()Ljava/lang/String;", "getComments", "()Ljava/util/List;", "getCryptpart", "getDate", "()Lorg/joda/time/DateTime;", "getDeleted", "()Z", "getMedicines", "getNoSymptom", "getPathLists", "getRemoteMeasureGroupId", "()J", "getServerCreatedDate", "getServerModifiedDate", "getSignalId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSource", "getSymptoms", "getUserId", "getWsId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/Long;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLorg/joda/time/DateTime;ZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/withings/manualLogging/data/webservice/note/WebServiceNoteGroup;", "equals", "other", "hashCode", "", "toString", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebServiceNoteGroup {
    @SerializedName("bucket")
    private final String bucket;
    @SerializedName("texts")
    private final List<WebServiceCommentNote> comments;
    @SerializedName("cryptpart")
    private final String cryptpart;
    @SerializedName("date")
    private final DateTime date;
    @SerializedName("deleted")
    private final boolean deleted;
    @SerializedName("medicines")
    private final List<WebServiceHealthAttributeNote> medicines;
    @SerializedName("no_symptom")
    private final boolean noSymptom;
    @SerializedName("pathlists")
    private final List<IdentifiedPathList> pathLists;
    @SerializedName("measgrpid")
    private final long remoteMeasureGroupId;
    @SerializedName(ConstantsWs.JSON_ACCOUNT_KEY_CREATED)
    private final DateTime serverCreatedDate;
    @SerializedName("modified")
    private final DateTime serverModifiedDate;
    @SerializedName("signalid")
    private final Long signalId;
    @SerializedName("source")
    private final String source;
    @SerializedName("symptoms")
    private final List<WebServiceHealthAttributeNote> symptoms;
    @SerializedName("userid")
    private final Long userId;
    @SerializedName("notegrpid")
    private final long wsId;

    public WebServiceNoteGroup(long j5, Long l5, long j11, Long l6, String str, String str2, String str3, List<IdentifiedPathList> pathLists, boolean z5, DateTime date, boolean z11, DateTime dateTime, DateTime dateTime2, List<WebServiceHealthAttributeNote> medicines, List<WebServiceHealthAttributeNote> symptoms, List<WebServiceCommentNote> comments) {
        u.j(pathLists, "pathLists");
        u.j(date, "date");
        u.j(medicines, "medicines");
        u.j(symptoms, "symptoms");
        u.j(comments, "comments");
        this.wsId = j5;
        this.userId = l5;
        this.remoteMeasureGroupId = j11;
        this.signalId = l6;
        this.cryptpart = str;
        this.bucket = str2;
        this.source = str3;
        this.pathLists = pathLists;
        this.deleted = z5;
        this.date = date;
        this.noSymptom = z11;
        this.serverCreatedDate = dateTime;
        this.serverModifiedDate = dateTime2;
        this.medicines = medicines;
        this.symptoms = symptoms;
        this.comments = comments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebServiceNoteGroup copy$default(WebServiceNoteGroup webServiceNoteGroup, long j5, Long l5, long j11, Long l6, String str, String str2, String str3, List list, boolean z5, DateTime dateTime, boolean z11, DateTime dateTime2, DateTime dateTime3, List list2, List list3, List list4, int i11, Object obj) {
        long j12;
        Long l11;
        long j13;
        Long l12;
        String str4;
        String str5;
        String str6;
        List<IdentifiedPathList> list5;
        boolean z12;
        DateTime dateTime4;
        boolean z13;
        DateTime dateTime5;
        DateTime dateTime6;
        List<WebServiceHealthAttributeNote> list6;
        List<WebServiceHealthAttributeNote> list7;
        List<WebServiceCommentNote> list8;
        if ((i11 & 1) != 0) {
            j12 = webServiceNoteGroup.wsId;
        } else {
            j12 = j5;
        }
        if ((i11 & 2) != 0) {
            l11 = webServiceNoteGroup.userId;
        } else {
            l11 = l5;
        }
        if ((i11 & 4) != 0) {
            j13 = webServiceNoteGroup.remoteMeasureGroupId;
        } else {
            j13 = j11;
        }
        if ((i11 & 8) != 0) {
            l12 = webServiceNoteGroup.signalId;
        } else {
            l12 = l6;
        }
        if ((i11 & 16) != 0) {
            str4 = webServiceNoteGroup.cryptpart;
        } else {
            str4 = str;
        }
        if ((i11 & 32) != 0) {
            str5 = webServiceNoteGroup.bucket;
        } else {
            str5 = str2;
        }
        if ((i11 & 64) != 0) {
            str6 = webServiceNoteGroup.source;
        } else {
            str6 = str3;
        }
        if ((i11 & 128) != 0) {
            list5 = webServiceNoteGroup.pathLists;
        } else {
            list5 = list;
        }
        if ((i11 & 256) != 0) {
            z12 = webServiceNoteGroup.deleted;
        } else {
            z12 = z5;
        }
        if ((i11 & 512) != 0) {
            dateTime4 = webServiceNoteGroup.date;
        } else {
            dateTime4 = dateTime;
        }
        if ((i11 & 1024) != 0) {
            z13 = webServiceNoteGroup.noSymptom;
        } else {
            z13 = z11;
        }
        if ((i11 & ModuleCopy.f28574b) != 0) {
            dateTime5 = webServiceNoteGroup.serverCreatedDate;
        } else {
            dateTime5 = dateTime2;
        }
        DateTime dateTime7 = dateTime5;
        if ((i11 & 4096) != 0) {
            dateTime6 = webServiceNoteGroup.serverModifiedDate;
        } else {
            dateTime6 = dateTime3;
        }
        DateTime dateTime8 = dateTime6;
        if ((i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            list6 = webServiceNoteGroup.medicines;
        } else {
            list6 = list2;
        }
        List<WebServiceHealthAttributeNote> list9 = list6;
        if ((i11 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            list7 = webServiceNoteGroup.symptoms;
        } else {
            list7 = list3;
        }
        if ((i11 & Utils.MAX_EVENT_SIZE) != 0) {
            list8 = webServiceNoteGroup.comments;
        } else {
            list8 = list4;
        }
        return webServiceNoteGroup.copy(j12, l11, j13, l12, str4, str5, str6, list5, z12, dateTime4, z13, dateTime7, dateTime8, list9, list7, list8);
    }

    public final long component1() {
        return this.wsId;
    }

    public final DateTime component10() {
        return this.date;
    }

    public final boolean component11() {
        return this.noSymptom;
    }

    public final DateTime component12() {
        return this.serverCreatedDate;
    }

    public final DateTime component13() {
        return this.serverModifiedDate;
    }

    public final List<WebServiceHealthAttributeNote> component14() {
        return this.medicines;
    }

    public final List<WebServiceHealthAttributeNote> component15() {
        return this.symptoms;
    }

    public final List<WebServiceCommentNote> component16() {
        return this.comments;
    }

    public final Long component2() {
        return this.userId;
    }

    public final long component3() {
        return this.remoteMeasureGroupId;
    }

    public final Long component4() {
        return this.signalId;
    }

    public final String component5() {
        return this.cryptpart;
    }

    public final String component6() {
        return this.bucket;
    }

    public final String component7() {
        return this.source;
    }

    public final List<IdentifiedPathList> component8() {
        return this.pathLists;
    }

    public final boolean component9() {
        return this.deleted;
    }

    public final WebServiceNoteGroup copy(long j5, Long l5, long j11, Long l6, String str, String str2, String str3, List<IdentifiedPathList> pathLists, boolean z5, DateTime date, boolean z11, DateTime dateTime, DateTime dateTime2, List<WebServiceHealthAttributeNote> medicines, List<WebServiceHealthAttributeNote> symptoms, List<WebServiceCommentNote> comments) {
        u.j(pathLists, "pathLists");
        u.j(date, "date");
        u.j(medicines, "medicines");
        u.j(symptoms, "symptoms");
        u.j(comments, "comments");
        return new WebServiceNoteGroup(j5, l5, j11, l6, str, str2, str3, pathLists, z5, date, z11, dateTime, dateTime2, medicines, symptoms, comments);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebServiceNoteGroup)) {
            return false;
        }
        WebServiceNoteGroup webServiceNoteGroup = (WebServiceNoteGroup) obj;
        if (this.wsId == webServiceNoteGroup.wsId && u.e(this.userId, webServiceNoteGroup.userId) && this.remoteMeasureGroupId == webServiceNoteGroup.remoteMeasureGroupId && u.e(this.signalId, webServiceNoteGroup.signalId) && u.e(this.cryptpart, webServiceNoteGroup.cryptpart) && u.e(this.bucket, webServiceNoteGroup.bucket) && u.e(this.source, webServiceNoteGroup.source) && u.e(this.pathLists, webServiceNoteGroup.pathLists) && this.deleted == webServiceNoteGroup.deleted && u.e(this.date, webServiceNoteGroup.date) && this.noSymptom == webServiceNoteGroup.noSymptom && u.e(this.serverCreatedDate, webServiceNoteGroup.serverCreatedDate) && u.e(this.serverModifiedDate, webServiceNoteGroup.serverModifiedDate) && u.e(this.medicines, webServiceNoteGroup.medicines) && u.e(this.symptoms, webServiceNoteGroup.symptoms) && u.e(this.comments, webServiceNoteGroup.comments)) {
            return true;
        }
        return false;
    }

    public final String getBucket() {
        return this.bucket;
    }

    public final List<WebServiceCommentNote> getComments() {
        return this.comments;
    }

    public final String getCryptpart() {
        return this.cryptpart;
    }

    public final DateTime getDate() {
        return this.date;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final List<WebServiceHealthAttributeNote> getMedicines() {
        return this.medicines;
    }

    public final boolean getNoSymptom() {
        return this.noSymptom;
    }

    public final List<IdentifiedPathList> getPathLists() {
        return this.pathLists;
    }

    public final long getRemoteMeasureGroupId() {
        return this.remoteMeasureGroupId;
    }

    public final DateTime getServerCreatedDate() {
        return this.serverCreatedDate;
    }

    public final DateTime getServerModifiedDate() {
        return this.serverModifiedDate;
    }

    public final Long getSignalId() {
        return this.signalId;
    }

    public final String getSource() {
        return this.source;
    }

    public final List<WebServiceHealthAttributeNote> getSymptoms() {
        return this.symptoms;
    }

    public final Long getUserId() {
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
        int hashCode7 = Long.hashCode(this.wsId) * 31;
        Long l5 = this.userId;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int a11 = c.a(this.remoteMeasureGroupId, (hashCode7 + hashCode) * 31, 31);
        Long l6 = this.signalId;
        if (l6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l6.hashCode();
        }
        int i12 = (a11 + hashCode2) * 31;
        String str = this.cryptpart;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str2 = this.bucket;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str3 = this.source;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int a12 = y1.a(this.noSymptom, a.b(this.date, y1.a(this.deleted, e.b(this.pathLists, (i14 + hashCode5) * 31, 31), 31), 31), 31);
        DateTime dateTime = this.serverCreatedDate;
        if (dateTime == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = dateTime.hashCode();
        }
        int i15 = (a12 + hashCode6) * 31;
        DateTime dateTime2 = this.serverModifiedDate;
        if (dateTime2 != null) {
            i11 = dateTime2.hashCode();
        }
        return this.comments.hashCode() + e.b(this.symptoms, e.b(this.medicines, (i15 + i11) * 31, 31), 31);
    }

    public String toString() {
        long j5 = this.wsId;
        Long l5 = this.userId;
        long j11 = this.remoteMeasureGroupId;
        Long l6 = this.signalId;
        String str = this.cryptpart;
        String str2 = this.bucket;
        String str3 = this.source;
        List<IdentifiedPathList> list = this.pathLists;
        boolean z5 = this.deleted;
        DateTime dateTime = this.date;
        boolean z11 = this.noSymptom;
        DateTime dateTime2 = this.serverCreatedDate;
        DateTime dateTime3 = this.serverModifiedDate;
        List<WebServiceHealthAttributeNote> list2 = this.medicines;
        List<WebServiceHealthAttributeNote> list3 = this.symptoms;
        List<WebServiceCommentNote> list4 = this.comments;
        StringBuilder sb2 = new StringBuilder("WebServiceNoteGroup(wsId=");
        sb2.append(j5);
        sb2.append(", userId=");
        sb2.append(l5);
        g.d(sb2, ", remoteMeasureGroupId=", j11, ", signalId=");
        sb2.append(l6);
        sb2.append(", cryptpart=");
        sb2.append(str);
        sb2.append(", bucket=");
        b.d(sb2, str2, ", source=", str3, ", pathLists=");
        sb2.append(list);
        sb2.append(", deleted=");
        sb2.append(z5);
        sb2.append(", date=");
        sb2.append(dateTime);
        sb2.append(", noSymptom=");
        sb2.append(z11);
        sb2.append(", serverCreatedDate=");
        sb2.append(dateTime2);
        sb2.append(", serverModifiedDate=");
        sb2.append(dateTime3);
        sb2.append(", medicines=");
        com.withings.contentproviders.eightfit.model.webservice.a.a(sb2, list2, ", symptoms=", list3, ", comments=");
        return d.i(sb2, list4, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ WebServiceNoteGroup(long r23, java.lang.Long r25, long r26, java.lang.Long r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.util.List r32, boolean r33, org.joda.time.DateTime r34, boolean r35, org.joda.time.DateTime r36, org.joda.time.DateTime r37, java.util.List r38, java.util.List r39, java.util.List r40, int r41, kotlin.jvm.internal.m r42) {
        /*
            r22 = this;
            r0 = r41
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L9
            r6 = r2
            goto Lb
        L9:
            r6 = r25
        Lb:
            r1 = r0 & 4
            if (r1 == 0) goto L13
            r3 = -1
            r7 = r3
            goto L15
        L13:
            r7 = r26
        L15:
            r1 = r0 & 8
            if (r1 == 0) goto L1b
            r9 = r2
            goto L1d
        L1b:
            r9 = r28
        L1d:
            r1 = r0 & 16
            if (r1 == 0) goto L23
            r10 = r2
            goto L25
        L23:
            r10 = r29
        L25:
            r1 = r0 & 32
            if (r1 == 0) goto L2b
            r11 = r2
            goto L2d
        L2b:
            r11 = r30
        L2d:
            r1 = r0 & 64
            if (r1 == 0) goto L33
            r12 = r2
            goto L35
        L33:
            r12 = r31
        L35:
            r1 = r0 & 128(0x80, float:1.794E-43)
            kotlin.collections.i0 r3 = kotlin.collections.i0.f76187a
            if (r1 == 0) goto L3d
            r13 = r3
            goto L3f
        L3d:
            r13 = r32
        L3f:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r4 = 0
            if (r1 == 0) goto L46
            r14 = r4
            goto L48
        L46:
            r14 = r33
        L48:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L57
            org.joda.time.DateTime r1 = org.joda.time.DateTime.now()
            java.lang.String r5 = "now(...)"
            kotlin.jvm.internal.u.i(r1, r5)
            r15 = r1
            goto L59
        L57:
            r15 = r34
        L59:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L60
            r16 = r4
            goto L62
        L60:
            r16 = r35
        L62:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L69
            r17 = r2
            goto L6b
        L69:
            r17 = r36
        L6b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L72
            r18 = r2
            goto L74
        L72:
            r18 = r37
        L74:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L7b
            r19 = r3
            goto L7d
        L7b:
            r19 = r38
        L7d:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L84
            r20 = r3
            goto L86
        L84:
            r20 = r39
        L86:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L8f
            r21 = r3
            goto L91
        L8f:
            r21 = r40
        L91:
            r3 = r22
            r4 = r23
            r3.<init>(r4, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.data.webservice.note.WebServiceNoteGroup.<init>(long, java.lang.Long, long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, org.joda.time.DateTime, boolean, org.joda.time.DateTime, org.joda.time.DateTime, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.m):void");
    }
}
