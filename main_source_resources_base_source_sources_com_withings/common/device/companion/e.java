package com.withings.common.device.companion;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: CompanionLinkActivity.kt */
/* loaded from: classes3.dex */
final class e extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CompanionLinkActivity f35095a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CompanionLinkActivity companionLinkActivity) {
        super(0);
        this.f35095a = companionLinkActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        g gVar;
        gVar = this.f35095a.f35065d;
        if (gVar != null) {
            gVar.y0();
            return y.f85009a;
        }
        u.s("viewModel");
        throw null;
    }
}
