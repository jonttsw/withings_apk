package com.withings.partner.exchanges.samsung;

import com.samsung.android.sdk.healthdata.HealthConnectionErrorResult;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: SamsungHealthDataHelper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/partner/exchanges/samsung/SamsungConnectException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "partner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SamsungConnectException extends IllegalStateException {

    /* renamed from: a  reason: collision with root package name */
    private final HealthConnectionErrorResult f43453a;

    public SamsungConnectException(HealthConnectionErrorResult errorResult) {
        u.j(errorResult, "errorResult");
        this.f43453a = errorResult;
    }

    public final HealthConnectionErrorResult a() {
        return this.f43453a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SamsungConnectException) && u.e(this.f43453a, ((SamsungConnectException) obj).f43453a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f43453a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "SamsungConnectException(errorResult=" + this.f43453a + ")";
    }
}
