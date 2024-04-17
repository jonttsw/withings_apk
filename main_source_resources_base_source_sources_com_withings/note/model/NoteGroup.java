package com.withings.note.model;

import androidx.activity.result.c;
import androidx.camera.core.y1;
import com.google.android.gms.internal.mlkit_common.a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import okhttp3.internal.http2.Http2;
import org.joda.time.DateTime;
/* compiled from: NoteGroup.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B¯\u0001\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0002\u0010\u0015BÝ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0002\u0010\u001cJ\t\u0010N\u001a\u00020\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010Q\u001a\u00020\u0011HÆ\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017HÆ\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017HÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010*J\t\u0010V\u001a\u00020\u0011HÆ\u0003J\t\u0010W\u001a\u00020\u0011HÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010*J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010]\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010^\u001a\u00020\fHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0006\u0010`\u001a\u00020\u0000Jæ\u0001\u0010`\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0011HÆ\u0001¢\u0006\u0002\u0010aJ\u0013\u0010b\u001a\u00020\u00112\b\u0010c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010d\u001a\u00020eHÖ\u0001J\b\u0010f\u001a\u00020\nH\u0016R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0013\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\"\"\u0004\b1\u0010$R$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010&\"\u0004\b7\u0010(R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00109\"\u0004\b=\u0010;R \u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\"\"\u0004\b?\u0010$R \u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\"\"\u0004\bA\u0010$R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\bB\u0010*\"\u0004\bC\u0010,R$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00103\"\u0004\bE\u00105R\u001a\u0010\u0014\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010&\"\u0004\bG\u0010(R$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u00103\"\u0004\bI\u00105R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\bJ\u0010*\"\u0004\bK\u0010,R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\bL\u0010*\"\u0004\bM\u0010,¨\u0006g"}, d2 = {"Lcom/withings/note/model/NoteGroup;", "", "noteGroupId", "", "wsId", NavigationArguments.USER_ID, "remoteMeasureGroupId", "localMeasureGroupId", "localHeartSignalMeasurementId", "cryptpart", "", "date", "Lorg/joda/time/DateTime;", "serverCreatedDate", "serverModifiedDate", "localModifiedDate", "noSymptom", "", "signalId", "deleted", "synced", "(JLjava/lang/Long;Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/Long;ZZ)V", "texts", "", "Lcom/withings/note/model/NoteText;", "symptoms", "Lcom/withings/note/model/NoteHealthAttribute;", "medicines", "(JLjava/lang/Long;Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;ZZ)V", "getCryptpart", "()Ljava/lang/String;", "setCryptpart", "(Ljava/lang/String;)V", "getDate", "()Lorg/joda/time/DateTime;", "setDate", "(Lorg/joda/time/DateTime;)V", "getDeleted", "()Z", "setDeleted", "(Z)V", "getLocalHeartSignalMeasurementId", "()Ljava/lang/Long;", "setLocalHeartSignalMeasurementId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getLocalMeasureGroupId", "setLocalMeasureGroupId", "getLocalModifiedDate", "setLocalModifiedDate", "getMedicines", "()Ljava/util/List;", "setMedicines", "(Ljava/util/List;)V", "getNoSymptom", "setNoSymptom", "getNoteGroupId", "()J", "setNoteGroupId", "(J)V", "getRemoteMeasureGroupId", "setRemoteMeasureGroupId", "getServerCreatedDate", "setServerCreatedDate", "getServerModifiedDate", "setServerModifiedDate", "getSignalId", "setSignalId", "getSymptoms", "setSymptoms", "getSynced", "setSynced", "getTexts", "setTexts", "getUserId", "setUserId", "getWsId", "setWsId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/Long;Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;ZZ)Lcom/withings/note/model/NoteGroup;", "equals", "other", "hashCode", "", "toString", "note_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NoteGroup {
    @SerializedName("cryptpart")
    private String cryptpart;
    @SerializedName("date")
    private DateTime date;
    private boolean deleted;
    private Long localHeartSignalMeasurementId;
    private Long localMeasureGroupId;
    private DateTime localModifiedDate;
    private List<NoteHealthAttribute> medicines;
    @SerializedName("no_symptom")
    private boolean noSymptom;
    private long noteGroupId;
    @SerializedName("measgrpid")
    private long remoteMeasureGroupId;
    @SerializedName(ConstantsWs.JSON_ACCOUNT_KEY_CREATED)
    private DateTime serverCreatedDate;
    @SerializedName("modified")
    private DateTime serverModifiedDate;
    @SerializedName("signalid")
    private Long signalId;
    private List<NoteHealthAttribute> symptoms;
    private boolean synced;
    private List<NoteText> texts;
    @SerializedName("userid")
    private Long userId;
    @SerializedName("notegrpid")
    private Long wsId;

    public NoteGroup() {
        this(0L, null, null, 0L, null, null, null, null, null, null, null, false, null, null, null, null, false, false, 262143, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoteGroup copy$default(NoteGroup noteGroup, long j5, Long l5, Long l6, long j11, Long l11, Long l12, String str, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, boolean z5, List list, List list2, List list3, Long l13, boolean z11, boolean z12, int i11, Object obj) {
        return noteGroup.copy((i11 & 1) != 0 ? noteGroup.noteGroupId : j5, (i11 & 2) != 0 ? noteGroup.wsId : l5, (i11 & 4) != 0 ? noteGroup.userId : l6, (i11 & 8) != 0 ? noteGroup.remoteMeasureGroupId : j11, (i11 & 16) != 0 ? noteGroup.localMeasureGroupId : l11, (i11 & 32) != 0 ? noteGroup.localHeartSignalMeasurementId : l12, (i11 & 64) != 0 ? noteGroup.cryptpart : str, (i11 & 128) != 0 ? noteGroup.date : dateTime, (i11 & 256) != 0 ? noteGroup.serverCreatedDate : dateTime2, (i11 & 512) != 0 ? noteGroup.serverModifiedDate : dateTime3, (i11 & 1024) != 0 ? noteGroup.localModifiedDate : dateTime4, (i11 & ModuleCopy.f28574b) != 0 ? noteGroup.noSymptom : z5, (i11 & 4096) != 0 ? noteGroup.texts : list, (i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? noteGroup.symptoms : list2, (i11 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? noteGroup.medicines : list3, (i11 & Utils.MAX_EVENT_SIZE) != 0 ? noteGroup.signalId : l13, (i11 & 65536) != 0 ? noteGroup.deleted : z11, (i11 & 131072) != 0 ? noteGroup.synced : z12);
    }

    public final long component1() {
        return this.noteGroupId;
    }

    public final DateTime component10() {
        return this.serverModifiedDate;
    }

    public final DateTime component11() {
        return this.localModifiedDate;
    }

    public final boolean component12() {
        return this.noSymptom;
    }

    public final List<NoteText> component13() {
        return this.texts;
    }

    public final List<NoteHealthAttribute> component14() {
        return this.symptoms;
    }

    public final List<NoteHealthAttribute> component15() {
        return this.medicines;
    }

    public final Long component16() {
        return this.signalId;
    }

    public final boolean component17() {
        return this.deleted;
    }

    public final boolean component18() {
        return this.synced;
    }

    public final Long component2() {
        return this.wsId;
    }

    public final Long component3() {
        return this.userId;
    }

    public final long component4() {
        return this.remoteMeasureGroupId;
    }

    public final Long component5() {
        return this.localMeasureGroupId;
    }

    public final Long component6() {
        return this.localHeartSignalMeasurementId;
    }

    public final String component7() {
        return this.cryptpart;
    }

    public final DateTime component8() {
        return this.date;
    }

    public final DateTime component9() {
        return this.serverCreatedDate;
    }

    public final NoteGroup copy(long j5, Long l5, Long l6, long j11, Long l11, Long l12, String str, DateTime date, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, boolean z5, List<NoteText> texts, List<NoteHealthAttribute> symptoms, List<NoteHealthAttribute> medicines, Long l13, boolean z11, boolean z12) {
        u.j(date, "date");
        u.j(texts, "texts");
        u.j(symptoms, "symptoms");
        u.j(medicines, "medicines");
        return new NoteGroup(j5, l5, l6, j11, l11, l12, str, date, dateTime, dateTime2, dateTime3, z5, texts, symptoms, medicines, l13, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoteGroup)) {
            return false;
        }
        NoteGroup noteGroup = (NoteGroup) obj;
        if (this.noteGroupId == noteGroup.noteGroupId && u.e(this.wsId, noteGroup.wsId) && u.e(this.userId, noteGroup.userId) && this.remoteMeasureGroupId == noteGroup.remoteMeasureGroupId && u.e(this.localMeasureGroupId, noteGroup.localMeasureGroupId) && u.e(this.localHeartSignalMeasurementId, noteGroup.localHeartSignalMeasurementId) && u.e(this.cryptpart, noteGroup.cryptpart) && u.e(this.date, noteGroup.date) && u.e(this.serverCreatedDate, noteGroup.serverCreatedDate) && u.e(this.serverModifiedDate, noteGroup.serverModifiedDate) && u.e(this.localModifiedDate, noteGroup.localModifiedDate) && this.noSymptom == noteGroup.noSymptom && u.e(this.texts, noteGroup.texts) && u.e(this.symptoms, noteGroup.symptoms) && u.e(this.medicines, noteGroup.medicines) && u.e(this.signalId, noteGroup.signalId) && this.deleted == noteGroup.deleted && this.synced == noteGroup.synced) {
            return true;
        }
        return false;
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

    public final Long getLocalHeartSignalMeasurementId() {
        return this.localHeartSignalMeasurementId;
    }

    public final Long getLocalMeasureGroupId() {
        return this.localMeasureGroupId;
    }

    public final DateTime getLocalModifiedDate() {
        return this.localModifiedDate;
    }

    public final List<NoteHealthAttribute> getMedicines() {
        return this.medicines;
    }

    public final boolean getNoSymptom() {
        return this.noSymptom;
    }

    public final long getNoteGroupId() {
        return this.noteGroupId;
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

    public final List<NoteHealthAttribute> getSymptoms() {
        return this.symptoms;
    }

    public final boolean getSynced() {
        return this.synced;
    }

    public final List<NoteText> getTexts() {
        return this.texts;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final Long getWsId() {
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
        int hashCode9 = Long.hashCode(this.noteGroupId) * 31;
        Long l5 = this.wsId;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = (hashCode9 + hashCode) * 31;
        Long l6 = this.userId;
        if (l6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l6.hashCode();
        }
        int a11 = c.a(this.remoteMeasureGroupId, (i12 + hashCode2) * 31, 31);
        Long l11 = this.localMeasureGroupId;
        if (l11 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l11.hashCode();
        }
        int i13 = (a11 + hashCode3) * 31;
        Long l12 = this.localHeartSignalMeasurementId;
        if (l12 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l12.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str = this.cryptpart;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int b10 = a.b(this.date, (i14 + hashCode5) * 31, 31);
        DateTime dateTime = this.serverCreatedDate;
        if (dateTime == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = dateTime.hashCode();
        }
        int i15 = (b10 + hashCode6) * 31;
        DateTime dateTime2 = this.serverModifiedDate;
        if (dateTime2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = dateTime2.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        DateTime dateTime3 = this.localModifiedDate;
        if (dateTime3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = dateTime3.hashCode();
        }
        int b11 = e.b(this.medicines, e.b(this.symptoms, e.b(this.texts, y1.a(this.noSymptom, (i16 + hashCode8) * 31, 31), 31), 31), 31);
        Long l13 = this.signalId;
        if (l13 != null) {
            i11 = l13.hashCode();
        }
        return Boolean.hashCode(this.synced) + y1.a(this.deleted, (b11 + i11) * 31, 31);
    }

    public final void setCryptpart(String str) {
        this.cryptpart = str;
    }

    public final void setDate(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.date = dateTime;
    }

    public final void setDeleted(boolean z5) {
        this.deleted = z5;
    }

    public final void setLocalHeartSignalMeasurementId(Long l5) {
        this.localHeartSignalMeasurementId = l5;
    }

    public final void setLocalMeasureGroupId(Long l5) {
        this.localMeasureGroupId = l5;
    }

    public final void setLocalModifiedDate(DateTime dateTime) {
        this.localModifiedDate = dateTime;
    }

    public final void setMedicines(List<NoteHealthAttribute> list) {
        u.j(list, "<set-?>");
        this.medicines = list;
    }

    public final void setNoSymptom(boolean z5) {
        this.noSymptom = z5;
    }

    public final void setNoteGroupId(long j5) {
        this.noteGroupId = j5;
    }

    public final void setRemoteMeasureGroupId(long j5) {
        this.remoteMeasureGroupId = j5;
    }

    public final void setServerCreatedDate(DateTime dateTime) {
        this.serverCreatedDate = dateTime;
    }

    public final void setServerModifiedDate(DateTime dateTime) {
        this.serverModifiedDate = dateTime;
    }

    public final void setSignalId(Long l5) {
        this.signalId = l5;
    }

    public final void setSymptoms(List<NoteHealthAttribute> list) {
        u.j(list, "<set-?>");
        this.symptoms = list;
    }

    public final void setSynced(boolean z5) {
        this.synced = z5;
    }

    public final void setTexts(List<NoteText> list) {
        u.j(list, "<set-?>");
        this.texts = list;
    }

    public final void setUserId(Long l5) {
        this.userId = l5;
    }

    public final void setWsId(Long l5) {
        this.wsId = l5;
    }

    public String toString() {
        long j5 = this.noteGroupId;
        Long l5 = this.wsId;
        Long l6 = this.userId;
        long j11 = this.remoteMeasureGroupId;
        String str = this.cryptpart;
        DateTime dateTime = this.date;
        Long l11 = this.signalId;
        return " NoteGroup: noteGroupId = " + j5 + ", wsId = " + l5 + ", userId = " + l6 + ", remoteMeasureGroupId = " + j11 + ", cryptpart = " + str + ", date = " + dateTime + ", signalId=" + l11 + " ";
    }

    public NoteGroup(long j5, Long l5, Long l6, long j11, Long l11, Long l12, String str, DateTime date, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, boolean z5, List<NoteText> texts, List<NoteHealthAttribute> symptoms, List<NoteHealthAttribute> medicines, Long l13, boolean z11, boolean z12) {
        u.j(date, "date");
        u.j(texts, "texts");
        u.j(symptoms, "symptoms");
        u.j(medicines, "medicines");
        this.noteGroupId = j5;
        this.wsId = l5;
        this.userId = l6;
        this.remoteMeasureGroupId = j11;
        this.localMeasureGroupId = l11;
        this.localHeartSignalMeasurementId = l12;
        this.cryptpart = str;
        this.date = date;
        this.serverCreatedDate = dateTime;
        this.serverModifiedDate = dateTime2;
        this.localModifiedDate = dateTime3;
        this.noSymptom = z5;
        this.texts = texts;
        this.symptoms = symptoms;
        this.medicines = medicines;
        this.signalId = l13;
        this.deleted = z11;
        this.synced = z12;
    }

    public final NoteGroup copy() {
        List<NoteText> list = this.texts;
        ArrayList arrayList = new ArrayList(x.y(list, 10));
        for (NoteText noteText : list) {
            arrayList.add(noteText.copy());
        }
        ArrayList S0 = x.S0(arrayList);
        List<NoteHealthAttribute> list2 = this.symptoms;
        ArrayList arrayList2 = new ArrayList(x.y(list2, 10));
        for (NoteHealthAttribute noteHealthAttribute : list2) {
            arrayList2.add(noteHealthAttribute.copy());
        }
        ArrayList S02 = x.S0(arrayList2);
        List<NoteHealthAttribute> list3 = this.medicines;
        ArrayList arrayList3 = new ArrayList(x.y(list3, 10));
        for (NoteHealthAttribute noteHealthAttribute2 : list3) {
            arrayList3.add(noteHealthAttribute2.copy());
        }
        return copy$default(this, 0L, null, null, 0L, null, null, null, null, null, null, null, false, S0, S02, x.S0(arrayList3), null, false, false, 233471, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ NoteGroup(long r22, java.lang.Long r24, java.lang.Long r25, long r26, java.lang.Long r28, java.lang.Long r29, java.lang.String r30, org.joda.time.DateTime r31, org.joda.time.DateTime r32, org.joda.time.DateTime r33, org.joda.time.DateTime r34, boolean r35, java.util.List r36, java.util.List r37, java.util.List r38, java.lang.Long r39, boolean r40, boolean r41, int r42, kotlin.jvm.internal.m r43) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.note.model.NoteGroup.<init>(long, java.lang.Long, java.lang.Long, long, java.lang.Long, java.lang.Long, java.lang.String, org.joda.time.DateTime, org.joda.time.DateTime, org.joda.time.DateTime, org.joda.time.DateTime, boolean, java.util.List, java.util.List, java.util.List, java.lang.Long, boolean, boolean, int, kotlin.jvm.internal.m):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ NoteGroup(long r18, java.lang.Long r20, java.lang.Long r21, long r22, java.lang.Long r24, java.lang.Long r25, java.lang.String r26, org.joda.time.DateTime r27, org.joda.time.DateTime r28, org.joda.time.DateTime r29, org.joda.time.DateTime r30, boolean r31, java.lang.Long r32, boolean r33, boolean r34, int r35, kotlin.jvm.internal.m r36) {
        /*
            r17 = this;
            r0 = r35
            r1 = r0 & 1
            if (r1 == 0) goto L9
            r1 = 0
            goto Lb
        L9:
            r1 = r18
        Lb:
            r3 = r0 & 2
            if (r3 == 0) goto L11
            r3 = 0
            goto L13
        L11:
            r3 = r20
        L13:
            r5 = r0 & 4
            if (r5 == 0) goto L19
            r5 = 0
            goto L1b
        L19:
            r5 = r21
        L1b:
            r6 = r0 & 8
            if (r6 == 0) goto L22
            r6 = -1
            goto L24
        L22:
            r6 = r22
        L24:
            r8 = r0 & 16
            if (r8 == 0) goto L2a
            r8 = 0
            goto L2c
        L2a:
            r8 = r24
        L2c:
            r9 = r0 & 32
            if (r9 == 0) goto L32
            r9 = 0
            goto L34
        L32:
            r9 = r25
        L34:
            r10 = r0 & 64
            if (r10 == 0) goto L3a
            r10 = 0
            goto L3c
        L3a:
            r10 = r26
        L3c:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L4a
            org.joda.time.DateTime r11 = org.joda.time.DateTime.now()
            java.lang.String r12 = "now(...)"
            kotlin.jvm.internal.u.i(r11, r12)
            goto L4c
        L4a:
            r11 = r27
        L4c:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L52
            r12 = 0
            goto L54
        L52:
            r12 = r28
        L54:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L5a
            r13 = 0
            goto L5c
        L5a:
            r13 = r29
        L5c:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L62
            r14 = 0
            goto L64
        L62:
            r14 = r30
        L64:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            r16 = 0
            if (r15 == 0) goto L6d
            r15 = r16
            goto L6f
        L6d:
            r15 = r31
        L6f:
            r4 = r0 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L75
            r4 = 0
            goto L77
        L75:
            r4 = r32
        L77:
            r36 = r4
            r4 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L80
            r4 = r16
            goto L82
        L80:
            r4 = r33
        L82:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L87
            goto L89
        L87:
            r16 = r34
        L89:
            r18 = r17
            r19 = r1
            r21 = r3
            r22 = r5
            r23 = r6
            r25 = r8
            r26 = r9
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r14
            r32 = r15
            r33 = r36
            r34 = r4
            r35 = r16
            r18.<init>(r19, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.note.model.NoteGroup.<init>(long, java.lang.Long, java.lang.Long, long, java.lang.Long, java.lang.Long, java.lang.String, org.joda.time.DateTime, org.joda.time.DateTime, org.joda.time.DateTime, org.joda.time.DateTime, boolean, java.lang.Long, boolean, boolean, int, kotlin.jvm.internal.m):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoteGroup(long j5, Long l5, Long l6, long j11, Long l11, Long l12, String str, DateTime date, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, boolean z5, Long l13, boolean z11, boolean z12) {
        this(j5, l5, l6, j11, l11, l12, str, date, dateTime, dateTime2, dateTime3, z5, new ArrayList(), new ArrayList(), new ArrayList(), l13, z11, z12);
        u.j(date, "date");
    }
}
