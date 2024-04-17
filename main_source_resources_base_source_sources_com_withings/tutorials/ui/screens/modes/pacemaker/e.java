package com.withings.tutorials.ui.screens.modes.pacemaker;

import androidx.compose.material3.j5;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.r;
/* compiled from: PacemakerMode.kt */
/* loaded from: classes4.dex */
final class e extends w implements r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PacemakerModeViewModel f45760a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f45761b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f45762c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PacemakerModeViewModel pacemakerModeViewModel, ym0.a<y> aVar, ym0.a<y> aVar2) {
        super(4);
        this.f45760a = pacemakerModeViewModel;
        this.f45761b = aVar;
        this.f45762c = aVar2;
    }

    @Override // ym0.r
    public final y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        c.f45714a.a(this.f45760a, this.f45761b, this.f45762c, aVar, 3080);
        return y.f85009a;
    }
}
