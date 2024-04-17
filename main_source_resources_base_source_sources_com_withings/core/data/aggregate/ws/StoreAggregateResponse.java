package com.withings.core.data.aggregate.ws;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: StoreAggregateResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/core/data/aggregate/ws/StoreAggregateResponse;", "", "storetime", "Lorg/joda/time/DateTime;", "(Lorg/joda/time/DateTime;)V", "getStoretime", "()Lorg/joda/time/DateTime;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoreAggregateResponse {
    private final DateTime storetime;

    public StoreAggregateResponse(DateTime storetime) {
        u.j(storetime, "storetime");
        this.storetime = storetime;
    }

    public static /* synthetic */ StoreAggregateResponse copy$default(StoreAggregateResponse storeAggregateResponse, DateTime dateTime, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dateTime = storeAggregateResponse.storetime;
        }
        return storeAggregateResponse.copy(dateTime);
    }

    public final DateTime component1() {
        return this.storetime;
    }

    public final StoreAggregateResponse copy(DateTime storetime) {
        u.j(storetime, "storetime");
        return new StoreAggregateResponse(storetime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof StoreAggregateResponse) && u.e(this.storetime, ((StoreAggregateResponse) obj).storetime)) {
            return true;
        }
        return false;
    }

    public final DateTime getStoretime() {
        return this.storetime;
    }

    public int hashCode() {
        return this.storetime.hashCode();
    }

    public String toString() {
        DateTime dateTime = this.storetime;
        return "StoreAggregateResponse(storetime=" + dateTime + ")";
    }
}
