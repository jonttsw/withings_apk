package com.withings.vasistas.model;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Vasistas.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/withings/vasistas/model/Vasistas;", "invoke", "(Lcom/withings/vasistas/model/Vasistas;)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VasistasKt$mostCountedDeviceId$1 extends w implements l<Vasistas, Long> {
    public static final VasistasKt$mostCountedDeviceId$1 INSTANCE = new VasistasKt$mostCountedDeviceId$1();

    VasistasKt$mostCountedDeviceId$1() {
        super(1);
    }

    @Override // ym0.l
    public final Long invoke(Vasistas it) {
        u.j(it, "it");
        return Long.valueOf(it.getDeviceId());
    }
}
