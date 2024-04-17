package com.withings.account.ui.vm;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import hg.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import og.d;
import vf.c;
import xw.n;
/* compiled from: LoadingSensitiveActionViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/account/ui/vm/LoadingSensitiveActionViewModel;", "Landroidx/lifecycle/g1;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LoadingSensitiveActionViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final b f31022a;

    /* renamed from: b  reason: collision with root package name */
    private final c f31023b;

    /* renamed from: c  reason: collision with root package name */
    private final n<d> f31024c;

    @Inject
    public LoadingSensitiveActionViewModel(b bVar, c accountManager) {
        u.j(accountManager, "accountManager");
        this.f31022a = bVar;
        this.f31023b = accountManager;
        this.f31024c = new n<>();
    }

    public final c f0() {
        return this.f31023b;
    }

    public final b g0() {
        return this.f31022a;
    }

    public final n<d> i0() {
        return this.f31024c;
    }

    public final void j0() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new a(this, null), 3, null);
    }
}
