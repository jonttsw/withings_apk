package com.withings.wiscale2.device.common.screen.ui;

import android.content.Context;
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
final class g extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f53301a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f53302b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, k1.r0<String> r0Var) {
        super(1);
        this.f53301a = context;
        this.f53302b = r0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        this.f53302b.setValue(this.f53301a.getString(num.intValue()));
        return nm0.y.f85009a;
    }
}
