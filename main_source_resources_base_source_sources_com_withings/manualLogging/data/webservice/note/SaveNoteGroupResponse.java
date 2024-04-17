package com.withings.manualLogging.data.webservice.note;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: SaveNoteGroupResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/withings/manualLogging/data/webservice/note/SaveNoteGroupResponse;", "", "noteGroup", "Lcom/withings/manualLogging/data/webservice/note/WebServiceNoteGroup;", "(Lcom/withings/manualLogging/data/webservice/note/WebServiceNoteGroup;)V", "getNoteGroup", "()Lcom/withings/manualLogging/data/webservice/note/WebServiceNoteGroup;", "setNoteGroup", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SaveNoteGroupResponse {
    @SerializedName("data")
    private WebServiceNoteGroup noteGroup;

    public SaveNoteGroupResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ SaveNoteGroupResponse copy$default(SaveNoteGroupResponse saveNoteGroupResponse, WebServiceNoteGroup webServiceNoteGroup, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            webServiceNoteGroup = saveNoteGroupResponse.noteGroup;
        }
        return saveNoteGroupResponse.copy(webServiceNoteGroup);
    }

    public final WebServiceNoteGroup component1() {
        return this.noteGroup;
    }

    public final SaveNoteGroupResponse copy(WebServiceNoteGroup webServiceNoteGroup) {
        return new SaveNoteGroupResponse(webServiceNoteGroup);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SaveNoteGroupResponse) && u.e(this.noteGroup, ((SaveNoteGroupResponse) obj).noteGroup)) {
            return true;
        }
        return false;
    }

    public final WebServiceNoteGroup getNoteGroup() {
        return this.noteGroup;
    }

    public int hashCode() {
        WebServiceNoteGroup webServiceNoteGroup = this.noteGroup;
        if (webServiceNoteGroup == null) {
            return 0;
        }
        return webServiceNoteGroup.hashCode();
    }

    public final void setNoteGroup(WebServiceNoteGroup webServiceNoteGroup) {
        this.noteGroup = webServiceNoteGroup;
    }

    public String toString() {
        WebServiceNoteGroup webServiceNoteGroup = this.noteGroup;
        return "SaveNoteGroupResponse(noteGroup=" + webServiceNoteGroup + ")";
    }

    public SaveNoteGroupResponse(WebServiceNoteGroup webServiceNoteGroup) {
        this.noteGroup = webServiceNoteGroup;
    }

    public /* synthetic */ SaveNoteGroupResponse(WebServiceNoteGroup webServiceNoteGroup, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : webServiceNoteGroup);
    }
}
