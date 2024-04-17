package com.withings.library.healthscore.utils.ktx;

import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: StringExtension.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"isUs", "", "", "HealthScore_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StringExtensionKt {
    public static final boolean isUs(String str) {
        u.j(str, "<this>");
        return x.W("Canada", "United Stated", "Mexico").contains(str);
    }
}
