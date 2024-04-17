package com.withings.authentication.accountConsent;

import androidx.lifecycle.g1;
import androidx.lifecycle.k0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import xw.p;
import ym0.q;
/* compiled from: AccountConsentViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/authentication/accountConsent/AccountConsentViewModel;", "Landroidx/lifecycle/g1;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AccountConsentViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final k0<Boolean> f31342a;

    /* renamed from: b  reason: collision with root package name */
    private final k0<Boolean> f31343b;

    /* renamed from: c  reason: collision with root package name */
    private final k0<Boolean> f31344c;

    /* renamed from: d  reason: collision with root package name */
    private final p<Boolean, Boolean, Boolean> f31345d;

    /* compiled from: AccountConsentViewModel.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements q<p<Boolean, Boolean, Boolean>, Boolean, Boolean, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f31346a = new w(3);

        @Override // ym0.q
        public final y invoke(p<Boolean, Boolean, Boolean> pVar, Boolean bool, Boolean bool2) {
            boolean z5;
            p<Boolean, Boolean, Boolean> livedata = pVar;
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            u.j(livedata, "livedata");
            if (booleanValue && booleanValue2) {
                z5 = true;
            } else {
                z5 = false;
            }
            livedata.setValue(Boolean.valueOf(z5));
            return y.f85009a;
        }
    }

    @Inject
    public AccountConsentViewModel() {
        k0<Boolean> k0Var = new k0<>();
        this.f31342a = k0Var;
        k0<Boolean> k0Var2 = new k0<>();
        this.f31343b = k0Var2;
        this.f31344c = new k0<>();
        this.f31345d = new p<>(k0Var, k0Var2, a.f31346a);
    }

    public final void f0(boolean z5) {
        this.f31344c.postValue(Boolean.valueOf(z5));
    }

    public final boolean g0() {
        Boolean value = this.f31344c.getValue();
        if (value == null) {
            return false;
        }
        return value.booleanValue();
    }

    public final p<Boolean, Boolean, Boolean> i0() {
        return this.f31345d;
    }

    public final void j0(boolean z5) {
        this.f31342a.postValue(Boolean.valueOf(z5));
    }

    public final boolean k0() {
        Boolean value = this.f31342a.getValue();
        if (value == null) {
            return false;
        }
        return value.booleanValue();
    }

    public final void m0() {
        k0<Boolean> k0Var = this.f31342a;
        Boolean bool = Boolean.FALSE;
        k0Var.setValue(bool);
        this.f31343b.setValue(bool);
        this.f31344c.setValue(bool);
    }

    public final void p0(boolean z5) {
        this.f31343b.postValue(Boolean.valueOf(z5));
    }

    public final boolean q0() {
        Boolean value = this.f31343b.getValue();
        if (value == null) {
            return false;
        }
        return value.booleanValue();
    }
}
