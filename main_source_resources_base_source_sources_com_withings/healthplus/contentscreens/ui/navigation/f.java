package com.withings.healthplus.contentscreens.ui.navigation;

import android.os.Bundle;
import androidx.lifecycle.g1;
import androidx.lifecycle.n1;
import com.withings.healthplus.contentscreens.ui.viewmodel.SuggestWorkoutLaunchOnWatchViewModel;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import i6.a;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import lu.g0;
import nm0.y;
/* compiled from: ContentScreenNavigation.kt */
/* loaded from: classes3.dex */
final class f extends w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f40149a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f40150b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r8.n nVar, ym0.a aVar) {
        super(4);
        this.f40149a = aVar;
        this.f40150b = nVar;
    }

    @Override // ym0.r
    public final y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        String string;
        String str;
        i6.a aVar2;
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        androidx.compose.runtime.a aVar3 = aVar;
        num.intValue();
        u.j(composable, "$this$composable");
        u.j(it, "it");
        Bundle c11 = it.c();
        if (c11 != null && (string = c11.getString(NavigationArguments.CONTENT_ID)) != null) {
            Bundle c12 = it.c();
            String str2 = null;
            if (c12 != null) {
                str = c12.getString(NavigationArguments.PROGRAM_INFORMATION);
            } else {
                str = null;
            }
            Bundle c13 = it.c();
            if (c13 != null) {
                str2 = c13.getString(NavigationArguments.MISSION_INFORMATION);
            }
            String str3 = str2;
            aVar3.s(1890788296);
            n1 a11 = j6.a.a(aVar3);
            if (a11 != null) {
                fk0.c a12 = e6.a.a(a11, aVar3);
                aVar3.s(1729797275);
                if (a11 instanceof androidx.lifecycle.u) {
                    aVar2 = ((androidx.lifecycle.u) a11).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C1058a.f71431b;
                }
                g1 a13 = j6.b.a(SuggestWorkoutLaunchOnWatchViewModel.class, a11, null, a12, aVar2, aVar3);
                aVar3.J();
                aVar3.J();
                g0.a((SuggestWorkoutLaunchOnWatchViewModel) a13, this.f40149a, new e(this.f40150b, string, str, str3), aVar3, 8);
                return y.f85009a;
            }
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        throw new Exception("contentId shouldn't be null");
    }
}
