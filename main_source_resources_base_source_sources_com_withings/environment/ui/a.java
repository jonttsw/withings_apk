package com.withings.environment.ui;

import com.withings.environment.ui.d;
/* compiled from: WS50GraphFragment.java */
/* loaded from: classes3.dex */
final class a extends pm.h<d.a> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f38981a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(d dVar) {
        this.f38981a = dVar;
    }

    @Override // vh.m.b
    public final void onResult(Object obj) {
        d dVar = this.f38981a;
        dVar.f38998q = (d.a) obj;
        dVar.y1();
    }
}
