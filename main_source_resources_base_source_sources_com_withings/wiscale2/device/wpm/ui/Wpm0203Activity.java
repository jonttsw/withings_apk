package com.withings.wiscale2.device.wpm.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.ActionBar;
import androidx.camera.core.y1;
import androidx.fragment.app.m0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.k1;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.account.core.model.Account;
import com.withings.comm.wpp.generated.object.ProbeReply;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.DeviceModel;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import com.withings.util.log.Fail;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import com.withings.wiscale2.device.wpm.conversation.WpmMeasureConversation;
import com.withings.wiscale2.device.wpm.ui.b0;
import com.withings.wiscale2.device.wpm.ui.c0;
import com.withings.wiscale2.device.wpm.ui.k0;
import com.withings.wiscale2.heart.bloodpressure.g;
import dj.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
import tb0.b1;
/* compiled from: Wpm0203Activity.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0006\u000e\u000f\u0010\u0011\u0012\u0013B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/withings/wiscale2/device/wpm/ui/Wpm0203Activity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/device/wpm/ui/k0$a;", "Lcom/withings/wiscale2/device/wpm/ui/c0$a;", "Lcom/withings/wiscale2/device/wpm/ui/b0$a;", "Lcom/withings/wiscale2/heart/bloodpressure/g$a;", "Lcom/withings/wiscale2/device/wpm/ui/d;", "Lxe0/b;", ConstantsWs.JSON_SESSION_KEY_EVENT, "Lnm0/y;", "onEventMainThread", "(Lxe0/b;)V", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "MeasureState", "c", "d", com.huawei.hms.feature.dynamic.e.e.f28630a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class Wpm0203Activity extends Hilt_Wpm0203Activity implements k0.a, c0.a, b0.a, g.a, com.withings.wiscale2.device.wpm.ui.d {

    /* renamed from: e  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f55618e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public e f55619f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f55620g;

    /* renamed from: h  reason: collision with root package name */
    private final g f55621h;

    /* renamed from: i  reason: collision with root package name */
    private final h f55622i;

    /* renamed from: j  reason: collision with root package name */
    private k0 f55623j;

    /* renamed from: k  reason: collision with root package name */
    private b0 f55624k;

    /* renamed from: l  reason: collision with root package name */
    private c0 f55625l;

    /* renamed from: m  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f55626m;

    /* renamed from: o  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f55616o = {androidx.camera.core.v.c(Wpm0203Activity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivityWpmBinding;", 0), androidx.camera.core.v.c(Wpm0203Activity.class, "macAddress", "getMacAddress()Lcom/withings/util/MacAddress;", 0), androidx.camera.core.v.c(Wpm0203Activity.class, "deviceModel", "getDeviceModel()Lcom/withings/device/DeviceModel;", 0)};

    /* renamed from: n  reason: collision with root package name */
    public static final a f55615n = new Object();

    /* renamed from: p  reason: collision with root package name */
    private static final String f55617p = "Wpm0203Activity";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Wpm0203Activity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpm/ui/Wpm0203Activity$MeasureState;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class MeasureState {

        /* renamed from: a  reason: collision with root package name */
        public static final MeasureState f55627a;

        /* renamed from: b  reason: collision with root package name */
        public static final MeasureState f55628b;

        /* renamed from: c  reason: collision with root package name */
        public static final MeasureState f55629c;

        /* renamed from: d  reason: collision with root package name */
        public static final MeasureState f55630d;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ MeasureState[] f55631e;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.wiscale2.device.wpm.ui.Wpm0203Activity$MeasureState, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.wiscale2.device.wpm.ui.Wpm0203Activity$MeasureState, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.wiscale2.device.wpm.ui.Wpm0203Activity$MeasureState, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r3v2, types: [com.withings.wiscale2.device.wpm.ui.Wpm0203Activity$MeasureState, java.lang.Enum] */
        static {
            ?? r02 = new Enum("START", 0);
            f55627a = r02;
            ?? r12 = new Enum("MEASURE", 1);
            f55628b = r12;
            ?? r22 = new Enum("RESULT", 2);
            f55629c = r22;
            ?? r32 = new Enum("SELECT_USER", 3);
            f55630d = r32;
            MeasureState[] measureStateArr = {r02, r12, r22, r32};
            f55631e = measureStateArr;
            sm0.b.a(measureStateArr);
        }

        private MeasureState() {
            throw null;
        }

        public static MeasureState valueOf(String str) {
            return (MeasureState) Enum.valueOf(MeasureState.class, str);
        }

        public static MeasureState[] values() {
            return (MeasureState[]) f55631e.clone();
        }
    }

    /* compiled from: Wpm0203Activity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: Wpm0203Activity.kt */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f55632a;

        /* renamed from: b  reason: collision with root package name */
        private final String f55633b;

        /* renamed from: c  reason: collision with root package name */
        private final String f55634c;

        /* renamed from: d  reason: collision with root package name */
        private final String f55635d;

        /* renamed from: e  reason: collision with root package name */
        private final String f55636e;

        /* renamed from: f  reason: collision with root package name */
        private final String f55637f;

        public b(String str, String str2, boolean z5, String str3, String str4, String str5) {
            this.f55632a = z5;
            this.f55633b = str;
            this.f55634c = str2;
            this.f55635d = str3;
            this.f55636e = str4;
            this.f55637f = str5;
        }

        public final String a() {
            return this.f55634c;
        }

        public final String b() {
            return this.f55636e;
        }

        public final String c() {
            return this.f55637f;
        }

        public final String d() {
            return this.f55635d;
        }

        public final String e() {
            return this.f55633b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f55632a == bVar.f55632a && kotlin.jvm.internal.u.e(this.f55633b, bVar.f55633b) && kotlin.jvm.internal.u.e(this.f55634c, bVar.f55634c) && kotlin.jvm.internal.u.e(this.f55635d, bVar.f55635d) && kotlin.jvm.internal.u.e(this.f55636e, bVar.f55636e) && kotlin.jvm.internal.u.e(this.f55637f, bVar.f55637f)) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.f55632a;
        }

        public final int hashCode() {
            return this.f55637f.hashCode() + defpackage.d.c(this.f55636e, defpackage.d.c(this.f55635d, defpackage.d.c(this.f55634c, defpackage.d.c(this.f55633b, Boolean.hashCode(this.f55632a) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MeasureFailedInfo(tripleMeasure=");
            sb2.append(this.f55632a);
            sb2.append(", title=");
            sb2.append(this.f55633b);
            sb2.append(", message=");
            sb2.append(this.f55634c);
            sb2.append(", positiveButtonText=");
            sb2.append(this.f55635d);
            sb2.append(", negativeButtonText=");
            sb2.append(this.f55636e);
            sb2.append(", neutralButtonText=");
            return y1.e(sb2, this.f55637f, ")");
        }
    }

    /* compiled from: Wpm0203Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final User f55638a;

        /* renamed from: b  reason: collision with root package name */
        private final u70.i f55639b;

        /* renamed from: c  reason: collision with root package name */
        private final MeasuresGroup f55640c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f55641d;

        public c(User user, u70.i iVar, MeasuresGroup measuresGroup, boolean z5) {
            this.f55638a = user;
            this.f55639b = iVar;
            this.f55640c = measuresGroup;
            this.f55641d = z5;
        }

        public final u70.i a() {
            return this.f55639b;
        }

        public final MeasuresGroup b() {
            return this.f55640c;
        }

        public final boolean c() {
            return this.f55641d;
        }

        public final User d() {
            return this.f55638a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (kotlin.jvm.internal.u.e(this.f55638a, cVar.f55638a) && kotlin.jvm.internal.u.e(this.f55639b, cVar.f55639b) && kotlin.jvm.internal.u.e(this.f55640c, cVar.f55640c) && this.f55641d == cVar.f55641d) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int i11 = 0;
            User user = this.f55638a;
            if (user == null) {
                hashCode = 0;
            } else {
                hashCode = user.hashCode();
            }
            int i12 = hashCode * 31;
            u70.i iVar = this.f55639b;
            if (iVar == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = iVar.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            MeasuresGroup measuresGroup = this.f55640c;
            if (measuresGroup != null) {
                i11 = measuresGroup.hashCode();
            }
            return Boolean.hashCode(this.f55641d) + ((i13 + i11) * 31);
        }

        public final String toString() {
            return "ResultInfo(user=" + this.f55638a + ", macAddress=" + this.f55639b + ", measureGroup=" + this.f55640c + ", tripleMeasure=" + this.f55641d + ")";
        }
    }

    /* compiled from: Wpm0203Activity.kt */
    /* loaded from: classes5.dex */
    public static final class d extends g1 implements t.a {
        private dj.t A;

        /* renamed from: a  reason: collision with root package name */
        private final u70.i f55642a;

        /* renamed from: b  reason: collision with root package name */
        private final DeviceModel f55643b;

        /* renamed from: c  reason: collision with root package name */
        private final Context f55644c;

        /* renamed from: d  reason: collision with root package name */
        private final vf.c f55645d;

        /* renamed from: e  reason: collision with root package name */
        private final kn.e f55646e;

        /* renamed from: f  reason: collision with root package name */
        private final d10.a f55647f;

        /* renamed from: g  reason: collision with root package name */
        private final lg.a f55648g;

        /* renamed from: h  reason: collision with root package name */
        private final t00.d f55649h;

        /* renamed from: i  reason: collision with root package name */
        private final xw.n<nm0.y> f55650i;

        /* renamed from: j  reason: collision with root package name */
        private final xw.n<nm0.y> f55651j;

        /* renamed from: k  reason: collision with root package name */
        private final xw.n<nm0.y> f55652k;

        /* renamed from: l  reason: collision with root package name */
        private final xw.n<nm0.y> f55653l;

        /* renamed from: m  reason: collision with root package name */
        private final xw.n<nm0.y> f55654m;

        /* renamed from: n  reason: collision with root package name */
        private final xw.n<Integer> f55655n;

        /* renamed from: o  reason: collision with root package name */
        private final xw.n<c> f55656o;

        /* renamed from: p  reason: collision with root package name */
        private final xw.n<nm0.y> f55657p;

        /* renamed from: q  reason: collision with root package name */
        private final xw.n<nm0.y> f55658q;

        /* renamed from: r  reason: collision with root package name */
        private final androidx.lifecycle.j0 f55659r;

        /* renamed from: s  reason: collision with root package name */
        private final androidx.lifecycle.k0<b> f55660s;

        /* renamed from: t  reason: collision with root package name */
        private MeasureState f55661t;

        /* renamed from: u  reason: collision with root package name */
        private WpmMeasureConversation f55662u;

        /* renamed from: v  reason: collision with root package name */
        private Integer f55663v;

        /* renamed from: w  reason: collision with root package name */
        private User f55664w;

        /* renamed from: x  reason: collision with root package name */
        private int f55665x;

        /* renamed from: y  reason: collision with root package name */
        private int f55666y;

        /* renamed from: z  reason: collision with root package name */
        private MeasuresGroup f55667z;

        /* compiled from: Wpm0203Activity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpm.ui.Wpm0203Activity$Wpm02ViewModel$account$1", f = "Wpm0203Activity.kt", l = {388}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Account>, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f55668a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f55669b;

            a(qm0.d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                a aVar = new a(dVar);
                aVar.f55669b = obj;
                return aVar;
            }

            @Override // ym0.p
            public final Object invoke(androidx.lifecycle.h0<Account> h0Var, qm0.d<? super nm0.y> dVar) {
                return ((a) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f55668a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    Account h11 = d.this.f55645d.h();
                    this.f55668a = 1;
                    if (((androidx.lifecycle.h0) this.f55669b).emit(h11, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* compiled from: Wpm0203Activity.kt */
        /* loaded from: classes5.dex */
        static final class b extends kotlin.jvm.internal.w implements ym0.l<Account, LiveData<Boolean>> {
            b() {
                super(1);
            }

            @Override // ym0.l
            public final LiveData<Boolean> invoke(Account account) {
                boolean z5;
                Account account2 = account;
                kotlin.jvm.internal.u.j(account2, "account");
                if (d.this.f55643b.b() == 43 && account2.c().c()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                return xw.d.a(Boolean.valueOf(z5));
            }
        }

        public d(u70.i macAddress, DeviceModel deviceModel, Context context, vf.c accountManager, kn.e deviceManager, m70.i userManager, ej.w wVar, d10.a aVar, lg.a aVar2, t00.d networkSyncManager, fl.p pVar) {
            nm0.y yVar;
            kotlin.jvm.internal.u.j(macAddress, "macAddress");
            kotlin.jvm.internal.u.j(deviceModel, "deviceModel");
            kotlin.jvm.internal.u.j(accountManager, "accountManager");
            kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
            kotlin.jvm.internal.u.j(userManager, "userManager");
            kotlin.jvm.internal.u.j(networkSyncManager, "networkSyncManager");
            this.f55642a = macAddress;
            this.f55643b = deviceModel;
            this.f55644c = context;
            this.f55645d = accountManager;
            this.f55646e = deviceManager;
            this.f55647f = aVar;
            this.f55648g = aVar2;
            this.f55649h = networkSyncManager;
            this.f55650i = new xw.n<>();
            this.f55651j = new xw.n<>();
            xw.n<nm0.y> nVar = new xw.n<>();
            this.f55652k = nVar;
            this.f55653l = new xw.n<>();
            this.f55654m = new xw.n<>();
            this.f55655n = new xw.n<>();
            this.f55656o = new xw.n<>();
            this.f55657p = new xw.n<>();
            this.f55658q = new xw.n<>();
            this.f55659r = e1.c(androidx.lifecycle.h.a(Dispatchers.getIO(), new a(null), 2), new b());
            this.f55660s = xw.d.b(null);
            this.f55661t = MeasureState.f55627a;
            this.f55664w = userManager.f();
            WpmMeasureConversation wpmMeasureConversation = (WpmMeasureConversation) wVar.y(macAddress, WpmMeasureConversation.class);
            this.f55662u = wpmMeasureConversation;
            if (wpmMeasureConversation != null) {
                cj.b x11 = wpmMeasureConversation.x();
                kotlin.jvm.internal.u.i(x11, "getWppDevice(...)");
                this.f55663v = Integer.valueOf(pVar.f(x11).a());
                yVar = nm0.y.f85009a;
            } else {
                yVar = null;
            }
            if (yVar == null) {
                nVar.postValue(null);
            }
            dj.t E = wVar.E(macAddress);
            this.A = E;
            E.e(this);
        }

        public final xw.n<nm0.y> A0() {
            return this.f55650i;
        }

        public final int B0() {
            return this.f55665x;
        }

        @Override // dj.t.a
        public final void D(dj.t tVar, dj.u uVar) {
            if (uVar instanceof dj.b) {
                if (kotlin.jvm.internal.u.e(this.f55642a, ((dj.b) uVar).a())) {
                    this.f55651j.postValue(null);
                    WpmMeasureConversation wpmMeasureConversation = this.f55662u;
                    if (wpmMeasureConversation != null) {
                        wpmMeasureConversation.p();
                    }
                }
            }
        }

        public final androidx.lifecycle.k0<b> F0() {
            return this.f55660s;
        }

        public final MeasureState G0() {
            return this.f55661t;
        }

        public final xw.n<nm0.y> K0() {
            return this.f55652k;
        }

        public final androidx.lifecycle.j0 M0() {
            return this.f55659r;
        }

        public final xw.n<Integer> O0() {
            return this.f55655n;
        }

        public final xw.n<c> R0() {
            return this.f55656o;
        }

        public final xw.n<nm0.y> T0() {
            return this.f55654m;
        }

        public final xw.n<nm0.y> U0() {
            return this.f55653l;
        }

        public final xw.n<nm0.y> V0() {
            return this.f55658q;
        }

        public final void W0(int i11, boolean z5) {
            int i12;
            WpmMeasureConversation wpmMeasureConversation = this.f55662u;
            if (wpmMeasureConversation != null) {
                wpmMeasureConversation.C();
            }
            if (i11 != 1) {
                if (i11 != 37) {
                    if (i11 != 59) {
                        i12 = C1987R.string._BP_RESULT_CONDITION_;
                    } else {
                        i12 = C1987R.string._BPV2_RESULT_ZSTABLE_;
                    }
                } else {
                    i12 = C1987R.string._BPV2_RESULT_NOCAL_;
                }
            } else {
                i12 = C1987R.string._BPV2_RESULT_NOPOLL_;
            }
            int i13 = this.f55666y + 1;
            this.f55666y = i13;
            if (i13 >= 5) {
                cr.a.a(new nm0.j(this.f55664w, wpmMeasureConversation), new com.withings.wiscale2.device.wpm.ui.i(this));
            }
            androidx.lifecycle.k0<b> k0Var = this.f55660s;
            Context context = this.f55644c;
            String string = context.getString(C1987R.string._BP_RESULT_ERROR_TITLE_);
            kotlin.jvm.internal.u.i(string, "getString(...)");
            String string2 = context.getString(i12);
            kotlin.jvm.internal.u.i(string2, "getString(...)");
            String string3 = context.getString(C1987R.string.ANDROID_START_AGAIN);
            kotlin.jvm.internal.u.i(string3, "getString(...)");
            String string4 = context.getString(C1987R.string._CANCEL_);
            kotlin.jvm.internal.u.i(string4, "getString(...)");
            String string5 = context.getString(C1987R.string._OK_);
            kotlin.jvm.internal.u.i(string5, "getString(...)");
            k0Var.postValue(new b(string, string2, z5, string3, string4, string5));
        }

        public final void X0(User user) {
            this.f55664w = user;
            d1();
        }

        public final void Y0(int i11) {
            this.f55665x = i11;
        }

        public final void Z0() {
            this.f55661t = MeasureState.f55629c;
        }

        public final void a1(int i11) {
            this.f55665x = i11;
            this.f55661t = MeasureState.f55628b;
            this.f55655n.postValue(Integer.valueOf(i11));
        }

        public final void c1() {
            this.f55661t = MeasureState.f55630d;
            this.f55654m.postValue(null);
        }

        public final void d1() {
            nm0.y yVar;
            this.f55661t = MeasureState.f55627a;
            if (this.f55663v != null) {
                this.f55653l.postValue(null);
                yVar = nm0.y.f85009a;
            } else {
                yVar = null;
            }
            if (yVar == null) {
                this.f55657p.postValue(null);
            }
        }

        public final void e1() {
            WpmMeasureConversation wpmMeasureConversation;
            if (this.f55661t == MeasureState.f55628b && (wpmMeasureConversation = this.f55662u) != null) {
                wpmMeasureConversation.U();
            }
            d1();
        }

        public final void g1(int i11) {
            if (i11 != -1) {
                if (i11 == 0) {
                    this.f55658q.postValue(null);
                    return;
                }
                return;
            }
            this.f55649h.d(this.f55648g.a(false), "sync account WPM0203", null);
        }

        public final void i1() {
            WpmMeasureConversation wpmMeasureConversation = this.f55662u;
            if (wpmMeasureConversation != null) {
                if (!wpmMeasureConversation.M()) {
                    wpmMeasureConversation = null;
                }
                if (wpmMeasureConversation != null) {
                    wpmMeasureConversation.V();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.g1
        public final void onCleared() {
            dj.t tVar = this.A;
            if (tVar != null) {
                tVar.f(this);
            }
        }

        public final void q0() {
            WpmMeasureConversation wpmMeasureConversation = this.f55662u;
            if (wpmMeasureConversation != null) {
                wpmMeasureConversation.p();
            }
        }

        public final WpmMeasureConversation r0() {
            return this.f55662u;
        }

        public final User t0() {
            return this.f55664w;
        }

        public final xw.n<nm0.y> y0() {
            return this.f55651j;
        }

        public final Integer z0() {
            return this.f55663v;
        }
    }

    /* compiled from: Wpm0203Activity.kt */
    /* loaded from: classes5.dex */
    public interface e {
        d a(u70.i iVar, DeviceModel deviceModel);
    }

    /* compiled from: Wpm0203Activity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.p<WpmMeasureConversation, k0, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f55672a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(WpmMeasureConversation wpmMeasureConversation, k0 k0Var) {
            WpmMeasureConversation conversation = wpmMeasureConversation;
            k0 startFragment = k0Var;
            kotlin.jvm.internal.u.j(conversation, "conversation");
            kotlin.jvm.internal.u.j(startFragment, "startFragment");
            startFragment.w1(conversation.N());
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class g implements bn0.d<Activity, u70.i> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f55673a = nm0.h.b(new x(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f55674b;

        public g(Activity activity) {
            this.f55674b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [u70.i, java.lang.Object] */
        @Override // bn0.d
        public final u70.i getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f55673a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class h implements bn0.d<Activity, DeviceModel> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f55675a = nm0.h.b(new y(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f55676b;

        public h(Activity activity) {
            this.f55676b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, com.withings.device.DeviceModel] */
        @Override // bn0.d
        public final DeviceModel getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f55675a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, b1> {
        @Override // ym0.l
        public final b1 invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.main_layout);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return b1.a(e11);
        }
    }

    /* compiled from: Wpm0203Activity.kt */
    /* loaded from: classes5.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.a<d> {
        j() {
            super(0);
        }

        @Override // ym0.a
        public final d invoke() {
            Wpm0203Activity wpm0203Activity = Wpm0203Activity.this;
            return (d) new k1(wpm0203Activity, new z(wpm0203Activity)).a(d.class);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public Wpm0203Activity() {
        super(0);
        this.f55618e = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f55620g = nm0.h.b(new j());
        this.f55621h = new g(this);
        this.f55622i = new h(this);
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.wiscale2.device.wpm.ui.f(this, 0));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f55626m = registerForActivityResult;
    }

    public static void A3(Wpm0203Activity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.Q3().d1();
    }

    public static void B3(Wpm0203Activity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.O3();
    }

    public static void C3(Wpm0203Activity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        b0 b0Var = this$0.f55624k;
        if (b0Var != null) {
            b0Var.v1();
        }
    }

    public static void D3(Wpm0203Activity this$0, MeasuresGroup measuresGroupToDelete) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(measuresGroupToDelete, "$measuresGroupToDelete");
        d Q3 = this$0.Q3();
        Q3.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(Q3), Dispatchers.getIO(), null, new com.withings.wiscale2.device.wpm.ui.j(measuresGroupToDelete, Q3, null), 2, null);
    }

    public static final DeviceModel F3(Wpm0203Activity wpm0203Activity) {
        return (DeviceModel) wpm0203Activity.f55622i.getValue(wpm0203Activity, f55616o[2]);
    }

    public static final u70.i G3(Wpm0203Activity wpm0203Activity) {
        wpm0203Activity.getClass();
        return (u70.i) wpm0203Activity.f55621h.getValue(wpm0203Activity, f55616o[1]);
    }

    public static final void I3(Wpm0203Activity wpm0203Activity, b bVar) {
        wpm0203Activity.getClass();
        qc.b B = new qc.b(wpm0203Activity).B(bVar.e());
        kotlin.jvm.internal.u.i(B, "setTitle(...)");
        if (!bVar.f()) {
            wpm0203Activity.Q3().d1();
            B.j(bVar.c(), null);
        } else {
            B.h(bVar.b(), new cq.b(wpm0203Activity, 3));
            B.A(bVar.d(), new iq.c(wpm0203Activity, 3));
        }
        B.v(bVar.a());
        B.s();
    }

    public static final void J3(Wpm0203Activity wpm0203Activity, int i11) {
        boolean z5;
        b0 b0Var;
        wpm0203Activity.getClass();
        if (i11 == 0) {
            b0Var = new b0();
        } else {
            int i12 = b0.f55686p;
            if (i11 <= 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            Fail.i("interval must be > 0", z5);
            b0 b0Var2 = new b0();
            Bundle bundle = new Bundle();
            bundle.putInt("interval_in_second", i11);
            b0Var2.setArguments(bundle);
            b0Var = b0Var2;
        }
        wpm0203Activity.f55624k = b0Var;
        wpm0203Activity.P3().f98875b.setVisibility(8);
        b0 b0Var3 = wpm0203Activity.f55624k;
        if (b0Var3 != null) {
            m0 m11 = wpm0203Activity.getSupportFragmentManager().m();
            m11.l(C1987R.id.content, b0Var3, null);
            m11.f();
        }
        ActionBar supportActionBar = wpm0203Activity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.g();
        }
    }

    public static final void K3(Wpm0203Activity wpm0203Activity, User user, u70.i iVar, MeasuresGroup measuresGroup, boolean z5) {
        d Q3 = wpm0203Activity.Q3();
        MeasureState measureState = MeasureState.f55627a;
        Q3.Z0();
        cr.a.a(new nm0.j(iVar, measuresGroup), new w(wpm0203Activity, user, z5));
        c0 c0Var = wpm0203Activity.f55625l;
        if (c0Var != null) {
            m0 m11 = wpm0203Activity.getSupportFragmentManager().m();
            m11.l(C1987R.id.content, c0Var, null);
            m11.f();
        }
    }

    public static final void L3(Wpm0203Activity wpm0203Activity) {
        wpm0203Activity.P3().f98875b.setText(C1987R.string.bpmMeasurement_selectUser);
        ActionBar supportActionBar = wpm0203Activity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.y();
        }
        ActionBar supportActionBar2 = wpm0203Activity.getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.o(true);
        }
        m0 m11 = wpm0203Activity.getSupportFragmentManager().m();
        m11.l(C1987R.id.content, new com.withings.wiscale2.device.wpm.ui.c(), null);
        m11.f();
    }

    public static final void M3(Wpm0203Activity wpm0203Activity) {
        Integer z02 = wpm0203Activity.Q3().z0();
        if (z02 != null) {
            int intValue = z02.intValue();
            User t02 = wpm0203Activity.Q3().t0();
            k0 k0Var = new k0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("currentUser", t02);
            bundle.putInt("deviceModelId", intValue);
            k0Var.setArguments(bundle);
            wpm0203Activity.f55623j = k0Var;
        }
        wpm0203Activity.P3().f98875b.setText(C1987R.string._BPV2_MENU_NEW_MEASUREMENT_);
        wpm0203Activity.P3().f98874a.setNavigationIcon(y70.a.c(C1987R.drawable.icon_medium_navigation_close, wpm0203Activity, ah.u.w(C1987R.attr.colorOnPrimary, wpm0203Activity, -65281)));
        ActionBar supportActionBar = wpm0203Activity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.y();
        }
        ActionBar supportActionBar2 = wpm0203Activity.getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.o(true);
        }
        k0 k0Var2 = wpm0203Activity.f55623j;
        if (k0Var2 != null) {
            m0 m11 = wpm0203Activity.getSupportFragmentManager().m();
            m11.l(C1987R.id.content, k0Var2, null);
            m11.f();
        }
    }

    public static final void N3(Wpm0203Activity wpm0203Activity) {
        wpm0203Activity.getClass();
        wpm0203Activity.f55626m.a(HMWebActivity.f35395c.b(wpm0203Activity, null, C1987R.string.BPM03_SEINE_AKNOWLEDGEMENT_URL));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O3() {
        Q3().q0();
        MainActivity.f47950r.getClass();
        startActivity(MainActivity.a.a(this));
        finish();
    }

    private final b1 P3() {
        return (b1) ((LifecycleViewBindingProperty) this.f55618e).getValue(this, f55616o[0]);
    }

    private final d Q3() {
        return (d) this.f55620g.getValue();
    }

    public static void z3(Wpm0203Activity this$0, ActivityResult activityResult) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.Q3().g1(activityResult.b());
    }

    @Override // com.withings.wiscale2.device.wpm.ui.b0.a
    public final void A0() {
        x70.b.r(f55617p, "onTakeMeasureNeeded", new Object[0]);
        Q3().i1();
    }

    @Override // com.withings.wiscale2.device.wpm.ui.b0.a
    public final void G0(ProbeReply probeReply, we0.l result, boolean z5) {
        kotlin.jvm.internal.u.j(probeReply, "probeReply");
        kotlin.jvm.internal.u.j(result, "result");
        x70.b.r(f55617p, "Activity measure finished : " + result, new Object[0]);
        d Q3 = Q3();
        u70.i macAddress = (u70.i) this.f55621h.getValue(this, f55616o[1]);
        Q3.getClass();
        kotlin.jvm.internal.u.j(macAddress, "macAddress");
        BuildersKt__Builders_commonKt.launch$default(h1.a(Q3), Dispatchers.getIO(), null, new k(Q3, result, z5, macAddress, probeReply, null), 2, null);
    }

    @Override // com.withings.wiscale2.heart.bloodpressure.g.a
    public final void W2(final MeasuresGroup measuresGroupToDelete) {
        kotlin.jvm.internal.u.j(measuresGroupToDelete, "measuresGroupToDelete");
        x70.b.r(f55617p, "onDeleteMeasureClicked for " + measuresGroupToDelete, new Object[0]);
        qc.b bVar = new qc.b(this);
        bVar.C(C1987R.string._DELETE_TITLE_);
        bVar.w(C1987R.string._CANCEL_, null).z(C1987R.string._DELETE_YES_, new DialogInterface.OnClickListener() { // from class: com.withings.wiscale2.device.wpm.ui.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                Wpm0203Activity.D3(Wpm0203Activity.this, measuresGroupToDelete);
            }
        }).s();
    }

    @Override // com.withings.wiscale2.device.wpm.ui.c0.a
    public final void Z0(u70.i macAddress, DateTime dateTime) {
        kotlin.jvm.internal.u.j(macAddress, "macAddress");
        x70.b.s(f55617p, macAddress, "onDone", new Object[0]);
        d Q3 = Q3();
        Q3.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(Q3), Dispatchers.getIO(), null, new l(Q3, macAddress, dateTime, null), 2, null);
    }

    @Override // com.withings.wiscale2.device.wpm.ui.k0.a, com.withings.wiscale2.device.wpm.ui.b0.a
    public final void d() {
        x70.b.r(f55617p, "onReadyToStart", new Object[0]);
        cr.a.a(new nm0.j(Q3().r0(), this.f55623j), f.f55672a);
    }

    @Override // com.withings.wiscale2.device.wpm.ui.d
    public final void d1(com.withings.wiscale2.device.wpm.ui.d dVar, User user) {
        x70.b.r(f55617p, "onUserSelected for " + user, new Object[0]);
        Q3().X0(user);
    }

    @Override // com.withings.wiscale2.device.wpm.ui.k0.a, com.withings.wiscale2.device.wpm.ui.c0.a
    public final void f() {
        x70.b.r(f55617p, "onStartSingleMeasure()", new Object[0]);
        Q3().a1(0);
    }

    @Override // com.withings.wiscale2.device.wpm.ui.c0.a
    public final void o() {
        x70.b.r(f55617p, android.support.v4.media.a.a("onStartTripleMeasure() interval : ", Q3().B0()), new Object[0]);
        Q3().a1(Q3().B0());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int ordinal = Q3().G0().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                O3();
                return;
            } else {
                Q3().d1();
                return;
            }
        }
        Q3().e1();
    }

    @Override // com.withings.wiscale2.device.wpm.ui.Hilt_Wpm0203Activity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        supportRequestWindowFeature(9);
        getWindow().addFlags(128);
        super.onCreate(bundle);
        setSupportActionBar(P3().f98874a);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
        }
        jk0.c.b().f(this);
        d Q3 = Q3();
        xw.d.d(this, Q3.A0(), new n(this));
        xw.d.d(this, Q3.V0(), new o(this));
        xw.d.d(this, Q3.y0(), new p(this));
        xw.d.d(this, Q3.K0(), new q(this));
        xw.d.d(this, Q3.U0(), new r(this));
        xw.d.d(this, Q3.T0(), new s(this));
        xw.d.c(this, Q3.O0(), new t(this));
        xw.d.c(this, Q3.R0(), new u(this));
        xw.d.c(this, Q3.M0(), new v(this));
        xw.d.c(this, Q3.F0(), new m(this));
        if (bundle == null) {
            Q3().d1();
        }
    }

    @Override // com.withings.wiscale2.device.wpm.ui.Hilt_Wpm0203Activity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        jk0.c.b().g(this);
    }

    public final void onEventMainThread(xe0.b event) {
        kotlin.jvm.internal.u.j(event, "event");
        x70.b.r(f55617p, "onEventMainThread : ".concat(xe0.b.class.getSimpleName()), new Object[0]);
        qc.b bVar = new qc.b(this);
        bVar.C(C1987R.string._BP_NO_BATTERY_TITLE_);
        bVar.g(C1987R.string._BP_NO_BATTERY_);
        bVar.t(false);
        bVar.z(C1987R.string._OK_, new ao.c(this, 3)).s();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        Q3().e1();
    }

    @Override // com.withings.wiscale2.device.wpm.ui.k0.a
    public final void p0() {
        x70.b.r(f55617p, "onSelectUserClicked", new Object[0]);
        Q3().c1();
    }

    @Override // com.withings.wiscale2.device.wpm.ui.d
    public final void t1(com.withings.wiscale2.device.wpm.ui.d dVar) {
        x70.b.r(f55617p, "onGuestSelected", new Object[0]);
        Q3().X0(null);
    }

    @Override // com.withings.wiscale2.device.wpm.ui.b0.a
    public final void v2() {
        x70.b.r(f55617p, "onStopMeasuringNeeded", new Object[0]);
        Q3().e1();
    }

    @Override // com.withings.wiscale2.device.wpm.ui.b0.a
    public final void x2() {
        x70.b.r(f55617p, "Activity measure canceled()", new Object[0]);
        WpmMeasureConversation r02 = Q3().r0();
        if (r02 != null) {
            r02.P();
        }
        Q3().d1();
    }

    @Override // com.withings.wiscale2.device.wpm.ui.b0.a
    public final void z(long j5, boolean z5) {
        x70.b.r(f55617p, androidx.camera.camera2.internal.q.c("onMeasureFailed : ", j5), new Object[0]);
        Q3().W0((int) j5, z5);
    }

    @Override // com.withings.wiscale2.device.wpm.ui.k0.a
    public final void z0(int i11) {
        x70.b.r(f55617p, "onStartTripleMeasure", new Object[0]);
        Q3().Y0(i11);
        o();
    }
}
