package com.withings.tutorials.ui.screens.howtouse;

import androidx.compose.material3.j5;
/* compiled from: HowToUseWBS08.kt */
/* loaded from: classes4.dex */
final class v extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f45484a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45485b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45486c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r8.n f45487d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String str, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, r8.n nVar) {
        super(4);
        this.f45484a = str;
        this.f45485b = aVar;
        this.f45486c = aVar2;
        this.f45487d = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        w.f45488a.c(24576, aVar, this.f45484a, this.f45485b, new u(this.f45487d), this.f45486c);
        return nm0.y.f85009a;
    }
}
