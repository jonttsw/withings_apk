package com.withings.common.device.companion;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: CompanionLinkActivity.kt */
/* loaded from: classes3.dex */
final class b extends w implements ym0.l<xw.c<? extends y>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CompanionLinkActivity f35092a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CompanionLinkActivity companionLinkActivity) {
        super(1);
        this.f35092a = companionLinkActivity;
    }

    @Override // ym0.l
    public final y invoke(xw.c<? extends y> cVar) {
        xw.c<? extends y> cVar2 = cVar;
        if (cVar2 != null && !cVar2.b()) {
            this.f35092a.finish();
        }
        return y.f85009a;
    }
}
