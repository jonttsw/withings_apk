package com.withings.wiscale2.mydevices;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material3.m8;
import androidx.compose.material3.u5;
import androidx.compose.runtime.a;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v0;
import androidx.lifecycle.h1;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.lifecycle.u;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.common.device.reporting.InstallStateReporter;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.device.setup.ui.SetupChooseDeviceActivity;
import com.withings.devicesetup.Setup;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.mydevices.a;
import com.withings.wiscale2.mydevices.c;
import com.withings.wiscale2.mydevices.q;
import com.withings.wiscale2.notification.NotificationPermissionActivity;
import i6.a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import k1.r0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import nm0.y;
/* compiled from: MyDevicesFragment.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\nX\u008a\u0084\u0002²\u0006\u0010\u0010\t\u001a\u0004\u0018\u00010\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/withings/wiscale2/mydevices/q;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/withings/wiscale2/mydevices/c;", "finalDevices", "Lvi/o;", "deviceDiscovered", "Lfl/o;", "deviceModel", "", "showDialog", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class q extends com.withings.wiscale2.mydevices.b {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f58662l = 0;

    /* renamed from: h  reason: collision with root package name */
    private final i1 f58663h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public com.withings.wiscale2.mydevices.a f58664i;
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public kn.e f58665j;

    /* renamed from: k  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f58666k;

    /* compiled from: MyDevicesFragment.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -707736551, new p(q.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes5.dex */
    public static final class b extends w implements ym0.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f58668a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f58668a = fragment;
        }

        @Override // ym0.a
        public final Fragment invoke() {
            return this.f58668a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes5.dex */
    public static final class c extends w implements ym0.a<n1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a f58669a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f58669a = bVar;
        }

        @Override // ym0.a
        public final n1 invoke() {
            return (n1) this.f58669a.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes5.dex */
    public static final class d extends w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nm0.g f58670a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(nm0.g gVar) {
            super(0);
            this.f58670a = gVar;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return ((n1) this.f58670a.getValue()).getViewModelStore();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes5.dex */
    public static final class e extends w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nm0.g f58671a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(nm0.g gVar) {
            super(0);
            this.f58671a = gVar;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            u uVar;
            n1 n1Var = (n1) this.f58671a.getValue();
            if (n1Var instanceof u) {
                uVar = (u) n1Var;
            } else {
                uVar = null;
            }
            if (uVar != null) {
                return uVar.getDefaultViewModelCreationExtras();
            }
            return a.C1058a.f71431b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes5.dex */
    public static final class f extends w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f58672a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ nm0.g f58673b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment, nm0.g gVar) {
            super(0);
            this.f58672a = fragment;
            this.f58673b = gVar;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            u uVar;
            k1.b defaultViewModelProviderFactory;
            n1 n1Var = (n1) this.f58673b.getValue();
            if (n1Var instanceof u) {
                uVar = (u) n1Var;
            } else {
                uVar = null;
            }
            if (uVar == null || (defaultViewModelProviderFactory = uVar.getDefaultViewModelProviderFactory()) == null) {
                k1.b defaultViewModelProviderFactory2 = this.f58672a.getDefaultViewModelProviderFactory();
                kotlin.jvm.internal.u.i(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
            return defaultViewModelProviderFactory;
        }
    }

    public q() {
        nm0.g a11 = nm0.h.a(LazyThreadSafetyMode.f76138c, new c(new b(this)));
        this.f58663h = v0.a(this, q0.b(MyDevicesViewModel.class), new d(a11), new e(a11), new f(this, a11));
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new wn.f(this, 3));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f58666k = registerForActivityResult;
    }

    public static void s1(q this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        MyDevicesViewModel myDevicesViewModel = (MyDevicesViewModel) this$0.f58663h.getValue();
        BuildersKt__Builders_commonKt.launch$default(h1.a(myDevicesViewModel), null, null, new t(myDevicesViewModel, null), 3, null);
    }

    public static void t1(q this$0, Device device) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(device, "$device");
        ((MyDevicesViewModel) this$0.f58663h.getValue()).t0(device, false);
    }

    public static void u1(q this$0, Device device) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(device, "$device");
        ((MyDevicesViewModel) this$0.f58663h.getValue()).t0(device, true);
    }

    public static final void v1(q qVar, com.withings.wiscale2.mydevices.c cVar, vi.o oVar, androidx.compose.runtime.a aVar, int i11) {
        fl.o oVar2;
        qVar.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-1704709473);
        g11.s(1315693497);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = l0.f(null, androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        r0 r0Var = (r0) t11;
        Object a11 = com.huawei.hms.health.a.a(g11, 1315693557);
        if (a11 == a.C0060a.a()) {
            a11 = l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(a11);
        }
        r0 r0Var2 = (r0) a11;
        g11.J();
        k1.y.f(oVar, new g(oVar, r0Var, r0Var2, null), g11);
        if (cVar instanceof c.a) {
            g11.s(1315694134);
            nh0.b.a(((c.a) cVar).a(), new h(qVar), new i(qVar), new j(qVar), new k(qVar), g11, 8);
            g11.J();
        } else if (kotlin.jvm.internal.u.e(cVar, c.b.f58646a)) {
            g11.s(1315694480);
            nh0.f.a(new l(qVar), new m(qVar), g11, 0);
            g11.J();
        } else if (kotlin.jvm.internal.u.e(cVar, c.C0759c.f58647a)) {
            g11.s(1315694648);
            nh0.g.a(new n(qVar), new o(qVar), g11, 0);
            g11.J();
        } else {
            g11.s(1315694789);
            g11.J();
        }
        if (((Boolean) r0Var2.getValue()).booleanValue() && (oVar2 = (fl.o) r0Var.getValue()) != null) {
            Setup e02 = oVar2.e0(new DeviceModel(oVar2.a(), null));
            String str = (e02 == null || (str = qVar.getString(e02.j0())) == null) ? "" : "";
            m8 d11 = u5.d(true, null, g11, 6, 2);
            int B = oVar2.B(null);
            com.withings.wiscale2.mydevices.d dVar = new com.withings.wiscale2.mydevices.d(qVar, oVar2, r0Var2, r0Var);
            g11.s(-34373761);
            Object t12 = g11.t();
            if (t12 == a.C0060a.a()) {
                t12 = new com.withings.wiscale2.mydevices.e(r0Var2, r0Var);
                g11.n(t12);
            }
            g11.J();
            tj.h.a(str, B, C1987R.string._INSTALL_A_DEVICE_, d11, dVar, (ym0.a) t12, g11, 196608);
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new com.withings.wiscale2.mydevices.f(qVar, cVar, oVar, i11));
        }
    }

    public static final MyDevicesViewModel w1(q qVar) {
        return (MyDevicesViewModel) qVar.f58663h.getValue();
    }

    public static final void x1(q qVar) {
        qVar.getClass();
        SetupChooseDeviceActivity.a aVar = SetupChooseDeviceActivity.f37481i;
        Context requireContext = qVar.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        InstallStateReporter installStateReporter = new InstallStateReporter(true);
        aVar.getClass();
        qVar.startActivity(SetupChooseDeviceActivity.a.a(requireContext, false, installStateReporter));
    }

    public static final void y1(final q qVar, final Device device, a.InterfaceC0757a interfaceC0757a) {
        qVar.getClass();
        if (interfaceC0757a instanceof a.InterfaceC0757a.m) {
            int i11 = NotificationPermissionActivity.f58729d;
            Context requireContext = qVar.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            qVar.f58666k.a(NotificationPermissionActivity.a.a(requireContext));
        } else if (interfaceC0757a instanceof a.InterfaceC0757a.b0) {
            final Context requireContext2 = qVar.requireContext();
            kotlin.jvm.internal.u.i(requireContext2, "requireContext(...)");
            final Integer[] numArr = {30, 60, 90, 120};
            ArrayList arrayList = new ArrayList(4);
            for (int i12 = 0; i12 < 4; i12++) {
                arrayList.add(numArr[i12].intValue() + requireContext2.getString(C1987R.string._SEC_));
            }
            qc.b bVar = new qc.b(requireContext2);
            bVar.C(C1987R.string.deviceDetailView_measurementIntervalTime);
            bVar.u((String[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: lh0.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    int i14 = q.f58662l;
                    Device device2 = Device.this;
                    kotlin.jvm.internal.u.j(device2, "$device");
                    Integer[] listIntervalSeconds = numArr;
                    kotlin.jvm.internal.u.j(listIntervalSeconds, "$listIntervalSeconds");
                    q this$0 = qVar;
                    kotlin.jvm.internal.u.j(this$0, "this$0");
                    Context context = requireContext2;
                    kotlin.jvm.internal.u.j(context, "$context");
                    device2.setMeasurementIntervalTime(listIntervalSeconds[i13].intValue());
                    int i15 = vh.h.f103738e;
                    vh.h.d(new d(this$0, device2, context));
                }
            });
            bVar.s();
        } else if (interfaceC0757a instanceof a.InterfaceC0757a.f) {
            if (((a.InterfaceC0757a.f) interfaceC0757a).a()) {
                ((MyDevicesViewModel) qVar.f58663h.getValue()).t0(device, true);
                return;
            }
            Context requireContext3 = qVar.requireContext();
            kotlin.jvm.internal.u.i(requireContext3, "requireContext(...)");
            qc.b bVar2 = new qc.b(requireContext3);
            bVar2.C(C1987R.string.wam03Quicklook_popupTitle);
            bVar2.g(C1987R.string.wam03Quicklook_popupMessage);
            qc.b w11 = bVar2.z(C1987R.string.wam03Quicklook_popupMainButton, new p40.b(1, qVar, device)).w(C1987R.string.wam03Quicklook_popupSecondaryButton, new DialogInterface.OnClickListener() { // from class: lh0.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    q.u1(q.this, device);
                }
            });
            kotlin.jvm.internal.u.i(w11, "setNegativeButton(...)");
            w11.s();
        } else if (interfaceC0757a instanceof a.InterfaceC0757a.n) {
            final a.InterfaceC0757a.n nVar = (a.InterfaceC0757a.n) interfaceC0757a;
            Context requireContext4 = qVar.requireContext();
            kotlin.jvm.internal.u.i(requireContext4, "requireContext(...)");
            List<User> a11 = nVar.a();
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: lh0.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    int i14 = q.f58662l;
                    q this$0 = q.this;
                    kotlin.jvm.internal.u.j(this$0, "this$0");
                    Device device2 = device;
                    kotlin.jvm.internal.u.j(device2, "$device");
                    a.InterfaceC0757a.n event = nVar;
                    kotlin.jvm.internal.u.j(event, "$event");
                    com.withings.wiscale2.mydevices.a aVar = this$0.f58664i;
                    if (aVar != null) {
                        Context requireContext5 = this$0.requireContext();
                        kotlin.jvm.internal.u.i(requireContext5, "requireContext(...)");
                        aVar.a(requireContext5, device2, new a.InterfaceC0757a.p(event.a().get(i13)));
                        return;
                    }
                    kotlin.jvm.internal.u.s("deviceSettingsRedirection");
                    throw null;
                }
            };
            List<User> list = a11;
            ArrayList arrayList2 = new ArrayList(x.y(list, 10));
            for (User user : list) {
                arrayList2.add(dp0.j.i0(user.l() + " " + user.s()).toString());
            }
            qc.b B = new qc.b(requireContext4).B(requireContext4.getText(C1987R.string._UTILISATEUR_));
            B.u((CharSequence[]) arrayList2.toArray(new String[0]), onClickListener);
            B.s();
        } else {
            com.withings.wiscale2.mydevices.a aVar = qVar.f58664i;
            if (aVar != null) {
                Context requireContext5 = qVar.requireContext();
                kotlin.jvm.internal.u.i(requireContext5, "requireContext(...)");
                aVar.a(requireContext5, device, interfaceC0757a);
                return;
            }
            kotlin.jvm.internal.u.s("deviceSettingsRedirection");
            throw null;
        }
    }

    public static final void z1(q qVar) {
        qVar.getClass();
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setData(Uri.parse(qVar.getString(C1987R.string.SHOP_URL_PROD)));
        intent.setFlags(268435456);
        qVar.startActivity(intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        Context requireContext = requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6, 0);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new s1.a(true, -1590146689, new a()));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        int i11 = v70.a.f103433b;
        v70.a.b("devices", null, null);
    }
}
