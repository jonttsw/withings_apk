package com.withings.manualLogging.data.webservice.note;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WebServiceNoteGroup.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/withings/manualLogging/data/webservice/note/IdentifiedPathList;", "", "wsId", "", "pathList", "Lcom/withings/manualLogging/data/webservice/note/PathList;", "(JLcom/withings/manualLogging/data/webservice/note/PathList;)V", "getPathList", "()Lcom/withings/manualLogging/data/webservice/note/PathList;", "getWsId", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IdentifiedPathList {
    @SerializedName("pathlist")
    private final PathList pathList;
    @SerializedName("id")
    private final long wsId;

    public IdentifiedPathList(long j5, PathList pathList) {
        u.j(pathList, "pathList");
        this.wsId = j5;
        this.pathList = pathList;
    }

    public static /* synthetic */ IdentifiedPathList copy$default(IdentifiedPathList identifiedPathList, long j5, PathList pathList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j5 = identifiedPathList.wsId;
        }
        if ((i11 & 2) != 0) {
            pathList = identifiedPathList.pathList;
        }
        return identifiedPathList.copy(j5, pathList);
    }

    public final long component1() {
        return this.wsId;
    }

    public final PathList component2() {
        return this.pathList;
    }

    public final IdentifiedPathList copy(long j5, PathList pathList) {
        u.j(pathList, "pathList");
        return new IdentifiedPathList(j5, pathList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentifiedPathList)) {
            return false;
        }
        IdentifiedPathList identifiedPathList = (IdentifiedPathList) obj;
        if (this.wsId == identifiedPathList.wsId && u.e(this.pathList, identifiedPathList.pathList)) {
            return true;
        }
        return false;
    }

    public final PathList getPathList() {
        return this.pathList;
    }

    public final long getWsId() {
        return this.wsId;
    }

    public int hashCode() {
        return this.pathList.hashCode() + (Long.hashCode(this.wsId) * 31);
    }

    public String toString() {
        long j5 = this.wsId;
        PathList pathList = this.pathList;
        return "IdentifiedPathList(wsId=" + j5 + ", pathList=" + pathList + ")";
    }
}
