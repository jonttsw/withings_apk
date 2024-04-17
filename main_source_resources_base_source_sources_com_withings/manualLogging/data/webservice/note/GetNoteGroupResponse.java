package com.withings.manualLogging.data.webservice.note;

import androidx.camera.camera2.internal.e;
import androidx.camera.core.y1;
import com.google.gson.annotations.SerializedName;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: GetNoteGroupResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\bHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/withings/manualLogging/data/webservice/note/GetNoteGroupResponse;", "", "noteGroups", "", "Lcom/withings/manualLogging/data/webservice/note/WebServiceNoteGroup;", "hasMore", "", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "", "(Ljava/util/List;ZI)V", "getHasMore", "()Z", "getNoteGroups", "()Ljava/util/List;", "getOffset", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetNoteGroupResponse {
    @SerializedName(GetHealthAttributeResponse.FIELD_HAS_MORE_NAME)
    private final boolean hasMore;
    @SerializedName("data")
    private final List<WebServiceNoteGroup> noteGroups;
    @SerializedName(GetHealthAttributeResponse.FIELD_OFFSET_NAME)
    private final int offset;

    public GetNoteGroupResponse(List<WebServiceNoteGroup> noteGroups, boolean z5, int i11) {
        u.j(noteGroups, "noteGroups");
        this.noteGroups = noteGroups;
        this.hasMore = z5;
        this.offset = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetNoteGroupResponse copy$default(GetNoteGroupResponse getNoteGroupResponse, List list, boolean z5, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = getNoteGroupResponse.noteGroups;
        }
        if ((i12 & 2) != 0) {
            z5 = getNoteGroupResponse.hasMore;
        }
        if ((i12 & 4) != 0) {
            i11 = getNoteGroupResponse.offset;
        }
        return getNoteGroupResponse.copy(list, z5, i11);
    }

    public final List<WebServiceNoteGroup> component1() {
        return this.noteGroups;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final int component3() {
        return this.offset;
    }

    public final GetNoteGroupResponse copy(List<WebServiceNoteGroup> noteGroups, boolean z5, int i11) {
        u.j(noteGroups, "noteGroups");
        return new GetNoteGroupResponse(noteGroups, z5, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetNoteGroupResponse)) {
            return false;
        }
        GetNoteGroupResponse getNoteGroupResponse = (GetNoteGroupResponse) obj;
        if (u.e(this.noteGroups, getNoteGroupResponse.noteGroups) && this.hasMore == getNoteGroupResponse.hasMore && this.offset == getNoteGroupResponse.offset) {
            return true;
        }
        return false;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<WebServiceNoteGroup> getNoteGroups() {
        return this.noteGroups;
    }

    public final int getOffset() {
        return this.offset;
    }

    public int hashCode() {
        return Integer.hashCode(this.offset) + y1.a(this.hasMore, this.noteGroups.hashCode() * 31, 31);
    }

    public String toString() {
        List<WebServiceNoteGroup> list = this.noteGroups;
        boolean z5 = this.hasMore;
        int i11 = this.offset;
        StringBuilder sb2 = new StringBuilder("GetNoteGroupResponse(noteGroups=");
        sb2.append(list);
        sb2.append(", hasMore=");
        sb2.append(z5);
        sb2.append(", offset=");
        return e.c(sb2, i11, ")");
    }

    public /* synthetic */ GetNoteGroupResponse(List list, boolean z5, int i11, int i12, m mVar) {
        this(list, (i12 & 2) != 0 ? false : z5, (i12 & 4) != 0 ? 0 : i11);
    }
}
