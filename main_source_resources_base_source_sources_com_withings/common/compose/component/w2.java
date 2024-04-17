package com.withings.common.compose.component;

import android.view.View;
/* compiled from: KeepScreenOn.kt */
/* loaded from: classes3.dex */
public final class w2 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KeepScreenOn.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<k1.w, k1.v> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f34908a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(1);
            this.f34908a = view;
        }

        @Override // ym0.l
        public final k1.v invoke(k1.w wVar) {
            k1.w DisposableEffect = wVar;
            kotlin.jvm.internal.u.j(DisposableEffect, "$this$DisposableEffect");
            View view = this.f34908a;
            view.setKeepScreenOn(true);
            return new v2(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KeepScreenOn.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f34909a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11) {
            super(2);
            this.f34909a = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            w2.a(aVar, ah.o.g(this.f34909a | 1));
            return nm0.y.f85009a;
        }
    }

    public static final void a(androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(2109663082);
        if (i11 == 0 && g11.h()) {
            g11.C();
        } else {
            k1.y.c(nm0.y.f85009a, new a((View) g11.D(androidx.compose.ui.platform.u0.h())), g11);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(i11));
        }
    }
}
