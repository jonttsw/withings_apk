package com.withings.tutorials.ui.screens.tab;

import androidx.compose.material3.j5;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.r;
/* compiled from: AchieveTabTutorial.kt */
/* loaded from: classes4.dex */
final class c extends w implements r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p f46255a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f46256b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f46257c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r8.n f46258d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, ym0.a<y> aVar, ym0.a<y> aVar2, r8.n nVar) {
        super(4);
        this.f46255a = pVar;
        this.f46256b = aVar;
        this.f46257c = aVar2;
        this.f46258d = nVar;
    }

    @Override // ym0.r
    public final y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        androidx.compose.runtime.a aVar2 = aVar;
        j5.e(num, cVar, "$this$composable", dVar, "it");
        p pVar = this.f46255a;
        int a11 = pVar.a();
        int b10 = pVar.b();
        if (pVar.c() != null) {
            i11 = C1987R.string._NEXT_;
        } else {
            i11 = C1987R.string._DONE_;
        }
        int i12 = i11;
        o.a(a11, b10, i12, this.f46256b, new b(pVar, this.f46257c, this.f46258d), pVar.e(), aVar2, 0);
        return y.f85009a;
    }
}
