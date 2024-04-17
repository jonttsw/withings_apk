package com.withings.authentication.mfa.recovery.login;

import androidx.lifecycle.g1;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.library.authentication.setup2fa.Setup2FAService;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import th.r;
/* compiled from: LoginRecoveryCodeViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/authentication/mfa/recovery/login/LoginRecoveryCodeViewModel;", "Landroidx/lifecycle/g1;", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LoginRecoveryCodeViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final vf.c f31807a;

    /* renamed from: b  reason: collision with root package name */
    private final AccountSessionRepository f31808b;

    /* renamed from: c  reason: collision with root package name */
    private final th.l f31809c;

    /* renamed from: d  reason: collision with root package name */
    private final Setup2FAService f31810d;

    /* renamed from: e  reason: collision with root package name */
    private final r f31811e;

    /* renamed from: f  reason: collision with root package name */
    private final t00.d f31812f;

    /* renamed from: g  reason: collision with root package name */
    private final lg.a f31813g;

    /* renamed from: h  reason: collision with root package name */
    private final MutableStateFlow<r.a> f31814h;

    /* renamed from: i  reason: collision with root package name */
    private MutableStateFlow<a> f31815i;

    /* compiled from: LoginRecoveryCodeViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {

        /* compiled from: LoginRecoveryCodeViewModel.kt */
        /* renamed from: com.withings.authentication.mfa.recovery.login.LoginRecoveryCodeViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0417a implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0417a f31816a = new C0417a();

            private C0417a() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0417a)) {
                    return false;
                }
                C0417a c0417a = (C0417a) obj;
                return true;
            }

            public final int hashCode() {
                return -1581591183;
            }

            public final String toString() {
                return "Default";
            }
        }

        /* compiled from: LoginRecoveryCodeViewModel.kt */
        /* loaded from: classes3.dex */
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f31817a = new b();

            private b() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return true;
            }

            public final int hashCode() {
                return -1648057885;
            }

            public final String toString() {
                return "Processing";
            }
        }

        /* compiled from: LoginRecoveryCodeViewModel.kt */
        /* loaded from: classes3.dex */
        public static final class c implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f31818a = new c();

            private c() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return true;
            }

            public final int hashCode() {
                return -698597581;
            }

            public final String toString() {
                return "Success";
            }
        }
    }

    @Inject
    public LoginRecoveryCodeViewModel(vf.c accountManager, AccountSessionRepository accountSessionRepository, th.l lVar, Setup2FAService setup2FAService, r rVar, t00.d networkSyncManager, lg.a aVar) {
        u.j(accountManager, "accountManager");
        u.j(accountSessionRepository, "accountSessionRepository");
        u.j(networkSyncManager, "networkSyncManager");
        this.f31807a = accountManager;
        this.f31808b = accountSessionRepository;
        this.f31809c = lVar;
        this.f31810d = setup2FAService;
        this.f31811e = rVar;
        this.f31812f = networkSyncManager;
        this.f31813g = aVar;
        this.f31814h = StateFlowKt.MutableStateFlow(r.a.C1667a.f99920a);
        this.f31815i = StateFlowKt.MutableStateFlow(a.C0417a.f31816a);
    }

    public final MutableStateFlow<r.a> q0() {
        return this.f31814h;
    }

    public final MutableStateFlow<a> r0() {
        return this.f31815i;
    }
}
