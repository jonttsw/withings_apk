package com.withings.tutorials.ui.screens.modes.eyesclosed;

import androidx.compose.material3.j5;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.r;
/* compiled from: EyesClosedMode.kt */
/* loaded from: classes4.dex */
final class d extends w implements r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EyesClosedModeViewModel f45676a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f45677b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f45678c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EyesClosedModeViewModel eyesClosedModeViewModel, ym0.a<y> aVar, ym0.a<y> aVar2) {
        super(4);
        this.f45676a = eyesClosedModeViewModel;
        this.f45677b = aVar;
        this.f45678c = aVar2;
    }

    @Override // ym0.r
    public final y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        b.f45630a.a(this.f45676a, this.f45677b, this.f45678c, aVar, 3080);
        return y.f85009a;
    }
}
