package com.withings.wiscale2.activity.ui;

import com.withings.vasistas.model.Vasistas;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VasistasInfoActivity.kt */
/* loaded from: classes4.dex */
public final class d extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VasistasInfoActivity f48626a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Vasistas f48627b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ fl.p f48628c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f48629d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(VasistasInfoActivity vasistasInfoActivity, Vasistas vasistas, fl.p pVar, int i11) {
        super(2);
        this.f48626a = vasistasInfoActivity;
        this.f48627b = vasistas;
        this.f48628c = pVar;
        this.f48629d = i11;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f48629d | 1);
        Vasistas vasistas = this.f48627b;
        fl.p pVar = this.f48628c;
        VasistasInfoActivity.Y3(this.f48626a, vasistas, pVar, aVar, g11);
        return y.f85009a;
    }
}
