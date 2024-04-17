package com.withings.wiscale2.device.consumable.model;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Consumable.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/wiscale2/device/consumable/model/GetConsumableResponse;", "", "consumable", "Lcom/withings/wiscale2/device/consumable/model/Consumable;", "(Lcom/withings/wiscale2/device/consumable/model/Consumable;)V", "getConsumable", "()Lcom/withings/wiscale2/device/consumable/model/Consumable;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetConsumableResponse {
    public static final int $stable = 8;
    private final Consumable consumable;

    public GetConsumableResponse(Consumable consumable) {
        u.j(consumable, "consumable");
        this.consumable = consumable;
    }

    public static /* synthetic */ GetConsumableResponse copy$default(GetConsumableResponse getConsumableResponse, Consumable consumable, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            consumable = getConsumableResponse.consumable;
        }
        return getConsumableResponse.copy(consumable);
    }

    public final Consumable component1() {
        return this.consumable;
    }

    public final GetConsumableResponse copy(Consumable consumable) {
        u.j(consumable, "consumable");
        return new GetConsumableResponse(consumable);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof GetConsumableResponse) && u.e(this.consumable, ((GetConsumableResponse) obj).consumable)) {
            return true;
        }
        return false;
    }

    public final Consumable getConsumable() {
        return this.consumable;
    }

    public int hashCode() {
        return this.consumable.hashCode();
    }

    public String toString() {
        Consumable consumable = this.consumable;
        return "GetConsumableResponse(consumable=" + consumable + ")";
    }
}
