package com.withings.paywall.subscription;

import ah.o;
import com.withings.paywall.b0;
import java.util.List;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubscriptionScreen.kt */
/* loaded from: classes4.dex */
public final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f43675a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<b0> f43676b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f43677c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l<String, y> f43678d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f43679e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f43680f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i11, int i12, androidx.compose.ui.e eVar, String str, List list, l lVar) {
        super(2);
        this.f43675a = eVar;
        this.f43676b = list;
        this.f43677c = str;
        this.f43678d = lVar;
        this.f43679e = i11;
        this.f43680f = i12;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = o.g(this.f43679e | 1);
        a.c(g11, this.f43680f, aVar, this.f43675a, this.f43677c, this.f43676b, this.f43678d);
        return y.f85009a;
    }
}
