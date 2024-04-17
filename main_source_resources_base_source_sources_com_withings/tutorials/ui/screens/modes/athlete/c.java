package com.withings.tutorials.ui.screens.modes.athlete;

import kotlin.jvm.internal.w;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AthleteMode.kt */
/* loaded from: classes4.dex */
public final class c extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f45589a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f45590b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, int i11) {
        super(2);
        this.f45589a = aVar;
        this.f45590b = i11;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f45590b | 1);
        a.g(this.f45589a, aVar, g11);
        return y.f85009a;
    }
}
