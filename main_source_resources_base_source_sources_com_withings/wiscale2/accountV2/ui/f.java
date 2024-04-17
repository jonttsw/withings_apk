package com.withings.wiscale2.accountV2.ui;

import ah.o;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoggedOutActivity.kt */
/* loaded from: classes4.dex */
public final class f extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LoggedOutActivity f48212a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f48213b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f48214c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f48215d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LoggedOutActivity loggedOutActivity, boolean z5, ym0.a<y> aVar, int i11) {
        super(2);
        this.f48212a = loggedOutActivity;
        this.f48213b = z5;
        this.f48214c = aVar;
        this.f48215d = i11;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = o.g(this.f48215d | 1);
        boolean z5 = this.f48213b;
        ym0.a<y> aVar2 = this.f48214c;
        LoggedOutActivity.z3(this.f48212a, z5, aVar2, aVar, g11);
        return y.f85009a;
    }
}
