package com.withings.vasistas.model;

import kotlin.Metadata;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: Vasistas.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class VasistasKt$mostCountedDeviceId$2 extends w implements l<Long, Boolean> {
    public static final VasistasKt$mostCountedDeviceId$2 INSTANCE = new VasistasKt$mostCountedDeviceId$2();

    VasistasKt$mostCountedDeviceId$2() {
        super(1);
    }

    public final Boolean invoke(long j5) {
        return Boolean.valueOf(j5 == 0);
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ Boolean invoke(Long l5) {
        return invoke(l5.longValue());
    }
}
