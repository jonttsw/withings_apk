package com.withings.healthplus.explore.ui.activity;

import android.os.Bundle;
import androidx.compose.runtime.a;
import com.withings.contentproviders.eightfit.model.ContentCategory;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class j extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f40319a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.r<ContentCategory, String, String, Integer, nm0.y> f40320b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<rv.f, nm0.y> f40321c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(ym0.a<nm0.y> aVar, ym0.r<? super ContentCategory, ? super String, ? super String, ? super Integer, nm0.y> rVar, ym0.l<? super rv.f, nm0.y> lVar) {
        super(4);
        this.f40319a = aVar;
        this.f40320b = rVar;
        this.f40321c = lVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        Bundle c11 = it.c();
        if (c11 != null) {
            long j5 = c11.getLong(NavigationArguments.PROGRAM_ID);
            Bundle c12 = it.c();
            if (c12 != null) {
                int i11 = c12.getInt(NavigationArguments.INSTANCE_ID);
                aVar2.s(-1717223948);
                ym0.r<ContentCategory, String, String, Integer, nm0.y> rVar = this.f40320b;
                boolean K = aVar2.K(rVar) | aVar2.d(j5) | aVar2.c(i11);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new i(rVar, j5, i11);
                    aVar2.n(t11);
                }
                aVar2.J();
                sv.a.a(this.f40319a, (ym0.r) t11, this.f40321c, null, null, aVar2, 0, 24);
                return nm0.y.f85009a;
            }
            throw new Exception("instanceId shouldn't be null");
        }
        throw new Exception("programId shouldn't be null");
    }
}
