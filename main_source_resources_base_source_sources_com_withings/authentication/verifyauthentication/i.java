package com.withings.authentication.verifyauthentication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.u4;
import com.withings.account.core.model.Account;
import com.withings.account.models.AccountPrefEntity;
import com.withings.features.FeatureFlag;
/* compiled from: AuthBottomSheetDialog.kt */
/* loaded from: classes3.dex */
public final class i extends com.google.android.material.bottomsheet.l {

    /* renamed from: c  reason: collision with root package name */
    private final Activity f32674c;

    /* renamed from: d  reason: collision with root package name */
    private final Account f32675d;

    /* renamed from: e  reason: collision with root package name */
    private final int f32676e = 850;

    /* compiled from: AuthBottomSheetDialog.kt */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                boolean c11 = wr.b.c(FeatureFlag.f39120n0);
                i iVar = i.this;
                if (c11) {
                    aVar2.s(1515386483);
                    ng.a.a(null, "loading", new com.withings.authentication.verifyauthentication.a(iVar), new b(iVar), new c(iVar), new d(iVar), aVar2, 48, 1);
                    aVar2.J();
                } else {
                    aVar2.s(1515387097);
                    if (kotlin.jvm.internal.u.e(iVar.s1().i().d().a(), AccountPrefEntity.PROVIDER_GOOGLE)) {
                        aVar2.s(1515387190);
                        o.b(new e(iVar), new f(iVar), aVar2, 0);
                        aVar2.J();
                    } else {
                        aVar2.s(1515387626);
                        o.a(iVar.s1(), new g(iVar), new h(iVar), aVar2, 8);
                        aVar2.J();
                    }
                    aVar2.J();
                }
            }
            return nm0.y.f85009a;
        }
    }

    public i(Activity activity, Account account) {
        this.f32674c = activity;
        this.f32675d = account;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        Context requireContext = requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6, 0);
        composeView.setViewCompositionStrategy(u4.a.f10134a);
        composeView.setContent(new s1.a(true, 475711727, new a()));
        return composeView;
    }

    public final Account s1() {
        return this.f32675d;
    }

    public final Activity t1() {
        return this.f32674c;
    }

    public final int u1() {
        return this.f32676e;
    }
}
