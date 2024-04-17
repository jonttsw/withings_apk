package com.withings.wiscale2;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainActivity.kt */
/* loaded from: classes4.dex */
public final class f2 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MainActivity f56102a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(MainActivity mainActivity) {
        super(0);
        this.f56102a = mainActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        MainActivity mainActivity = this.f56102a;
        try {
            BuildersKt.runBlocking(Dispatchers.getIO(), new e2(mainActivity, null));
        } catch (InterruptedException e11) {
            x70.b.b(mainActivity, e11.toString(), new Object[0]);
        }
        return nm0.y.f85009a;
    }
}
