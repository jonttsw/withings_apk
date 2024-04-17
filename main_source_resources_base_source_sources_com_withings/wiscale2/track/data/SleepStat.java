package com.withings.wiscale2.track.data;

import android.content.Intent;
import androidx.appcompat.app.h;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: SleepScoreHelper.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006!"}, d2 = {"Lcom/withings/wiscale2/track/data/SleepStat;", "", "id", "", "titleResId", "formattedValue", "", "value", RemoteMessageConst.Notification.COLOR, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "(IILjava/lang/String;IILandroid/content/Intent;)V", "getColor", "()I", "getFormattedValue", "()Ljava/lang/String;", "getId", "getIntent", "()Landroid/content/Intent;", "getTitleResId", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SleepStat {
    public static final int $stable = 8;
    private final int color;
    private final String formattedValue;

    /* renamed from: id  reason: collision with root package name */
    private final int f61733id;
    private final Intent intent;
    private final int titleResId;
    private final int value;

    public SleepStat(int i11, int i12, String formattedValue, int i13, int i14, Intent intent) {
        u.j(formattedValue, "formattedValue");
        this.f61733id = i11;
        this.titleResId = i12;
        this.formattedValue = formattedValue;
        this.value = i13;
        this.color = i14;
        this.intent = intent;
    }

    public static /* synthetic */ SleepStat copy$default(SleepStat sleepStat, int i11, int i12, String str, int i13, int i14, Intent intent, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = sleepStat.f61733id;
        }
        if ((i15 & 2) != 0) {
            i12 = sleepStat.titleResId;
        }
        int i16 = i12;
        if ((i15 & 4) != 0) {
            str = sleepStat.formattedValue;
        }
        String str2 = str;
        if ((i15 & 8) != 0) {
            i13 = sleepStat.value;
        }
        int i17 = i13;
        if ((i15 & 16) != 0) {
            i14 = sleepStat.color;
        }
        int i18 = i14;
        if ((i15 & 32) != 0) {
            intent = sleepStat.intent;
        }
        return sleepStat.copy(i11, i16, str2, i17, i18, intent);
    }

    public final int component1() {
        return this.f61733id;
    }

    public final int component2() {
        return this.titleResId;
    }

    public final String component3() {
        return this.formattedValue;
    }

    public final int component4() {
        return this.value;
    }

    public final int component5() {
        return this.color;
    }

    public final Intent component6() {
        return this.intent;
    }

    public final SleepStat copy(int i11, int i12, String formattedValue, int i13, int i14, Intent intent) {
        u.j(formattedValue, "formattedValue");
        return new SleepStat(i11, i12, formattedValue, i13, i14, intent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepStat)) {
            return false;
        }
        SleepStat sleepStat = (SleepStat) obj;
        if (this.f61733id == sleepStat.f61733id && this.titleResId == sleepStat.titleResId && u.e(this.formattedValue, sleepStat.formattedValue) && this.value == sleepStat.value && this.color == sleepStat.color && u.e(this.intent, sleepStat.intent)) {
            return true;
        }
        return false;
    }

    public final int getColor() {
        return this.color;
    }

    public final String getFormattedValue() {
        return this.formattedValue;
    }

    public final int getId() {
        return this.f61733id;
    }

    public final Intent getIntent() {
        return this.intent;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode;
        int a11 = h.a(this.color, h.a(this.value, d.c(this.formattedValue, h.a(this.titleResId, Integer.hashCode(this.f61733id) * 31, 31), 31), 31), 31);
        Intent intent = this.intent;
        if (intent == null) {
            hashCode = 0;
        } else {
            hashCode = intent.hashCode();
        }
        return a11 + hashCode;
    }

    public String toString() {
        int i11 = this.f61733id;
        int i12 = this.titleResId;
        String str = this.formattedValue;
        int i13 = this.value;
        int i14 = this.color;
        Intent intent = this.intent;
        StringBuilder e11 = h.e("SleepStat(id=", i11, ", titleResId=", i12, ", formattedValue=");
        e11.append(str);
        e11.append(", value=");
        e11.append(i13);
        e11.append(", color=");
        e11.append(i14);
        e11.append(", intent=");
        e11.append(intent);
        e11.append(")");
        return e11.toString();
    }
}
