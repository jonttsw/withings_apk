package com.withings.sharing.datasharing.sendinvitation;

import androidx.compose.ui.platform.k4;
import k1.r0;
/* compiled from: ShareMethodScreen.kt */
/* loaded from: classes4.dex */
final class b0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k4 f44137a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<String, nm0.y> f44138b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<String> f44139c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(k4 k4Var, ym0.l<? super String, nm0.y> lVar, r0<String> r0Var) {
        super(0);
        this.f44137a = k4Var;
        this.f44138b = lVar;
        this.f44139c = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        k4 k4Var = this.f44137a;
        if (k4Var != null) {
            k4Var.a();
        }
        this.f44138b.invoke(this.f44139c.getValue());
        return nm0.y.f85009a;
    }
}
