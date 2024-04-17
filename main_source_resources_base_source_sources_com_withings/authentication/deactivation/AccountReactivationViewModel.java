package com.withings.authentication.deactivation;

import androidx.lifecycle.g1;
import com.withings.account.core.model.Account;
import javax.inject.Inject;
import kotlin.Metadata;
import nm0.y;
import th.u;
import xw.n;
/* compiled from: AccountReactivationViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/authentication/deactivation/AccountReactivationViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AccountReactivationViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final vf.c f31461a;

    /* renamed from: b  reason: collision with root package name */
    private final u f31462b;

    /* renamed from: c  reason: collision with root package name */
    private final n<y> f31463c;

    /* renamed from: d  reason: collision with root package name */
    private final n<y> f31464d;

    /* renamed from: e  reason: collision with root package name */
    private final n<y> f31465e;

    @Inject
    public AccountReactivationViewModel(vf.c accountManager, u uVar) {
        kotlin.jvm.internal.u.j(accountManager, "accountManager");
        this.f31461a = accountManager;
        this.f31462b = uVar;
        this.f31463c = new n<>();
        this.f31464d = new n<>();
        this.f31465e = new n<>();
    }

    public final Account i0() {
        return this.f31461a.h();
    }

    public final n<y> j0() {
        return this.f31463c;
    }

    public final n<y> k0() {
        return this.f31464d;
    }

    public final n<y> m0() {
        return this.f31465e;
    }
}
