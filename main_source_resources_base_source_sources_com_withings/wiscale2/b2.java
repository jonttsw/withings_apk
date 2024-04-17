package com.withings.wiscale2;

import java.util.List;
/* compiled from: MainActivity.kt */
/* loaded from: classes4.dex */
final class b2 extends kotlin.jvm.internal.w implements ym0.l<List<? extends v60.a>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MainActivity f50291a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(MainActivity mainActivity) {
        super(1);
        this.f50291a = mainActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(List<? extends v60.a> list) {
        List<? extends v60.a> alreadyDisplayTabs = list;
        kotlin.jvm.internal.u.j(alreadyDisplayTabs, "alreadyDisplayTabs");
        MainActivity.I3(this.f50291a, alreadyDisplayTabs);
        return nm0.y.f85009a;
    }
}
