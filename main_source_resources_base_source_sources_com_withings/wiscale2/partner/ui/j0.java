package com.withings.wiscale2.partner.ui;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: PartnerExchangesFragment.kt */
/* loaded from: classes5.dex */
final class j0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f59122a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e.n<Intent, ActivityResult> f59123b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(CoroutineScope coroutineScope, e.n nVar) {
        super(0);
        this.f59122a = coroutineScope;
        this.f59123b = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Object a11;
        try {
            a11 = BuildersKt__Builders_commonKt.launch$default(this.f59122a, null, null, new i0(this.f59123b, null), 3, null);
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        Throwable b10 = nm0.k.b(a11);
        if (b10 != null) {
            b10.printStackTrace();
        }
        return nm0.y.f85009a;
    }
}
