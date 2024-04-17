package com.withings.core.device;

import android.widget.ImageView;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: FullscreenVideoFragment.kt */
/* loaded from: classes3.dex */
final class e extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ fm.b f35352a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fm.b bVar) {
        super(0);
        this.f35352a = bVar;
    }

    @Override // ym0.a
    public final y invoke() {
        ImageView preview = (ImageView) this.f35352a.f67701d;
        u.i(preview, "preview");
        preview.setVisibility(0);
        return y.f85009a;
    }
}
