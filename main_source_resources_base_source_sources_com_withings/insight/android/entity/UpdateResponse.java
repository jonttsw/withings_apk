package com.withings.insight.android.entity;

import ah.a;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
/* compiled from: UpdateResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/insight/android/entity/UpdateResponse;", "", "modified", "", "(J)V", "getModified", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UpdateResponse {
    private final long modified;

    public UpdateResponse() {
        this(0L, 1, null);
    }

    public static /* synthetic */ UpdateResponse copy$default(UpdateResponse updateResponse, long j5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j5 = updateResponse.modified;
        }
        return updateResponse.copy(j5);
    }

    public final long component1() {
        return this.modified;
    }

    public final UpdateResponse copy(long j5) {
        return new UpdateResponse(j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof UpdateResponse) && this.modified == ((UpdateResponse) obj).modified) {
            return true;
        }
        return false;
    }

    public final long getModified() {
        return this.modified;
    }

    public int hashCode() {
        return Long.hashCode(this.modified);
    }

    public String toString() {
        return a.c("UpdateResponse(modified=", this.modified, ")");
    }

    public UpdateResponse(long j5) {
        this.modified = j5;
    }

    public /* synthetic */ UpdateResponse(long j5, int i11, m mVar) {
        this((i11 & 1) != 0 ? 0L : j5);
    }
}
