package com.withings.library.vo2.firstbeat.utils;

import kotlin.Metadata;
/* compiled from: FxIntHelper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0000¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"fxIntToDouble", "", "", "toFxInt", "(D)Ljava/lang/Integer;", "Vo2Lib_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FxIntHelperKt {
    public static final double fxIntToDouble(int i11) {
        return i11 / 65536.0d;
    }

    public static final Integer toFxInt(double d11) {
        double d12 = d11 * 65536.0d;
        if (d12 > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d12);
    }
}
