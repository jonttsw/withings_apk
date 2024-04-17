package com.withings.wiscale2.account.email;

import ah.o;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EmailModificationActivity.kt */
/* loaded from: classes4.dex */
public final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EmailModificationActivity f48071a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f48072b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<String, y> f48073c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f48074d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(EmailModificationActivity emailModificationActivity, String str, ym0.l<? super String, y> lVar, int i11) {
        super(2);
        this.f48071a = emailModificationActivity;
        this.f48072b = str;
        this.f48073c = lVar;
        this.f48074d = i11;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = o.g(this.f48074d | 1);
        String str = this.f48072b;
        ym0.l<String, y> lVar = this.f48073c;
        this.f48071a.B3(g11, aVar, str, lVar);
        return y.f85009a;
    }
}
