package com.withings.authentication.userCreation;

import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.account.core.model.Account;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.common.compose.component.input.Gender;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.y;
import org.joda.time.DateTime;
import th.a;
/* compiled from: UserCreationViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/authentication/userCreation/UserCreationViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class UserCreationViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final m70.i f32475a;

    /* renamed from: b  reason: collision with root package name */
    private final vf.c f32476b;

    /* renamed from: c  reason: collision with root package name */
    private final AccountSessionRepository f32477c;

    /* renamed from: d  reason: collision with root package name */
    private final t00.d f32478d;

    /* renamed from: e  reason: collision with root package name */
    private final th.a f32479e;

    /* renamed from: f  reason: collision with root package name */
    private final cg.e f32480f;

    /* renamed from: g  reason: collision with root package name */
    private final String f32481g;

    /* renamed from: h  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f32482h;

    /* renamed from: i  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f32483i;

    /* renamed from: j  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f32484j;

    /* renamed from: k  reason: collision with root package name */
    private User f32485k;

    /* renamed from: l  reason: collision with root package name */
    private m70.f f32486l;

    /* renamed from: m  reason: collision with root package name */
    private m70.k f32487m;

    /* renamed from: n  reason: collision with root package name */
    private final xw.n<y> f32488n;

    /* renamed from: o  reason: collision with root package name */
    private final xw.n<y> f32489o;

    /* renamed from: p  reason: collision with root package name */
    private final om.d f32490p;

    /* renamed from: q  reason: collision with root package name */
    private MutableStateFlow<a.b> f32491q;

    @Inject
    public UserCreationViewModel(Context context, m70.i userManager, vf.c accountManager, AccountSessionRepository accountSessionRepository, t00.d networkSyncManager, th.a aVar, cg.e eVar, q70.j jVar, l70.w unitPreferencesRepository, cg.n nVar) {
        ParcelableSnapshotMutableState f11;
        ParcelableSnapshotMutableState f12;
        ParcelableSnapshotMutableState f13;
        boolean z5;
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(accountManager, "accountManager");
        kotlin.jvm.internal.u.j(accountSessionRepository, "accountSessionRepository");
        kotlin.jvm.internal.u.j(networkSyncManager, "networkSyncManager");
        kotlin.jvm.internal.u.j(unitPreferencesRepository, "unitPreferencesRepository");
        this.f32475a = userManager;
        this.f32476b = accountManager;
        this.f32477c = accountSessionRepository;
        this.f32478d = networkSyncManager;
        this.f32479e = aVar;
        this.f32480f = eVar;
        l70.i iVar = new l70.i(0);
        this.f32481g = nVar.a();
        f11 = l0.f(null, v0.f8878a);
        this.f32482h = f11;
        f12 = l0.f(null, v0.f8878a);
        this.f32483i = f12;
        f13 = l0.f(null, v0.f8878a);
        this.f32484j = f13;
        if (userManager.f() != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f32486l = new m70.f(z5, 2);
        m70.k kVar = new m70.k(false);
        this.f32487m = kVar;
        this.f32488n = new xw.n<>();
        this.f32489o = new xw.n<>();
        om.d dVar = new om.d(jVar, h1.a(this), context, unitPreferencesRepository, userManager);
        this.f32490p = dVar;
        this.f32491q = StateFlowKt.MutableStateFlow(a.b.C1654a.f99779a);
        om.a value = dVar.getValue();
        if (value == null) {
            kVar.k(iVar.d());
            kVar.i(iVar.b());
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new c(this, kVar.c(), kVar.f(), null), 2, null);
            return;
        }
        kVar.k(value.e().j());
        kVar.i(value.b().j());
    }

    public static final Object f0(UserCreationViewModel userCreationViewModel, Account account, User user, qm0.d dVar) {
        qm0.i iVar = new qm0.i(rm0.a.b(dVar));
        int i11 = v70.a.f103433b;
        v70.a.f(user.q(), account.i().b());
        userCreationViewModel.f32478d.c("account_creation_sync", new Long(user.q()), new b(iVar));
        Object a11 = iVar.a();
        if (a11 != CoroutineSingletons.f76214a) {
            return y.f85009a;
        }
        return a11;
    }

    public static final a.C1653a j0(UserCreationViewModel userCreationViewModel, boolean z5) {
        String str;
        String t02 = userCreationViewModel.t0();
        if (t02 == null || (str = (String) userCreationViewModel.f32484j.getValue()) == null) {
            return null;
        }
        return new a.C1653a(t02, str, userCreationViewModel.f32481g, (String) userCreationViewModel.f32483i.getValue(), z5);
    }

    public final xw.n<y> A0() {
        return this.f32488n;
    }

    public final User B0() {
        User user = this.f32485k;
        if (user == null) {
            return new User();
        }
        return user;
    }

    public final m70.f F0() {
        return this.f32486l;
    }

    public final m70.k G0() {
        return this.f32487m;
    }

    public final void K0() {
        boolean z5;
        M0(null);
        O0(null);
        R0(null);
        this.f32485k = null;
        this.f32491q.setValue(a.b.C1654a.f99779a);
        if (this.f32475a.f() != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f32486l = new m70.f(z5, 2);
    }

    public final void M0(String str) {
        this.f32482h.setValue(str);
    }

    public final void O0(String str) {
        this.f32483i.setValue(str);
    }

    public final void R0(String str) {
        this.f32484j.setValue(str);
    }

    public final void p0() {
        this.f32476b.e();
        kg.a.a(this.f32477c);
        K0();
        this.f32489o.setValue(null);
    }

    public final void q0(long j5, String firstname, String lastname, Gender gender) {
        String str;
        String concat;
        int i11;
        boolean z5;
        kotlin.jvm.internal.u.j(firstname, "firstname");
        kotlin.jvm.internal.u.j(lastname, "lastname");
        kotlin.jvm.internal.u.j(gender, "gender");
        User user = new User();
        user.H(new DateTime(j5));
        user.a0(firstname);
        user.p0(lastname);
        String l5 = user.l();
        kotlin.jvm.internal.u.i(l5, "getFirstName(...)");
        int i12 = 1;
        int length = l5.length() - 1;
        int i13 = 0;
        boolean z11 = false;
        while (i13 <= length) {
            if (!z11) {
                i11 = i13;
            } else {
                i11 = length;
            }
            if (kotlin.jvm.internal.u.l(l5.charAt(i11), 32) < 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z11) {
                if (!z5) {
                    z11 = true;
                } else {
                    i13++;
                }
            } else if (!z5) {
                break;
            } else {
                length--;
            }
        }
        String upperCase = l5.subSequence(i13, length + 1).toString().toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.u.i(upperCase, "toUpperCase(...)");
        String d11 = new dp0.h("[^A-Z0-9]+").d(upperCase, "");
        if (d11.length() < 3) {
            str = d11;
        } else {
            str = null;
        }
        if (str != null && (concat = str.concat("AAA")) != null) {
            d11 = concat;
        }
        String substring = d11.substring(0, 3);
        kotlin.jvm.internal.u.i(substring, "substring(...)");
        user.L0(substring);
        if (gender.b() == C1987R.string._HOMME_) {
            i12 = 0;
        }
        user.c0(i12);
        this.f32485k = user;
    }

    public final MutableStateFlow<a.b> r0() {
        return this.f32491q;
    }

    public final String t0() {
        return (String) this.f32482h.getValue();
    }

    public final om.d y0() {
        return this.f32490p;
    }

    public final xw.n<y> z0() {
        return this.f32489o;
    }
}
