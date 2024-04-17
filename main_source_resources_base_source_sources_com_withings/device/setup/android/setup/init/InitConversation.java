package com.withings.device.setup.android.setup.init;

import android.content.Context;
import androidx.camera.camera2.internal.v1;
import com.withings.alarm.conversation.GetAlarmSettingsConversation;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.LocaleSet;
import com.withings.device.setup.android.setup.init.clockmode.ClockModeConversation;
import com.withings.device.setup.android.setup.init.locale.GetLocaleConversation;
import com.withings.device.setup.android.setup.init.locale.SetLocaleConversation;
import com.withings.measurements.ui.u1;
import com.withings.user.core.models.User;
import com.withings.wiscale2.device.common.conversation.SendDistanceUnitConversation;
import com.withings.wiscale2.device.common.conversation.SendStepGoalConversation;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.types.d;
import ln.a0;
import ln.b0;
import ln.c0;
import ln.i;
import ln.j;
import ln.k;
import ln.n;
import ln.p;
import ln.r;
import ln.s;
import ln.v;
import ln.x;
import ln.z;
import nm0.y;
import qo.b;
import xb0.c;
import xb0.e;
import xb0.f;
import xb0.g;
import ym0.l;
/* compiled from: InitConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/setup/android/setup/init/InitConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class InitConversation extends WppDeviceConversation {
    private final xo.a A;
    private final ln.a B;
    private final User F;
    private final boolean G;

    /* renamed from: f  reason: collision with root package name */
    private final hp.a f37421f;

    /* renamed from: g  reason: collision with root package name */
    private final ip.a f37422g;

    /* renamed from: h  reason: collision with root package name */
    private final gp.a f37423h;

    /* renamed from: i  reason: collision with root package name */
    private final v1 f37424i;

    /* renamed from: j  reason: collision with root package name */
    private final dp.a f37425j;

    /* renamed from: k  reason: collision with root package name */
    private final ro.a f37426k;

    /* renamed from: l  reason: collision with root package name */
    private final ep.a f37427l;

    /* renamed from: m  reason: collision with root package name */
    private final vo.a f37428m;

    /* renamed from: n  reason: collision with root package name */
    private final qo.a f37429n;

    /* renamed from: o  reason: collision with root package name */
    private final b f37430o;

    /* renamed from: p  reason: collision with root package name */
    private final d f37431p;

    /* renamed from: q  reason: collision with root package name */
    private final yo.a f37432q;

    /* renamed from: r  reason: collision with root package name */
    private final cp.a f37433r;

    /* renamed from: s  reason: collision with root package name */
    private final so.a f37434s;

    /* renamed from: t  reason: collision with root package name */
    private final fp.a f37435t;

    /* renamed from: u  reason: collision with root package name */
    private final bp.a f37436u;

    /* renamed from: v  reason: collision with root package name */
    private final uo.a f37437v;

    /* renamed from: w  reason: collision with root package name */
    private final ap.a f37438w;

    /* renamed from: x  reason: collision with root package name */
    private final wo.a f37439x;

    /* renamed from: y  reason: collision with root package name */
    private final jp.a f37440y;

    /* renamed from: z  reason: collision with root package name */
    private final zo.b f37441z;

    /* compiled from: InitConversation.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements l<LocaleSet, y> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(LocaleSet localeSet) {
            LocaleSet localeSet2 = localeSet;
            if (localeSet2 != null) {
                boolean e11 = u.e(Locale.getDefault().getLanguage(), localeSet2.locale);
                InitConversation initConversation = InitConversation.this;
                if (!e11) {
                    initConversation.f37432q.getClass();
                    initConversation.E(new SetLocaleConversation());
                }
                ln.a aVar = initConversation.B;
                u.j(aVar, "<this>");
                if (aVar instanceof b0) {
                    b0 b0Var = (b0) aVar;
                    initConversation.E(((g) initConversation.f37433r).a(localeSet2));
                }
            }
            return y.f85009a;
        }
    }

    public InitConversation(hp.a aVar, ip.a aVar2, gp.a aVar3, v1 v1Var, f fVar, ro.a aVar4, u1 u1Var, im.a aVar5, b50.b bVar, c cVar, d dVar, yo.a aVar6, g gVar, so.a aVar7, fp.a aVar8, bp.a aVar9, xb0.b bVar2, e eVar, wo.a aVar10, jp.a aVar11, zo.b bVar3, xo.a aVar12, ln.a aVar13, User user) {
        u.j(user, "user");
        this.f37421f = aVar;
        this.f37422g = aVar2;
        this.f37423h = aVar3;
        this.f37424i = v1Var;
        this.f37425j = fVar;
        this.f37426k = aVar4;
        this.f37427l = u1Var;
        this.f37428m = aVar5;
        this.f37429n = bVar;
        this.f37430o = cVar;
        this.f37431p = dVar;
        this.f37432q = aVar6;
        this.f37433r = gVar;
        this.f37434s = aVar7;
        this.f37435t = aVar8;
        this.f37436u = aVar9;
        this.f37437v = bVar2;
        this.f37438w = eVar;
        this.f37439x = aVar10;
        this.f37440y = aVar11;
        this.f37441z = bVar3;
        this.A = aVar12;
        this.B = aVar13;
        this.F = user;
        this.G = true;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        boolean z5;
        ln.a aVar = this.B;
        u.j(aVar, "<this>");
        if (aVar instanceof x) {
            x xVar = (x) aVar;
            E(this.f37421f.a());
        }
        if (aVar instanceof a0) {
            a0 a0Var = (a0) aVar;
            E(this.f37422g.a());
        }
        if (aVar instanceof ln.w) {
            ln.w wVar = (ln.w) aVar;
            E(this.f37423h.a());
        }
        if (aVar instanceof j) {
            j jVar = (j) aVar;
            this.f37424i.getClass();
            E(new ClockModeConversation());
        }
        boolean z11 = aVar instanceof z;
        User user = this.F;
        if (z11) {
            z zVar = (z) aVar;
            if (aVar instanceof ln.c) {
                ln.c cVar = (ln.c) aVar;
                z5 = true;
            } else {
                z5 = false;
            }
            E(((f) this.f37425j).a(user, !z5));
        }
        if (aVar instanceof ln.c) {
            ln.c cVar2 = (ln.c) aVar;
            E(this.f37426k.a());
        }
        if (aVar instanceof ln.u) {
            ln.u uVar = (ln.u) aVar;
            ((u1) this.f37427l).getClass();
            u.j(user, "user");
            E(new SendStepGoalConversation(o70.a.e(user)));
        }
        if (aVar instanceof n) {
            n nVar = (n) aVar;
            ((im.a) this.f37428m).getClass();
            E(new SendDistanceUnitConversation());
        }
        if (aVar instanceof ln.e) {
            ln.e eVar = (ln.e) aVar;
            ((b50.b) this.f37429n).getClass();
            E(new GetAlarmSettingsConversation());
            E(((c) this.f37430o).a());
        }
        if (aVar instanceof s) {
            s sVar = (s) aVar;
            a aVar2 = new a();
            this.f37431p.getClass();
            E(new GetLocaleConversation(aVar2));
        }
        if (aVar instanceof i) {
            i iVar = (i) aVar;
            E(this.f37434s.a());
        }
        if (aVar instanceof v) {
            v vVar = (v) aVar;
            E(this.f37435t.a());
        }
        if (v1.P(aVar)) {
            E(this.f37436u.a());
        }
        if (aVar instanceof k) {
            k kVar = (k) aVar;
            Context r7 = r();
            u.i(r7, "getContext(...)");
            long id2 = user.getId();
            u70.i g11 = x().g();
            u.i(g11, "getMac(...)");
            Iterator it = ((xb0.b) this.f37437v).a(r7, id2, g11, this.G).iterator();
            while (it.hasNext()) {
                E((WppDeviceConversation) it.next());
            }
        }
        if (v1.P(aVar)) {
            E(((e) this.f37438w).a());
        }
        if (aVar instanceof p) {
            p pVar = (p) aVar;
            E(this.f37439x.a());
        }
        if (aVar instanceof c0) {
            c0 c0Var = (c0) aVar;
            E(this.f37440y.a());
        }
        if (this.G && (aVar instanceof ln.d)) {
            ln.d dVar = (ln.d) aVar;
            if (dVar.a()) {
                E(this.f37441z.a(dVar));
            }
        }
        if (aVar instanceof r) {
            r rVar = (r) aVar;
            E(this.A.a(user.getId()));
        }
    }
}
