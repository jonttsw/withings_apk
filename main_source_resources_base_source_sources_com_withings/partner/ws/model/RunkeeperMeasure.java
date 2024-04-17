package com.withings.partner.ws.model;

import androidx.appcompat.app.h;
import com.samsung.android.sdk.healthdata.HealthConstants;
import kotlin.Metadata;
/* compiled from: RunkeeperActivities.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/withings/partner/ws/model/RunkeeperMeasure;", "", "()V", "type", "", "getType", "()I", "setType", "(I)V", HealthConstants.FoodIntake.UNIT, "getUnit", "setUnit", "value", "getValue", "setValue", "toString", "", "partner_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RunkeeperMeasure {
    private int unit;
    private int value = -1;
    private int type = -1;

    public final int getType() {
        return this.type;
    }

    public final int getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }

    public final void setType(int i11) {
        this.type = i11;
    }

    public final void setUnit(int i11) {
        this.unit = i11;
    }

    public final void setValue(int i11) {
        this.value = i11;
    }

    public String toString() {
        int i11 = this.value;
        int i12 = this.type;
        int i13 = this.unit;
        StringBuilder e11 = h.e("value ", i11, " type ", i12, " unit ");
        e11.append(i13);
        return e11.toString();
    }
}
