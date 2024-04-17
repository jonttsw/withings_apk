package com.withings.healthplus.library.ui.navigation;

import android.os.Bundle;
import androidx.compose.foundation.layout.e1;
import androidx.compose.runtime.a;
import com.withings.contentproviders.model.content.TaskType;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.r;
import ym0.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LibraryNavigation.kt */
/* loaded from: classes3.dex */
public final class i extends w implements r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f40422a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u<TaskType, String, String, String, String, Boolean, String, y> f40423b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(ym0.a<y> aVar, u<? super TaskType, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, y> uVar) {
        super(4);
        this.f40422a = aVar;
        this.f40423b = uVar;
    }

    @Override // ym0.r
    public final y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        String str;
        String str2;
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        Bundle c11 = it.c();
        String str3 = null;
        if (c11 == null || (str = c11.getString(NavigationArguments.ORIGINAL_CONTENT_ID_TO_BE_SWAPPED)) == null) {
            Bundle c12 = it.c();
            if (c12 != null) {
                str = c12.getString("cid");
            } else {
                str = null;
            }
        }
        Bundle c13 = it.c();
        if (c13 != null) {
            str2 = c13.getString(NavigationArguments.MISSION_INFORMATION);
        } else {
            str2 = null;
        }
        Bundle c14 = it.c();
        if (c14 != null) {
            str3 = c14.getString(NavigationArguments.PROGRAM_INFORMATION);
        }
        androidx.compose.ui.e d11 = e1.d(androidx.compose.ui.e.f8927a);
        aVar2.s(332453243);
        u<TaskType, String, String, String, String, Boolean, String, y> uVar = this.f40423b;
        boolean K = aVar2.K(uVar) | aVar2.K(str) | aVar2.K(str2) | aVar2.K(str3);
        Object t11 = aVar2.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = new h(uVar, str, str2, str3);
            aVar2.n(t11);
        }
        aVar2.J();
        ov.c.a(this.f40422a, (r) t11, d11, null, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 8);
        return y.f85009a;
    }
}
