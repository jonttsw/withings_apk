package com.withings.manualLogging.data.webservice.note;

import androidx.activity.result.c;
import androidx.work.impl.g;
import com.google.gson.annotations.SerializedName;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: WebServiceNote.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/withings/manualLogging/data/webservice/note/WebServiceCommentNote;", "Lcom/withings/manualLogging/data/webservice/note/WebServiceNote;", "wsId", "", "text", "", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "modified", "(JLjava/lang/String;JJ)V", "getCreated", "()J", "getModified", "getText", "()Ljava/lang/String;", "getWsId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebServiceCommentNote implements WebServiceNote {
    @SerializedName(ConstantsWs.JSON_ACCOUNT_KEY_CREATED)
    private final long created;
    @SerializedName("modified")
    private final long modified;
    @SerializedName("text")
    private final String text;
    @SerializedName("id")
    private final long wsId;

    public WebServiceCommentNote(long j5, String str, long j11, long j12) {
        this.wsId = j5;
        this.text = str;
        this.created = j11;
        this.modified = j12;
    }

    public static /* synthetic */ WebServiceCommentNote copy$default(WebServiceCommentNote webServiceCommentNote, long j5, String str, long j11, long j12, int i11, Object obj) {
        long j13;
        String str2;
        long j14;
        long j15;
        if ((i11 & 1) != 0) {
            j13 = webServiceCommentNote.wsId;
        } else {
            j13 = j5;
        }
        if ((i11 & 2) != 0) {
            str2 = webServiceCommentNote.text;
        } else {
            str2 = str;
        }
        if ((i11 & 4) != 0) {
            j14 = webServiceCommentNote.created;
        } else {
            j14 = j11;
        }
        if ((i11 & 8) != 0) {
            j15 = webServiceCommentNote.modified;
        } else {
            j15 = j12;
        }
        return webServiceCommentNote.copy(j13, str2, j14, j15);
    }

    public final long component1() {
        return this.wsId;
    }

    public final String component2() {
        return this.text;
    }

    public final long component3() {
        return this.created;
    }

    public final long component4() {
        return this.modified;
    }

    public final WebServiceCommentNote copy(long j5, String str, long j11, long j12) {
        return new WebServiceCommentNote(j5, str, j11, j12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebServiceCommentNote)) {
            return false;
        }
        WebServiceCommentNote webServiceCommentNote = (WebServiceCommentNote) obj;
        if (this.wsId == webServiceCommentNote.wsId && u.e(this.text, webServiceCommentNote.text) && this.created == webServiceCommentNote.created && this.modified == webServiceCommentNote.modified) {
            return true;
        }
        return false;
    }

    public final long getCreated() {
        return this.created;
    }

    public final long getModified() {
        return this.modified;
    }

    public final String getText() {
        return this.text;
    }

    @Override // com.withings.manualLogging.data.webservice.note.WebServiceNote
    public long getWsId() {
        return this.wsId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.wsId) * 31;
        String str = this.text;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Long.hashCode(this.modified) + c.a(this.created, (hashCode2 + hashCode) * 31, 31);
    }

    public String toString() {
        long j5 = this.wsId;
        String str = this.text;
        long j11 = this.created;
        long j12 = this.modified;
        StringBuilder sb2 = new StringBuilder("WebServiceCommentNote(wsId=");
        sb2.append(j5);
        sb2.append(", text=");
        sb2.append(str);
        g.d(sb2, ", created=", j11, ", modified=");
        return android.support.v4.media.session.c.c(sb2, j12, ")");
    }

    public /* synthetic */ WebServiceCommentNote(long j5, String str, long j11, long j12, int i11, m mVar) {
        this(j5, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? 0L : j11, (i11 & 8) != 0 ? 0L : j12);
    }
}
