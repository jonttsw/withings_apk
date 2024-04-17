package com.withings.screen.model;

import ah.a;
import kotlin.Metadata;
/* compiled from: WsModels.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/screen/model/StoreDeviceScreenResponse;", "", "modified", "", "(J)V", "getModified", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StoreDeviceScreenResponse {
    private final long modified;

    public StoreDeviceScreenResponse(long j5) {
        this.modified = j5;
    }

    public static /* synthetic */ StoreDeviceScreenResponse copy$default(StoreDeviceScreenResponse storeDeviceScreenResponse, long j5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j5 = storeDeviceScreenResponse.modified;
        }
        return storeDeviceScreenResponse.copy(j5);
    }

    public final long component1() {
        return this.modified;
    }

    public final StoreDeviceScreenResponse copy(long j5) {
        return new StoreDeviceScreenResponse(j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof StoreDeviceScreenResponse) && this.modified == ((StoreDeviceScreenResponse) obj).modified) {
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
        return a.c("StoreDeviceScreenResponse(modified=", this.modified, ")");
    }
}
