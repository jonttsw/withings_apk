package com.withings.core.device;

import android.widget.ProgressBar;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: FullscreenVideoFragment.kt */
/* loaded from: classes3.dex */
final class f extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ fm.b f35353a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(fm.b bVar) {
        super(0);
        this.f35353a = bVar;
    }

    @Override // ym0.a
    public final y invoke() {
        ProgressBar loader = (ProgressBar) this.f35353a.f67700c;
        u.i(loader, "loader");
        loader.setVisibility(4);
        return y.f85009a;
    }
}
